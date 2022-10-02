import java.util.Scanner;

public class StepTracker {
    int[][] dayToMonth = new int[12][30];
    int goalOfSteps = 10000;

    public void savingsStepsByDay(int day, int month, int steps) {
        if (steps < 0) {
            System.out.println("Введите положительное число шагов");
        } else {
            dayToMonth[month][day] = steps;
            System.out.println(steps + " - было записанов в " + day + "-ый день " + month + "-ого месяца!");
        }
    }

    public void numberOfSteps(int month) {
        for (int i = 0; i < dayToMonth[month].length - 1; i++) {
            System.out.println((i + 1) + "-ый день: " + dayToMonth[month][i] + ",");
        }
        System.out.println(dayToMonth[month].length + "-ый день: " + dayToMonth[month][29]);
    }

    public int saveSumSteps(int month) {
        int sumSteps = 0;
        for (int i = 0; i < dayToMonth[month].length; i++) {
            sumSteps = sumSteps + dayToMonth[month][i];

        }
        return sumSteps;
    }

    public int saveMaxStep(int month) {
        int maxSteps = 0;
        for (int i = 0; i < dayToMonth[month].length; i++) {
            if (dayToMonth[month][i] > maxSteps) {
                maxSteps = dayToMonth[month][i];
            }
        }
        return maxSteps;
    }
    public double averageCountOfSteps(int month){
        double sumOfSteps = saveMaxStep(month);
        double countOfMonth = dayToMonth[month].length;
        return countOfMonth / sumOfSteps;
    }
    public int bestSeriesSteps(int month){
        int seriesSteps = 1;
        int maxSeriesSteps = 0;
        for (int i = 0; i < dayToMonth[month].length; i++){
            if (dayToMonth[month][i] >= goalOfSteps ){
                maxSeriesSteps = maxSeriesSteps + 1;
            }
        }
        return maxSeriesSteps;
    }
    public void changerGoalSteps(int userInput){
        if (userInput < 0){
            System.out.println("Введите положительное число!");
        }else {
            goalOfSteps = userInput;
            System.out.println("Цель по количесвту шагов за день изменена на: " + goalOfSteps + " шагов.");
        }

    }
}






