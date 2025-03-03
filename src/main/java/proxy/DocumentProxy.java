package proxy;

public class DocumentProxy implements Document {
    private RealDocument realDocument;
    private String fileName;
    private String userRole;

    public DocumentProxy(String fileName, String userRole) {
        this.fileName = fileName;
        this.userRole = userRole;
    }


    @Override
    public void display() {
        if(!userRole.equals("admin")) {
            System.out.println("Your access to document has been denied.");
            return;
        }

        if(realDocument == null) {
            realDocument = new RealDocument(fileName);
        }
        realDocument.display();
    }
}
