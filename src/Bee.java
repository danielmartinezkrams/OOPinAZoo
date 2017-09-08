/**
 * Created by h205p2 on 9/8/17.
 */
public class Bee extends Animal{
    public Bee(String name){
        super(name, "pollen");
    }
    public void eat(String food){
        System.out.println("YUM!!! " + this.name + " wants more pollen");
        sleep();
    }
    public void sleep(){
        System.out.println(this.name + "never sleeps");
    }
}
