package com.example.immigration_application

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class Fragment_calender : Fragment() {

    companion object {
        fun newInstance() = Fragment_calender()
    }

    private lateinit var viewModel: FragmentCalenderViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_calender_fragment, container, false)
    }


}
