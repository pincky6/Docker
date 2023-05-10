import java.util.ArrayList;
import java.util.List;
    public class ObjectCollection {
    private List<Object> objects;

    public ObjectCollection() {
        this.objects = new ArrayList<>();
    }

    public void add(Object object) {
        objects.add(object);
    }

    public void remove(Object object) {
        objects.remove(object);
    }

    public void clear() {
        objects.clear();
    }

    public void process(Processor processor) {
        for (Object object : objects) {
            processor.process(object);
        }
    }
}
