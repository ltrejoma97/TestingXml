package com.example.joujonaapp.presentation

import android.app.Dialog
import android.os.Bundle
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.compose.material3.Text
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.platform.ViewCompositionStrategy
import com.example.joujonaapp.R
import com.example.joujonaapp.databinding.FragmentQrScanDialogListDialogItemBinding
import com.example.joujonaapp.databinding.FragmentQrScanDialogListDialogBinding
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.kma.supervision.app.presentation.theme.SupervisionAppTheme


class QrScanDialogFragment : RoundedBottomSheetDialogFragment() {

    lateinit var binding: FragmentQrScanDialogListDialogBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
//        return ComposeView(requireContext()).apply {
//            setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed)
//            setContent {
//                SupervisionAppTheme {
//                    Text(text = "Hola soy padding")
//                }
//            }
//        }

        binding = FragmentQrScanDialogListDialogBinding.inflate(inflater, container, false)
        configureFragment()

        return binding.root

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

    private fun configureFragment() {
        val offsetFromTop = 500

        (dialog as? BottomSheetDialog)?.behavior?.apply {
            this.isDraggable = false
            isFitToContents = true
            expandedOffset = offsetFromTop
            maxHeight = 400
            state = BottomSheetBehavior.STATE_EXPANDED
        }

    }

//    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
//        // used to show the bottom sheet dialog
//        dialog?.setOnShowListener { it ->
//            val d = it as BottomSheetDialog
//            val bottomSheet = d.findViewById<View>(com.google.android.material.R.id.design_bottom_sheet)
//            bottomSheet?.let {
//                val behavior = BottomSheetBehavior.from(it)
//                behavior.state = BottomSheetBehavior.STATE_EXPANDED
//            }
//        }
//        return super.onCreateDialog(savedInstanceState)
//    }
}