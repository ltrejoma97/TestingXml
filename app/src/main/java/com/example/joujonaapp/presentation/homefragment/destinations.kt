package com.example.joujonaapp.presentation.homefragment

import com.example.joujonaapp.HomeFragment
import com.example.joujonaapp.presentation.QrScanDialogFragment

fun HomeFragment.displayQrDialog(){

    val modal = QrScanDialogFragment()
    childFragmentManager.let { modal.show(it, QrScanDialogFragment.QR_SCAN_FRAGMENT) }

    }
