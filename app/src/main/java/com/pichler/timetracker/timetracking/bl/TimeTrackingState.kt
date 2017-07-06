package com.pichler.timetracker.timetracking.bl

import org.funktionale.option.Option
import java.time.LocalDateTime

/**
 * Created by Patrick Pichler on 05-Jul-17.
 */
data class TimeTrackingState(val isTracking: Boolean = false,
                             val startTime: Option<LocalDateTime> = Option.None,
                             val endTime: Option<LocalDateTime> = Option.None)