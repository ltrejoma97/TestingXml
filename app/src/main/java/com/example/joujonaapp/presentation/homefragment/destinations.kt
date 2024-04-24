package com.example.joujonaapp.presentation.homefragment

import android.view.ViewGroup
import com.example.joujonaapp.HomeFragment
import com.example.joujonaapp.R
import com.example.joujonaapp.presentation.QrScanDialogFragment
import com.google.android.material.bottomsheet.BottomSheetDialog

fun HomeFragment.displayQrDialog() {

//    val modal = QrScanDialogFragment()
//    modal.
//    childFragmentManager.let { modal.show(it, QrScanDialogFragment.QR_SCAN_FRAGMENT) }
//        if ( childFragmentManager.findFragmentByTag(QrScanDialogFragment.QR_SCAN_FRAGMENT) !=null){
//            ///Don't do nothing
//        }else{
////            viewModel.updateUiObject(viewModel.uiObject.copy(placeError = ""))
//            val fragment= QrScanDialogFragment.newInstance()
////            fragment.arguments = bundle
//
//            fragment.show(childFragmentManager, QrScanDialogFragment.QR_SCAN_FRAGMENT)
//        }
    val dialog = BottomSheetDialog(requireContext())
    val bottomSheet = layoutInflater.inflate(R.layout.fragment_qr_scan_dialog_list_dialog,null)

//    bottomSheet.buttonSubmit.setOnClickListener { dialog.dismiss() }

    dialog.setContentView(bottomSheet)
    dialog.show()
    }
