package com.example.midterm2

import android.os.Bundle
import android.util.AttributeSet
import android.view.*
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.midterm2.databinding.FragmentStartBinding
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI

class StartFragment : Fragment() {
    private lateinit var binding: FragmentStartBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View?{
        setHasOptionsMenu(true)

        val binding = DataBindingUtil.inflate<FragmentStartBinding>(inflater, R.layout.fragment_start, container,false)
        setHasOptionsMenu(true);

        binding.button2.setOnClickListener{ view : View ->
            view.findNavController().navigate(R.id.navigatetogame)
        }

        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.aboutme,menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(item,requireView().findNavController())||super.onOptionsItemSelected(item)
    }

}