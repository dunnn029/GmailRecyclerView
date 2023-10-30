package com.example.gmail

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class ListMailAdapter(private val mailList: ArrayList<MailData>): BaseAdapter() {

    override fun getCount(): Int {
        return mailList.size
    }

    override fun getItem(p0: Int): MailData {
        return mailList[p0]
    }

    override fun getItemId(p0: Int): Long {
        return mailList[p0].mailID.toLong()
    }

    override fun getView(p0: Int, convertView: View?, parent: ViewGroup?): View? {
        var itemView = convertView

        // Nếu convertView = null, view này được sử dụng lại, chỉ cần cập nhật nội dung mới
        if (itemView == null)
            itemView = LayoutInflater.from(parent?.context).
                inflate(R.layout.list_item, parent, false)

        // Bind dữ liệu phần tử vào view
        val data: MailData = getItem(p0)
        val avatarText = itemView?.findViewById<TextView>(R.id.avatarText)
        val username = itemView?.findViewById<TextView>(R.id.username)
        val title = itemView?.findViewById<TextView>(R.id.mailTitle)
        val body = itemView?.findViewById<TextView>(R.id.mailBody)
        val timestamp = itemView?.findViewById<TextView>(R.id.timestamp)
        val isFavour = itemView?.findViewById<ImageView>(R.id.favourite)

        avatarText?.text = data.username.first().toString()
        username?.text = data.username
        title?.text = data.title
        body?.text = data.body
        timestamp?.text = data.timestamp

        // Đổi màu dấu sao khi click vào
        isFavour?.setOnClickListener {
            if (!data.isFavour) {
                isFavour?.setImageResource(R.drawable.star_border)
                data.isFavour = true
            }
            else {
                isFavour?.setImageResource(R.drawable.star_yellow)
                data.isFavour = false
            }
        }



        return itemView
    }
}