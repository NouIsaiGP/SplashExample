package com.example.splash

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.example.splash.databinding.FragmentLoginBinding

//private const val ARG_PARAM1 = "param1"

class LoginFragment : Fragment() {

    private var _binding: FragmentLoginBinding? = null
    private val binding get() = _binding!!
    //private var userName: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /*arguments?.let {
            userName = it.getString(ARG_PARAM1)
        }*/
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLoginBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnIniciar.setOnClickListener {
                setUpViewPageFragment()
        }

    }


    private fun setUpViewPageFragment() {
        val user = binding.tvUsuario.text.toString()
        var fr = getFragmentManager()?.beginTransaction()
        fr?.replace(R.id.container, DetailsFragment.newInstance(user))
        fr?.commit()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {
        @JvmStatic
        fun newInstance() =
            LoginFragment()

        @JvmStatic
        fun newInstance(bundle: Bundle) =
            LoginFragment()

    }

}