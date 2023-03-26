package com.n11.manager;

import com.n11.pages.FirstCase;
import com.n11.pages.SecondCase;
import com.n11.pages.ThirdCase;

public class PageInitializer extends DriverManager {

	public static ThirdCase thirdCase;
	public static FirstCase firstCase;
	public static SecondCase secondCase;

	public static void initialize() {
		// initialize pages
		thirdCase = new ThirdCase();
		firstCase = new FirstCase();
		secondCase = new SecondCase();
	}

}

