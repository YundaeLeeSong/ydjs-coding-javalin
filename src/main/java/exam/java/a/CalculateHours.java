package exam.java.a;

/**
 * One of the accountants of your company, Roger, needs to calculate how many
 * hours of billing contractors should be paid for. The contractors enter work
 * completed in a number of minutes, which are all added together at the end of
 * each week. Help Roger by writing a program that sums all the values of a
 * given array of minutes and returns the number of hours and minutes as a
 * String.
 * 
 * Please provide an implementation for the 'calculateHours()' method. This
 * method takes an array of integers and should return a String of hours and
 * minutes, for instance: "2 hours and 15 minutes". Please note that each hour
 * is 60 minutes.
 * 
 * Keep the following in mind:
 * - The output should not include the hours or minutes if the value of the unit
 *   is 0. For instance, an input of 60 minutes should be "1 hour" and not
 *   "1 hour 0 minutes".
 * - The output should only be plural if the value of the unit is greater than
 *   one. For instance, "1 hour" and not "1 hours".
 * - The string output of the words should be lowercase. For instance, "1 hour"
 *   not "1 HOUR" or "1 Hour".
 * - If the input is less than one hour, then it should default to minutes.
 * - The spaces between input matter. For instance, it should be "1 hour", not
 *   "1hour".
 * 
 * NOTE: The first value of the input is the size of the array, and the
 * following values are the elements in the array!
 * 
 * Input Values                        Output
 * 6 [180, 90, 120, 120, 90, 150]      12 hours 30 minutes
 * 5 [15, 20, 35, 10, 5]               1 hour 25 minutes
 */
public class CalculateHours {
    public static String calculateHours(Integer[] arr) {
        Integer sum = 0;
        for (Integer el: arr) {
            sum += el;        
        }

        Integer hrs = sum / 60;
        Integer mins = sum % 60;
        String hrsStr = "";
        if (hrs > 1) {
            hrsStr = hrs + " hours";
        } else if (hrs == 1) {
            hrsStr = hrs + " hour";
        }
        
        String minsStr = "";
        if (mins > 1) {
            minsStr = mins + " minutes";
        } else if (mins == 1) {
            minsStr = mins + " minute";
        }

        if (hrsStr.length() == 0) return minsStr;
        if (minsStr.length() == 0) return hrsStr;
        return hrsStr + " " + minsStr;
    }
}


