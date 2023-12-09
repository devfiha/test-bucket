package Hello;

import java.util.Scanner;

/**
 * Helo
 */
 class Car {
        String brand = "Lamborghini - 1D4545";
        int carNo = 343434; 
    }
public class Helo {

    

    static void hola(String name1, String name2){
            System.out.println("Fisrt name :" + name1 + " Second name " + name2);
            Car mana = new Car();

            System.out.println(mana.brand);
   
    }

   

    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);

       String name = sc.nextLine();
       String name2 = sc.nextLine();

        hola(name, name2);
        



    }

    
    
}