package com.example.mvpdummy.presenter

import com.example.mvpdummy.MainActivity
import com.example.mvpdummy.model.Data


//buat constructor MainView
class MainPresenter(val data: MainView) {
    //buat fungsi untuk menghitung bilangan di mainActivity
    fun hitung(numbOne : Int, numbTwo : Int){
        //buat variabel baru namanya hasil  , masukin rumus nya
        val hasil = numbOne.times(numbTwo)

        //buat variable untuk memanggil model
        val model = Data()
        //panggil model
        model.dataHasil = hasil
        data.hasilPresenter(model)

    }
}