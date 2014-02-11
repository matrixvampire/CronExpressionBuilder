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
import com.mt.quartz.intervals.Month;
import com.mt.quartz.intervals.Rank;

/**
 * Cron expression generator to generate year based expression.
 *
 * @author Basanta Raj Onta <basanta.onta (at) gmail (dot) com>
 * @version 1.0
 *
 */
public class YearBasedExpression extends CronExpressionValidator implements CronExpressionGenerator {

	private CronExpression cronExpression;

	public YearBasedExpression() {
		cronExpression = new CronExpression();
	}

	public YearBasedExpression setTime(int hour, int minute) {
		// check hour
		hour = checkAndFix(hour, 0, 23);

		// check minute
		minute = checkAndFix(minute, 0, 59);

		this.cronExpression.setMinutes(String.valueOf(minute));
		this.cronExpression.setHours(String.valueOf(hour));

		return this;
	}

	public YearBasedExpression setAtTheDaysOfEveryMonth(Month month, int... days) {

		List<String> dayOfMonths = new ArrayList<String>(0);
		for (int day : days) {
			dayOfMonths.add(String.valueOf(day));
		}

		this.cronExpression.setDayOfMonth(StringUtils.join(dayOfMonths, ","));
		this.cronExpression.setMonth(String.valueOf(month.getCode()));
		this.cronExpression.setDayOfWeek("?");
		this.cronExpression.setYear("*");

		return this;
	}

	public YearBasedExpression setDayRankOfEveryMonth(Rank rank, Day day, Month month) {

		this.cronExpression.setDayOfMonth("?");
		this.cronExpression.setMonth(String.valueOf(month.getCode()));
		this.cronExpression.setDayOfWeek(day.getCode() + "#" + rank.getCode());
		this.cronExpression.setYear("*");

		return this;
	}

	@Override
	public String getCronExpression() {
		return cronExpression.toString();
	}
}
