package library.models;

public class Map extends Item{
    private String region;
    private String type;

    public Map (int ID, boolean inStock, String region, String type){
        super(ID, inStock);
        this.setRegion(region);
        this.setType(type);
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
