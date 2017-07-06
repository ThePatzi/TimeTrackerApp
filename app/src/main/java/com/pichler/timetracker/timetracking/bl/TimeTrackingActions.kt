package com.pichler.timetracker.timetracking.bl

/**
 * Created by Patrick Pichler on 05-Jul-17.
 */
sealed class TimeTrackingActions {
  object StartTracking : TimeTrackingActions()

  object StopTracking : TimeTrackingActions()

  object ResetTracking : TimeTrackingActions()
}
