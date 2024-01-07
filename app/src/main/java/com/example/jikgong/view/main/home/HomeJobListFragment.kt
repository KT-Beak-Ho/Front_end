package com.example.jikgong.view.main.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.jikgong.R
import com.example.jikgong.databinding.FragmentHomeJoblistBinding

class HomeJobListFragment : Fragment() {
    private lateinit var binding: FragmentHomeJoblistBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {}
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomeJoblistBinding.inflate(inflater,container,false)
        binding.test.setOnClickListener {
            val currentFragment = parentFragmentManager.findFragmentById(R.id.frame_layout)
            
            val fragmentTransaction = parentFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.frame_layout,HomeMapFragment())
            fragmentTransaction.commit()


        }
        return binding.root
    }

}

