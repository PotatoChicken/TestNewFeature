package com.example.wenjunzhong.testnewfeature.statistical;

import android.app.Activity;
import android.content.Context;


import java.util.HashMap;


/**
 * Created by wenjun.zhong on 2016/11/15.
 */

public class StatisticalAgent {

    private StatisticalAgent(){}


    public static void onResume(Activity context){

    }

    public static void onPause(Activity context){

    }

    public static void onEvent(Context context, String eventId, String label){
        HashMap<String, String> map = new HashMap<>();
        map.put("hash_key", "testTC");
      //  TCAgent.onEvent(context, eventId, label, map);
    }
}
