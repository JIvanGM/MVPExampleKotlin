package com.ivan.garcia.mvpexample_kotlin.model

import com.ivan.garcia.mvpexample_kotlin.interfaces.interfacesClass

class User : interfacesClass.Model {

    //presentador
    private lateinit var presenter: interfacesClass.Presenter

    //Model Data
    private lateinit var fullName: String
    private lateinit var email: String

    //constructores
    constructor(presenter: interfacesClass.Presenter) {
        this.presenter = presenter
    }

    constructor(nombre: String, email: String) {
        this.fullName = nombre
        this.email = email
    }

    override fun transformData(fullName: String, email: String) {
        this.fullName = fullName
        this.email = email
        presenter.updateUserInfoTextView(toString())
    }

    override fun toString(): String {
        return "Email : $email \n FullName : $fullName"
    }


}