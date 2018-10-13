package com.mursitaffandi.rrcodelabs

import com.mursitaffandi.rrcodelabs.model.League

interface MainView {
    fun OnGetLeagueSuccess(leagues: List<League>)
    fun OnGetLeagueError(messageDigest: String)
}