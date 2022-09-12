package org.radio.Broadcasts;

public class Advertising extends BaseBroadcast {

    private String nameOfProduct;
    private final float pricePerSecond = 5;

    public Advertising (int adDuration, String nameOfProduct){
        super(adDuration);
        this.nameOfProduct = nameOfProduct;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public void setNameOfProduct(String nameOfProduct){
        this.nameOfProduct = nameOfProduct;
    }

    @Override
    public String toString() {
        return "Advertising{" +
                "nameOfProduct='" + nameOfProduct + '\'' +
                ", pricePerSecond=" + pricePerSecond +
                '}';
    }
}
