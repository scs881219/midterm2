package com.example.midterm2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.midterm2.databinding.FragmentWinBinding
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs

class WinFragment : Fragment() {
    private lateinit var binding: FragmentWinBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View?{
        val args = WinFragmentArgs.fromBundle(requireArguments())
        val binding = DataBindingUtil.inflate<FragmentWinBinding>(inflater, R.layout.fragment_win, container,false)

        binding.textView5.text = args.gamewon.toString()
        binding.playagainwin.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.winnavigatetogame)
        }
        return binding.root
    }

}