public class Program {
    public static void main(String[] args) {
        Cat cat1 = new Cat ();
        Cat cat2 = new Cat ("Снежок"  );
        Cat cat3 = new Cat (2, 1.3, "Снежок");

        

        cat1.printInfo();
        cat2.printInfo();
        cat3.printInfo();
        /*
        cat1.name = "Барсик";
        cat1.age = 5;
        cat1.weight = 4.7;

        cat1.setName("Снежок");

        

        Cat cat2 = new Cat();
        cat2.name = "Пушок";
        cat2.age = 3;
        cat2.weight = 5.2;


        cat1.setAge(14);
        cat1.setWeight(1.3);


        

       cat1.printInfo();
       cat2.printInfo();

            cat1.run(1);
            cat2.run(2);

           cat1.eat(2);
           cat2.eat(2);
           */
    }
}
