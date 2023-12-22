package com.surajbaba.surajlibrary

import android.content.Context
import android.widget.Toast

object Test {
    fun print(context:Context){
        val toast=Toast.makeText(context,"this is for testing",Toast.LENGTH_SHORT)
        toast.show()

    }
}