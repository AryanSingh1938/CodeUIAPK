package com.example.spaceexplorerapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.spaceexplorerapp.databinding.CardCellBinding

class CardAdapter(
    private val planet: List<Planet>,
    private val clickListener: BookClickListener)
    : RecyclerView.Adapter<CardViewHolder>()
{
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CardViewHolder {
        val from = LayoutInflater.from(parent.context)
        val binding = CardCellBinding.inflate(from, parent, false)
        return CardViewHolder(binding,clickListener)
    }

    override fun onBindViewHolder(
        holder: CardViewHolder,
        position: Int
    ) {
        holder.bindPlanet(planet[position])
    }

    override fun getItemCount(): Int = planet.size

}