package library.models;

public class Newspaper extends Item {
    private String publisher;
    private String type;

    public Newspaper(int ID, boolean inStock, String publisher, String type){
        super(ID, inStock);
        this.setPublisher(publisher);
        this.setType(type);
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
