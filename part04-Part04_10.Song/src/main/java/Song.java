public class Song {

    private String name;
    private int lenght;

    public Song(String name, int lenght) {
        this.lenght = lenght;
        this.name = name;
    }

    public String name(){
        return name;
    }

    public int length() {
        return lenght;
    }
}
