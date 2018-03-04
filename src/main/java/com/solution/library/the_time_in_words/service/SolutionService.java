package com.solution.library.the_time_in_words.service;

import org.springframework.stereotype.Service;

@Service
public class SolutionService {

	public String convertNumToTimeString(int n) {
		switch (n) {
		case 1:
			return "one";
		case 2:
			return "two";
		case 3:
			return "three";
		case 4:
			return "four";
		case 5:
			return "five";
		case 6:
			return "six";
		case 7:
			return "seven";
		case 8:
			return "eight";
		case 9:
			return "nine";
		case 10:
			return "ten";
		case 11:
			return "eleven";
		case 12:
			return "twelve";
		case 13:
			return "thirteen";
		case 14:
			return "fourteen";
		case 15:
			return "quarter";
		case 16:
			return "sixteen";
		case 17:
			return "seventeen";
		case 18:
			return "eighteen";
		case 19:
			return "nineteen";
		case 20:
			return "twenty";
		case 21:
			return "twenty one";
		case 22:
			return "twenty two";
		case 23:
			return "twenty three";
		case 24:
			return "twenty four";
		case 25:
			return "twenty five";
		case 26:
			return "twenty six";
		case 27:
			return "twenty seven";
		case 28:
			return "twenty eight";
		case 29:
			return "twenty nine";
		case 30:
			return "half";
		default:
			return "";

		}
	}

	public String getTimeString(String s) {
		String time[] = s.split(":");
		String hour;
		int minute = Integer.parseInt(time[1]);
		if (minute <= 30)
			hour = convertNumToTimeString(Integer.parseInt(time[0]));
		else
			hour = convertNumToTimeString(Integer.parseInt(time[0]) + 1);
		if (minute==0)
			return hour+" o' clock";
		String minToString = convertNumToTimeString(minute > 30 ? 60 - minute : minute);
		String middle = minute == 1 ? " minute" : minute == 30 || minute == 45 || minute == 15 ? "" : " minutes";
		if (minute > 30)
			return minToString + middle + " to " + hour;
		else
			return minToString + middle + " past " + hour;

	}
}
