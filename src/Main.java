public class Main {
    public static void main(String[] args) {

        //1
        int savingMoney = 0;
        int month = 0;
        while (savingMoney <= 2_459_000){
            savingMoney += 15_000;
            month += 1;
            System.out.println("Месяц "+month+" Сумма накоплений равна "+savingMoney+" рублей");

        }
        //2
        int one = 1;
        while (one < 11){
            System.out.print(one+" ");
            one += 1;
        }
        System.out.println();
        for (int i = 10;i>=1;i--){
            System.out.print(i +" ");
        }
        //3
        int person = 12_000_000;
        double birthPerson = 17;
        double deathPerson =8;
        int years =10;

        double changePerson = birthPerson - deathPerson;

        for (int year = 1; year <=years; year++){
            int populationChange = (int) (person * changePerson / 1000);
            person += populationChange;
            System.out.println("Год "+ year + ", численность населения "+ person);
        }

        //4-5
        int firstVklad = 15_000;
        int Month = 0;
        while (firstVklad <= 12_000_000){
            firstVklad += (firstVklad * 7 / 100);
            month++;
            if (month % 6 == 0){
                System.out.println("месяц "+month+" количество денег " + firstVklad);
            }


        }



        //6
        int ForEighteenMonth = 0;
        int firstVkladTwo = 15_000;
        while (ForEighteenMonth != 108){
            firstVkladTwo += (firstVkladTwo * 7 / 100);
            ForEighteenMonth++;
            if (ForEighteenMonth % 6 == 0){
                System.out.println("Месяц "+ForEighteenMonth+" количество накоплений "+firstVkladTwo);
            }
        }

        //7
        int Friday = 5;
        while (Friday < 31){
            System.out.println("Сегодня пятница "+Friday+"-e число. Необходимо подготовить отчет ");
            Friday += 7;
        }
        //8
        int simpleYear = 2024;
        int lastYears = simpleYear - 200;
        int FutureYears = simpleYear + 100;
        while (lastYears <= simpleYear && simpleYear <= FutureYears){
            if (lastYears % 79 == 0 ){
                System.out.println(lastYears);
                lastYears++;
            } else if (FutureYears % 79 ==0) {
                System.out.println(FutureYears);
                FutureYears++;
            } else {
                lastYears++;
                FutureYears++;
            }

        }
    }
}