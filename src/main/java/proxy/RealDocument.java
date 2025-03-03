package proxy;

public class RealDocument implements Document {
    private String fileName;

    public RealDocument(String fileName) {
        this.fileName = fileName;
    }

    private void loadFromDisk()
    {
        System.out.println("Loading file form :"+fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying file :"+fileName);
    }
}
