package com.modernjava.javaimprovements;

public class VarExample {
    public static void main(String[] args) {
        var name = "John Doe"; // Infers String type
        var age = 25; // Infers int type
        var salary = 5000.0; // Infers double type
        
        String stringName = new String("Krishna");
        int intAge = 24;
        double doubleSalary = 423.322;
        
        printVar(name, age, salary);
        
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    
        System.out.println("stringName: " + stringName);
        System.out.println("intAge: " + intAge);
        System.out.println("doubleSalary: " + doubleSalary);
    }
    
    // Not Allowed
    //In Java, the var keyword cannot be used as a method parameter type.
    //The var keyword is only allowed for local variable type inference within method bodies.

  //  public void printVar(var name, var age, var salary ) {
    	
  //  }
    
    public static void printVar(String name, int age, double salary ) {
        
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    	
    }
}
