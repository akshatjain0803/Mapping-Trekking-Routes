package com.example.mapping_trekking_routes

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import com.example.mapping_trekking_routes.databinding.FragmentLoginScreenBinding

class LoginScreen : Fragment() {

    // Binding the Fragment with the view
    private lateinit var bindingLoginScreen: FragmentLoginScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        bindingLoginScreen.register.setOnClickListener {
            val transaction = requireActivity()?.supportFragmentManager.beginTransaction()
            transaction?.replace(R.id.main, Fragment(R.layout.fragment_register_screen))
            transaction?.commit()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        // Remove the taskbar
        requireActivity().window.addFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS)

        // Bind the view
        bindingLoginScreen = FragmentLoginScreenBinding.inflate(inflater, container, false)
        return bindingLoginScreen.root
    }
}