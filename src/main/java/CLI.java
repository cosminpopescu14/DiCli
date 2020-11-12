import com.google.inject.Guice;

public class CLI {



    public static void main(String[] args) {
        var injector = Guice.createInjector(new BasicModule());
        var persons = injector.getInstance(PersonCreator.class);
        var dogs = injector.getInstance(DogCreator.class);

        System.out.println(persons.create().iterator().next().getName());
        System.out.println(dogs.create().get(1).name());


    }
}
