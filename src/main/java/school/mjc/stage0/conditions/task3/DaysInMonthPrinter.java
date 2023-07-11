package school.mjc.stage0.conditions.task3;

public class DaysInMonthPrinter {
    //Implement the program that will consume a number month from method argument
    //and print amount of days in that month, if number is not a month number -> print: "wrong number!":
    //1, 3, 5, 7, 8, 10, 12
    //4, 6, 9, 11

    public void amountOfDays(int month) {
        if (month < 1 || month > 12) System.out.println("wrong number!");
        else if (month == 2) System.out.println(28);
        else if (month == 4 || month == 6 ||month == 9 ||month == 11) System.out.println(30);
        else System.out.println(31);
    }
}
