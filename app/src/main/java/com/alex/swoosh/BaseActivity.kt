package com.alex.swoosh

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

// This class contains Log.d() info for every Activity Life Cycle for each method.
open class BaseActivity : AppCompatActivity() {

    private val TAG = "LifeCycle"

    // Logs for logcat for every method activity life cycle
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG, "${javaClass.simpleName} onCreate")
        super.onCreate(savedInstanceState)
    }

    // Logs for logcat for every method activity life cycle
    override fun onStart() {
        Log.d(TAG, "${javaClass.simpleName} onStart")
        super.onStart()
    }

    // Logs for logcat for every method activity life cycle
    override fun onResume() {
        Log.d(TAG, "${javaClass.simpleName} onResume")
        super.onResume()
    }

    // Logs for logcat for every method activity life cycle
    override fun onRestart() {
        Log.d(TAG, "${javaClass.simpleName} on Restart")
        super.onRestart()
    }

    // Logs for logcat for every method activity life cycle
    override fun onPause() {
        Log.d(TAG, "${javaClass.simpleName} onPause")
        super.onPause()
    }

    // Logs for logcat for every method activity life cycle
    override fun onStop() {
        Log.d(TAG, "${javaClass.simpleName} onStop")
        super.onStop()
    }

    // Logs for logcat for every method activity life cycle
    override fun onDestroy() {
        Log.d(TAG, "${javaClass.simpleName} onDestroy" )
        super.onDestroy()
    }
}
