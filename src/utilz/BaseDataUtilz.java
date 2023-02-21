package utilz;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class BaseDataUtilz<T> {

    //TODO:падает если файла нет и записей нет

    public List<T> LoadData(String path) {
        FileInputStream fis = null;
        ObjectInputStream in = null;
        List<T> object = null;
        try {
            fis = new FileInputStream(path);
            in = new ObjectInputStream(fis);
            object = (List<T>) in.readObject();
            in.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return object;
    }

    public void SaveData(String path, List<T> object) {
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
