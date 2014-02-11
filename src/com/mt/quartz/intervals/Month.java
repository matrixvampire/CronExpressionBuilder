/*
 * ----------------------------------------------------------------------------
 * Copyright © 2014 by Basanta Raj Onta. All rights reserved.
 * ----------------------------------------------------------------------------
 */
package com.mt.quartz.intervals;

/**
 * Interval enum for months.
 *
 * @author Basanta Raj Onta <basanta.onta (at) gmail (dot) com>
 * @version 1.0
 */
public enum Month {
	JANUARY(1, "JAN"),
	FEBRUARY(2, "FEB"),
	MARCH(3, "MAR"),
	APRIL(4, "APR"),
	MAY(5, "MAY"),
	JUNE(6, "JUN"),
	JULY(7, "JUL"),
	AUGUST(8, "AUG"),
	SEPTMEBER(9, "SEP"),
	OCTOBER(10, "OCT"),
	NOVEMBER(11, "NOV"),
	DECEMBER(12, "DEC");

	private int code;
	private String word;

	private Month(int code, String word) {
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
