import java.util.ArrayList;

/**
 * Created by h205p2 on 9/11/17.
 */
public class Zookeeper {
    String name = "";
    public Zookeeper(String name){
        this.name = name;
    }
    public void feedAnimals(ArrayList<Animal> animals, String food){
        System.out.println(this.name + " is feeding " + food + " to " + animals.size() + " animals of " +  Animal.populationCounter() + " total animals");
        for(int i = 0; i < animals.size(); i++){
            animals.get(i).eat(food);
        }
    }
}
