/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.csc380homework;


/**
 *
 * @author Sean McGrath
 */
public class Reservation {
    
    private String licensePlate;
    private String name;
    private String permit;
    
    public String getPlate(){
        return licensePlate;
    }
    public String getName(){
        return name;
    }
    
    public String getPermit(){
        return permit;
    }
    
    private void setPlate(String pl){
        licensePlate = pl;
    }
    
    private void setName(String n){
        name = n;
    }
    
    private void setPermit(String p){
        permit = p;
    }
    
    public Reservation(String n, String plate, String permitNum){
       this.setPlate(plate);
       this.setName(n);
       this.setPermit(permitNum); 
    }
    
    @Override
    public String toString(){
        return  "     Reserved by: " + name + 
                "\n     License Plate: " + licensePlate + 
                "\n     Permit ID: " + permit;
    }
    
    
}
//go thru each posibility, ask if has res, if so print it
//maybe ask for confirmation of given information before reserving in main class