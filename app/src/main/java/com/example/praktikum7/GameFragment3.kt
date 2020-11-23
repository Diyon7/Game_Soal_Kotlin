package com.example.praktikum7

import com.example.praktikum7.databinding.FragmentGameBinding
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.praktikum7.databinding.FragmentGame3Binding

class GameFragment3 : Fragment() {
    override fun onCreateView(inflater:
                              LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<FragmentGame3Binding>(
            inflater, R.layout.fragment_game3, container, false)
        binding.submitButton3.setOnClickListener { view: View ->
            val checkedId =
                binding.questionRadioGroup.checkedRadioButtonId
            if (-1 != checkedId) {
                var answerIndex = 0
                when (checkedId) {
                    R.id.firstAnswerRadioButton -> answerIndex = 0
                    R.id.secondAnswerRadioButton -> answerIndex = 1
                    R.id.thirdAnswerRadioButton -> answerIndex = 2
                    R.id.fourthAnswerRadioButton -> answerIndex = 3
                }
                if (answerIndex == 0) {
                    view.findNavController()
                        .navigate(R.id.action_gameFragment_to_gameWonFragment3)
                } else {
                    view.findNavController()
                        .navigate(R.id.action_gameFragment_to_gameOverFragment)
                }
            }
        }
        return binding.root
    }
}

