/*
 Created by h205p2 on 9/8/17.
 */
public class Tiger {
    String name;
    String favoriteFood;

    public Tiger(String name){
        this.name = name;
        this.favoriteFood = "meat";
    }
    public void sleep(){
        System.out.println(this.name + " sleeps for 8 hours");
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
    public static void main(String args[]){
        Tiger tigger = new Tiger("Tigger");
        tigger.eat("meat");
        tigger.eat("kibble");

    }
}
