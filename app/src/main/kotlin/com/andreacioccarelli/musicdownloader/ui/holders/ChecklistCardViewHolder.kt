package com.andreacioccarelli.musicdownloader.ui.holders

import android.view.View
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.andreacioccarelli.musicdownloader.R

class ChecklistCardViewHolder(v: View) : RecyclerView.ViewHolder(v) {
    var icon: ImageView = v.findViewById(R.id.icon)
    var titleLayout: RelativeLayout = v.findViewById(R.id.title_layout)
    var title: TextView = v.findViewById(R.id.title)
    var card: CardView = v.findViewById(R.id.card)
}
