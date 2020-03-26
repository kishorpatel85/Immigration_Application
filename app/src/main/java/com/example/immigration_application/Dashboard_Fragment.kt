package com.example.immigration_application

import android.os.Bundle
import android.sax.RootElement
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import kotlinx.android.synthetic.main.dashboard__fragment.*
import kotlinx.android.synthetic.main.dashboard__fragment.view.*
import org.w3c.dom.Text


class Dashboard_Fragment : Fragment() {

    companion object {
        fun newInstance() = Dashboard_Fragment()
    }

    private lateinit var viewModel: DashboardViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        val view = inflater.inflate(R.layout.dashboard__fragment, container, false)

        return view
    }
}



