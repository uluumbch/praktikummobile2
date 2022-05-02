package com.uluumbch.motogpmodul4.ui.name

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar
import com.uluumbch.motogpmodul4.adapter.NamaAdapter
import com.uluumbch.motogpmodul4.databinding.FragmentGalleryBinding

class NamaFragment : Fragment() {

    private var _binding: FragmentGalleryBinding? = null
    private lateinit var recyclerView: RecyclerView

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {


        _binding = FragmentGalleryBinding.inflate(inflater, container, false)
        val root: View = binding.root

        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val galleryViewModel =
            ViewModelProvider(this).get(NamaViewModel::class.java)
        val adapter = NamaAdapter(galleryViewModel.loadData())
        recyclerView = binding.rvNama
        recyclerView.adapter = adapter
        adapter.setOnItemClickListener(object : NamaAdapter.OnItemClickListener{
            override fun onItemClick(position: Int) {
                super.onItemClick(position)
//                Toast.makeText(context, "Anda menekan item ke ${position}",Toast.LENGTH_LONG).show()
                Snackbar.make(view, "Anda menekan item ke ${position+1}", Snackbar.LENGTH_LONG).show()
            }
        })
    }



    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}