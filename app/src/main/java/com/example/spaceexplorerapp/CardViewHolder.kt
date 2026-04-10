package com.example.spaceexplorerapp

import androidx.recyclerview.widget.RecyclerView
import com.example.spaceexplorerapp.databinding.CardCellBinding

class CardViewHolder(
    private val cardCellBinding: CardCellBinding,
    private val clickListener: BookClickListener
) : RecyclerView.ViewHolder(cardCellBinding.root)
{
    fun bindPlanet(planet: Planet)
    {
        cardCellBinding.iv1.setImageResource(planet.imageResId)
        cardCellBinding.title.text = planet.name

        cardCellBinding.cardView.setOnClickListener {
            clickListener.onClick(planet)
        }
    }
}