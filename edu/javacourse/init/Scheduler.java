package edu.javacourse.init;

public class Scheduler
{
    // Часто используется
    // public enum Weekday
    // {
    //     MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    // }

    // Редко используется
    // public enum Weekday
    // {
    //     MONDAY("Понедельник"), TUESDAY("Вторник"), WEDNESDAY("Среда"), 
    //     THURSDAY("Четверг"), FRIDAY("Пятница"), SATURDAY("Суббота"), SUNDAY("Воскресенье");

    //     String value;
    //     Weekday(String value)
    //     {
    //         this.value = value;
    //     }

    //     @Override
    //     public String toString()
    //     {
    //         return value;
    //     }
    // }

    // Очень редко используется
    public enum Weekday
    {
        MONDAY
        {
            @Override
            public String toString()
            {
                return "Понедельник";
            }
        },
        TUESDAY
        {
            @Override
            public String toString()
            {
                return "Вторник";
            }
        },
        WEDNESDAY
        {
            @Override
            public String toString()
            {
                return "Среда";
            }
        },
        THURSDAY
        {
            @Override
            public String toString()
            {
                return "Четверг";
            }
        },
        FRIDAY
        {
            @Override
            public String toString()
            {
                return "Пятница";
            }
        },
        SATURDAY
        {
            @Override
            public String toString()
            {
                return "Суббота";
            }
        },
        SUNDAY
        {
            @Override
            public String toString()
            {
                return "Воскресенье";
            }
        }
    }

    public static void main(String[] args)
    {
        System.out.println(Weekday.FRIDAY);
        Weekday wd = Weekday.FRIDAY;
        System.out.println(wd);
        System.out.println(wd.toString());
    }
}