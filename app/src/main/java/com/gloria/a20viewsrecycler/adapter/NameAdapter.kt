package com.gloria.a20viewsrecycler.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.gloria.a20viewsrecycler.databinding.ActivityMainBinding
import com.gloria.a20viewsrecycler.model.Name
import java.text.ParsePosition

class NameAdapter(val names: List <Name> : RecyclerView.Adapter<NameAdapter.NameViewHolder>) {
    class NameViewHolder(var binding: NameItemBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind (names: Name){
            binding.profilepicture.setImageResource(name.profile)
            binding.firstname.text = name.first
            binding.lastname.text = name.text
        }
fun initialize(name: Name, action:OnNameItemClicklistner){
    binding.profilepicture.setImageResource(name.profile)
    binding.firstname.text = name.first
    binding.lastName.text =name.last

    binding.root.setOnClickListner{
        action.OnItemClick(name, adapterPosition)
    }
}
    }

    override fun oncreateViewHolder(parent: ViewGroup. viewType: Int): NameViewHolder{
        val binding = NameItemBinding.Inflate(LayoutInflater.from(parent.context))
        return NameViewHolder(binding)

    }
    override fun OnBindViewHolder(holder: NameViewHolder, position: Int){
        val names = names[position]
    holder.bind(name)
    holder.initialize(names[position], clickListener)
    }
    override fun getItemCount(): Int{
        return names.size
    }
}
interface OnNameItemClickListener{
    fun onItemClick(name: Name, position: Int)

}