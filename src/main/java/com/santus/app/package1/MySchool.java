package com.santus.app.package1;

import com.santus.app.package2.School1;
import com.santus.app.package3.Cars;

public class MySchool {

    public static void main(String[] args) {
       
        
     School1 student1 = new School1();
     
     System.out.println("about student1");
     System.out.println(student1.getNumber());
     System.out.println(student1.getName());
     System.out.println("xxxxxxxxxxxxxx");
     System.out.println("xxxxxxxxxxxxxx");
     System.out.println("");
     System.out.println(student1.toString ());
     
     
     System.out.println("about student2");
     School1 student2 = new School1(30, "Uche");
     System.out.println(student2.getNumber());
     System.out.println(student2.getName());
     System.out.println("xxxxxxxxxxxxxxx");
     System.out.println("xxxxxxxxxxxxxxx");
     System.out.println("");
     System.out.println(student2.toString());
     
     
     System.out.println("adding name to stduent2");
     student2.addName("onuegbu");
     System.out.println(student2.getName());
     System.out.println(student2.getNumber());
     System.out.println(student2.toString());
      
     System.out.println("seeting new name to student2");
     student2.setName("darlington");
     student2.setNumber(28);
     System.out.println(student2.getName());
     System.out.println(student2.getNumber());
     System.out.println("xxxxxxxxxxxxxxx");
     System.out.println("xxxxxxxxxxxxxxxxx");
     System.out.println("");
     System.out.println(student2.toString());
     
     
     System.out.println("about student3");
     School1 student3 = new School1 (35, "Chimadikamma");
     
     System.out.println(student3.getName());
     System.out.println(student3.getNumber());
     System.out.println("xxxxxxxxxxxxxxx");
     System.out.println("");
     System.out.println(student3.toString());
     
     
     System.out.println("xxxxxxxxxx obiject 1, 2, 3 xxxxxxxx");
     System.out.println("student1 tostring");
     System.out.println(student1.toString());
     
     System.out.println("student2 tostring");
     System.out.println(student2.toString());
     
     System.out.println("student3 tostring");
     System.out.println(student3.toString());
     
     
     
     System.out.println("about car1");
     Cars car1 = new Cars ();
     
     System.out.println(car1.getMake());
     System.out.println(car1.getEnginetype());
     System.out.println(car1.getMileage());
     System.out.println(car1.getYear());
     System.out.println("xxxxxxxxxxxxxxx");
     System.out.println(car1.toString());
     
     
     System.out.println("about car2");
     Cars car2 = new Cars ("Tesla   ", "electric    ",     15000,                 2023 );
     System.out.println(car2.getMake());
     System.out.println(car2.getEnginetype());
     System.out.println(car2.getMileage());
     System.out.println(car2.getYear());
     System.out.println(car2.toString());
     
     
     car2.setMake("peugeot");
     car2.setYear(2023);
     System.out.println(car2.getMake());
     System.out.println(car2.getEnginetype());
     System.out.println(car2.getMileage());
     System.out.println(car2.getYear());
     System.out.println ("xxxxxxxxxxxxx");
     System.out.println(car2.toString());
     
     
     System.out.println("about car3");
     Cars car3 = new Cars("Ford", "patrol", 13000, 2017);
     System.out.println(car3.getMake());
     System.out.println(car3.getEnginetype());
     System.out.println(car3.getMileage());
     System.out.println(car3.getYear());
     System.out.println(car3.toString());
     
     
     if (student1.getNumber() == student2.getNumber()) {
         System.out.println("Approved");}
     
         else {System.out.println("Not Approved");
                 }
     
     
     
     if (student1.getName() == "Uche") {
        System.out.println("You are allowed");
     }
     
     
     
     if (student2.getName() == "dark") {
         System.out.println("Welcome, darlington, do hava a lovely day today ");
    }
     else { System.out.println("Try again later, your mname does not match");
     
     }
     
       
     
     }
     }
     
     
     
     
             
     
     
     
     
     
     
     
     
     
     
     
     
    
     
     
     
     
     
     
     
     
     
    }
}
