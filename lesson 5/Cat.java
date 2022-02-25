

public class Cat {
    String name;
    int age;
    double weight;
    

    Cat() {
        System.out.println("создали кота" + name);
    }

    Cat(String name){
        this.name = name;
        System.out.println("создали кота" + name);
    }

    Cat(int age, double weight, String name){
        this.age = age;
        this.weight = weight;
        System.out.println("Ему лет" + age);
        this.name = name;
    }
    

   void printInfo(){
    System.out.println("Это котиик! Его зовут " + name +
    "\nЕго возраст:" + age + 
     "\nВесит от " + weight + "кг" );
   }


    void setName(String name) {
        System.out.println("Раньше меня звали " + this.name +
        ", а теперь меня зовут " + name);

this.name = name;
    }

    void setWeight(double weight) {
        System.out.println("Раньше я весил " + this.weight + "а сейчвс я вешу " + weight + "кг");
    }


void setAge(int age) {
    System.out.println("Раньше мне было" +  this.age  + "а сейчас мне " + age + "лет" );
    this.weight = weight;

    this.age = age;
}




    
    void run(int circles){
        weight -= circles * 0.01;
       System.out.println("Я - " + name + "!" +
        "\nЯ пробежал "+ circles + " кругов по квартире!" + 
        "\nТеперь я вешу "+ weight + " кг");

    }

        void eat(int korm){
            weight += korm * 0.5;
           System.out.println("Я - " + name + "!" +
            "\nЯ поел "+ korm + " пачек корма" + 
            "\nТеперь я вешу "+ weight + " кг");

    }
}
