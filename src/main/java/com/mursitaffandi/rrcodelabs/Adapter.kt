package com.mursitaffandi.rrcodelabs

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mursitaffandi.rrcodelabs.model.League

class Adapter(private val matchMatches: List<League>, private val listener: (League) -> Unit)
: RecyclerView.Adapter<VHLeague>() {

    var list = matchMatches
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): VHLeague {
        val v : View = LayoutInflater.from(p0.context).inflate(R.layout.item_league,p0,false)
        return VHLeague(v)
    }

    fun swapContent(matchMatches: List<League>){
        list = matchMatches
    notifyDataSetChanged()
}
    override fun getItemCount() = matchMatches.size

    override fun onBindViewHolder(vh: VHLeague, position: Int) {
        vh.bindValue(matchMatches.get(position))
    }


}
