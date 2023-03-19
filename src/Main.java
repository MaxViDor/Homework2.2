public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4 ();
        task5 ();
        task6 ();
        task7 ();
    }

    public static void task1() {
        System.out.println("Задача 1");
        byte b = 1;
        System.out.println("Значение переменной b с типом byte равно " + b);
        short s = 12;
        System.out.println("Значение переменной s с типом short равно " + s);
        int i = 123;
        System.out.println("Значение переменной i с типом int равно " + i);
        long l = 1234L;
        System.out.println("Значение переменной l с типом long равно " + l);
        float f = 1.1f;
        System.out.println("Значение переменной f с типом float равно " + f);
        double d = 1.12;
        System.out.println("Значение переменной d с типом double равно " + d);

    }

    public static void task2() {
        System.out.println("Задача 2");
        float f = 27.12f;
        long l = 987678965549L;
        float f1 = 2.786f;
        short s = 569;
        short s1 = -159;
        short s2 = 27897;
        byte b1 = 67;
    }

    public static void task3() {
        System.out.println("Задача 3");
        byte lpStudents = 23; //Количество учеников Людмилы Павловны
        byte asStudents = 27; //Количество учеников Фтты Сергеевны
        byte eaStudents = 30; //Количество учеников Екатерины Андреевны
        byte totalStudents = (byte) (lpStudents + asStudents + eaStudents);
        short totalListOfPaper = 480;
        System.out.println("На каждого ученика расчитано "+ totalListOfPaper / totalStudents+" листов бумаги");

    }
    public static void task4() {
        System.out.println("Задача 4");
        byte machineProductivityPerMinute = 16/2;
        System.out.println("За одну минуту машина произвела " +machineProductivityPerMinute+ "штук бутылок");
        short productivity20Minute = (short) (machineProductivityPerMinute * 20);
        System.out.println("За одну 20 минут машина произвела " +productivity20Minute+ "штук бутылок");
        short minutePerDay = 60 * 24;
        short productivityPerDay = (short) (machineProductivityPerMinute * minutePerDay);
        System.out.println("За один день машина произвела " +productivityPerDay+ "штук бутылок");
        int productivityPerThreeDays = productivityPerDay * 3;
        System.out.println("За три дня машина произвела " +productivityPerThreeDays+ "штук бутылок");
        int productivityPerMonth = productivityPerDay * 30;
        System.out.println("За один месяц машина произвела " +productivityPerMonth+ "штук бутылок");


    }
    public static void task5() {
        System.out.println("Задача 5");
        byte totalCanColor = 120;
        byte colorWhiteOnOneClass = 2;
        byte colorBraunOnOneClass = 4;
        byte canColorOnClass = (byte) (colorWhiteOnOneClass+colorBraunOnOneClass);
        byte howManyClasses = (byte) (totalCanColor / canColorOnClass);
        byte colorWhiteAllClasses = (byte) (howManyClasses * colorWhiteOnOneClass);
        byte colorBraunAllClasses = (byte) (howManyClasses * colorBraunOnOneClass);
        System.out.println("В школе, где " +howManyClasses+ " классов, нужно " +colorWhiteAllClasses+
                " банок белой краски и " +colorBraunAllClasses+ " банок коричневой краски." );


    }
    public static void task6() {
        System.out.println("Задача 6");
        byte bananasWeight = 80;
        byte milkWeight = 105;
        byte iceCreamWeight = 100;
        byte eggsWeight = 70;
        int weightProductsCoctailGramm = bananasWeight * 5 + milkWeight * 2 + iceCreamWeight * 2 + eggsWeight * 4;
        int weightProductsCoctailKg = weightProductsCoctailGramm / 1000;
        System.out.println("Вес спортзавтрака в граммах составляет " +weightProductsCoctailGramm+ " что в киллограмах составляет " +weightProductsCoctailKg+" кг");
    }
    public static void task7() {
        System.out.println("Задача 7");
        float needToSlim = 7f;
        float slimEveryDayVer1 = 0.250f;
        float slimEveryDayVer2 = 0.500f;
        float daysForResultVer1 = needToSlim / slimEveryDayVer1;
        float daysForResultVer2 = needToSlim / slimEveryDayVer2;
        System.out.println("Чтобы сбросить спортсмену " +needToSlim+ " кг, при ежедневной потере в " +slimEveryDayVer1+ " кг, понадобится " +daysForResultVer1+ " дней");
        System.out.println("Чтобы сбросить спортсмену " +needToSlim+ " кг, при ежедневной потере в " +slimEveryDayVer2+ " кг, понадобится " +daysForResultVer2+ " дней");

    }


}