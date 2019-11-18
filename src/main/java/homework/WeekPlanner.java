package homework;

import java.util.Scanner;

public class WeekPlanner {

    public static void main(String[] args) {
        String[][] schedule = new String[7][2];
        schedule[0][0] = "Sunday";
        schedule[0][1] = "do the homework";
        schedule[1][0] = "Monday";
        schedule[1][1] = "go to courses";
        schedule[2][0] = "Tuesday";
        schedule[2][1] = "watch the film";
        schedule[3][0] = "Wednesday";
        schedule[3][1] = "take a shower";
        schedule[4][0] = "Thursday";
        schedule[4][1] = "write a quiz";
        schedule[5][0] = "Friday";
        schedule[5][1] = "read a chapter from networking";
        schedule[6][0] = "Saturday";
        schedule[6][1] = "meet with friend";
        while (true) {
            System.out.println("Please, input the day of the week:");
            String day = getDay();
            day = day.trim();
            //the task said to use "switch" operator, but it wouldn't work
            if (day.equalsIgnoreCase("Sunday")) {
                System.out.printf("Your task for %s: %s\n", day, schedule[0][1]);
                continue;
            } else if (day.equalsIgnoreCase("Monday")) {
                System.out.printf("Your task for %s: %s\n", day, schedule[1][1]);
                continue;
            } else if (day.equalsIgnoreCase("Tuesday")) {
                System.out.printf("Your task for %s: %s\n", day, schedule[2][1]);
                continue;
            } else if (day.equalsIgnoreCase("Wednesday")) {
                System.out.printf("Your task for %s: %s\n", day, schedule[3][1]);
                continue;
            } else if (day.equalsIgnoreCase("Thursday")) {
                System.out.printf("Your task for %s: %s\n", day, schedule[4][1]);
                continue;
            } else if (day.equalsIgnoreCase("Friday")) {
                System.out.printf("Your task for %s: %s\n", day, schedule[5][1]);
                continue;
            } else if (day.equalsIgnoreCase("Saturday")) {
                System.out.printf("Your task for %s: %s\n", day, schedule[6][1]);
                continue;
            } else if (day.equalsIgnoreCase("exit")) {
                break;
            } else {
                System.out.println("Sorry, I don't understand you, please try again.");
                continue;
            }
        }

    }

    static String getDay() {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
}
