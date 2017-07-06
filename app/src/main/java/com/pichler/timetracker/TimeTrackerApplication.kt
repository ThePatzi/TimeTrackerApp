package com.pichler.timetracker

import android.app.Application
import com.github.salomonbrys.kodein.*

/**
 * Created by Patrick Pichler on 7/6/2017.
 */
class TimeTrackerApplication : Application(), KodeinAware {
  override val kodein by Kodein.lazy {
    bind<TimeTrackerApplication>() with instance(this@TimeTrackerApplication)
    bind<String>("log-tag") with instance("time-tracker")
  }
}