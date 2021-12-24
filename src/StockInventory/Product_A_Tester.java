package StockInventory;

import java.io.*;

public class Product_A_Tester {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //variable declaration
        String ProdName;
        float ProdPrice = 0;
        int ProdQuantity = 0;
        String ProdID;
        String ProdBrand;


        //user input
        System.out.print("Enter the name of the product : ");
        ProdName = br.readLine();

        try {
            System.out.print("Enter the price of the product : ");
            ProdPrice = Float.parseFloat(br.readLine());
        } catch (NumberFormatException e) {
            System.out.println("Exception Occured! Invalid Data");
        }

        try {
            System.out.print("Enter the quantity of product unit it stock : ");
            ProdQuantity = Integer.parseInt(br.readLine());
        } catch (NumberFormatException e) {
            System.out.println("Exception Occured! Invalid Data");
        }

        System.out.print("Enter the product ID : ");
        ProdID = br.readLine();

        System.out.print("Enter the brand of the product : ");
        ProdBrand = br.readLine();
        br.close();

        //create object for Product A
        Product_A prod = new Product_A();

        //update variable value
        prod.setProductName(ProdName);
        prod.setProductPrice(ProdPrice);
        prod.setProductQuantity(ProdQuantity);
        prod.setProductID(ProdID);
        prod.setProductBrand(ProdBrand);

        // Output
        System.out.println("Product Name : " +prod.getProductName() );
        System.out.println("Product Price : " +prod.getProductPrice() );
        System.out.println("Quantity of product units in stock : " +prod.getProductQuantity());
        System.out.println("Product ID Number : " +prod.getProductID() );
        System.out.println("Product Brand : " +prod.getProductBrand());
        System.out.println("Inventory Value :" + prod.Inventory_Value(ProdPrice, ProdQuantity));
    }
}
