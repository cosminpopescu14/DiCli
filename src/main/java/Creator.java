import java.util.List;

public interface Creator<T> {

    public <T> List<T> create();
}
