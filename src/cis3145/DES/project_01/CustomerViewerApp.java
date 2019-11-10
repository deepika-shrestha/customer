/*
Name: Deepika Shrestha
Project Name : CIS3145Project_01
Date: 2/11/2018
Description: Customer Viewer program

 */
package cis3145.DES.project_01;

import java.util.Scanner;
/**
 *
 * @author deepika
 */
public class CustomerViewerApp {
    
    public static void main(String args[]) {
        System.out.println("Customer Viewer: Version 1.0");
        
        Scanner sc = new Scanner(System.in);
        String choice = "y";
        while (choice.equalsIgnoreCase("y")){
         
           System.out.print("Enter a customer number: ");
           int customerNumber = Integer.parseInt(sc.nextLine());
           
           Customer customer = CustomerDB.getCustomer(customerNumber);
           if (customer == null)  {
               System.out.println("There is no customer number "+ customerNumber + " to display");
           }else {
               System.out.println(customer.getNameAndAddress());
           }
           System.out.print("Display another customer? (y/n): ");
           choice = sc.nextLine();
                
        }
    }
    
}
