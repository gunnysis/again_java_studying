public class Book {
    String name;
    int price;
    static boolean mSValue;

    static {
        mSValue = true;
    }

    Book(){}

    Book(String name, int price){
        this.name = name;
        this.price = price;
    }

    void mA(){}
    int mB(){
        return price;
    }
    String mC(){
        return name;
    }
    double mD(){
        return price;
    }

    static boolean mS() {
        return mSValue;
    }
}
