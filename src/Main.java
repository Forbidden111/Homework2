
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

    public static void task1 () {
        System.out.println("Задача 1");
        var dog=8;
        var cat=3.6;
        var paper=763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }


    public static void task2 () {
        System.out.println("Задача 2");
        var dog=8;
        dog=dog+4;
        var cat=3.6;
        cat=cat+4;
        var paper=763789;
        paper=paper+4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);


    }
    public static void task3 () {
        System.out.println("Задача 3");
        var dog=7.6;
        dog=dog-3.5;
        var cat=3.6;
        cat=cat-1.6;
        var paper=763789;
        paper=paper-7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
    public static void task4 () {
        System.out.println("Задача 4");
        var friend=19;
        friend=friend+2;
        friend=friend/7;
        System.out.println(friend);
    }

    public static void task5 () {
        System.out.println("Задача 5");
        var frog=3.5;
        frog=frog*10;
        frog=frog/3.5;
        frog= frog+4;
        System.out.println( frog);


    }
    public static void task6 () {
        System.out.println("Задача 6");

        var boxerWeight1=78.2;
        var boxerWeight2=82.7;
        var boxersTotalWeight=boxerWeight2+boxerWeight1;
        System.out.println("Общий вес двух бойцов:" + boxersTotalWeight+"кг!");


    }
    public static void task7 () {
        System.out.println("Задача 7");
        var boxerWeight1=78.2;
        var boxerWeight2=82.7;
        var weiqhtDifference = boxerWeight2 - boxerWeight1;
        System.out.println("Разница между весами двух бойцов: " + weiqhtDifference + "кг!");

        weiqhtDifference = boxerWeight2 % boxerWeight1;
        System.out.println("Разница между весами двух бойцов:" + weiqhtDifference + "кг!" );

    }
    public static void task8 () {
        System.out.println("Задача 8");
        var hoursWork=640;
        var employeeHours=8;
        var result=hoursWork/employeeHours;
        System.out.println("всего работников в компании:" + result + " человек " );

        result=result+94;
        hoursWork=result*8;
        System.out.println("Если в компании работает" + result + "человек,то всего"+ hoursWork + "часов работы может быть поделено между сотрудниками" );

    }



}