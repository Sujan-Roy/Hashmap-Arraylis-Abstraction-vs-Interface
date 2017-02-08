package Absvsinterference;
//abstract can extend only one class
/**
 * Created by Android on 2/8/2017.
 */
public class Abstaction {
    public void display1(){
        System.out.println("display1 method");
    }
}
  abstract class Abs1 extends Abstaction{
    abstract void display2();
}
  class Abs2 extends Abstaction{
    public void display3(){
        System.out.println("Only one class extend in Abstraction");
    }
}
