/*
 * ----------------------------------------------------------------------------
 * Copyright © 2014 by Basanta Raj Onta. All rights reserved.
 * ----------------------------------------------------------------------------
 */
package com.mt.quartz.intervals;

/**
 * Interval enum for days.
 *
 * @author Basanta Raj Onta <basanta.onta (at) gmail (dot) com>
 * @version 1.0
 */
public enum Day {
	SUNDAY(1, "SUN"),
	MONDAY(2, "MON"),
	TUESDAY(3, "TUE"),
	WEDNESDAY(4, "WED"),
	THURSDAY(5, "THU"),
	FRIDAY(6, "FRI"),
	SATURDAY(7, "SAT");

	private int code;
	private String word;

	private Day(int code, String word) {
		this.code = code;
		this.word = word;
	}

	public int getCode() {
		return code;
	}

	public String getWord() {
		return word;
	}

	@Override
	public String toString() {
		// only capitalize the first letter
		String s = super.toString();
		return s.substring(0, 1) + s.substring(1).toLowerCase();
	}
}
