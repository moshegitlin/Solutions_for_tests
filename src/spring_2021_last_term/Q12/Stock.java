package spring_2021_last_term.Q12;

public class Stock {
    private FoodItem[] stock;
    private int numOfItems;

    public Stock() {
        this.stock = new FoodItem[100];
        this.numOfItems =0;
    }
    public int howMany(int temp){
    if(numOfItems <=0) return 0;
    int num = 0;
    for (FoodItem f:stock){
        if (temp >= f.getMinTemperature()&& temp <= f.getMaxTemperature()){
            num+=f.getQuantity();
        }
    }
        return num;
    }
   public boolean addFoodItem(FoodItem f){
        if (numOfItems >= stock.length) return false;
        for (FoodItem item:stock){
            if (item==null){
                stock[numOfItems++] = f;
            }
        }

        return true;
    }
    public void removeAfterDate(Date d){
        for (int i = 0; i < stock.length; i++) {
            if (!(stock[i].isFresh(d))){
                stock[i] = null;
            }
        }
    }
}
