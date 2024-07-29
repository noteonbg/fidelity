package testpoc;

 // Asset.java
public class Asset {
    private int assetId;
    private double price;
    private String category;

    // Constructor
    public Asset(int assetId, double price, String category) {
        this.assetId = assetId;
        this.price = price;
        this.category = category;
    }

    // Getters
    public int getAssetId() {
        return assetId;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    // toString method for easy representation
    @Override
    public String toString() {
        return "Asset{" +
                "assetId=" + assetId +
                ", price=" + price +
                ", category='" + category + '\'' +
                '}';
    }
}
