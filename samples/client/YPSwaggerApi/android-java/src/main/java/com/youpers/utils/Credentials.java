package com.youpers.utils;

import android.util.Base64;

import java.io.UnsupportedEncodingException;

/**
 * Created by IvanRigamonti on 06.05.14.
 */
public class Credentials {

    private String mUser;
    private String mPW;
    private String mBase64;

    public Credentials(String user, String pw) {
        mUser = user;
        mPW = pw;
        String stringToEncode = mUser + ":" + mPW;
        byte[] mData;

        try {
            mData = stringToEncode.getBytes("UTF-8");
            mBase64 = Base64.encodeToString(mData, Base64.NO_WRAP);
//          Log.i("Base 64", mBase64);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    public String getUser() {
        return mUser;
    }

    public String getPW() {
        return mPW;
    }

    public String getBase64() {
        return mBase64;
    }

}
