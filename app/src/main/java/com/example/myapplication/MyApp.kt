package com.example.myapplication

import android.content.Context
import androidx.multidex.MultiDex
import com.acuant.sampleapp.AppInstance

class MyApp:AppInstance() {
    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
        MultiDex.install(base)
    }
}