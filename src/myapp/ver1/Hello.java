package myapp.ver1;

    import java.io.Console;

public class Hello {

    public static void main(String[] args){

        //Get system console
        Console cons = System.console();

        //Read from the console,, the result is assigned to variable
        String name = "";
        while (name.trim().length() <= 0) {
            name = cons.readLine("What is your name? ");
        } 

        //Use equals() for string comparison, == is for numbers
        if (name.trim().equals("Fred")) {
            System.out.println("Yabadabadoo");

        } else if (name.trim().equals("Barney")){
            System.out.println("Hello Barney");

        } else if (name.trim().length() == 0){
                System.out.println("Please enter your name");
            
        } else {

        //Send a greeting to a name
        System.out.printf("Hello %s. \n\tNice to make your acquantance\n"
        , name.toUpperCase());
    }
    
}

}
