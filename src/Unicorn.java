/**
 * Created by h205p2 on 9/8/17.
 */
public class Unicorn extends Animal{
    public Unicorn(String name){
        super(name, "marshmallows");
    }
    public void sleep(){
        System.out.println(this.name + " sleeps in a cloud");
    }

}
