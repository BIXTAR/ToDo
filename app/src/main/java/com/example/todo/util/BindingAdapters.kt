package com.example.todo.util

import android.graphics.Color
import android.widget.TextView
import androidx.databinding.BindingAdapter
import java.text.DateFormat

@BindingAdapter("setPriority")
fun setPriority(view: TextView, priority: Int){
    when(priority){
        1 -> {
            view.text = "1"
            view.setTextColor(Color.rgb(197,29,52))
        }
        2 -> {
            view.text = "2"
            view.setTextColor(Color.rgb(255,191,0))
        }
        3 -> {
            view.text = "3"
            view.setTextColor(Color.rgb(0,125,52))
        }
    }
}
@BindingAdapter("setTimestamp")
fun setTimestamp(view: TextView, timestamp: Long){
    view.text = DateFormat.getInstance().format(timestamp)
}