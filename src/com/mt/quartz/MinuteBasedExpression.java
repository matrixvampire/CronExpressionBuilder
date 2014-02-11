/*
 * ----------------------------------------------------------------------------
 * Copyright © 2014 by Basanta Raj Onta. All rights reserved.
 * ----------------------------------------------------------------------------
 */
package com.mt.quartz;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

/**
 * Cron expression generator to generate minute based expression.
 *
 * @author Basanta Raj Onta <basanta.onta (at) gmail (dot) com>
 * @version 1.0
 *
 */
public class MinuteBasedExpression extends CronExpressionValidator implements CronExpressionGenerator {

	private CronExpression cronExpression;

	public MinuteBasedExpression() {
		cronExpression = new CronExpression();
		cronExpression.setHours("*");
		cronExpression.setDayOfMonth("1/1");
		cronExpression.setMonth("*");
		cronExpression.setDayOfWeek("?");
		cronExpression.setYear("*");
	}

	public MinuteBasedExpression setInterval(int interval) {
		// check minute
		interval = checkAndFix(interval, 1, 60);

		this.cronExpression.setMinutes("0/" + interval);

		return this;
	}

	public MinuteBasedExpression setInterval(int... intervals) {

		List<String> minutes = new ArrayList<String>(0);
		for (int interval : intervals) {
			// check minute
			interval = checkAndFix(interval, 1, 60);

			minutes.add(String.valueOf(interval));
		}

		this.cronExpression.setMinutes(StringUtils.join(minutes, ","));

		return this;
	}

	@Override
	public String getCronExpression() {
		return cronExpression.toString();
	}
}
