package com.ivan.garcia.mvpexample_kotlin.view

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.ivan.garcia.mvpexample_kotlin.R
import com.ivan.garcia.mvpexample_kotlin.interfaces.interfacesClass
import com.ivan.garcia.mvpexample_kotlin.model.User
import com.ivan.garcia.mvpexample_kotlin.presenter.MainActivityPresenter
import kotlinx.android.synthetic.main.activity_main.*
import java.io.Console

class MainActivity : AppCompatActivity(), interfacesClass.View {
    //Presenter
    private var presenter: MainActivityPresenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter = MainActivityPresenter(this)

        button2.setOnClickListener {
            safeData()
        }


        val nombre = "Jose";
        val email = "mail@mail.com";
        var usuario1: User = User(nombre, email)
        print("usuario: $usuario1")
    }

    fun safeData() {
        presenter?.transformData(userNameTxt.text.toString(), userMailTxt.text.toString())
    }

    override fun updateUserInfoTextView(resultData: String) {
        resultTxt.text = resultData
    }
}
