package com.enaitzdam.roomcotxeszero.afegirCotxe

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.enaitzdam.roomcotxeszero.Repositori
import com.enaitzdam.roomcotxeszero.data.Cotxe

class afegirCotxeViewModel:ViewModel() {

    //funció cridar repositori fegir cotxes
    fun nouCotxe(context: Context, any:Int, combustible:String, marca:String, cavalls:Int) {

        var cotxeVM=Cotxe(any,combustible,marca,cavalls)
        Repositori.inserirCotxe(context,cotxeVM)
    }
}