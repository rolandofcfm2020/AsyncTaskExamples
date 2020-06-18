/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package asynctest;


/**
 *
 * @author Lenovo
 */
import java.util.*;
import asyncFunctions.Fuctions;
import java.util.concurrent.CompletableFuture;
public class AsyncTest {

    /**
     * @param args the command line arguments
     */
    static String stringTask;
    public static void main(String[] args)  throws InterruptedException  {
        // TODO code application logic here
        
        //Functions func = new Functions();
        Fuctions func =  new Fuctions();
        try {
        //CompletableFuture.supplyAsync(() ->  func.MakeTaskAsync());
        CompletableFuture.runAsync(() ->   {
               stringTask =  func.MakeTaskAsync();
               System.out.println(stringTask);
               
              }
        ).thenRun(() ->  System.out.println("Por fin terminé!"));
        }
        catch (Exception ex )
        {
        
        }
        System.out.println("Ejecutando tarea principal");
        
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        String userName = myObj.nextLine();
        
            //stringTask = new Functions().MakeTaskAsync();
       
    }
    
}
