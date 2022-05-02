package com.uluumbch.motogpmodul4.ui.slideshow

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar
import com.uluumbch.motogpmodul4.adapter.TeamAdapter
import com.uluumbch.motogpmodul4.databinding.FragmentSlideshowBinding

class TeamFragment : Fragment() {

    private var _binding: FragmentSlideshowBinding? = null
    private lateinit var recyclerView: RecyclerView

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {


        _binding = FragmentSlideshowBinding.inflate(inflater, container, false)
        val root: View = binding.root
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val teamViewModel =
            ViewModelProvider(this).get(TeamViewModel::class.java)
        val adapter = TeamAdapter(teamViewModel.team)
        recyclerView = binding.rvTeam
        recyclerView.adapter = adapter

        adapter.setOnItemClickListener(object : TeamAdapter.OnItemClickListener{
            override fun onItemClick(position: Int) {
                super.onItemClick(position)
                Snackbar.make(view, "Anda menekan item ke ${position+1}", Snackbar.LENGTH_LONG).show()
            }
        })
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}