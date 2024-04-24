package com.example.joujonaapp.presentation.listfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.joujonaapp.R
import com.example.joujonaapp.databinding.FragmentHomeBinding
import com.example.joujonaapp.databinding.FragmentItemBinding
import com.example.joujonaapp.databinding.FragmentItemListBinding

/**
 * A fragment representing a list of Items.
 */
class ItemFragment : Fragment() {

    private var columnCount = 1
    lateinit var binding : FragmentItemListBinding

    val locationQrCodes = listOf<LocationQr>(
        LocationQr("8693662631",ValidationType.success),
        LocationQr("8693662631",ValidationType.warning),
        LocationQr("8693662631",ValidationType.error),
        LocationQr("8693662631",ValidationType.success),
        LocationQr("8693662631",ValidationType.success),
        LocationQr("8693662631",ValidationType.warning),
        LocationQr("8693662631",ValidationType.error),
        LocationQr("8693662631",ValidationType.success),
        LocationQr("8693662631",ValidationType.success),
        LocationQr("8693662631",ValidationType.warning),
        LocationQr("8693662631",ValidationType.error),
        LocationQr("8693662631",ValidationType.success)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        arguments?.let {
            columnCount = it.getInt(ARG_COLUMN_COUNT)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentItemListBinding.inflate(inflater, container, false)
//        val view = inflater.inflate(R.layout.fragment_item_list, container, false)

        // Set the adapter

        with(binding.directionRecycler) {
                layoutManager = when {
                    columnCount <= 1 -> LinearLayoutManager(context)
                    else -> GridLayoutManager(context, columnCount)
                }
                adapter = MyItemRecyclerViewAdapter(locationQrCodes)
            }

        return binding.root
    }

    companion object {

        // TODO: Customize parameter argument names
        const val ARG_COLUMN_COUNT = "column-count"

        // TODO: Customize parameter initialization
        @JvmStatic
        fun newInstance(columnCount: Int) =
            ItemFragment().apply {
                arguments = Bundle().apply {
                    putInt(ARG_COLUMN_COUNT, columnCount)
                }
            }
    }
}

data class LocationQr(
    val id :String,
    val validation : ValidationType
)
enum class ValidationType(val value : Int){
    warning(0),success(1),error(3)
}