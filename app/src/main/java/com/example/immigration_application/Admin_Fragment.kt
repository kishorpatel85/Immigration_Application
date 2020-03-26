package com.example.immigration_application

import android.app.Fragment
/*import androidx.lifecycle.ViewModelProviders*/
import android.os.Bundle
/*import androidx.fragment.app.Fragment*/
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Spinner
import android.widget.TextView
/*import kotlinx.android.synthetic.main.admin__fragment.*
import kotlinx.android.synthetic.main.dashboard__fragment.**/
import java.util.Observer

//import com.example.immigration_application.AllAngleExpandableButton;
//import com.immigration_application.ButtonData;
//import com.example.allangleexpandablebutton.ButtonEventListener;


class Admin_Fragment : Fragment() {



    private lateinit var viewModel: AdminViewModel
        override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.admin__fragment, container, false)

    }

}