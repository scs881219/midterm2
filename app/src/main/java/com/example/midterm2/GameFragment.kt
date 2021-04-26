package com.example.midterm2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.midterm2.databinding.FragmentGameBinding
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController

class GameFragment : Fragment() {
    private lateinit var binding: FragmentGameBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View?{

        val binding = DataBindingUtil.inflate<FragmentGameBinding>(inflater, R.layout.fragment_game, container,false)
        val str1 = getString(R.string.str1)
        val str2 = getString(R.string.str2)
        val number = (1..50).random()
        var count = 0

        binding.confirmButton.setOnClickListener{ view: View ->
            count++
            val input = binding.inputnumber.text.toString().toInt()
            if (input < number){
                val output = str1 + input
                binding.textView4.text = output
            }
            else if (input > number){
                val output = str2 + input
                binding.textView4.text = output
            }
            else {
                view.findNavController().navigate(GameFragmentDirections.navigatetowin(count))
            }
            if(count==10){
                view.findNavController().navigate(GameFragmentDirections.navigatetolose(number))
            }
        }

        return binding.root
    }


}