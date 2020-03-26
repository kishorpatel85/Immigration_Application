package com.example.immigration_application

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class Enquiry_Fragment : Fragment() {

    companion object {
        fun newInstance() = Enquiry_Fragment()
    }

    private lateinit var viewModel: EnquiryViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.enquiry__fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(EnquiryViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
