public class Unit1Task0 {
    public static void main(String[] args) {
        int day = 30;
        int month = 5;

        //операторы сравнения

        System.out.println("Операторы сравнения");
        if (day > month) {
            System.out.println("day > month = true");
        } else {
            System.out.println("day > month = false");
        }
        if (day >= month) {
            System.out.println("day >= month = true");
        } else {
            System.out.println("day >= month = false");
        }
        if (day < month) {
            System.out.println("day < month = true");
        } else {
            System.out.println("day < month = false");
        }
        if (day <= month) {
            System.out.println("day <= month = true");
        } else {
            System.out.println("day <= month = false");
        }
        if (day == month) {
            System.out.println("day == month = true");
        } else {
            System.out.println("day == month = false");
        }
        if (day != month) {
            System.out.println("day != month = true");
        } else {
            System.out.println("day != month = false");
        }

        // арифметические операторы
        System.out.println("Арифметические операторы");

        System.out.println("month + day = " + (month + day));
        System.out.println("month += day = " + (month += day));
        month = 5;
        System.out.println("month - day = " + (month - day));
        System.out.println("month -= day = " + (month -= day));
        month = 5;
        System.out.println("month * day = " + (month * day));
        System.out.println("month *= day = " + (month *= day));
        month = 5;
        System.out.println("month / day = " + ((double) month / day));
        System.out.println("month /= day = " + (month /= day));
        month = 5;
        System.out.println("month % day = " + (month % day));
        System.out.println("month %= day = " + (month %= day));
        month = 5;
        System.out.println("month++ = " + (month++));
        System.out.println("month-- = " + (month--));

        //битовые операторы
        System.out.println("Битовые операторы");

        System.out.println("month | day = " + (month | day));
        System.out.println("month |= day = " + (month |= day));
        System.out.println("month & day = " + (month & day));
        System.out.println("month &= day = " + (month &= day));
        System.out.println("month ^ day = " + (month ^ day));
        System.out.println("month ^= day = " + (month ^= day));
        System.out.println("month >> day = " + (month >> day));
        System.out.println("month >>= day = " + (month >>= day));
        System.out.println("month >>> day = " + (month >>> day));
        System.out.println("month >>>= day = " + (month >>>= day));
        System.out.println("month << day = " + (month << day));
        System.out.println("month <<= day = " + (month <<= day));

        //логические операторы
        System.out.println("Логические операторы");
        if (true || false) {
            System.out.println("true || false = " + (true || false));
        } else {
            System.out.println("true || false = " + (true || false));
        }
        if (true && false) {
            System.out.println("true && false = " + (true && false));
        } else {
            System.out.println("true && false = " + (true && false));
        }
    }
}
