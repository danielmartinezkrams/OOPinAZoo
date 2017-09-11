/**
 * Created by h205p2 on 9/8/17.
 */
public class Bee extends Animal{
    public Bee(String name){
        super(name, "pollen");
    }
    public void eat(String food){
        System.out.println(this.name + " eats " + food);
        if("pollen".equals(food)){
            System.out.println("YUM!!! " + this.name + " wants more pollen");
            sleep();
        }
        else{
            System.out.println("YUCK!!! " + this.name + " will not eat " + food);
        }
    }
    public void sleep(){
        System.out.println(this.name + " never sleeps");
    }
}
