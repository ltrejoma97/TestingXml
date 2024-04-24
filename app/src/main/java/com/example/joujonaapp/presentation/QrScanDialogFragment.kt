package com.example.joujonaapp.presentation

import android.os.Bundle
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.joujonaapp.R
import com.example.joujonaapp.databinding.FragmentQrScanDialogListDialogItemBinding
import com.example.joujonaapp.databinding.FragmentQrScanDialogListDialogBinding


class QrScanDialogFragment : RoundedBottomSheetDialogFragment() {

    lateinit var binding: FragmentQrScanDialogListDialogBinding



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentQrScanDialogListDialogBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        activity?.findViewById<RecyclerView>(R.id.list)?.layoutManager =
            LinearLayoutManager(context)

    }


    companion object {

        fun newInstance(): QrScanDialogFragment =
            QrScanDialogFragment().apply {
                arguments = Bundle().apply {
                }
            }
        const val QR_SCAN_FRAGMENT = "qr scan fragment"

    }

    override fun onDestroyView() {
        super.onDestroyView()
    }
}