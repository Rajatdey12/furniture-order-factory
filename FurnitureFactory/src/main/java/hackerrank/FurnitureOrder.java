package hackerrank;

import java.util.HashMap;
import java.util.Map;

public class FurnitureOrder implements FurnitureOrderInterface {
    /**
     * TODO: Create a map of Furniture items to order quantities
     */
    private final Map<Furniture, Integer> furnitureMap;

    /**
     * Initialize a new mapping of Furniture types to order quantities.
     */
    public FurnitureOrder() {
        // TODO: Complete the constructor
        this.furnitureMap = new HashMap<>(1);
    }

    public void addToOrder(final Furniture type, final int furnitureCount) {
        // TODO: Complete the method
        furnitureMap.put(type, furnitureCount);
    }

    public HashMap<Furniture, Integer> getOrderedFurniture() {
        // TODO: Complete the method
        return new HashMap<>(furnitureMap);
    }

    public float getTotalOrderCost() {
        // TODO: Complete the method
        float total = 0;
        for (Map.Entry<Furniture, Integer> entry : furnitureMap.entrySet()) {
            Furniture furniture = entry.getKey();
            total += entry.getValue() * furniture.cost();
        }
        return total;
    }

    public int getTypeCount(Furniture type) {
        // TODO: Complete the method
        if (furnitureMap.get(type) != null) {
            return furnitureMap.get(type);
        }
        return 0;
    }

    public float getTypeCost(Furniture type) {
        // TODO: Complete the method
        if (furnitureMap.get(type) != null) {
            int orders = furnitureMap.get(type);
            return type.cost() * orders;
        }
        return 0.0f;
    }

    public int getTotalOrderQuantity() {
        int total = 0;
        for (Map.Entry<Furniture, Integer> entry : furnitureMap.entrySet()) {
            total += entry.getValue();
        }
        return total;
    }
}