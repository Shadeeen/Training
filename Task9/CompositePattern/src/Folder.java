import java.util.ArrayList;

public class Folder implements FileSystem {

    private String name;

    private ArrayList<FileSystem> docs = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void add(FileSystem fs) {
        docs.add(fs);
    }

    @Override
    public void open() {
        System.out.println("Folder: " + name);

        for (FileSystem fs : docs) {
            fs.open(); // recursion
        }
    }
}
