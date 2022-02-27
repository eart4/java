import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class program{
    public static void main(String[] args) {
     
     
      System.out.println("Введите числа номер дня недели");
      Scanner input = new Scanner (System.in);


      int number = input.nextInt();
      input.close();
      switch (number) {
        case 1: {System.out.println("Вы ввели понедельник");} break;
        case 2: {System.out.println("Вы ввели вторник");}break;
        case 3: {System.out.println("Вы ввели среда");}break;
        case 4: {System.out.println("Вы ввели четверг");}break;
        case 5: {System.out.println("Вы ввели пятница");}break;
        case 6: {System.out.println("Вы ввели суббота");}break;
        case 7: {System.out.println("Вы ввели воскременье");}break;
        default: {System.out.println("Вы ввели неверные данные");}break;

      }
     
      /*HashMap<Integer,String> map = new HashMap<Integer,String>();





map.put(2018, "Poco");
map.put(2019, "roza");
map.put(2018, "El primo");

map.remove(2018);
map.keySet();
System.out.println(map.get(2018));
System.out.println(map.size());
*/


   /*  HashSet<String>set = new HashSet<String>();
     set.add("Poco");
     set.add("leon");
     set.add("El Primo");

      set.remove("El Primo");

     System.out.println(set.size());
     
     System.out.println(set.contains("leon"));
     
    */ 
     
     
     
      /*   
      ArrayList<String> List  = new ArrayList<String>();
      List.add("Chicago"); 
      //tor
      List.add("New York");
      List.add("Paris");

      List.add(1,"Toronto");
    List.remove("Chicago");
       System.out.println(List.size());
       System.out.println(List.get(1));
//List.set(2, "Moscow");



       //System.out.println(List.indexOf("Moscow"));
       
       List.clear();
       
       



       ArrayList<String> lowList = new ArrayList<String>();
       Scanner input = new Scanner(System.in);
     
      for (int i; i < 5; i++){
        lowList.add(input.next());
      }

      int min = lowList.get(0).length();

      for(int i = 0; i < lowList.size(); i++ ) {
if(lowList.get(i).length() < min)
min = lowList.get(i).length();
      }
*/

       }
       
    }
