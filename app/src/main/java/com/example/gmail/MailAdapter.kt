package com.example.gmail

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MailAdapter(private val mailList: ArrayList<MailData>): RecyclerView.Adapter<MailAdapter.ViewHolder>() {
    /**
     * Provide a reference to the type of views that you are using
     * (custom ViewHolder).
     */
    class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val avatarText = itemView.findViewById<TextView>(R.id.avatarText)
        val username = itemView.findViewById<TextView>(R.id.username)
        val title = itemView.findViewById<TextView>(R.id.mailTitle)
        val body = itemView.findViewById<TextView>(R.id.mailBody)
        val timestamp = itemView.findViewById<TextView>(R.id.timestamp)
        val isFavour = itemView.findViewById<ImageView>(R.id.favourite)
    }

    // Create new views
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context).
            inflate(R.layout.list_item, parent, false)
        return ViewHolder(itemView)
    }

    // Return the size of your dataset
    override fun getItemCount() = mailList.size

    // Replace the contents of a view
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.avatarText.text = mailList[position].username.first().toString()
        holder.username.text = mailList[position].username
        holder.title.text = mailList[position].title
        holder.body.text = mailList[position].body
        holder.timestamp.text = mailList[position].timestamp

        // Đổi màu dấu sao khi click vào
        holder.isFavour?.setOnClickListener {
            if (!mailList[position].isFavour) {
                holder.isFavour.setImageResource(R.drawable.star_border)
                mailList[position].isFavour = true
            }
            else {
                holder.isFavour.setImageResource(R.drawable.star_yellow)
                mailList[position].isFavour = false
            }
        }
    }


}