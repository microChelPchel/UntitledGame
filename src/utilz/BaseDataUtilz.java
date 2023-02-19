package utilz;

import java.io.*;

public abstract class BaseDataUtilz<T> {

    public T LoadData(String path) {
        FileInputStream fis = null;
        ObjectInputStream in = null;
        T object = null;
        try {
            fis = new FileInputStream(path);
            in = new ObjectInputStream(fis);
            object = (T) in.readObject();
            in.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return object;
    }

    public void SaveData(String path, T object) {
        FileOutputStream fos = null;
        ObjectOutputStream out = null;
        try {
            fos = new FileOutputStream(path);
            out = new ObjectOutputStream(fos);
            out.writeObject(object);
            out.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

}
