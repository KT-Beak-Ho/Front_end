package com.example.jikgong.view.main.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.jikgong.R
import com.example.jikgong.databinding.FragmentHomeJoblistBinding
import com.example.jikgong.view.main.adapter.JobListRVAdapter

class HomeJobListFragment : Fragment() {
    private lateinit var binding: FragmentHomeJoblistBinding
    private val jobList = ArrayList<>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {}
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        // 프래그 먼트 내부에서 프래그먼트 전환하기
        binding = FragmentHomeJoblistBinding.inflate(inflater, container, false)
        binding.test.setOnClickListener {
            val currentFragment = parentFragmentManager.findFragmentById(R.id.frame_layout)
            if (currentFragment == null || currentFragment?.javaClass?.simpleName == "HomeJobListFragment") {
                val fragmentTransaction = parentFragmentManager.beginTransaction()
                fragmentTransaction.replace(R.id.frame_layout, HomeMapFragment())
                fragmentTransaction.commit()
                jobListRV()
            } else {
                val fragmentTransaction = parentFragmentManager.beginTransaction()
                fragmentTransaction.replace(R.id.frame_layout, HomeJobListFragment())
                fragmentTransaction.commit()
            }
        }
        return binding.root
    }

    private fun jobListRV() {
        val jobListRVAdapter = JobListRVAdapter(requireContext(), jobList)
//  이게 여기에 연결하는게 맞나?
    }

}

