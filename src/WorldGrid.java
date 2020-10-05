import java.util.ArrayList;

public class WorldGrid {
    ArrayList<Animal> animals;
    WorldGrid(){
        //Instansiering af 4D array 10x10x10x1
        Object[][][][] world = new Object[10][10][10][1];

        //instansicering af ArrayList af objekter
        ArrayList<Animal> animals = new ArrayList<Animal>();
        world[0][0][0][0] = animals;
        //sheep objekt instansieres i objektarraylist
        for (int i = 0; i < 10; i++) {
            animals.add(new Sheep());
            animals.add(new Dog());
        }
        this.animals = animals;
    }

    public static void main(String[] args) {
        Animal animal;
        WorldGrid world = new WorldGrid();

        for (int i = 0; i < world.animals.size(); i++) {
            animal = world.animals.get(i);
            animal.sound();
        }
    }
}

