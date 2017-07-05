package com.pichler.nfctimetracker

import android.app.Activity
import android.os.Bundle
import org.jetbrains.anko.*

class MainActivity : Activity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    MainActivityUI().setContentView(this)
  }
}

