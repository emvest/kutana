package com.jnyakush.kutana

import android.app.Application

class Kutana : Application() {

    override fun onCreate() {
        super.onCreate()

        initKoin()
        initStetho()
        initTimber()
    }

    private fun initKoin() {
        TODO("Not yet implemented")
    }

    private fun initStetho() {
        TODO("Not yet implemented")
    }

    private fun initTimber() {
        TODO("Not yet implemented")
    }
}