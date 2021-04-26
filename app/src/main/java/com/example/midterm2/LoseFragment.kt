package com.example.midterm2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.midterm2.databinding.FragmentLoseBinding
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController


class LoseFragment : Fragment() {
    private lateinit var binding: FragmentLoseBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View?{
        val binding = DataBindingUtil.inflate<FragmentLoseBinding>(inflater, R.layout.fragment_lose, container,false)
        val args = LoseFragmentArgs.fromBundle(requireArguments())
        binding.textView7.text = args.answernumber.toString()

        binding.playagainlose.setOnClickListener{ view : View ->
            view.findNavController().navigate(R.id.losenavigatetogame)
        }
        return binding.root
    }

}