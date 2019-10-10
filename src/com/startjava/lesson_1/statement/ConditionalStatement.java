package com.startjava.lesson_1.statement;

public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 21;        
        if(age > 20) {
            System.out.println("Вы старше 20");
        }  
        
        boolean male = false;            
        if(male) {
             System.out.println("Вы мужчина");
        }                    
        if(!male) {
             System.out.println("Вы женщина");
        } 
        
        float height = 1.70F;
        if(height < 1.80) {
            System.out.println("Коротышка");
        } else{
            System.out.println("Высокий");
        }
        
        char capitalinName = 'M';
        if(capitalinName == 'M') {
            System.out.println("Ты наверное Михаил");
        } else if(capitalinName == 'I') {
            System.out.println("Ты наверное Iван");
        } else{
            System.out.println("Мы не знаем кто ты");
        }
    }
}