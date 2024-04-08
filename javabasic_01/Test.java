// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathe");
        
    }
}
    class Fish extends Animal{
        int fins;
        void swim(){
            System.out.println("swims in water");
        }
    }
        
    
  public class Test{
    public static void main(String[]args)
{
    Fish sharks= new Fish();
    sharks.eat();
}
}

