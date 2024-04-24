package com.example.joujonaapp.presentation.homefragment

import com.example.joujonaapp.HomeFragment
import com.example.joujonaapp.presentation.QrScanDialogFragment

fun HomeFragment.displayQrDialog(){

        if ( childFragmentManager.findFragmentByTag(QrScanDialogFragment.QR_SCAN_FRAGMENT) !=null){
            ///Don't do nothing
        }else{
//            viewModel.updateUiObject(viewModel.uiObject.copy(placeError = ""))
            val fragment= QrScanDialogFragment.newInstance()
//            fragment.arguments = bundle
            fragment.show(childFragmentManager, QrScanDialogFragment.QR_SCAN_FRAGMENT)
        }
    }
