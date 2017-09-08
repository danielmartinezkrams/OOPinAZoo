/**
 * Created by h205p2 on 9/7/17.
 */
public class Zoo {

    public static void main(String args[]){
        Zoo Tigger = new Zoo();
        Tigger.eat("Tigger", "meat");
        Tigger.eat("Tigger", "bacon");
    }
    String favoriteFood = "bacon";
    public static void sleep(String name){
        System.out.println(name + " sleeps for 8 hours");
    }
    public void eat(String name, String food){
        System.out.println(name + " eats " + food);
        if(food.equals(favoriteFood)){
            System.out.println("YUM!!! " + name + " wants more " + food);
        }
        else{
            sleep(name);
        }
    }
}
