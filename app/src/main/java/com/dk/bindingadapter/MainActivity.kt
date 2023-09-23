package com.dk.bindingadapter

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.databinding.DataBindingUtil
import com.dk.bindingadapter.databinding.ActivityMainBinding

class MainActivity : ComponentActivity() {
    lateinit var dataBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dataBinding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        val userData = UserData("Iron Man","Anthony Edward Stark is a fictional character primarily portrayed by Robert Downey Jr. in the Marvel Cinematic Universe media franchise—based on the Marvel Comics character of the same name—commonly known by his alias, Iron Man.",
            "https://via.placeholder.com/300/09f/fff.png")
        dataBinding.userdata = userData
    }
}