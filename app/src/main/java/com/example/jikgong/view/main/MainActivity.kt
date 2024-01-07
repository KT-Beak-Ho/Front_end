package com.example.jikgong.view.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.jikgong.R
import com.example.jikgong.databinding.ActivityMainBinding
import com.example.jikgong.view.main.home.HomeMapFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.test.setOnClickListener(){
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.frame_layout, HomeMapFragment())
            // 프래그먼트를 프레임 레이아웃에 대체
            fragmentTransaction.commit() // 트랜잭션 완료 = 커밋.
        }

        //  광고 캐러셀 시작
        //  광고 캐러셀 끝
        
        //  필터 버튼 리스트 시작
        //  필터 버튼 리스트 끝
        

        //  하단 네비게이션 바 추가 및 연결 시작
        val bottomNavigationView = binding.bottomNavigationView
        val navController = findNavController(R.id.fragmentContainerView)

        bottomNavigationView.setupWithNavController(navController)
        //  하단 네비게이션 바 추가 및 연결 끝
    }

}
