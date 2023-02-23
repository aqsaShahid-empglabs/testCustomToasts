package com.example.cicdtestinglibrarymodule

import android.content.Context
import android.widget.Toast

class CICDToast {
    companion object{
         fun publistToast(context: Context, string: String){
             Toast.makeText(context,string,Toast.LENGTH_LONG)
         }
    }
}