package com.example.usingreturn;
public class School {
 School m1(){
     int x=98;
     System.out.println("this is return of class type method"+x);
     School school=new School();
     return school; //here school is reference object variable,it is return type of School type like we return int,float type value
 }
}



