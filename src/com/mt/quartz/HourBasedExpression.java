/*
 * ----------------------------------------------------------------------------
 * Copyright © 2014 by Basanta Raj Onta. All rights reserved.
 * ----------------------------------------------------------------------------
 */
package com.mt.quartz;

/**
 * Cron expression generator to generate hour based expression.
 *
 * @author Basanta Raj Onta <basanta.onta (at) gmail (dot) com>
 * @version 1.0
 *
 */
public class HourBasedExpression extends CronExpressionValidator implements CronExpressionGenerator {

	private CronExpression cronExpression;

	public HourBasedExpression() {
		cronExpression = new CronExpression();
		cronExpression.setDayOfMonth("1/1");
		cronExpression.setMonth("*");
		cronExpression.setDayOfWeek("?");
		cronExpression.setYear("*");
	}

	public HourBasedExpression setInterval(int interval) {
		// check interval
		interval = checkAndFix(interval, 1, 24);

		this.cronExpression.setMinutes("0");
		this.cronExpression.setHours("0/" + interval);

		return this;
	}

	public HourBasedExpression setTime(int hour, int minute) {
		// check hour
		hour = checkAndFix(hour, 0, 23);

		// check minute
		minute = checkAndFix(minute, 0, 59);

		this.cronExpression.setMinutes(String.valueOf(minute));
		this.cronExpression.setHours(String.valueOf(hour));

		return this;
	}

	@Override
	public String getCronExpression() {
		return cronExpression.toString();
	}

}
