package com.pichler.timetracker.timetracking

import android.os.Bundle
import com.brianegan.bansa.BaseStore
import com.brianegan.bansa.Store
import com.github.salomonbrys.kodein.Kodein
import com.github.salomonbrys.kodein.android.KodeinActivity
import com.github.salomonbrys.kodein.bind
import com.github.salomonbrys.kodein.instance
import com.github.salomonbrys.kodein.singleton
import com.pichler.timetracker.timetracking.bl.TimeTrackingReducer
import com.pichler.timetracker.timetracking.bl.TimeTrackingState
import com.pichler.timetracker.timetracking.ui.TimeTrackingUI
import org.jetbrains.anko.setContentView

class TimeTrackingActivity : KodeinActivity() {
  private val logTag: String by instance("log-tag")
  private val store: Store<TimeTrackingState> by instance("store")

  override fun provideOverridingModule() = Kodein.Module {
    bind<String>("log-tag", overrides = true) with instance("time-tracking")
    bind<Store<TimeTrackingState>>("store") with singleton { BaseStore(TimeTrackingState(), TimeTrackingReducer()) }
  }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    TimeTrackingUI().setContentView(this)
  }
}
