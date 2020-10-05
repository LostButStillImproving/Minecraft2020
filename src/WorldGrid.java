import java.util.ArrayList;

public class WorldGrid {

    ArrayList<Object> sheeps;
    WorldGrid(){
        //Instansiering af 4D array 10x10x10x1
        Object[][][][] world = new Object[10][10][10][1];

        //instansicering af ArrayList af objekter
        ArrayList<Object> sheeps = new ArrayList<Object>();
        world[0][0][0][0] = sheeps;
        //heep objekt instansieres i objektarrayet
        for (int i = 0; i < 10; i++) {
            sheeps.add(new Sheep());
        }
        this.sheeps = sheeps;
    }

    public static void main(String[] args) {
        ArrayList<Sheep> sheeps;
        Object sheep;
        Sheep sheepyfied;
        WorldGrid world = new WorldGrid();
        for (int i = 0; i < world.sheeps.size(); i++) {
            sheep = world.sheeps.get(i);
            sheepyfied = (Sheep) sheep;
            System.out.println(sheepyfied.getGender());
        }
    }
}

