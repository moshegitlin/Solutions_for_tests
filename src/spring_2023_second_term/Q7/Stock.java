package spring_2023_second_term.Q7;

import spring_2023_second_term.Q7.Product;

public class Stock {
    private Product[] stock;
    private int numOfProducts;

    public Stock() {
        this.stock = new Product[100];
        this.numOfProducts =0;
    }
    public Product mostCheaper(String category){
        Product test = null;
        for (Product p:stock){
        if (p== null) continue;
        if(p.getCategory().equals(category)) {
            test = p;
            break;
        }
        }
        if (test == null ) return test;
        for (Product p: stock){
            if (p== null) continue;
            if(p.isCheaper(test)) test = p;
        }
        return test;
    }
    public void updateStock(String name, String category, int count,double price){
        Product other = new Product(name,category,count,price);
        for (int i = 0; i < numOfProducts; i++) {
            if(stock[i].isSame(other)) {
                stock[i].setCount( stock[i].getCount()+1);
                stock[i].setPrice(Math.min(stock[i].getPrice(),other.getPrice()));
                return;
            }
        }
        stock[numOfProducts++]= other;
    }
}
