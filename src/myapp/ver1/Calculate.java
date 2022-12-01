package myapp.ver1;

import java.io.Console;

public class Calculate {
    public static void main(String[] args) {
    
        String input = "";
        Integer total = 0;
        Integer count = 0;

        // Get the console
        Console cons = System.console();

        while(true){

            //Read line
            input = cons.readLine("Please enter a number: ");
            input = input.trim();

            if (input.equals("stop")){
                //exit the loop
                break;
            }
            
            // count++;
            count +=1;

            // Interger value = Integer.parseInt(input);
            // total = total + value
            total += Integer.parseInt(input);


        }

        System.out.printf("The total is %d,and the number is %d",total, count);
    
    
    }

    
}