public class Main {
    public static void main(String[] args) {


        System.out.println("\ntask 1___________________________________________________________________________________");
        int savings = 15_000;
        int money = 0;
        int i = 0;
        while (money < 2_459_000) {
            i++;
            money = money + money;
            money = money + savings;
            System.out.printf("«Месяц %s сумма накоплений равна %s рублей».\n", i, money);

        }

        System.out.println("\ntask 2___________________________________________________________________________________");
        i = 1;
        while (i < 11) {
            System.out.println(i);
            i = i + 1;
        }
        System.out.println("\n");
        for (i = 10; i >= 0; i--) {
            System.out.println(i);
        }

        System.out.println("\ntask 3___________________________________________________________________________________");
        int population = 12_000_000;
        int birthRate = 17;
        int deathRate = 8;
        for (int year = 0; year < 10; year++) {
            population += (birthRate - deathRate) * population / 1000;
            System.out.printf("Год %s, численность населения составляет %s\n", year + 1, population);
        }

        System.out.println("\ntask 4___________________________________________________________________________________");
        int contribution = 15_000;
        double sum = 1.07;
        i = 1;
        while (contribution < 12_000_000) {
            contribution = (int) (contribution * sum);
            System.out.printf("Количества месяцев:%s,сумма:%s\n", i, contribution);
            i++;
        }

        System.out.println("\ntask 5___________________________________________________________________________________");

        contribution = 15_000;
        for (i = 1; contribution < 12_000_000; i++) {
            contribution = (int) (contribution * sum);
            if (i % 6 == 0) {
                System.out.printf("Количества месяцев:%s,сумма:%s\n", i, contribution);
            }
        }

        System.out.println("\ntask 6___________________________________________________________________________________");
        contribution = 15_000;
        int sumAccumulation = 9 * 12;
        for (i = 1; i <= sumAccumulation; i++) {
            contribution = (int) (contribution * sum);
            if (i % 6 == 0) {
                System.out.printf("Количества месяцев:%s,сумма:%s\n", i, contribution);
            }

        }


        System.out.println("\ntask 7___________________________________________________________________________________");
        int firstFriday = 1;
        for (i = firstFriday; i < 31; i += 7) {
            System.out.printf("«Сегодня пятница, %s-е число. Необходимо подготовить отчет».\n", i);
        }


        System.out.println("\ntask 8___________________________________________________________________________________");
        int currentYear = 2024;
        int begin = currentYear - 200;
        int end = currentYear + 100;
        for (i = 0; i < end; i += 79) {
            if (i >= begin) {
                System.out.println(i);
            }
        }


    }

}

