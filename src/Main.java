public class Main {
    public static void main(String[] args) {
        int i = 900000;
        byte b = 112;
        short s = 30554;
        long l = 33589575892L;
        float f = 2.564444f;
        double d = 1.754545448474;
        System.out.println("Значение переменной i с типом int равно " + i + ".");
        System.out.println("Значение переменной b с типом byte равно " + b + ".");
        System.out.println("Значение переменной s с типом short равно " + s + ".");
        System.out.println("Значение переменной l с типом long равно " + l + ".");
        System.out.println("Значение переменной f с типом float равно " + f + ".");
        System.out.println("Значение переменной d с типом double равно " + d + ".");

        float znachOne = 27.12f;
        long znachTwo = 987678965549L;
        double znachThree = 2.786;
        short znachFour = 569;
        short znachFive = -159;
        int znachSix = 27897;
        byte znachSeven = 67;
        System.out.println(znachOne);
        System.out.println(znachTwo);
        System.out.println(znachThree);
        System.out.println(znachFour);
        System.out.println(znachFive);
        System.out.println(znachSix);
        System.out.println(znachSeven);

        byte lydPav = 23;
        byte annSer = 27;
        byte katAnd = 30;
        short list = 480;
        int studentList = list / (lydPav + annSer +katAnd);
        System.out.println("На каждого ученика расчитано " + studentList + " листов бумаги.");

        byte numBottles = 16;
        byte timeOne = 2;
        int powerMachine = numBottles / timeOne;
        int twentyMin = powerMachine * 20;
        int day = powerMachine * 60 * 24;
        int threeDay = powerMachine * 60 * 24 * 3;
        int month = powerMachine * 60 * 24 * 30;
        System.out.println("За 20 минут машина произвела " + twentyMin + " штук бутылок.");
        System.out.println("За сутки машина произвела " + day + " штук бутылок.");
        System.out.println("За 3 дня машина произвела " + threeDay + " штук бутылок.");
        System.out.println("За месяц машина произвела " + month + " штук бутылок.");

        byte jarPaint = 120;
        byte oneClassWhite = 2;
        byte oneClassBrown = 4;
        int oneClassPaint = oneClassBrown + oneClassWhite;
        int classroom = jarPaint / oneClassPaint;
        int whitePaint = classroom * oneClassWhite;
        int brownPaint = classroom * oneClassBrown;
        System.out.println("В школе, где " + classroom + " классов, нужно " + whitePaint + " банок белой краски и " + brownPaint + " банок коричневой краски.");

        byte banana = 80;
        byte milk = 105;
        byte iceCream = 100;
        byte eggs = 70;
        int massGram = banana * 5 + milk * 2 + iceCream * 2 + eggs * 4;
        float massKilo = massGram / 1000f;
        System.out.println("Завтрак составит " + massGram + " грамм (" + massKilo + " кг).");

        short mass = 7000;
        short minimum = 250;
        short maximum = 500;
        int minTime = mass / minimum;
        int maxTime = mass / maximum;
        System.out.println("Если спортсмен буден за день скидывать 250 грамм, то за " + minTime + " дней он скинет 7 кг.");
        System.out.println("Если спортсмен буден за день скидывать 500 грамм, то за " + maxTime + " дней он скинет 7 кг.");

        int masha = 67760;
        int denis = 83690;
        int kris = 76230;
        int tenPercMasha = masha / 10;
        int tenPercDenis = denis / 10;
        int tenPercKris = kris / 10;
        System.out.println("Маша теперь получает " + (masha + tenPercMasha) + " рублей. Годовой доход вырос на " + (tenPercMasha * 12) + " рублей.");
        System.out.println("Денис теперь получает " + (denis + tenPercDenis) + " рублей. Годовой доход вырос на " + (tenPercDenis * 12) + " рублей.");
        System.out.println("Кристина теперь получает " + (kris + tenPercKris) + " рублей. Годовой доход вырос на " + (tenPercKris * 12) + " рублей.");
    }
}