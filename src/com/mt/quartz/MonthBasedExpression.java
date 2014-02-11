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
import com.mt.quartz.intervals.Rank;

/**
 * Cron expression generator to generate month based expression.
 *
 * @author Basanta Raj Onta <basanta.onta (at) gmail (dot) com>
 * @version 1.0
 *
 */
public class MonthBasedExpression extends CronExpressionValidator implements
		CronExpressionGenerator {

	private CronExpression cronExpression;

	public MonthBasedExpression() {
		cronExpression = new CronExpression();
	}

	public MonthBasedExpression setTime(int hour, int minute) {
		// check hour
		hour = checkAndFix(hour, 0, 23);

		// check minute
		minute = checkAndFix(minute, 0, 59);

		this.cronExpression.setMinutes(String.valueOf(minute));
		this.cronExpression.setHours(String.valueOf(hour));

		return this;
	}

	public MonthBasedExpression setDayOfMonthInterval(int month, int... days) {

		// check month interval
		month = checkAndFix(month, 1, 12);

		List<String> dayOfMonths = new ArrayList<String>(0);
		for (int day : days) {
			dayOfMonths.add(String.valueOf(day));
		}

		this.cronExpression.setDayOfMonth(StringUtils.join(dayOfMonths, ","));
		this.cronExpression.setMonth("1/" + month);
		this.cronExpression.setDayOfWeek("?");
		this.cronExpression.setYear("*");

		return this;

	}

	public MonthBasedExpression setDayRankOfMonthInterval(Rank rank, Day day, int month) {
		// check month
		month = checkAndFix(month, 1, 12);

		this.cronExpression.setDayOfMonth("?");
		this.cronExpression.setMonth("1/" + month);
		this.cronExpression.setDayOfWeek(day.getCode() + "#" + rank.getCode());
		this.cronExpression.setYear("*");

		return this;
	}

	@Override
	public String getCronExpression() {
		return cronExpression.toString();
	}
}
