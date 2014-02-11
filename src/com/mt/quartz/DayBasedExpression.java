/*
 * ----------------------------------------------------------------------------
 * Copyright © 2014 by Basanta Raj Onta. All rights reserved.
 * ----------------------------------------------------------------------------
 */
package com.mt.quartz;

/**
 * Cron expression generator to generate day based expression.
 *
 * @author Basanta Raj Onta <basanta.onta (at) gmail (dot) com>
 * @version 1.0
 *
 */
public class DayBasedExpression extends CronExpressionValidator implements CronExpressionGenerator{

	private CronExpression cronExpression;

	public DayBasedExpression() {
		cronExpression = new CronExpression();
	}

	public DayBasedExpression setTime(int hour, int minute) {
		// check hour
		hour = checkAndFix(hour, 0, 23);

		// check minute
		minute = checkAndFix(minute, 0, 59);

		this.cronExpression.setMinutes(String.valueOf(minute));
		this.cronExpression.setHours(String.valueOf(hour));

		return this;
	}

	public DayBasedExpression setInterval(int interval) {
		// check interval
		interval = checkAndFix(interval, 1, 31);

		this.cronExpression.setDayOfMonth("1/" + interval);
		this.cronExpression.setMonth("*");
		this.cronExpression.setDayOfWeek("?");
		this.cronExpression.setYear("*");

		return this;

	}

	@Override
	public String getCronExpression() {
		return cronExpression.toString();
	}
}
