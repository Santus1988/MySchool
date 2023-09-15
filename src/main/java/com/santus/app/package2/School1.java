package com.santus.app.package2;

public class School1 {
    
   int number  =  19;
   String name =  "Santus   ";
   
       public School1() {}
   

       public School1 (int number, String name){
           this.number = number;
           this.name = name;           
       }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
       
        public void addName(String name) {
        this.name = this.name + name;
    }

        public void changeNumberAndName(int number, String name) {
       this.number = number;
       this.name = name;
    }
        

    @Override
    public String toString() {
        return "School1{" + "number=" + number + ", name=" + name + '}';
    }
        
       
}
