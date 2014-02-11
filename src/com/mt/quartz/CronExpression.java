/*
 * ----------------------------------------------------------------------------
 * Copyright © 2014 by Basanta Raj Onta. All rights reserved.
 * ----------------------------------------------------------------------------
 */
package com.mt.quartz;

/**
 * A simple bean class to store and create cron expression. The generated
 * expression is based on <code>Quartz</code> cron format. The format is
 * comprised of 6 required fields and one optional field separated by white
 * space. The fields respectively are described as follows:
 *
 *
 * <table cellspacing="8">
 * <tr>
 * <th align="left">Field Name</th>
 * <th align="left">&nbsp;</th>
 * <th align="left">Allowed Values</th>
 * <th align="left">&nbsp;</th>
 * <th align="left">Allowed Special Characters</th>
 * </tr>
 * <tr>
 * <td align="left"><code>Seconds</code></td>
 * <td align="left">&nbsp;</th>
 * <td align="left"><code>0-59</code></td>
 * <td align="left">&nbsp;</th>
 * <td align="left"><code>, - * /</code></td>
 * </tr>
 * <tr>
 * <td align="left"><code>Minutes</code></td>
 * <td align="left">&nbsp;</th>
 * <td align="left"><code>0-59</code></td>
 * <td align="left">&nbsp;</th>
 * <td align="left"><code>, - * /</code></td>
 * </tr>
 * <tr>
 * <td align="left"><code>Hours</code></td>
 * <td align="left">&nbsp;</th>
 * <td align="left"><code>0-23</code></td>
 * <td align="left">&nbsp;</th>
 * <td align="left"><code>, - * /</code></td>
 * </tr>
 * <tr>
 * <td align="left"><code>Day-of-month</code></td>
 * <td align="left">&nbsp;</th>
 * <td align="left"><code>1-31</code></td>
 * <td align="left">&nbsp;</th>
 * <td align="left"><code>, - * ? /</code></td>
 * </tr>
 * <tr>
 * <td align="left"><code>Month</code></td>
 * <td align="left">&nbsp;</th>
 * <td align="left"><code>1-12</code></td>
 * <td align="left">&nbsp;</th>
 * <td align="left"><code>, - * /</code></td>
 * </tr>
 * <tr>
 * <td align="left"><code>Day-of-Week</code></td>
 * <td align="left">&nbsp;</th>
 * <td align="left"><code>1-7</code></td>
 * <td align="left">&nbsp;</th>
 * <td align="left"><code>, - * ? / #</code></td>
 * </tr>
 * <tr>
 * <td align="left"><code>Year (Optional)</code></td>
 * <td align="left">&nbsp;</th>
 * <td align="left"><code>empty, 1970-2199</code></td>
 * <td align="left">&nbsp;</th>
 * <td align="left"><code>, - * /</code></td>
 * </tr>
 * </table>
 * <p>
 * For more information, see <code>CronExpression</code> in <code>Quartz</code>
 * API.
 *
 * @author Mobile-Technologies
 * @author Basanta Raj Onta <basanta.onta (at) mobile-technologies.com>
 * @version 1.0
 */
public class CronExpression {

	private String seconds;
	private String minutes;
	private String hours;
	private String dayOfMonth;
	private String month;
	private String dayOfWeek;
	private String year;

	public CronExpression() {
		this.seconds = "0";
		this.minutes = "0";
		this.hours = "0";
	}

	public CronExpression(String seconds, String minutes, String hours, String dayOfMonth,
			String month, String dayOfWeek, String year) {
		super();
		this.seconds = seconds;
		this.minutes = minutes;
		this.hours = hours;
		this.dayOfMonth = dayOfMonth;
		this.month = month;
		this.dayOfWeek = dayOfWeek;
		this.year = year;
	}

	public void setSeconds(String seconds) {
		this.seconds = seconds;
	}

	public void setMinutes(String minutes) {
		this.minutes = minutes;
	}

	public void setHours(String hours) {
		this.hours = hours;
	}

	public void setDayOfMonth(String dayOfMonth) {
		this.dayOfMonth = dayOfMonth;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public void setDayOfWeek(String dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}

	public void setYear(String year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return String.format("%s %s %s %s %s %s %s", seconds, minutes, hours, dayOfMonth, month,
				dayOfWeek, year);
	}
}
