package interfaceex;


// Want to extends Mammal and implements Pet
public class Dog extends Mammal implements Pet{
    Dog() {
        System.out.println("devided object value: "+this.hashCode());
    }


    @Override
    public void love() {
        System.out.println("love dog");
    }
}
