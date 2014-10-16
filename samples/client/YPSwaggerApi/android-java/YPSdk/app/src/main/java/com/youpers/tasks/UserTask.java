package com.youpers.ypfmktest;

import android.content.Context;
import android.os.AsyncTask;

import com.youpers.utils.NetworkUtils;
import com.youpers.utils.AsyncTaskResult;
import com.youpers.client.ApiException;
import com.youpers.api.UsersApi;
import com.youpers.model.User;
import com.youpers.utils.Credentials;

/**
 * Created by IvanRigamonti on 06.05.14.
 */
public class UserTask extends AsyncTask<Void, Void, AsyncTaskResult<User>> {

    Context mContext;
    Credentials mCredentials;

    User mUser;
    AsyncTaskResult<User> mResult;

    public UserTask(Context context, Credentials credentials) {
        mContext = context;
        mCredentials = credentials;
    }

    @Override
    protected AsyncTaskResult<User> doInBackground(Void... voids) {

        mResult = new AsyncTaskResult<User>(mUser);
        mResult.setRC("");

        if (NetworkUtils.isNetworkConnected(mContext)) {
            UsersApi mUserApi= new UsersApi();
            //mLoginApi.addHeader("Authorization", "basic " + mCredentials.getBase64());
            //mLoginApi.setBasePath("http://localhost:8000");
            //mLoginApi.setBasePath("https://uat.youpers.com/api");
            mUserApi.setBasePath("https://cimaster.youpers.com/api");
            try {
                //mUser = mLoginApi.login("");
                mUser = mUserApi.getUserById("525fb247101e330000000005", "", "");
            } catch (ApiException e) {
                e.printStackTrace();
            }
            mResult.setResult(mUser, "ok");
        }
        else {
            mResult.setResult(mUser, "No network connection available.");
        }

        return mResult;
    }

    @Override
    protected void onPostExecute(AsyncTaskResult<User> userAsyncTaskResult) {
        mResult = userAsyncTaskResult;
    }
}
