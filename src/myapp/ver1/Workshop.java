package myapp.ver1;

import java.io.Console;

public class Workshop {

    public static void main(String[] args){

        String input = "";
        Integer total = 0;
        Integer count = 0;

        Console cons = System.console();
        
        while (true) {
            //read line
            input = cons.readLine("Enter a number:");
            input = input.trim();

            if (input.equals("stop")){
                //exit the While loop
                break;
            }

            // count += 1;
            count++;
        
            // Integer value = Integer.parseInt(input);
            // total = total + value
             total = total + Integer.parseInt(input);
        } 
      
        System.out.printf("The total of adding %d number %d\n", count, total);
    }
    
}
