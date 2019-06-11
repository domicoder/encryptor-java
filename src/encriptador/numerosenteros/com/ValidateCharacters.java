
package encriptador.numerosenteros.com;

import java.util.Scanner;

public class ValidateCharacters {
    Scanner input;
    
    public ValidateCharacters() {
        input = new Scanner(System.in);
    }
    
    public String validateString(String msg){
        
        String str = "";
        
        while(str.equals("")){
            System.out.println(msg);
            str = input.nextLine();
            if (str.equals(" ")) {
                str = "";
            }else if (!str.matches("^[A-Za-z ]*$")) {
                str = "";
            }
        }
        return str;
    }

    public String validateStringAndNumbers(String msg){
        
        String str = "";
        
        while(str.equals("")){
            System.out.println(msg);
            str = input.nextLine();
            if (str.equals(" ")) {
                str = "";
            }else if (!str.matches("^[A-Za-z 0-9]*$")) {
                str = "";
            }
        }
        return str;
    }
    
    public String enterToClose(String msg){
        
        String str = " ";
        
        while(!str.equals("")){
            System.out.println(msg);
            str = input.nextLine();
            if (str.equals("")) {
                break;
            }else if (!str.matches("^[A-Za-z 0-9]*$")) {
                str = " ";
            }
        }

        return str;
    }  
    
    public int validateNumbers(String msg){
        
        String str = "";
        
        while(str.equals("")){
            System.out.println(msg);
            str = input.nextLine();
            if (str.equals(" ")) {
                str = "";
            }else if (!str.matches("[0-9]*$")) {
                str = "";
            }
        }
        return Integer.parseInt(str);
        
    }
    
    public long validateLong(String msg){
        
        String str = "";
        
        while(str.equals("")){
            System.out.println(msg);
            str = input.nextLine();
            if (str.equals(" ")) {
                str = "";
            }else if (!str.matches("[0-9]*$")) {
                str = "";
            }
        }
        return Long.parseLong(str);
        
    }
}
//ECSoftware
//YanderS
