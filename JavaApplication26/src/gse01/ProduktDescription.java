package gse01;

public class ProduktDescription {

    private String productID;
    private String description;
    private double price;
    private int standardQuantity;
    private int quantityInWarehouse;

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getProductID() {
        return productID;
    }

    public void setProduktDescription(String description) {
        this.description = description;
    }

    public String getProduktDescription() {
        return description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setStandardQuantity(int standardQuantity) {
        this.standardQuantity = standardQuantity;
    }

    public double getStandardQuantity() {
        return standardQuantity;
    }

    public void setWarehouseQuantity(int quantityInWarehouse) {
        this.quantityInWarehouse = quantityInWarehouse;
    }

    public int getWarehouseQuantity() {
        return quantityInWarehouse;
    }
}
