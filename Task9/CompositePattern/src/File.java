public class File implements FileSystem{
    private String name;

    File(String name){
        this.name = name;
    }
    @Override
    public void open() {
        System.out.println("file "+name+" opened");
    }
}
