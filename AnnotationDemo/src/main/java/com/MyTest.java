package com;

/**
 * Created by wb-spq324872 on 2018/8/13.
 */
@MyAnnotation(age = 20, name = "littleStar")
public class MyTest {
    public static void testMyAnnotation(Class c){
        System.out.println(c.getName());
        MyAnnotation myAnno = (MyAnnotation) c.getAnnotation(MyAnnotation.class);
        if(myAnno != null){
            System.out.println("name:"+myAnno.name()+" age:"+myAnno.age());
        }else{
            System.out.println("my annotation not generate!");
        }
    }

    public static void main(String[] args){
        MyTest.testMyAnnotation(MyTest.class);
    }
}