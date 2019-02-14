package com.example.a13763.weathertest.util;

import okhttp3.*;

/**
 * 文件描述：
 *
 * @author：WJH
 * @Creatdata：2019/2/11
 * @Changedata：2019/2/11
 * @Version：
 */
public class HttpUtil {
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
