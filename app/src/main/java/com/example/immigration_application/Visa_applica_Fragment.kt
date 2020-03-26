package com.example.immigration_application

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class Visa_applica_Fragment : Fragment() {

    companion object {
        fun newInstance() = Visa_applica_Fragment()
    }

    private lateinit var viewModel: VisaApplicaViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.visa_applica__fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(VisaApplicaViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
