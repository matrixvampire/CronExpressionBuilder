/*
 * ----------------------------------------------------------------------------
 * Copyright © 2014 by Basanta Raj Onta. All rights reserved.
 * ----------------------------------------------------------------------------
 */
package com.mt.quartz.intervals;

/**
 * Interval enum for ranks.
 *
 * @author Basanta Raj Onta <basanta.onta (at) gmail (dot) com>
 * @version 1.0
 *
 */
public enum Rank {

	FIRST(1), SECOND(2), THIRD(3), FOURTH(4);

	private int code;

	private Rank(int code) {
		this.code = code;
	}

	public int getCode() {
		return code;
	}

	@Override
	public String toString() {
		// only capitalize the first letter
		String s = super.toString();
		return s.substring(0, 1) + s.substring(1).toLowerCase();
	}
}
