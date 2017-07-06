package com.pichler.timetracker.timetracking.ui

import android.view.View
import com.pichler.timetracker.timetracking.TimeTrackingActivity
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk25.coroutines.onClick

/**
 * Created by Patrick Pichler on 7/6/2017.
 */
class TimeTrackingUI : AnkoComponent<TimeTrackingActivity> {
  override fun createView(ui: AnkoContext<TimeTrackingActivity>): View = ui.apply {
    verticalLayout {
      val name = editText()

      button("Say Hello") {
        onClick { ctx.toast("Hello, ${name.text}") }
      }
    }
  }.view

}