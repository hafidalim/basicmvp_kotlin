package com.example.mvpdummy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.mvpdummy.model.Data
import com.example.mvpdummy.presenter.MainPresenter
import com.example.mvpdummy.presenter.MainView

//inisialisasi presenter
class MainActivity : AppCompatActivity(), MainView {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //inisialisasi angka yg akan dihitung
        val numbOne = 10
        val numbTwo = 12

        //panggil presenter
        val presenter = MainPresenter(this)

        //panggil fungsi yang ada didalam presenter
        presenter.hitung(numbOne, numbTwo)

    }

    override fun hasilPresenter(data: Data) {

        //menampilkan data
        Log.d("Hasil", data.dataHasil.toString())
    }
}
