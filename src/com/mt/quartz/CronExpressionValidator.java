/*
 * ----------------------------------------------------------------------------
 * Copyright © 2014 by Basanta Raj Onta. All rights reserved.
 * ----------------------------------------------------------------------------
 */
package com.mt.quartz;

/**
 * Abstract class provides methods for checking and evaluating.
 *
 * @author Basanta Raj Onta <basanta.onta (at) gmail (dot) com>
 * @version 1.0
 *
 */
public abstract class CronExpressionValidator {

	public int checkAndFix(int input, int min, int max) {
		if (input < min) {
			input = min;
		} else if (input > max) {
			input = max;
		}
		return input;
	}
}
