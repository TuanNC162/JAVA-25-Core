package entity;

public class DetailFoodItem {
    private int quantity;
    private FoodItem foodItem;

    public DetailFoodItem(int quantity, FoodItem foodItem) {
        this.quantity = quantity;
        this.foodItem = foodItem;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public FoodItem getFoodItem() {
        return foodItem;
    }

    public void setFoodItem(FoodItem foodItem) {
        this.foodItem = foodItem;
    }

    @Override
    public String toString() {
        return "DetailFoodItem{" +
                "quantity=" + quantity +
                ", foodItem=" + foodItem +
                '}';
    }
}
