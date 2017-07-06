package com.pichler.timetracker

import android.os.Bundle
import com.github.salomonbrys.kodein.Kodein
import com.github.salomonbrys.kodein.android.KodeinActivity
import com.github.salomonbrys.kodein.bind
import com.github.salomonbrys.kodein.instance
import org.jetbrains.anko.setContentView

class MainActivity : KodeinActivity() {
  private val logTag: String by instance("log-tag")

  override fun provideOverridingModule() = Kodein.Module {
    bind<String>("log-tag", overrides = true) with instance("main-activity")
  }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    MainActivityUI().setContentView(this)
  }
}

