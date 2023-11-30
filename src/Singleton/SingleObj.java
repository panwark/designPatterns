/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Singleton;

/**
 *
 * @author bharatsingh
 */
public class SingleObj {
     private static SingleObj instance = new SingleObj();
    
     /**
     * Private constructor to create a SingleObject instance.
     * This constructor is private to prevent external instantiation of the class.
     */

    private SingleObj() {
    }

    /**
     * Get the only object available.
     *
     * @return The instance of SingleObject.
    */
    
    public static SingleObj getInstance() {
        return instance;
    }
    /**
     * Display a message to the console.
     * This method prints "Hello World!" to the console.
     */
    
    public void showMessage() {
        System.out.println("Hello World!");
            
    }
    
}
