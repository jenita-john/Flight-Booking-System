/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.lab1;

public abstract class Passenger {
    String name;
    int age;
    
    public Passenger(String n, int a){
        name = n;
        age = a;
    }
    
    void setName(String n){
        name = n;
    }
    
    String getName(){
        return name;
    }
   
    void setAge(int a){
        age = a;
    }
    int getAge(){
        return age; 
   }
      
    abstract double applyDiscount(double p);
    
    @Override
    public String toString(){
    return name;
    }
    
}
