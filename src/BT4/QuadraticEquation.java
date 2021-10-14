package BT4;

import java.util.Scanner;

public class QuadraticEquation {
    double a,b,c;
    double delta;
    public QuadraticEquation(double a,double b,double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public double getDelta() {
        this.delta=b*b-4*a*c;
        return delta;
    }
    public double getRoot1(){
        return (-b-Math.sqrt(this.delta)/(2*a));
    }
    public double getRoot2(){
        return ((-b+Math.sqrt(this.delta)/(2*a)));
    }
    public String disPlay(){
        return "The solution of the equation is : Root1 : "+this.getRoot1()+"Root2 :"+this.getRoot2();
    }
}
