public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        System.out.println();
        byte f = 85;
        int g = 786725;
        short m = 9854;
        long w = 54889527;
        double s = 3.586;
        float h = 32.87f;

        System.out.println("Значение переменной f с типом byte равно" + " " + f);
        System.out.println("Значение переменной g с типом int равно" + " " + g);
        System.out.println("Значение пременной m с типом short равно" + " " + m);
        System.out.println("Значание переменной w с типом long равно" + " " + w);
        System.out.println("Значание переменной s с типом double равно" + " " + s);
        System.out.println("Значание переменной h с типом float равно" + " " + h);

        System.out.println();
        System.out.println("Задача 2");
        System.out.println();

        float r = 27.17f;
        long o = 987678965549l;
        byte n = 2;
        int d = 786;
        boolean l = false;
        int k = 569;
        int p = -159;
        short y =  27897;
        byte a = 67;






        System.out.println();
        System.out.println("Задача 3");
        System.out.println();
        var classLP = 23;
        var classAS = 27;
        var classEA = 30;
        var paper = 480;
        var student = classLP + classAS + classEA;
        var page = paper / student;
        System.out.println("На каждого ученика рассчитано" + " " + page + " " + "листов бумаги");

        System.out.println();
        System.out.println("Задача 4");
        System.out.println();

        var bottle = 16;
        var minute = 2;
        var oneMinute = bottle / minute;
        var forHour = oneMinute * 60;
        var time1 = 20;
        var timeFor20 = oneMinute * time1;
        System.out.println("За" + " " + time1 + " " + "минут машина производит" + " " + timeFor20 + " " + "штук");
        var time2 = 24;
        var time3 = 3;
        var timeFor24 = forHour * time2;
        System.out.println("За" + " " + time2 + " " + "часа машина производит" + " " + timeFor24 + " " + "штук");
        var timeFor3 = timeFor24 * time3;
        System.out.println("За" + " " + time3 + " " + "дня машина производит" + " " + timeFor3 + " " + "штук");
        var month1 = 1;
        var month = time2 * 30;
        var forMonth = month * forHour;
        System.out.println("За" + " " + month1 + " " + "месяц машина производит" + " " + forMonth + " " + "штук");

        System.out.println();
        System.out.println("Задача 5");
        System.out.println();

        var sumPots = 120;
        var whitePot = 2;
        var braunPot = 4;
        var totalPots = whitePot + braunPot;
        var classroom = sumPots / totalPots;
        var totalBraunPots = braunPot * classroom;
        var totalWhitePots = whitePot * classroom;
        System.out.println("В школе, где" + " " + classroom + " " + "классов, нужно" + " " + totalWhitePots + " " + "банок белой краски и" + " " + totalBraunPots + " " + "банок коричневой краски");

        System.out.println();
        System.out.println("Задача 6");
        System.out.println();

        int banana = 1;
        float weightBanana = 80;
        int amountBanana = 5;
        int kG = 1000;
        float weightBananasKG = (banana * weightBanana * amountBanana) / kG;
        float weightBananasG = banana * weightBanana * amountBanana;
        int milk = 1;
        float weightMilk = 105;
        int amountMilk = 2;
        float weightMilkKG = (milk * weightMilk * amountMilk) / kG;
        float weightMilkG = milk * weightMilk * amountMilk;
        int iceCream = 1;
        float weightIceCream = 100;
        int amountIceCream = 2;
        float weightIceCreamKG = (iceCream * weightIceCream * amountIceCream) / kG;
        float weightIceCreamG = iceCream * weightIceCream * amountIceCream;
        int egg = 1;
        float weightEggs = 100;
        int amountEggs = 2;
        float weightEggsKG = (egg * weightEggs * amountEggs) / kG;
        float weightEggsG = egg * weightEggs * amountEggs;
        float weightBreakfastKG = weightBananasKG + weightMilkKG + weightIceCreamKG + weightEggsKG;
        float weightBreakfastG = weightBananasG + weightMilkG + weightIceCreamG + weightEggsG;
        System.out.println("Вес завтрака в граммах составляет" + " " + weightBreakfastG);
        System.out.println("Вес завтрака в килограммах составляет" + " " + weightBreakfastKG);

        System.out.println();
        System.out.println("Задача 7");
        System.out.println();

        float norm = 7;
        float kg = 1000;
        float normKg = norm * kg;
        int normDay250 = 250;
        int normDay500 = 500;
        int middleDay = (normDay250 + normDay500) / 2;
        float day250 = normKg / normDay250;
        float day500 = normKg / normDay500;
        float middle = normKg / middleDay;
        System.out.println("При похудении в день на" + " " + normDay250 + " " + "гр, уйдет" + " " + day250 + " " + "дней");
        System.out.println("При похудении в день на" + " " + normDay500 + " " + "гр, уйдет" + " " + day500 + " " + "дней");
        System.out.println("В среднем, чтобы добиться результат, уйдет" + " " + middle + " " + "дней");

        System.out.println();
        System.out.println("Задача 8");
        System.out.println();

        int Msh = 67760;
        int Dn = 83690;
        int Kr = 76230;
        float Msh1 = (Msh * 10) / 100;
        float Dn1 = (Dn * 10) / 100;
        float Kr1 = (Kr * 10) / 100;
        double MshForYear = Msh + Msh1;
        double DnForYear = Dn + Dn1;
        double KrForYear = Kr + Kr1;
        double MshForYear1 = MshForYear * 12;
        double DnForYear1 = DnForYear * 12;
        double KrForYear1 = KrForYear * 12;
        double MshForYear2 = MshForYear1 - (Msh * 12);
        double DnForYear2 = DnForYear1 - (Dn * 12);
        double KrForYear2 = KrForYear1 - (Kr * 12);
        System.out.println("Маша теперь получает" + " " + MshForYear + " " + "рублей" + " " + ". Годовой доход вырос на" + " " + Msh1 + " " + "рублей.");
        System.out.println("Денис теперь получает" + " " + DnForYear + " " + "рублей" + " " + ". Годовой доход вырос на" + " " + Dn1 + " " + "рублей.");
        System.out.println("Кристина теперь получает" + " " + KrForYear + " " + "рублей" + " " + ". Годовой доход вырос на" + " " + Kr1 + " " + "рублей." );

        System.out.println();
        System.out.println("Разница зарплат Маши между годовым доходом с нынешней зарплатой и после повышения составляет" + " " + MshForYear2 + " " + "рублей.");
        System.out.println("Разница зарплат Дениса между годовым доходом с нынешней зарплатой и после повышения составляет" + " " + DnForYear2 + " " + "рублей.");
        System.out.println("Разница зарплат Кристины между годовым доходом с нынешней зарплатой и после повышения составляет" + " " + KrForYear2 + " " + "рублей.");
    }


}