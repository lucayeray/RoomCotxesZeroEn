package com.enaitzdam.roomcotxeszero.llistatCotxes

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.enaitzdam.roomcotxeszero.Repositori
import com.enaitzdam.roomcotxeszero.data.Cotxe

class llistarCotxesViewModel:ViewModel() {

    //HAuria de ser MutableLiveData!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    private var _llistat_cotxes: LiveData<List<Cotxe>>?=null
    val llistat_cotxes: LiveData<List<Cotxe>>?
        get()=_llistat_cotxes


    //funció obtenirCotxes

    fun llistar_cotxes(context: Context) {
        _llistat_cotxes = Repositori.obtenirCotxes(context)
    }


}