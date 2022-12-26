public class Main {
    public static void main(String[] args) {System.out.println("Hello world!");
    var dog = 8.0;
    System.out.println(dog);
    dog = dog + 4;
    System.out.println(dog);
    dog = dog - 3.5;
        System.out.println(dog);
    var cat = 3.6;
    System.out.println(cat);
    cat = cat + 4;
    System.out.println(cat);
    cat = cat -1.6;
        System.out.println(cat);
    var paper = 763789;
    System.out.println(paper);
    paper = paper + 4;
    System.out.println(paper);
    paper = paper - 7639;
    System.out.println(paper);
    var friend = 19;
    System.out.println(friend);
    friend = friend * 2;
    System.out.println(friend);
    friend = friend /7;
    System.out.println(friend);
    var frog = 3.5;
    System.out.println(frog);
    frog = frog * 10;
    System.out.println(frog);
    frog = frog/3.5;
    System.out.println(frog);
    frog = frog + 4;
    System.out.println(frog);

    var firstBoxer = 78.2;
    var secondBoxer = 82.7;
    var totalWeight = firstBoxer + secondBoxer;
    System.out.println("Общий вес " + totalWeight + " кг");

    var differentWeight = secondBoxer - firstBoxer;
    System.out.println("Разница в весе " + differentWeight);

    var surplusWeight = secondBoxer%firstBoxer;
    System.out.println("Избыток "+ surplusWeight);

    var totalHours = 640;
    var workHours = 8;
    var totalWorked = totalHours/workHours;
    System.out.println("Всего работников в компании - " + totalWorked + " человек");
    }
}