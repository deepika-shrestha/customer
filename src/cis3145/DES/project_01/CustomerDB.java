/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis3145.DES.project_01;

/**
 *
 * @author deepika
 */
public class CustomerDB {
    public static Customer getCustomer(int customerNumber){
        Customer customer = null;
         if (customerNumber == 123){
             customer = new Customer("Michael Martin", "1376 Hill Street", "Luckey", "OH", "43443");
         } else if (customerNumber == 124){
             customer = new Customer("Marjorie Galvan","3144 Hillcrest Avenue", "Cambridge", "MA", "02141");
         } else if (customerNumber == 125){
             customer = new Customer("Rebecca Cain", "3572 New Street","Jefferson", "OR", "97352");
         } else if (customerNumber == 126){
             customer = new Customer("Deepika Shrestha", "1049 Hampden Height", "Denver", "CO", "80145");
         }
         
         
         return customer;
    }
    
}
