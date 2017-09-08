/**
 * Created by h205p2 on 9/8/17.
 */
public class Bear extends Animal{
    /*
    String name;
    String favoriteFood;
    public void sleep(){
        System.out.println(this.name + " hibernates for 4 months");
    }
    public void eat(String food){
        System.out.println(this.name + " eats " + food);
        if(this.favoriteFood.equals(food)){
            System.out.println("YUM!!! " + this.name + " wants more " + food);
        }
        else{
            sleep();
        }
    }
    */
    public Bear(String name){
        super(name, "fish");
    }
    public void sleep(){
        System.out.println(this.name + " hibernates for 4 months");
    }
    public static void main(String args[]){
        Tiger tigger = new Tiger("Tigger");
        tigger.eat("meat");
        tigger.eat("kibble");
        Bear pooh = new Bear("Pooh");
        pooh.eat("fish");
        pooh.eat("meat");


    }
}
