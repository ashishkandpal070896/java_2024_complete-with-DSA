public class est123{
    public static void main(String[] args) {
        
        Bear q=new Bear();
        q.eat();
    }
}
interface  Herbivore{
    void eat();

}
interface  Carnivore{
    void eat01();
} 


    

class  Bear implements Herbivore,Carnivore{
   

    public void eat(){
        System.out.println("bear is eat the meat and Sugarcane,");
    }
    public void eat01(){
        System.out.println("the bear is eat  the meat");
    }
}