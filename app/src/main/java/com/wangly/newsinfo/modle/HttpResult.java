package com.wangly.newsinfo.modle;

/**
 * Created by wangly on 2016/11/24.
 */

public class HttpResult <T> {
    private String resultcode;
    private String reason;
    private int error_code;


    private T result;


    public String getResultcode() {
        return resultcode;
    }

    public void setResultcode(String resultcode) {
        this.resultcode = resultcode;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    @Override
    public String toString() {
        return "HttpResult{" +
                "error_code='" + error_code + '\'' +
                ", resultcode='" + resultcode + '\'' +
                ", reason='" + reason + '\'' +
                ", result=" + result +
                '}';
    }
}
