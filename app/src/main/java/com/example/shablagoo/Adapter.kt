package com.example.shablagoo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter(private val evenList: ArrayList<Event>) :
    RecyclerView.Adapter<Adapter.MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Adapter.MyViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)

        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: Adapter.MyViewHolder, position: Int) {
        val event: Event = evenList[position]
        holder.evento.text = event.evento
        holder.precio.text = event.precio
        holder.local.text = event.local
        holder.fecha.text = event.fecha
    }

    override fun getItemCount(): Int {
        return evenList.size
    }

    public class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val evento: TextView = itemView.findViewById(R.id.txtEvento)
        val precio: TextView = itemView.findViewById(R.id.txtPrecio)
        val local: TextView = itemView.findViewById(R.id.txtLocal)
        val fecha: TextView = itemView.findViewById(R.id.txtFecha)

    }
}