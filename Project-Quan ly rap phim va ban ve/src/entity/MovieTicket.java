package entity;

import java.io.Serializable;

public class MovieTicket implements Serializable {

    private static final long serialVersionUID = 6529685098267757690L;

    private int totalAmount;
    private Showtimes showtimes;
    private DetailFoodItem detailFoodItem;
    private float toatlPrice;

    public MovieTicket(int totalAmount, Showtimes showtimes, DetailFoodItem detailFoodItem, float toatlPrice) {
        this.totalAmount = totalAmount;
        this.showtimes = showtimes;
        this.detailFoodItem = detailFoodItem;
        this.toatlPrice = toatlPrice;
    }

    public MovieTicket(int totalAmount, Showtimes showtimes, float toatlPrice) {
        this.totalAmount = totalAmount;
        this.showtimes = showtimes;
        this.toatlPrice = toatlPrice;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Showtimes getShowtimes() {
        return showtimes;
    }

    public void setShowtimes(Showtimes showtimes) {
        this.showtimes = showtimes;
    }

    public DetailFoodItem getDetailFoodItem() {
        return detailFoodItem;
    }

    public void setDetailFoodItem(DetailFoodItem detailFoodItem) {
        this.detailFoodItem = detailFoodItem;
    }

    public float getToatlPrice() {
        return toatlPrice;
    }

    public void setToatlPrice(float toatlPrice) {
        this.toatlPrice = toatlPrice;
    }

    @Override
    public String toString() {
        return "MovieTicket{" +
                "totalAmount=" + totalAmount +
                ", showtimes=" + showtimes +
                ", detailFoodItem=" + detailFoodItem +
                ", toatlPrice=" + toatlPrice +
                '}';
    }
}
