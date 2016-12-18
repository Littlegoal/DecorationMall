package com.jzh.dto;

import java.io.Serializable;

/**
 * <p>{</p>
 * <p>&nbsp;success : true,</p>
 * <p>&nbsp;message : "query success",</p>
 * <p>&nbsp;data : </p>
 * <p>&nbsp;&nbsp;{</p>
 * <p>&nbsp;&nbsp;&nbsp;...</p>
 * <p>&nbsp;&nbsp;}</p>
 * <p>}</p>
 *
 * @author Junhao Zhou 2016/12/18
 */
public class Result<D> implements Serializable {

    private boolean success;

    private String message;

    private D data;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public D getData() {
        return data;
    }

    public void setData(D data) {
        this.data = data;
    }
}
