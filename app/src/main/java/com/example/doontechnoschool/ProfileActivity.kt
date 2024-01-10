package com.example.doontechnoschool

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.res.ResourcesCompat
import com.example.doontechnoschool.databinding.ActivityProfileBinding

class ProfileActivity : AppCompatActivity() {
    lateinit var mBinding:ActivityProfileBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding= ActivityProfileBinding.inflate(layoutInflater)
        setContentView(mBinding.root)
        val gradientDrawable = ResourcesCompat.getDrawable(resources,R.drawable.shape_heading_dashboard_gradient,null)
        window.setBackgroundDrawable(gradientDrawable)
    }
}