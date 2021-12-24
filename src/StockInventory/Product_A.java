package StockInventory;

public class Product_A {
    private String ProductName; //var for name of the product
    private float ProductPrice; //var for price of the product
    private int ProductQuantity; //var for the quantity of units in stock
    private float ProductID;    //var for the ID number of the product
    private String ProductBrand; //var for the brand of the product

    //default constructor
    Product_A(){}

    //overloading constructor
    Product_A(String ProductName, float ProductPrice, int ProductQuantity, float ProductID, String ProductBrand ){
        this.ProductName = ProductName;
        this.ProductPrice = ProductPrice;
        this.ProductQuantity = ProductQuantity;
        this.ProductID = ProductID;
        this.ProductBrand = ProductBrand;
    }

    //get method for var ProductName
    public String getProductName() {
        return ProductName;
    }
    //set method for var ProductName
    public void setProductName(String productName) {
        ProductName = productName;
    }
    //get method for var ProductPrice
    public float getProductPrice() {
        return ProductPrice;
    }
    //set method for var ProductPrice
    public void setProductPrice(float productPrice) {
        ProductPrice = productPrice;
    }
    //get method for var ProductQuantity
    public int getProductQuantity() {
        return ProductQuantity;
    }
    //set method for var ProductQuantity
    public void setProductQuantity(int productQuantity) {
        ProductQuantity = productQuantity;
    }
    //get method for var ProductID
    public float getProductID() {
        return ProductID;
    }
    //set method for var ProductID
    public void setProductID(float productID) {
        ProductID = productID;
    }
    //get method for var ProductBrand
    public String getProductBrand() {
        return ProductBrand;
    }
    //set method for var ProductBrand
    public void setProductBrand(String productBrand) {
        ProductBrand = productBrand;
    }
    //Method to calculate inventory value
    public float Inventory_Value(){
        return ProductPrice*ProductQuantity ;

}
}   