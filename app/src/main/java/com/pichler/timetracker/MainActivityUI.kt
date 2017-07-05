package com.pichler.timetracker

import android.view.View
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk25.coroutines.onClick

class MainActivityUI : AnkoComponent<MainActivity> {
  override fun createView(ui: AnkoContext<MainActivity>): View = ui.apply {
    verticalLayout {
      val name = editText()

      button("Say Hello"){
        onClick { ctx.toast("Hello, ${name.text}") }
      }
    }
  }.view

}