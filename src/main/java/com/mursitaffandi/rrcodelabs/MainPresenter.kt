package com.mursitaffandi.rrcodelabs

import com.mursitaffandi.rrcodelabs.model.Leagues
import com.mursitaffandi.rrcodelabs.rest.APIBuilder
import com.mursitaffandi.rrcodelabs.rest.ApiService
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class MainPresenter(private val view: MainView) {

    fun kuy(){
        val login = APIBuilder.retrofits
                .create<ApiService>(ApiService::class.java)
                .getAllLeague()

        login.subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({response ->
                    view.OnGetLeagueSuccess(response.leagues)
                })
    }
}
