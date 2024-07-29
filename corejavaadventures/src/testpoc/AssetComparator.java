package testpoc;

import java.util.Comparator;

//AssetComparator.java
import java.util.Comparator;

public class AssetComparator implements Comparator<Asset> {
 @Override
 public int compare(Asset a1, Asset a2) {
     // First compare by price
     int priceComparison = Double.compare(a1.getPrice(), a2.getPrice());
     if (priceComparison != 0) {
         return priceComparison;
     }
     // If prices are equal, compare by category
     return a1.getCategory().compareTo(a2.getCategory());
 }
}
