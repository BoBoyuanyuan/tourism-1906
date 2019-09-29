package com.is.tourism.utils;

public enum ResponseStatus {
    LOGIN_SUCCESS_STATUS(200,"登录成功"),
    ACCOUNT_LOCKED_STATUS(-2,"账号被锁定,请与管理员联系");

    private int status;
    private String msg;

    ResponseStatus(int status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
