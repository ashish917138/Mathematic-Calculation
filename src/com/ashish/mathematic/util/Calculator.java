/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ashish.mathematic.util;

/**
 *
 * @author Aasick
 */
public class Calculator {

    private int x, y;

    
    public Calculator() {

    }

    
    public Calculator(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int add() {
        return x + y;
    }

    public int sub() {
        return x - y;
    }

    public int mul() {
        return x * y;
    }
    public int divide() {
        return x / y;
    }
    public int multiplication() {
        int prdct = 1;
        for(int i=1; i<=10; i++) {
            prdct = x * i;
            System.out.println(x + "*" + i + "=" + prdct );
        }
        return prdct;
    }

    public int power() {
        int total=1;
        for (int i = 1; i <= y; i++) {
            total=total * x;
        }
        
        return total;
    }
    public int min() {
        int minum;
        if (x<y){
            System.out.println("Minimum number is x: "+ x);
        minum=x;
        }
        else if (x>y){
            System.out.println("Minimum number is y: "+ y);
        minum=y;
        }
        else{
           System.out.println("Both are equal");
        minum=x=y;
        }
        return minum;
    }
    
    public int max() {
        int maxnum;
        if (x>y){
            System.out.println("Maximum number is x: "+ x);
        maxnum=x;
        }
        else if (x<y){
            System.out.println("Maximum number is y: "+ y);
        maxnum=y;
        }
        else{
           System.out.println("Both are equal");
        maxnum=x=y;
        }
        return maxnum;
    }

   /** public int add(int x, int y) {
        return x + y;
    }

    public int sub(int x, int y) {
        return x - y;
    }**/

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

   
}
