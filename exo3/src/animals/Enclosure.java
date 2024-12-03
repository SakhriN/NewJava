package animals;

import java.util.ArrayList;
import java.util.List;

public class Enclosure {
private int id;
private String name;
private List<Animal> enclosure;
private int count = 1;

    public Enclosure(String name) {
        this.id = count++;
        this.name = name;
        this.enclosure = new ArrayList<Animal>();
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Animal> getEnclosure() {
        return enclosure;
    }

    public void addAnimal(Animal animal) {
    enclosure.add(animal);
}

public void removeAnimal(int id) {
    for (Animal animal : enclosure) {
        if (animal.getId() == id) {
            enclosure.remove(animal);
            break;
        }
    }
}

public void ListAnimals() {
    for (Animal animal : enclosure) {
        System.out.println(animal);
    }
}

}
