/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.lab1;

import java.util.ArrayList;
/**
 *
 * @author jjmar
 */
public class Manager {
    
   ArrayList<Flight> flights = new ArrayList();
   ArrayList<Ticket> issuedtickets = new ArrayList();
   double  discountedprice; 
   
    public void createFlights(){
        
        Flight a = new Flight(1,"Canada","Australia","1:30",200,11000.00);
        Flight b = new Flight(2,"Canada","USA","2:30",300,2000.00);
        Flight c = new Flight(3,"Canada","India","3:00",360,5000.00);
       // Flight d = new Flight(3,"Canada","Canada","3:00",360,5000.00);      Uncomment this line and flights.add(d)to test the exception 
        flights.add(a);
        flights.add(b);
        flights.add(c);
       // flights.add(d);                 //Uncomment to test
   
    }   
    
   public void displayAvailableFlights(String origin, String destination){
   
    for(int i = 0;i< flights.size(); i++ ){
        
    if(origin.equals(flights.get(i).origin)&&(destination.equals(flights.get(i).destination))){
        if(flights.get(i).capacity > 0){
        System.out.println(flights.get(i).toString());
        }
    }
      }
   }
   public Flight getFlight(int flightNumber){
       Flight f= null;
       for (int i =0; i< flights.size();i++){
           if(flightNumber == flights.get(i).flightNumber){
               f = flights.get(i);
               System.out.println(f.toString());
           } 
       }
       return null; 
   }

   
   public void bookSeat(int flightNumber, Passenger p){
       for(int i =0; i< flights.size(); i++){
           if(flightNumber == flights.get(i).flightNumber){
               if(flights.get(i).bookASeat()){
         
                   if(p instanceof Member){
                   discountedprice  = p.applyDiscount(flights.get(i).originalPrice);
                   Ticket f = new Ticket(p,flights.get(i),discountedprice);
                   issuedtickets.add(f);
                   System.out.println(f.toString());
               }
                   
                   if(p instanceof NonMember){
                   discountedprice = p.applyDiscount(flights.get(i).originalPrice);
                   Ticket f = new Ticket(p,flights.get(i),discountedprice);
                   issuedtickets.add(f);
                   System.out.println(f.toString());
               }
             
              } 
           }
        
       }
   }
       
    public static void main(String[] args){
        
    Manager a = new Manager();
    a.createFlights();
    a.getFlight(1);
    a.displayAvailableFlights("Canada", "USA");          //displays the available flights from Canada to USA
    Passenger r = new Member("Janeeta",20);
    Passenger m = new NonMember("Jenita",70);
    a.bookSeat(1, r);                    // Books flight #1 for Passenger p
    a.bookSeat(2, m);                    //Books flight #2 for Passenger m 

    
    }
    
    
}
