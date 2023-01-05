import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file = new File("Fields.txt");
        Method m = new Method();
        Field[] fields = Book.class.getDeclaredFields();

        List<String> annotationValues = new ArrayList<>();
        for (int i = 0; i < fields.length; i++) {
            Field field = fields[i];

            if (field.getAnnotation(Fielder.class) instanceof Fielder) {
                annotationValues.add(field.getName() + " -----  annotaion value = " + field.getAnnotation(Fielder.class).params());
            }
        }
        m.serialize(annotationValues,file);
        System.out.println("File: " + m.deserealize(file));
    }
}