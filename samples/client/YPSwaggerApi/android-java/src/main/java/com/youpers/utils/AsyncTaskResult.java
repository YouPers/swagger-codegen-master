package com.youpers.utils;

/**
 * Created by IvanRigamonti on 18.12.13.
 */
public class AsyncTaskResult<T> {
    private T mResult;
    private String mRC = "";

    public void setResult(T result) {
        this.mResult = result;
    }

    public void setResult(T result, String rc) {
        this.mResult = result;
        this.mRC = rc;
    }

    public T getResult() {
        return mResult;
    }

    public void setRC(String rc) {
        this.mRC = mRC;
    }

    public String getRC() {
        return mRC;
    }

    public AsyncTaskResult(T result) {
        super();
        this.mResult = result;
    }

    public AsyncTaskResult() {
        super();
        mRC = "";
    }

    public AsyncTaskResult(String rc) {
        super();
        mRC = rc;
    }
}
