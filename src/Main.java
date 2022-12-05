public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();



    }


    private static void task1() {
        System.out.println("\nЗадача 1");

        int apple = 10000;
        System.out.println("Значение переменной apple с типом int равно " + apple);
        byte aggs = 100;
        System.out.println("Значение переменной aggs c типом int равно "  + aggs);
        short banana = 30000;
        System.out.println("Значение переменной banana c типом short равно " + banana);
        long coconuts = 1000000;
        System.out.println("Значение переменной coconat с типом long равно " + coconuts);
        float mangos = 30;
        System.out.println("Значение переменной mangos с типом float равно " + mangos);
        double lemons = 3.5;
        System.out.println("Значение переменной lemons с типом double равно " + lemons);
    }


    private static void task2() {
        System.out.println("\nЗадача 2");

        double a=27.2;
        System.out.println(a);
        long b = 987678965549L;
        System.out.println(b);
        double c = 2.786;
        System.out.println(c);
        short d = 569;
        System.out.println(d);
        int e = -159;
        System.out.println(e);
        char f =27897;
        System.out.println(f);
        byte g = 67;
        System.out.println(g);
    }


    private static void task3() {
        System.out.println("\nЗадача 3");

        char ludmilasStudent = 23;
        char annStudent = 27;
        char kateStudent = 30;
        int allStudent = ludmilasStudent + annStudent + kateStudent;
        System.out.println("Количество всех студентов " + allStudent + " человек.");

        short paper = 480;
        int resultEverybody = paper / allStudent;
        System.out.println("На каждого ученика рассчитано " + resultEverybody + " листов бумаги.");
    }


    private static void task4() {
        System.out.println("\nЗадача 4");

        int bottle = 16;
        int time = 2;
        System.out.println("За " + time + " минуты машина произвела " + bottle + " штук бутылок.");

        int time2=20;
        int result= (time2/time) *16;
        System.out.println("За "+ time2+ " минут машина произвела "+ result+ " штук бутылок.");

        int time3=60*24;
        result=(time3/2)*16;
        System.out.println("За "+ time3+ " минут машина произвела "+ result+ " штук бутылок.");

        int time4= 1440*3;
        result=(time4/2)*16;
        System.out.println("За "+ time4+ " минут машина произвела "+ result+ " штук бутылок.");

        int time5=1440*30;
        result=(time5/2)*16;
        System.out.println("За "+ time5+ " минут машина произвела "+ result+ " штук бутылок.");}


    private static void task5() {
        System.out.println("\nЗадача 5");

        int allColor=120;
        int whiteClass=2;
        int brownClass=4;
        int resultAllcolorClass= whiteClass+brownClass;
        int resultOneClassColor=allColor/resultAllcolorClass;
        int resultWhiteColorTin= resultOneClassColor*whiteClass;
        int resultBrownColorTin=resultOneClassColor*brownClass;
        System.out.println("В школе, где "+ resultOneClassColor +" классов, нужно "+ resultWhiteColorTin+ " банок белой краски и "+ resultBrownColorTin+ " банок коричневой краски." );}


    private static void task6() {
        System.out.println("\nЗадача 6");

        int banan=80;
        int resultBannas=banan*5;
        int milk=105;
        int resultMilk=milk*2;
        int ice=100;
        int resultIce=ice*2;
        int egg=70;
        int resultEgg=egg*4;
        double ingridiensWeght= resultBannas+resultMilk+resultIce+resultEgg;
        System.out.println("Вес спортзавтрака составляет "+ ingridiensWeght+ " грамм.");

        double weght = ingridiensWeght/1000;
        System.out.println("Вес спортзавтрака составляет "+ weght+" кг.");}



    private static void task7() {
        System.out.println("\nЗадача 7");

        int loseWeight=7000;
        int looseOneWeghgt=250;
        int looseTwoWeght=500;
        int resultOne=loseWeight/looseOneWeghgt;
        System.out.println(resultOne+" Дней уйдет на похудение, если спортсмен будет терять каждый день по 250 грамм.");

        int resultTwo=loseWeight/looseTwoWeght;
        System.out.println(resultTwo+" Дней уйдет на похудение, если спортсмен будет терять каждый день по 500 грамм.");

        int resultAverage=(resultOne+resultTwo)/2;
        System.out.println(resultAverage+" потребоваться дней в среднем, чтобы добиться результата похудения.");}


    private static void task8() {
        System.out.println("\nЗадача 8");

        int maschaMoney=67760;
        int maschaMoneyInYear=maschaMoney*12;
        double maschaNewMoney=(maschaMoney*0.10) +maschaMoney;
        double maschaMoneyInYearNew=maschaNewMoney*12;
        System.out.println("Маша теперь получает "+maschaNewMoney+" рублей. Годовой доход вырос на "+(maschaMoneyInYearNew-maschaMoneyInYear) +" рублей.");

        int denisMoney=83690;
        int denisMoneyInYear=denisMoney*12;
        double denisNewMoney=(denisMoney*0.10)+denisMoney;
        double denisMoneyInYearNew=denisNewMoney*12;
        System.out.println("Денис теперь получает "+denisNewMoney+" рублей. Годовой доход вырос на "+(denisMoneyInYearNew-denisMoneyInYear)+" рублей.");

        int kristinaMoney=76230;
        int kristinaMoneyinYear=kristinaMoney*12;
        double kristinaNewMoney=(kristinaMoney*0.10)+kristinaMoney;
        double kristinaMoneyInYearNew=kristinaNewMoney*12;
        System.out.println("Кристина теперь получает "+kristinaNewMoney+" рублей. Годовой доход вырос на "+(kristinaMoneyInYearNew-kristinaMoneyinYear)+" рублей.");}

}



