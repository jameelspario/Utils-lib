package com.example.utilib;

import android.text.TextUtils;
import android.util.Log;

public class L {

    public static void e(String... ss){

        Log.e("TAG", TextUtils.join(" | ", ss));

    }

    public static void d(String... ss){

        Log.e("TAG", TextUtils.join(" | ", ss));

    }


}
