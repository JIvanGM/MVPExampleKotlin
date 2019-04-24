package com.ivan.garcia.mvpexample_kotlin.presenter

import com.ivan.garcia.mvpexample_kotlin.interfaces.interfacesClass
import com.ivan.garcia.mvpexample_kotlin.model.User

class MainActivityPresenter : interfacesClass.Presenter {

    private var view: interfacesClass.View
    private var model: User

    constructor(view: interfacesClass.View) {
        this.view = view
        model = User(this)
    }

    override fun updateUserInfoTextView(resultData: String) {
        if (view != null) {
            view.updateUserInfoTextView(resultData)
        }
    }

    override fun transformData(fullName: String, email: String) {
        if (view != null) {
            model.transformData(fullName, email)
        }
    }
}