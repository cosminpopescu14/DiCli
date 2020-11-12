import net.andreinc.mockneat.MockNeat;

import java.util.List;

public class PersonCreator implements Creator<Person> {

    public List<Person> create() {
        return List.of(new Person("cosmin", 27), new Person("cosmin1", 27));
    }
}
