package com.mursitaffandi.rrcodelabs

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView
import com.mursitaffandi.rrcodelabs.model.League
import org.jetbrains.anko.find

class VHLeague(view: View) : RecyclerView.ViewHolder(view){
    private val homeName: TextView = view.find(R.id.tv_name)

fun bindValue(model : League){
homeName.text = model.strLeague
}

}
