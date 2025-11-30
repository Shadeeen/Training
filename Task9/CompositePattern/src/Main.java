//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        File f1 = new File("file1");
        File f2 = new File("file2");

        Folder docs = new Folder("Folder1");
        docs.add(f1);
        docs.add(f2);

        Folder doc = new Folder("Root");
        doc.add(docs);

        doc.open();

    }
}