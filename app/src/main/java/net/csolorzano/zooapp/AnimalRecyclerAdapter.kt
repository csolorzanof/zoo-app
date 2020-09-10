package net.csolorzano.zooapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_item.view.*
import net.csolorzano.zooapp.AnimalRecyclerAdapter.AnimalViewHolder

class AnimalRecyclerAdapter(val animals: MutableList<Animal>) : RecyclerView.Adapter<AnimalViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimalViewHolder {
        return AnimalViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,false))
    }

    override fun onBindViewHolder(holder: AnimalViewHolder, position: Int) {
        when(holder){
            is AnimalViewHolder ->{
                holder.bind(animals[position])
            }
        }
    }

    override fun getItemCount(): Int {
        return animals.size
    }

    class AnimalViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val titleView = itemView.txtTitle
        val descriptionView = itemView.txtDescription
        val imageView = itemView.imgPicture


        fun bind(animal: Animal){
            titleView.text = animal.name
            descriptionView.text = animal.description
            imageView.setImageResource(animal.image)
        }
    }
}