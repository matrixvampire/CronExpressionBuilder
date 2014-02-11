/*
 * ----------------------------------------------------------------------------
 * Copyright © 2014 by Basanta Raj Onta. All rights reserved.
 * ----------------------------------------------------------------------------
 */
package com.mt.quartz;

/**
 * Cron expression builder provides methods to make minute-based, hour-based,
 * day-based, week-based, month-based, year-based expression.
 *
 * @author Basanta Raj Onta <basanta.onta (at) gmail (dot) com>
 * @version 1.0
 *
 */
public class CronExpressionBuilder {

	private CronExpressionGenerator cronExpressionGenerator;

	private MinuteBasedExpression minuteBasedExpression;
	private HourBasedExpression hourBasedExpression;
	private DayBasedExpression dayBasedExpression;
	private WeekBasedExpression weekBasedExpression;
	private MonthBasedExpression monthBasedExpression;
	private YearBasedExpression yearBasedExpression;

	public MinuteBasedExpression makeMinuteBasedExpression() {
		minuteBasedExpression = new MinuteBasedExpression();
		cronExpressionGenerator = minuteBasedExpression;
		return minuteBasedExpression;
	}

	public HourBasedExpression makeHourBasedExpression() {
		hourBasedExpression = new HourBasedExpression();
		cronExpressionGenerator = hourBasedExpression;
		return hourBasedExpression;
	}

	public DayBasedExpression makeDayBasedExpression() {
		dayBasedExpression = new DayBasedExpression();
		cronExpressionGenerator = dayBasedExpression;
		return dayBasedExpression;
	}

	public WeekBasedExpression makeWeekBasedExpression() {
		weekBasedExpression = new WeekBasedExpression();
		cronExpressionGenerator = weekBasedExpression;
		return weekBasedExpression;
	}

	public MonthBasedExpression makeMonthBasedExpression() {
		monthBasedExpression = new MonthBasedExpression();
		cronExpressionGenerator = monthBasedExpression;
		return monthBasedExpression;
	}

	public YearBasedExpression makeYearBasedExpression() {
		yearBasedExpression = new YearBasedExpression();
		cronExpressionGenerator = yearBasedExpression;
		return yearBasedExpression;
	}

	public CronExpressionGenerator getCronExpressionGenerator() {
		return cronExpressionGenerator;
	}
}
