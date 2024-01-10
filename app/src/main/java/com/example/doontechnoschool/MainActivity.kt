package com.example.doontechnoschool

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.res.ResourcesCompat
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel
import com.example.doontechnoschool.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var mBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)
//        window.statusBarColor = Color.TRANSPARENT
//        window.navigationBarColor = resources.getColor(R.color.transparent)
        val gradientDrawable = ResourcesCompat.getDrawable(resources,R.drawable.shape_heading_dashboard_gradient,null)
        window.setBackgroundDrawable(gradientDrawable)
        val bannerList:MutableList<SlideModel> = mutableListOf()
        bannerList.apply {
            add(SlideModel(R.drawable.doon_banner , "Title", ScaleTypes.FIT) )
            add(SlideModel(R.drawable.doon_banner_two , "Title", ScaleTypes.FIT) )

        }
        mBinding.apply {
            bannerSlider.setImageList(bannerList)
            profile.setOnClickListener { startActivity(Intent(applicationContext,ProfileActivity::class.java)) }
        }
    }
}