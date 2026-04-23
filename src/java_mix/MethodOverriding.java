package java_mix;

public class MethodOverriding {
	public static void main(String[] args){
        Animal obj1 = new Animal();
          Dog  obj2 = new Dog();
               obj2.sound();
               obj2.run();
         Cat obj3= new Cat();
             obj3.sound();
             obj3.run();
    }
}
class Animal{
    void sound(){
    System.out.print("The animals make sound");
  }
     void run(){
        System.out.print("The animals can run");   
     }
}

class Dog extends Animal{
       void sound(){
           System.out.println("Dog barks");
       }
       
        void run(){
           System.out.println("Dog can run");
  }
}
class Cat extends Animal{
       void sound(){
           System.out.println("Cat Mau");
       }
       
        void run(){
           System.out.println("cat can run faster");
    }
}


