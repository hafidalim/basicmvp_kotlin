package com.example.mvpdummy.presenter

import com.example.mvpdummy.model.Data

interface MainView {
    //interface untuk menghubungkan antara view dengan presenter
    fun hasilPresenter(data: Data)
}