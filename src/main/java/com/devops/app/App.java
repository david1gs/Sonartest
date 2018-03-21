package com.devops.app;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Hello world!
 *
 */
public class App 
{
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