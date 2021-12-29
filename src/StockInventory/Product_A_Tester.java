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
        float ProdStoCapacity = 0;
        String ProdManuCompany;


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

        try{
            System.out.print("Enter the storage capacity of the product : ");
            ProdStoCapacity = Float.parseFloat(br.readLine());
        }catch(NumberFormatException e){
            System.out.println("Exception Occured! Invalid Data");
        }

        System.out.print("Enter the manufacturing company of the product : ");
        ProdManuCompany = br.readLine();

        br.close();

        //create object 
        Product_B prod2 = new Product_B();
        Product_A prod = prod2; 

        //update variable value
        prod.setProductName(ProdName);
        prod.setProductPrice(ProdPrice);
        prod.setProductQuantity(ProdQuantity);
        prod.setProductID(ProdID);
        prod.setProductBrand(ProdBrand);
        prod2.setProductStoCapacity(ProdStoCapacity);
        prod2.setProductManuCompany(ProdManuCompany);

        // Output
        System.out.println("Product Name : " +prod2.getProductName() );
        System.out.println("Product Price : " +prod2.getProductPrice() );
        System.out.println("Quantity of product units in stock : " +prod2.getProductQuantity());
        System.out.println("Product ID Number : " +prod2.getProductID() );
        System.out.println("Product Brand : " +prod2.getProductBrand());
        System.out.println("Inventory Value : " +prod2.Inventory_Value());
        System.out.println("Product Storage Capacity : " +prod2.getProductStoCapacity());
        System.out.println("Product Manufacturing Company : " +prod2.getProductManuCompany());
    }
}
