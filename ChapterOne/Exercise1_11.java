package ChapterOne;

/* 1.11 (Population projection) The U.S. Census Bureau projects population based on the following assumptions:
 * ■ One birth every 7 seconds
 * ■ One death every 13 seconds
 * ■ One new immigrant every 45 seconds
 * Write a program to display the population for each of the next five years. Assume the current population is
 * 312,032,486 and one year has 365 days. Hint: In Java, if two integers perform division, the result is an integer.
 * The fractional part is truncated. For example, 5 / 4 is 1 (not 1.25) and 10 / 4 is 2 (not 2.5). To get an accurate
 * result with the fractional part, one of the values involved in the division must be a number with a decimal point.
 * For example, 5.0 / 4 is 1.25 and 10 / 4.0 is 2.5.
 */

public class Exercise1_11 {
    public static void main(String[] args) {
        long currentPopulation = 312032486;
        double daysInYear = 365;
        double secondsInYear = 31536000;
        double birthsPerYear = secondsInYear / 7.0;
        double deathsPerYear = secondsInYear / 13.0;
        double immigrantsPerYear = secondsInYear / 45.0;

        int year = 1;
        while(year <= 5){
            currentPopulation += birthsPerYear + immigrantsPerYear - deathsPerYear;
            System.out.println("The population in Year " + year + " is " + currentPopulation);
            year++;
        }

    }
}
