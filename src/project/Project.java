package project;

import java.util.Scanner;

public class Project {
    public static void main(String[] args) {
        int select;
        Scanner scn = new Scanner(System.in);
        
        String menu = 
                "1. Thai language\n"
                +"2. English language"
                +"0. exit"
                ;
        System.out.println(menu);
        
        do {
            System.out.println("Choose your language:");
            select = scn.nextInt();
            
            switch (select){
                case 1:
                    break;
                case 2:        
                    break;
            }
            
        } while (select != 0);
        
    }
    
}
