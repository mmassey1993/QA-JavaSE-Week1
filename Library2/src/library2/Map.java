package library2;

import java.util.ArrayList;

public class Map extends Item{

    private String region;

    public Map(int itemID, String region) {
        super(itemID);
        this.region = region;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}
