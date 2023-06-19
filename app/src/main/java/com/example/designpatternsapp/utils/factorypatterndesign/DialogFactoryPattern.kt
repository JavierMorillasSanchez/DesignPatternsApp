package com.example.designpatternsapp.utils

import android.app.Dialog
import android.content.Context
import com.example.designpatternsapp.R
import com.google.android.material.dialog.MaterialAlertDialogBuilder

interface CustomDialog{
    fun customDialog(context: Context): Dialog
}

abstract class DialogFactory {
    abstract fun createDialog(): CustomDialog
}

class InfoDialog: CustomDialog {

    companion object Factory: DialogFactory() {
        override fun createDialog(): CustomDialog = InfoDialog()

    }

    override fun customDialog(context: Context): Dialog {
        return MaterialAlertDialogBuilder(context)
            .setTitle("Titulo info")
            .setMessage("Texto info")
            .setPositiveButton("Boton info") { dialog, which -> { } }
            .show()
    }

}

class ErrorDialog: CustomDialog {

    companion object Factory: DialogFactory() {
        override fun createDialog(): CustomDialog = InfoDialog()

    }

    override fun customDialog(context: Context): Dialog {
        return MaterialAlertDialogBuilder(context)
            .setTitle("Titulo Error")
            .setMessage("Mensaje Error")
            .setPositiveButton("Boton Error") { dialog, which -> { } }
            .show()
    }

}

class TwoOptionDialog: CustomDialog {

    companion object Factory: DialogFactory() {
        override fun createDialog(): CustomDialog = InfoDialog()

    }

    override fun customDialog(context: Context): Dialog {
        return MaterialAlertDialogBuilder(context)
            .setTitle("Titulo 2 opciones")
            .setMessage("Mensaje 2 opciones")
            .setPositiveButton("Boton SI") { dialog, which -> { } }
            .setNegativeButton("Boton NO") { dialog, which -> { } }.show()
    }

}