package com.pms.open_api.util;

public class JsonResponse<T> {

    private Integer code;
    private String msg;
    private T data;

    public void setCode(Integer code)
    {
        this.code = code;
    }

    public Integer getCode()
    {
        return this.code;
    }

    public void setMsg(String msg)
    {
        this.msg = msg;
    }

    public String getMsg()
    {
        return msg;
    }

    public void setData(T data)
    {
        this.data = data;
    }

    public T getData()
    {
        return data;
    }
    public JsonResponse(Integer code,String msg)
    {
        this.code = code;
        this.msg = msg;
    }
    public JsonResponse(Integer code,String msg,T data)
    {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
}
