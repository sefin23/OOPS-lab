/*1)Course Outcome 1 (CO1):
1. Define a class ‘product’ with data members pcode, pname and price. Create 3 objects of
the class and find the product having the lowest price.*/


public class Product {
    int pcode;
    String pname;
    int price;
    public static void main(String[] args) {
       
        Product p1 = new Product();
        Product p2 = new Product();
        Product p3 = new Product();
p1.pcode=101;
p1.pname="xxx";
p1.price=100;

p2.pcode=108;
p2.pname="xyz";
p2.price=300;

p3.pcode=200;
p3.pname="zzz";
p3.price=120;

System.out.println("PRODUCT1");
System.out.println("code"+p1.pcode);
    System.out.println("name"+p1.pname);
    System.out.println("price"+p1.price);
   
    System.out.println("PRODUCT2");
    System.out.println("code"+p2.pcode);
    System.out.println("name"+p2.pname);
    System.out.println("price"+p2.price);
   
    System.out.println("PRODUCT3");
    System.out.println("code"+p3.pcode);
    System.out.println("name"+p3.pname);
    System.out.println("price"+p3.price);
   
    if (p1.price>p2.price)
    {
    if(p1.price>p3.price)
    {
    System.out.println("first product product have high price ");
    }
    else
    {
    System.out.println("third product product have high price");
    }
    }
    else
    {
    if(p2.price>p3.price)
    {
    System.out.println("second product have high price");
    }
    else
    {
    System.out.println("third product product have high price");
    }
    }
    }
    }
