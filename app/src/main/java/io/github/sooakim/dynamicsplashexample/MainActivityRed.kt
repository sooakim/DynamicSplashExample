package io.github.sooakim.dynamicsplashexample

import android.content.ComponentName
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import io.github.sooakim.dynamicsplashexample.databinding.ActivityMainBinding

class MainActivityRed : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnGreen.setOnClickListener(this)
        binding.btnRed.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        when(view.id){
            binding.btnGreen.id -> {
                packageManager.setComponentEnabledSetting(
                    ComponentName(packageName, "$packageName.MainActivityRed"),
                    PackageManager.COMPONENT_ENABLED_STATE_DISABLED,
                    PackageManager.DONT_KILL_APP
                )
                packageManager.setComponentEnabledSetting(
                    ComponentName(packageName, "$packageName.MainActivityGreen"),
                    PackageManager.COMPONENT_ENABLED_STATE_ENABLED,
                    PackageManager.DONT_KILL_APP
                )
            }
            binding.btnRed.id -> {
                packageManager.setComponentEnabledSetting(
                    ComponentName(packageName, "$packageName.MainActivityGreen"),
                    PackageManager.COMPONENT_ENABLED_STATE_DISABLED,
                    PackageManager.DONT_KILL_APP
                )
                packageManager.setComponentEnabledSetting(
                    ComponentName(packageName, "$packageName.MainActivityRed"),
                    PackageManager.COMPONENT_ENABLED_STATE_ENABLED,
                    PackageManager.DONT_KILL_APP
                )
            }
        }
    }
}

class MainActivityGreen: AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnGreen.setOnClickListener(this)
        binding.btnRed.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        when(view.id){
            binding.btnGreen.id -> {
                packageManager.setComponentEnabledSetting(
                    ComponentName(packageName, "$packageName.MainActivityRed"),
                    PackageManager.COMPONENT_ENABLED_STATE_DISABLED,
                    PackageManager.DONT_KILL_APP
                )
                packageManager.setComponentEnabledSetting(
                    ComponentName(packageName, "$packageName.MainActivityGreen"),
                    PackageManager.COMPONENT_ENABLED_STATE_ENABLED,
                    PackageManager.DONT_KILL_APP
                )
            }
            binding.btnRed.id -> {
                packageManager.setComponentEnabledSetting(
                    ComponentName(packageName, "$packageName.MainActivityGreen"),
                    PackageManager.COMPONENT_ENABLED_STATE_DISABLED,
                    PackageManager.DONT_KILL_APP
                )
                packageManager.setComponentEnabledSetting(
                    ComponentName(packageName, "$packageName.MainActivityRed"),
                    PackageManager.COMPONENT_ENABLED_STATE_ENABLED,
                    PackageManager.DONT_KILL_APP
                )
            }
        }
    }
}