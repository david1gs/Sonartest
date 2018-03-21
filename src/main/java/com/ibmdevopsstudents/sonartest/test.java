/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ibmdevopsstudents.sonartest;

import com.sun.istack.internal.NotNull;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author gaona
 */
public class test {
    
    
    public static void main(String[] args) {
        // 1.- 
         
        AtomicInteger aInt1 =  new AtomicInteger(0);
        AtomicInteger aInt2 =  new AtomicInteger(0);

        if( aInt1.equals(aInt2) ){
            
        }
        
        
        // 2.-
        int target  = 5;
        int num     = 3;
        
        target =- num;
        target =+ num;
        
        //3.- 
        Test3();
        
    }
    
    //3.-
    @Deprecated
    public static void Test3(){
    
    }
    
    //4.-
    @NotNull
    public String inderectMix(){
        String mix = null;
        return mix;      
    }
   
}
 
//5.-
class ParentClass{
    public boolean doSomething(){
        return false;
    }
}

class firstChildClass extends ParentClass{
    public boolean doSomething(){
        return true;
    }
}
