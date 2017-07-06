package com.pichler.timetracker.timetracking.bl

import com.brianegan.bansa.Action
import com.brianegan.bansa.Reducer

/**
 * Created by Patrick Pichler on 7/6/2017.
 */
class TimeTrackingReducer : Reducer<TimeTrackingState> {
  override fun reduce(state: TimeTrackingState?, action: Action?): TimeTrackingState = state ?: TimeTrackingState()
}