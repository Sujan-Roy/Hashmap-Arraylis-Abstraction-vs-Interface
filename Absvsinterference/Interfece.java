package Absvsinterference;
//inferface extend multiple class
/**
 * Created by Android on 2/8/2017.
 */
 interface Interfece {
    public void display1();

}
interface interface2{
    public void display2();

}
interface interface3 extends interface2,Interfece{

}
class interface4 implements interface3{
    public void display1(){
        System.out.println("display1 method");
    }

    @Override
    public void display2() {
        System.out.println("Two number add");
    }
}

