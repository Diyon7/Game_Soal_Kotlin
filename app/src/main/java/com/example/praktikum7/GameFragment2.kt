package com.example.praktikum7

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.praktikum7.databinding.FragmentGame2Binding


class GameFragment2 : Fragment() {
    override fun onCreateView(inflater:
                              LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<FragmentGame2Binding>(inflater,R.layout.fragment_game2, container, false)
        binding.submitButton2.setOnClickListener {
                view: View ->
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
                        .navigate(R.id.action_gameFragment_to_gameWonFragment2)
                } else {
                    view.findNavController()
                        .navigate(R.id.action_gameFragment_to_gameOverFragment)
                }
            }
        }
        return binding.root
    }
}

