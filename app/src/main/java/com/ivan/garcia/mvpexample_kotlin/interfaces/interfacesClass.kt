package com.ivan.garcia.mvpexample_kotlin.interfaces

interface interfacesClass {

    interface View {
        fun updateUserInfoTextView(resultData: String)
    }

    //se comunica con la vista y el modelo, por eso tiene ambos metodos
    interface Presenter {
        fun updateUserInfoTextView(resultData: String)
        fun transformData(fullName: String, email: String)
    }

    interface Model {
        fun transformData(fullName: String, email: String)
    }
}