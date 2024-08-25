public class Main {
    public static void main(String[] args) {
        int x = 569 ;
        int x2 =-159;
        byte y = 67;
        short z = 27897 ;
        long l = 987678965549L;
        float f = 27.12f;
        double d = 2.786;


        System.out.println("Значение переменной с типом int равно " + x );
        System.out.println("Значение переменной с типом int равно " + x2 );
        System.out.println("Значение переменной с типом byte равно " + y );
        System.out.println("Значение переменной с типом short равно " + z );
        System.out.println("Значение переменной с типом long равно " + l );
        System.out.println("Значение переменной с типом float равно " + f );
        System.out.println("Значение переменной с типом double равно " + d );

        int Ludmila = 23;
        int Anna = 27;
        int Ekaterina = 30;
        int allChildren = 480 / (Ludmila+Anna+Ekaterina);
        System.out.println("На каждого ученика рассчитано " + allChildren+" листов бумаги");

        int min = 20;
        int hour = 60;
        int day = 24;
        System.out.println("За 20 минут машина произвела "+min*2+ " штук бутылок");
        System.out.println("За cутки машина произвела "+hour*day*2+ " штук бутылок");
        System.out.println("За 3 дня машина произвела "+hour*day*3*2+ " штук бутылок");
        System.out.println("За месяц машина произвела "+hour*day*30*2+ " штук бутылок");

        byte clasov = 120/6;
        int paintWhite = (byte) (clasov*2);
        byte paintBrown = (byte) (clasov * 4);


        System.out.println("В школе, где "+clasov+" классов, нужно "+paintWhite+" банок белой краски и "
                +paintBrown+ " банок коричневой краски");

        int banans = 5*80;
        int milk = 2*105;
        int iceCream = 2*100;
        int egs = 4*70;

        int summ = banans*milk*iceCream*egs;
        float summkg = summ/1000;
        System.out.println("результат в граммах "+summ+" в килограммах "+summkg);

        int wigthGramm = 7000;
        System.out.println(wigthGramm/250+" дней по 250 грамм, "+wigthGramm/500+" дней по 500 грамм.");

        float Masha = 67760f;
        float Denis = 83690f;
        float Kristina = 76230f;
        System.out.println("Маша теперь получает "+Masha*1.1+" рублей. " +
                "Годовой доход вырос на "+(Masha*1.1-Masha)*12+ " рублей.");
        System.out.println("Маша теперь получает "+Denis*1.1+" рублей. " +
                "Годовой доход вырос на "+(Denis*1.1-Denis)*12+ " рублей.");
        System.out.println("Маша теперь получает "+Kristina*1.1+" рублей. " +
                "Годовой доход вырос на "+(Kristina*1.1-Kristina)*12+ " рублей.");






    }
}