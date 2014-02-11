/*
 * ----------------------------------------------------------------------------
 * Copyright © 2014 by Basanta Raj Onta. All rights reserved.
 * ----------------------------------------------------------------------------
 */
package com.mt.quartz;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import com.mt.quartz.intervals.Day;

/**
 * Cron expression generator to generate week based expression.
 *
 * @author Basanta Raj Onta <basanta.onta (at) gmail (dot) com>
 * @version 1.0
 *
 */
public class WeekBasedExpression extends CronExpressionValidator implements CronExpressionGenerator {

	private CronExpression cronExpression;

	public WeekBasedExpression() {
		cronExpression = new CronExpression();
	}

	public WeekBasedExpression setTime(int hour, int minute) {
		// check hour
		hour = checkAndFix(hour, 0, 23);

		// check minute
		minute = checkAndFix(minute, 0, 59);

		this.cronExpression.setMinutes(String.valueOf(minute));
		this.cronExpression.setHours(String.valueOf(hour));

		return this;
	}

	public WeekBasedExpression setDays(Day... days) {

		List<String> dayOfWeeks = new ArrayList<String>(0);
		for (Day day : days) {
			dayOfWeeks.add(String.valueOf(day.getCode()));
		}

		this.cronExpression.setDayOfMonth("?");
		this.cronExpression.setMonth("*");
		this.cronExpression.setDayOfWeek(StringUtils.join(dayOfWeeks, ","));
		this.cronExpression.setYear("*");

		return this;
	}

	@Override
	public String getCronExpression() {
		return cronExpression.toString();
	}
}
