package com.example.stricks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var Porn_Count = 0
        var AD_Count = 0
        var Run_Count = 0
        var Gym_Count = 0


        btn_PornIncrease.setOnClickListener {

            Porn_Count += 1
            tv_porn_number.text = Porn_Count.toString()
        }

        btn_PornReset.setOnClickListener {
            Porn_Count = 0
            tv_porn_number.text = Porn_Count.toString()

        }

        btn_Android_dev_Increase.setOnClickListener {
            AD_Count += 1
            tv_Android_dev_number.text = AD_Count.toString()
        }

        btn_Android_dev_Reset.setOnClickListener {
            AD_Count = 0
            tv_Android_dev_number.text = AD_Count.toString()
        }

        btn_Run_Increase.setOnClickListener {
            Run_Count += 1
            tv_Run_number.text = Run_Count.toString()
        }

        btn_Run_Reset.setOnClickListener {
            Run_Count = 0
            tv_Run_number.text = Run_Count.toString()
        }

        btn_GYM_Increase.setOnClickListener {
            Gym_Count += 1
            tv_GYM_number.text = Gym_Count.toString()
        }

        btn_GYM_Reset.setOnClickListener {
            Gym_Count = 0
            tv_GYM_number.text = Gym_Count.toString()
        }

        btn_Reset_all.setOnClickListener {
            Gym_Count = 0
            Run_Count = 0
            AD_Count = 0
            Porn_Count = 0
            tv_porn_number.text = Porn_Count.toString()
            tv_GYM_number.text = Gym_Count.toString()
            tv_Run_number.text = Run_Count.toString()
            tv_Android_dev_number.text = AD_Count.toString()
        }

        btn_IncreaseAll.setOnClickListener {
            Gym_Count += 1
            tv_GYM_number.text = Gym_Count.toString()
            Run_Count += 1
            tv_Run_number.text = Run_Count.toString()
            AD_Count += 1
            tv_Android_dev_number.text = AD_Count.toString()
            Porn_Count += 1
            tv_porn_number.text = Porn_Count.toString()
        }
    }
}