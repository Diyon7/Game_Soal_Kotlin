package com.example.praktikum7

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.praktikum7.databinding.FragmentGameWon3Binding

class GameWonFragment3 : Fragment() {
    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding: FragmentGameWon3Binding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_game_won3, container, false)
        binding.nextMatchButton3.setOnClickListener { view: View ->
            view.findNavController().
                navigate(R.id.action_gameWonFragment_to_titleFragment)
        }
        return binding.root
    }
}
