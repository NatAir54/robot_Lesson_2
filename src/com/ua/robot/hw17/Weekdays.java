package com.ua.robot.hw17;

public enum Weekdays {
    MONDAY(1), TUESDAY(2), WEDNESDAY(3),
    THURSDAY(4), FRIDAY(5), SATURDAY(6), SUNDAY(7);

    private final int weekdayNumber;

    Weekdays(int weekdayNumber) {
        this.weekdayNumber = weekdayNumber;
    }

    static void getWeekdayByNumber(int number) {
        switch (number) {
            case 1 -> System.out.println(MONDAY);
            case 2 -> System.out.println(TUESDAY);
            case 3 -> System.out.println(WEDNESDAY);
            case 4 -> System.out.println(THURSDAY);
            case 5 -> System.out.println(FRIDAY);
            case 6 -> System.out.println(SATURDAY);
            case 7 -> System.out.println(SUNDAY);
            default -> System.out.println("Illegal number. You can enter only integer number from 1 to 7.");
        }
    }

    @Override
    public String toString() {
        return this.name() + ", weekday number: " + weekdayNumber;
    }

}
