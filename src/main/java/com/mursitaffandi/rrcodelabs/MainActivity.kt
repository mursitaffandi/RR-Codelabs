package com.mursitaffandi.rrcodelabs

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.mursitaffandi.rrcodelabs.model.League
import org.jetbrains.anko.toast

class MainActivity : AppCompatActivity() , MainView{
    override fun OnGetLeagueError(messageDigest: String) {
    }

    override fun OnGetLeagueSuccess(leagues: List<League>) {
        println(leagues[0].strLeague)

    }
private lateinit var  presenter:MainPresenter
    private lateinit var adapter: Adapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter = MainPresenter(this)
        presenter.kuy()
        adapter = Adapter(mutableListOf()){
            toast(it.strLeague)
        }
    }
}
