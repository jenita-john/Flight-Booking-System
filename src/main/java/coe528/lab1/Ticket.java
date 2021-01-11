/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.lab1;

/**
 *
 * @author jjmar
 */
public class Ticket {
    Passenger passenger;
    Flight flight;
    double price;
    static int TicketNumber; 
    /*
     *
     * @param p
     * @param f
     * @param r
     */
    public Ticket(Passenger p, Flight f, double r){
        passenger = p;
        flight = f;
        price = r;
        TicketNumber++;
    }

    void setPassenger(Passenger p){
        passenger = p;
    }
  
   Passenger getPassenger(){
       return passenger; 
    }
    
    void setFlight(Flight f){
        flight = f;
    }
    
    Flight getFlight(){
        return flight; 
    }
    void setprice(double r){
        price = r;
    }
    
    double getprice(){
        return price; 
    }
    
    @Override
    public String toString(){
            return  passenger + "," + flight + "," + "Ticket Price:" + price + "$" ;
        }
    
    
}
