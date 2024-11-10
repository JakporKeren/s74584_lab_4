
package kk;

import java.util.Scanner;


public class Kk {

    
    public static void main(String[] args) {
      


Scanner sc = new Scanner (System.in);
    int sale = 0;
    double rate = 0;
    System.out.print("Enter your sale: ");
    sale = sc.nextInt();
        if (sale > 15000){
            rate = sale * 0.20;
        } else if (sale > 10000){
            rate = sale * 0.15;
        } else {
            rate = sale * 0.10;
        }
    System.out.print("Your rate is RM "+rate);
                    
    }
    
}

       
    }
    
}
