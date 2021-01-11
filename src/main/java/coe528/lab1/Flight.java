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
public class Flight {
    int flightNumber;
    String origin;
    String destination;
    String departureTime;
    int capacity;
    int numberOfSeatsLeft;
    double originalPrice; 
    int seat;
    
  

    /**
     *
     * @param f
     * @param o
     * @param d
     * @param t
     * @param c
     * @param p
     */

    public Flight (int f,String o,String d,String t, int c,double p){
        
        flightNumber = f;
        origin = o;
        destination = d;
        departureTime = t;
        capacity = c;
        originalPrice = p;
        
    
        if(o.equals(d) ){
            throw new IllegalArgumentException("The origin and destination cannot be the same.");
        }
    }
        
        void setFlightNumber(int f){
            flightNumber = f;
        }
        int getFlightNumber(){
            return flightNumber; 
        }
        void setOrigin(String o){
            origin = o;
        }
        String getOrigin(){
            return origin; 
        }
        void setDestination(String d){
            destination = d;
        }
        
        String getDestination(){
            return destination; 
        }
        
        void setDepartureTime(String t){
            departureTime = t;
        }
        
        String getDepartureTime(){
            return departureTime;
        }
        
        void setCapacity(int c){
            capacity = c; 
           
        }
        
        int getCapacity(){
            return capacity; 
        }
        
        void setPrice(double p){
            originalPrice = p; 
        }
        
        double getPrice(){
            return originalPrice;
        }
        
        void setnumberOfSeatsLeft(int n){
            numberOfSeatsLeft = n;
        }
        
        int getnumberOfSeatsLeft(){
            return numberOfSeatsLeft; 
        }
       
        boolean bookASeat(){
        seat++;
        setnumberOfSeatsLeft(capacity-seat);
            if(numberOfSeatsLeft > 0 ){
            return true;
            }else{
            return false;
            }
            
        }
        
    @Override
        public String toString(){
            return "Flight " + flightNumber + " , " + origin + " to " + destination + " , " + "20/9/2019" + " " +departureTime + " Original Price: " + originalPrice + "$" ;
        }
        
        
    
}
