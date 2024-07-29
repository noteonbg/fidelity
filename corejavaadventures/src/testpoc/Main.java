package testpoc;

// Main.java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a list of Asset objects
        List<Asset> assets = new ArrayList<>();
        assets.add(new Asset(1, 500.0, "Electronics"));
        assets.add(new Asset(2, 300.0, "Furniture"));
        assets.add(new Asset(3, 300.0, "Electronics"));
        assets.add(new Asset(4, 200.0, "Books"));
        assets.add(new Asset(5, 500.0, "Books"));

        // Print the list before sorting
        System.out.println("Before sorting:");
        for (Asset asset : assets) {
            System.out.println(asset);
        }

        // Sort the list using the AssetComparator
        Collections.sort(assets, new AssetComparator());

        // Print the list after sorting
        System.out.println("\nAfter sorting:");
        for (Asset asset : assets) {
            System.out.println(asset);
        }
    }
}

