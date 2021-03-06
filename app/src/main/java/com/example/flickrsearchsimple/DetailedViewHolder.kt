package com.example.flickrsearchsimple

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class DetailedViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    constructor(parent: ViewGroup) : this(LayoutInflater.from(parent.context).inflate(R.layout.detailed_item, parent, false))
}