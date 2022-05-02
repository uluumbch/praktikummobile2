package com.uluumbch.motogpmodul4.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.uluumbch.motogpmodul4.R
import com.uluumbch.motogpmodul4.databinding.FragmentHomeBinding
import java.util.*

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var flag: ImageView = binding.flag
        if (Locale.getDefault().language.equals("in")){
            flag.setImageResource(R.drawable.id)
        }else if (Locale.getDefault().language.equals("en")){
            flag.setImageResource(R.drawable.us)
        }
    }



    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}