package com.example.a13763.weathertest.util;

import android.text.TextUtils;

import com.example.a13763.weathertest.db.City;
import com.example.a13763.weathertest.db.Provice;
import com.example.a13763.weathertest.db.County;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * 文件描述：
 *
 * @author：WJH
 * @Creatdata：2019/2/11
 * @Changedata：2019/2/11
 * @Version：
 */
public class Utility {
    public static boolean handleProviceResponse(String response){
        if (!TextUtils.isEmpty(response)){
            try {
                JSONArray allProvices = new JSONArray(response);
                for (int i= 0;i<allProvices.length();i++){
                    JSONObject provinceObject = allProvices.getJSONObject(i);
                    Provice provice = new Provice();
                    provice.setProviceName(provinceObject.getString("name"));
                    provice.setPrviceceCode(provinceObject.getInt("id"));
                    provice.save();
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    public static boolean handleCityResponse(String response,int proviceId){
        if (!TextUtils.isEmpty(response)){
            try {
                JSONArray allCities = new JSONArray(response);
                for (int i= 0;i<allCities.length();i++){
                    JSONObject cityObject = allCities.getJSONObject(i);
                    City city = new City();
                    city.setCityName(cityObject.getString("name"));
                    city.setCityCode(cityObject.getInt("id"));
                    city.setProviceId(proviceId);
                    city.save();
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return false;
    }
    public static boolean handleCountyResponse(String response,int cityId){
        if (!TextUtils.isEmpty(response)){
            try {
                JSONArray allCounties = new JSONArray(response);
                for (int i= 0;i<allCounties.length();i++){
                    JSONObject countyObject = allCounties.getJSONObject(i);
                    County county = new County();
                    county.setCountyName(countyObject.getString("name"));
                    county.setCityId(cityId);
                    county.setWeatherId(countyObject.getString("weather_id"));
                    county.save();
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return false;
    }
}
