package com.enaitzdam.roomcotxeszero.llistatCotxes

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.enaitzdam.roomcotxeszero.R
import com.enaitzdam.roomcotxeszero.data.Cotxe

class CotxesAdapter(private val mList: List<Cotxe>) : RecyclerView.Adapter<CotxesAdapter.ViewHolder>() {

    // create new views
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // inflates the card_view_design view
        // that is used to hold list item
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.cardiview_cotxe, parent, false)

        return ViewHolder(view)
    }

    // binds the list items to a view
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val cotxe = mList[position]

        holder.textViewMarca.text = cotxe.marca
        holder.textViewCombustible.text = cotxe.combustible
        holder.textViewAny.text = cotxe.any.toString()
        holder.textViewCavalls.text = cotxe.cavalls.toString()
    }

    // return the number of the items in the list
    override fun getItemCount(): Int {
        return mList.size
    }

    // Holds the views for adding it to image and text
    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val textViewMarca: TextView = itemView.findViewById(R.id.textViewMarca)
        val textViewCavalls: TextView = itemView.findViewById(R.id.textViewCavalls)
        val textViewAny: TextView = itemView.findViewById(R.id.textViewAny)
        val textViewCombustible: TextView = itemView.findViewById(R.id.textViewCombustible)
    }
}