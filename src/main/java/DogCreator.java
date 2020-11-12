import java.util.List;

public class DogCreator implements Creator<Dog> {

    public List<Dog> create() {
        return List.of(new Dog("rita", 12), new Dog("lizzy", 4));
    }
}
