package com.examples.utils;
import com.example.geometry.*;
public class AreaCalculatorClass
{
    private int area;
    void areaOfRectangle(int height,int wedht){
        area=height*wedht;
        System.out.println("Your Reactangle area is "+area);
    }
    void areaOfCircle(int radious){
        area= (int) ((Math.PI)*(Math.pow(radious,2)));
        System.out.println("Your area is "+area);
    }

    public static void main(String[] args) {
        CircleClass c=new CircleClass(5);
        AreaCalculatorClass a=new AreaCalculatorClass();
        RectangleClass r=new RectangleClass(5,7);
        a.areaOfCircle(c.radious);
        a.areaOfRectangle(r.height,r.width);
    }
}
