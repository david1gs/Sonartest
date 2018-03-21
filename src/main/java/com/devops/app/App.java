package com.devops.app;

import java.util.concurrent.atomic.AtomicInteger;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.chrono.HijrahDate;
import java.io.Serializable;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 * Hello world!
 *
 */
public class App {
	String name;

    public static void main(String[] args) {
   		test_divide();
        weekYear();
   		setName("Lalo");
    }

    //292 .- 
    public static void test_divide(){
    	int a = 0;
    	int z = 0;
    	if( a > 0 ){
    		z = 1;
    	} 
    	if (a < 0){
    		z = 3;
    	}

    	z = 1 / z;
    }    

    //291
    public static void weekYear(){
    	try {
            Date date = new SimpleDateFormat("yyyy/MM/dd").parse("2015/12/31");
 			String result = new SimpleDateFormat("YYYY/MM/dd").format(date);  	
    		System.out.println(result);
        } catch (ParseException ex) {
            //Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }

    //289
    public static void setName(String name){
    	name = name;
    }

    //288
    public static int pickNumber(){
    	int i = 0;
    	int j = 0;
    	i = i++;

    	return j++;
    }

    
}


//287
class MyClass2 implements Serializable{
	private HijrahDate date; // Noncompliant; mark this transient
	//private transient HijrahDate date;
}


//285
class StringUtils{
	public static String concatenate(String s1, String s2){
		return s1 + s2;
	}
}
