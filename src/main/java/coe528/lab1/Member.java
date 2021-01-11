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
public class Member extends Passenger{
       
    int yearsOfMembership;
   
Member(String n, int a){
        super(n,a);
}

void setYearsOfMembership(int a){ 

        if (a <= 20){
        yearsOfMembership = 3;
        } else {
        yearsOfMembership = 10;
        }
}

int getYearsOfMembership(){
    return yearsOfMembership;
}
       
@Override
double applyDiscount(double p){
    setYearsOfMembership(age);
    
        if(yearsOfMembership > 5){
            return (0.5*p); 
        }
        if(yearsOfMembership > 1 && yearsOfMembership <= 5){
            return (0.1*p);
        }
        else{ 
            return p;
        }
     
   }

    
}
