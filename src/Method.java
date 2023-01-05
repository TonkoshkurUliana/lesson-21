import java.io.*;
import java.util.List;

public class Method implements Serializable {
    public static void serialize(List<String> text, File file) throws IOException {
        OutputStream os = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(os);
            oos.writeObject(text);

        oos.close();
        os.close();
    }

    public static Serializable deserealize(File file) throws IOException, ClassNotFoundException {
        InputStream is = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(is);
        Serializable text = (Serializable) ois.readObject();
        is.close();
        ois.close();
        return text;
    }
}