/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asyncFunctions;

/**
 *
 * @author Lenovo
 */
public class Fuctions {
    
    public String MakeTaskAsync() {
    
        try {
       
        System.out.println("Java sucks!");
        
            for (int i = 0; i < 100; i++) {
                  System.out.println(i);
            }
        }
        catch(Exception ex)
        {
        
        }
        //System.out.println("Java sucks!");
        return "MakeTask -> Async";
    }
    
}
