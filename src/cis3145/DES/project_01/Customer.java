/*
Name: Deepika Shrestha
Project Name : CIS3145Project_01
Date: 2/11/2018
Description: Customer Viewer program

 */
package cis3145.DES.project_01;
/**
 *
 * @author deepika
 */
public class Customer {
    private String name;
    private String address;
    private String city;
    private String state;
    private String zipCode;
    
    public Customer (String name,String address,String city,String state,String zipCode){
        this.name = name;
        this.address = address;
        this.city = city;
        this. state = state;
        this.zipCode = zipCode;
    }
    
    // the set and get method for the name
    public void setName(String name){
       this.name = name;   
    }
    public String getName(){
        return name;
    }
    // the set and get method for the address
     public void setAddress(String address){
       this.address = address;   
    }
    public String getAddress(){
        return address;
    }
    // the set and get method for the city
    public void setCity(String city){
        this.city = city;
    }
    public String getCity(){
        return city;
    }
    // the set and get method for the state
    public void setState(String state){
        this.state = state;
    }
    public String getState(){
        return state;
    }
    // the set and get method for the zipCode
    public void setZipCode(String zipCode){
        this.zipCode = zipCode;
    }
    public String getZipCode(){
        return zipCode;
    }
    // a get method for name
    public String getNameAndAddress(){
       String nameAndAddress = name + "\n" +
               address + "\n" +
               city + ", " + state + " " + zipCode;
       return nameAndAddress;
    }
}
 

