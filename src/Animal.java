/**
 * Created by h205p2 on 9/8/17.
 */
public class Animal {
    String name;
    String favoriteFood;
    public Animal(String name, String favoriteFood) {
        this.name = name;
        this.favoriteFood = favoriteFood;
        population++;
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
    static int population = 0;
    public static int populationCounter(){
        return population;
    }

}
