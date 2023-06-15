package Summer_2022_first_term;

import Summer_2022_first_term.Q12.Cake;
import Summer_2022_first_term.Q12.Date;
import Summer_2022_first_term.Q12.Refrigerator;
import Summer_2022_first_term.Q5.*;
import java.util.Scanner;
import static Summer_2022_first_term.Q5.TestMovie.*;


public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main (String [] args){
        System.out.println("Enter a question number");
       int Q = sc.nextInt();
       switch (Q){
           case 1:
               Solutions.Q1();
               break;
           case 3:
               System.out.println( Solutions.Q3(new int[]{1,2,3,-3,-2,-1}));
               System.out.println( Solutions.Q3(new int[]{1,2,3,-3,-2,-1,0,0}));
               System.out.println("The complexity of the operation is On because we only went through the array n times");
               break;
           case 4:
               Child c1= new Child("avi",'M',2022,8);
               Child c2= new Child("Moria",'F',2022,9);
               Child c3= new Child("moshe",'M',2022,6);
               Child.printByYear(new Child[]{c1,c2,c3},2022);
               Child.printByMonth(new Child[]{c1,c2,c3});
               break;
           case 5:
               Movie a = new Movie();
               a.setName("Avatar");
               a.setPrice(30.0);
               a.setNum(100);
               System.out.println(totalSum(a));
               a.setNum(50);
               Movie b = new Movie (a.getName(), 20.0, a.getNum());
               System.out.println(totalSum(b));
               System.out.println(getMostPopularMovie(new Movie[]{a,b}));
               break;
           case 12:
               Date d =new Date();
               Cake cake1 = new Cake("vanilla cake",3,1,2020,70,false);
               Cake cake2= new Cake("cinnamon cake",2,1,2020,75,false);
               System.out.println(cake1.isFresh(d));
               System.out.println(cake1.isFresh(new Date(3,1,2020)));
               System.out.println(cake1.isReplaceable(cake2));
               Refrigerator re = new Refrigerator();
               re.setCakes(cake1);
               re.setCakes(cake2);
               System.out.println(re.mostFresh());
               Cake cake3= new Cake("chocolate cake",2,1,2019,75,false);
               re.setCakes(cake3);
               re.removeNotFresh(new Date(1,2,2019));
               System.out.println(re.purchaseOrder(new String[]{"cinnamon cake","vanilla cake"}));
               System.out.println(re.purchaseOrder(new String[]{"cinnamon cake","vanilla cake","chocolate cake"}));
               break;
           case 14:
               int [][] mat = {
                       {1,3,8,1,2,4,5,0,0},
                       {2,0,0,0,4,7,0,0,0},
                       {3,3,8,3,1,1,0,0,1},
                       {3,3,3,1,1,1,3,1,1}
               };
               System.out.println(Solutions.Q14_A(mat,0));
               System.out.println(Solutions.Q14_A(mat,4));
               System.out.println(Solutions.Q14_B(mat));
               break;
           default:

               System.out.println("there is not such question");
               break;
       }
    }
}
