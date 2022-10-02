import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StepTracker steptracker = new StepTracker();
        Converter converter = new Converter();


        while (true) {
            printMenu();
            int command = scanner.nextInt();
            if (command == 1) {
                System.out.println("Выберите месяц:  [1-Янв]   [2-Фев]   [3-Мар]   [4-Апр]   [5-Май]   [6-Июнь] \n\t\t\t\t" +
                        " [7-Июль]   [8-Авг]   [9-Сен]  [10-Окт]  [11-Ноя]  [12-Дек]");
                int month = scanner.nextInt();
                System.out.println("Выберите нужное число: ");
                int day = scanner.nextInt();
                if (day < 1 | day > 30) {
                    System.out.println("Введен не правильный номер дня");
                } else {
                    System.out.println("Введите количество шагов:");
                    int steps = scanner.nextInt();
                    steptracker.savingsStepsByDay(day, month, steps);
                }


            } else if (command == 2) {
                System.out.println("Выберите месяц:  [1-Янв]   [2-Фев]   [3-Мар]   [4-Апр]   [5-Май]   [6-Июнь] \n\t\t\t\t" +
                        " [7-Июль]   [8-Авг]   [9-Сен]  [10-Окт]  [11-Ноя]  [12-Дек]");
                int month = scanner.nextInt();
                if (month < 1 | month > 12) {
                    System.out.println("Введен не правильный номер месяца");
                } else {
                    System.out.println("Кол-во пройденных шагов по дням за " + month + "-ый месяц: ");
                    steptracker.numberOfSteps(month);
                    System.out.println("Общее кол-во пройденных шагов за " + month + "-ый месяц = " + steptracker.saveSumSteps(month) + " шагов." );
                    System.out.println("Максимальное пройденное кол-во шагов за " + month + "-ый месяц = " + steptracker.saveMaxStep(month) + " шагов." );
                    System.out.println("Среднее кол-во шагов пройденных за " + month + "-ый месяц = " + steptracker.averageCountOfSteps(month) +  " шагов." );
                    System.out.println("Пройденная дистанция за " + month + "-ый месяц = " + converter.countingDistance(month, steptracker) + " км.");
                    System.out.println("Кол-во сожжённые калории за " + month + "-ый месяц = " + converter.countingCalories(month, steptracker) + " ккал.");
                    System.out.println("Лучшая серия: максимальное количество подряд идущих дней = "+
                                                       steptracker.bestSeriesSteps(month) + " подряд");


                }
            } else if (command == 3){
                System.out.println("Введите новое целевое кол-во шагов");
                int userInput = scanner.nextInt();
                steptracker.changerGoalSteps(userInput);

            } else if (command == 0) {
                System.out.println("Выход!");
                break;
            } else {
                System.out.println("Такой команды не существует, введите правильное значение!");
            }

        }
    }

        private static void printMenu () {
            System.out.println("1 - Сохранить колличество шагов за определённый день.");
            System.out.println("2 - Напечатать статистику за определённый месяц");
            System.out.println("3 - Изменить цель по количеству шагов в день ");
            System.out.println("0 - Выход");
        }

}