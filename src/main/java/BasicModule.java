import com.google.inject.AbstractModule;
import com.google.inject.Module;

public class BasicModule extends AbstractModule {

    /**
     * Constructor specific binding
     */
    @Override
    protected void configure() {
        bind(PersonCreator.class)
                .toInstance(new PersonCreator());

        bind(DogCreator.class)
                .toInstance(new DogCreator());
    }
}
