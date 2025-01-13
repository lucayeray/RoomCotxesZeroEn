package com.enaitzdam.roomcotxeszero

import android.content.Context
import androidx.lifecycle.LiveData
import com.enaitzdam.roomcotxeszero.data.Cotxe
import com.enaitzdam.roomcotxeszero.data.dataBase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.launch

class Repositori {
    companion object {
        var repositori_database: dataBase? = null

        var cotxes: LiveData<List<Cotxe>>? = null

        //funció per a inicialitzar la BD

        fun initializeDB(context: Context): dataBase {
            return dataBase.getDatabase(context)
        }

        //TODO:funcio qyue cridi a l'insert

        fun inserirCotxe(context: Context, cotxe: Cotxe) {

            //Connectar la BD
            repositori_database = initializeDB(context)

            CoroutineScope(IO).launch {
                repositori_database!!.cotxeDao().afegirCotxe(cotxe)
            }
        }

        //TODO:funcio que torni la select

        fun obtenirCotxes(context: Context): LiveData<List<Cotxe>>? {
            //Connectar la BD
            repositori_database = initializeDB(context)

            CoroutineScope(IO).launch {
                cotxes = repositori_database!!.cotxeDao().obtenirCotxes()
            }

            return cotxes

        }

    }
}