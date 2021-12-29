package StockInventory;

public class Product_B extends Product_A {
    private float ProductStoCapacity; // var for storage capacity of the product
    private String ProductManuCompany; // var for manufacturing comapany of the product

    //default constructor
    public Product_B(){}

    //constructor accepting instance field for both Prod_A and Prod_B
    public Product_B(String ProductName, float ProductPrice, int ProductQuantity, String ProductID, String ProductBrand, float productStoCapacity, String productManuCompany) {
        super(ProductName, ProductPrice, ProductQuantity, ProductID, ProductBrand);
        ProductStoCapacity = productStoCapacity;
        ProductManuCompany = productManuCompany;
    }

    
    //get method for var ProductStoCapacity
    public float getProductStoCapacity() {
        return ProductStoCapacity;
    }

    //set method for var ProductStoCapacity
    public void setProductStoCapacity(float productStoCapacity) {
        ProductStoCapacity = productStoCapacity;
    }

    //get method for var ProductManuCompany
    public String getProductManuCompany() {
        return ProductManuCompany;
    }

    //set method for var ProductManuCompany
    public void setProductManuCompany(String productManuCompany) {
        ProductManuCompany = productManuCompany;
    }

    //get inventory value for product B
    public float Inventory_Value(){
        float IV =1*03*super.getProductPrice()*super.getProductQuantity();
        return IV;
    }
}
