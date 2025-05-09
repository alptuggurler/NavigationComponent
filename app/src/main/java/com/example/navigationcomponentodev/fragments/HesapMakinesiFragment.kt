package com.example.navigationcomponentodev.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.navigationcomponentodev.R
import com.example.navigationcomponentodev.databinding.FragmentHesapMakinesiBinding


class HesapMakinesiFragment : Fragment() {
    private lateinit var binding: FragmentHesapMakinesiBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHesapMakinesiBinding.inflate(inflater, container, false)

        addButtonClickListener(binding.button1, "1",binding)
        addButtonClickListener(binding.button2, "2",binding)
        addButtonClickListener(binding.button3, "3",binding)
        addButtonClickListener(binding.button4, "4",binding)
        addButtonClickListener(binding.button5, "5",binding)
        addButtonClickListener(binding.button6, "6",binding)
        addButtonClickListener(binding.button7, "7",binding)
        addButtonClickListener(binding.button8, "8",binding)
        addButtonClickListener(binding.button9, "9",binding)
        addButtonClickListener(binding.button0, "0",binding)
        addButtonClickListener(binding.buttonArti, "+",binding)

        binding.buttonToplam.setOnClickListener {

            val deger = binding.editTextPanel.text.toString()
            val dizi = deger.split("+").toTypedArray()
            var toplam = 0
            for(i in dizi){
                if(i == ""){
                    toplam += 0
                }
                else{
                    toplam += i.toInt()}
            }
            binding.editTextPanel.setText(toplam.toString())

        }

        binding.buttonCE.setOnClickListener {
            binding.editTextPanel.setText("")
        }


        return binding.root
        // Inflate the layout for this fragment
    }

    fun addButtonClickListener(button: Button, value: String, binding: FragmentHesapMakinesiBinding){
        button.setOnClickListener {
            val deger = binding.editTextPanel.text.toString()

            binding.editTextPanel.setText("${deger}$value")
        }
    }
}