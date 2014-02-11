/*
 * ----------------------------------------------------------------------------
 * Copyright © 2014 by Basanta Raj Onta. All rights reserved.
 * ----------------------------------------------------------------------------
 */
package com.mt.quartz;

import com.mt.quartz.intervals.Day;
import com.mt.quartz.intervals.Month;
import com.mt.quartz.intervals.Rank;

/**
 * Cron expression builder test
 *
 * @author Basanta Raj Onta <basanta.onta (at) gmail (dot) com>
 * @version 1.0
 *
 */
public class CronExpressionBuilderTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		CronExpressionBuilder builder = new CronExpressionBuilder();


		builder.makeMinuteBasedExpression().setInterval(61);
		System.out.println(builder.getCronExpressionGenerator().getCronExpression());

		builder.makeMinuteBasedExpression().setInterval(25,50);
		System.out.println(builder.getCronExpressionGenerator().getCronExpression());


		builder.makeHourBasedExpression().setInterval(1);
		System.out.println(builder.getCronExpressionGenerator().getCronExpression());

		builder.makeHourBasedExpression().setInterval(23);
		System.out.println(builder.getCronExpressionGenerator().getCronExpression());

		builder.makeHourBasedExpression().setTime(19, 0);
		System.out.println(builder.getCronExpressionGenerator().getCronExpression());

		builder.makeDayBasedExpression().setTime(12, 30).setInterval(12);
		System.out.println(builder.getCronExpressionGenerator().getCronExpression());

		builder.makeWeekBasedExpression().setTime(12, 30)
				.setDays(Day.MONDAY, Day.WEDNESDAY, Day.FRIDAY);
		System.out.println(builder.getCronExpressionGenerator().getCronExpression());

		builder.makeMonthBasedExpression().setDayOfMonthInterval(5, 1).setTime(19, 0);
		System.out.println(builder.getCronExpressionGenerator().getCronExpression());

		builder.makeMonthBasedExpression().setTime(19, 0)
				.setDayRankOfMonthInterval(Rank.FIRST, Day.SUNDAY, 5);
		System.out.println(builder.getCronExpressionGenerator().getCronExpression());

		builder.makeYearBasedExpression().setTime(12, 30)
				.setAtTheDaysOfEveryMonth(Month.AUGUST, 11);
		System.out.println(builder.getCronExpressionGenerator().getCronExpression());

		builder.makeYearBasedExpression().setTime(12, 40)
				.setDayRankOfEveryMonth(Rank.FIRST, Day.SUNDAY, Month.AUGUST);
		System.out.println(builder.getCronExpressionGenerator().getCronExpression());

	}

}
