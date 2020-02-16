package com.app.rent

import android.app.Application


class RentApp : Application() {

    override fun onCreate() {
        super.onCreate()
        instance = this
    }

    companion object {
        lateinit var instance: RentApp
    }
}