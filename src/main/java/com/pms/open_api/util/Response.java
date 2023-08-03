package com.pms.open_api.util;

import java.util.HashMap;

public class Response {
    public static JsonResponse JsonReturn(Integer code, String msg , Object data)
    {
        return  new JsonResponse(code,msg,data);
    }

    public static JsonResponse success(Object data)
    {
        return  new JsonResponse(0,"ok",data);
    }

    public static JsonResponse error(Integer code, String msg)
    {
        return  new JsonResponse (code, msg , new HashMap<>());
    }

    public static JsonResponse ExceptionReturn(Integer code, String msg)
    {
        return new JsonResponse(code,msg,new HashMap<>());
    }
}
