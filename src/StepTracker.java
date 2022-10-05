import java.util.Scanner;

public class StepTracker {
    int[][] dayToMonth = new int[12][30];
    int goalOfSteps = 10000;

    public void savingsStepsByDay(int day, int month, int steps) {
        if (steps < 0) {
            System.out.println("Введите положительное число шагов");
        } else {
            dayToMonth[month-1][day-1] = steps;
            System.out.println(steps + " - было записанов в " + day + "-ый день " + month + "-ого месяца!");
        }
    }

    public void numberOfSteps(int month) {
        for (int i = 0; i < dayToMonth[month-1].length - 1; i++) {
            System.out.print((i + 1) + "-ый день: " + dayToMonth[month-1][i] + ",");
        }
        System.out.print(dayToMonth[month-1].length + "-ый день: " + dayToMonth[month-1][29]);
    }

    public int saveSumSteps(int month) {
        int sumSteps = 0;
        for (int i = 0; i < dayToMonth[month-1].length; i++) {
            sumSteps = sumSteps + dayToMonth[month-1][i];

        }
        return sumSteps;
    }

    public int saveMaxStep(int month) {
        int maxSteps = 0;
        for (int i = 0; i < dayToMonth[month-1].length; i++) {
            if (dayToMonth[month-1][i] > maxSteps) {
                maxSteps = dayToMonth[month-1][i];
            }
        }
        return maxSteps;
    }
    public double averageCountOfSteps(int month){
        double sumOfSteps = saveMaxStep(month);
        double countOfMonth = dayToMonth[month-1].length;
        return countOfMonth / sumOfSteps;
    }
    public int bestSeriesSteps(int month){
        int currentSeriesSteps = 0;
        int maxSeriesSteps = 0;
        for (int i = 0; i < dayToMonth[month-1].length; i++){
            if (dayToMonth[month-1][i] >= goalOfSteps ){
                currentSeriesSteps = currentSeriesSteps + 1;
                if (currentSeriesSteps > maxSeriesSteps){
                    maxSeriesSteps = currentSeriesSteps;
                }
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






