package com.example.joujonaapp.presentation.listfragment

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.example.joujonaapp.R

import com.example.joujonaapp.presentation.listfragment.placeholder.PlaceholderContent.PlaceholderItem
import com.example.joujonaapp.databinding.FragmentItemBinding

class MyItemRecyclerViewAdapter(
    private val values: List<LocationQr>
) : RecyclerView.Adapter<MyItemRecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        return ViewHolder(
            FragmentItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val item = values[position]
        holder.idView.text = item.id
        when (item.validation.value){
                 ValidationType.success.value->{holder.validationIcon.setImageDrawable(ContextCompat.getDrawable(holder.itemView.context,R.drawable.check_success_ic)) }
                 ValidationType.error.value->{holder.validationIcon.setImageDrawable(ContextCompat.getDrawable(holder.itemView.context,R.drawable.error_x_ic_)) }
                 else->{holder.validationIcon.setImageDrawable(ContextCompat.getDrawable(holder.itemView.context,R.drawable.warning_exclamation_ic)) }
        }
    }

    override fun getItemCount(): Int = values.size

    inner class ViewHolder(binding: FragmentItemBinding) : RecyclerView.ViewHolder(binding.root) {
        val idView: TextView = binding.itemNumber
        val validationIcon: ImageView = binding.iconValidation


    }

}