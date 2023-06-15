package Summer_2020_second_term;

import C2.ImageTutorial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     int Question =6;
        switch (Question){
            case 1:
            Solutions.Q1();
            break;
            case 2:
                Solutions.Jumper player1 = new Solutions.Jumper("avi",6);
                Solutions.Jumper player2 = new Solutions.Jumper("moshe",5);
                Solutions.Jumper player3 = new Solutions.Jumper("adi",7);
                Solutions.Jumper player4 = new Solutions.Jumper("barak",3);
                Solutions.Jumper player5 = new Solutions.Jumper("benny",4);
                Solutions.Jumper [] arr2 ={player1,player2,player3,player4,player5};
                System.out.println( Solutions.Jumper.avgScore(arr2));
                Solutions.Jumper.higerThenAvg(arr2);
                break;
            case 3:
                System.out.println(Solutions.what(4,5));
                System.out.println("כדי לקבל את הערך 15 נצטרך להכניס או את המספרים 5,3 או 15,1 ");
                System.out.println(String.format("%s  %s %s","טענה זו נכונה:",
                        ".n1>0, n2>0 מספרים זוג לכל what(n1, n2)==what(n2, n1)","מכיוון שכפל אין הבדל "));
                System.out.println(Solutions.why(2,3));
                System.out.println("בשביל לקבל את 16: צריך x=4,y=4 or x=2,y=4");
//                .n1>0, n2>0 מספרים זוג לכל why(n1, n2)==why(n2, n1)
//                טענה לא נכונה כי חזקה לא כך 3 חזקה 2 = 9 בעוד ש 2 בחזקה 3 שןןה 8
//                הפעולה מבצעת חזקה של x
                break;
            case 4:
                int [] arr ={22,56,10,13,31,44};
                int [] arr1 ={22,56,10,13,31,49};
                Solutions.Q4(arr);
                Solutions.Q4(arr1);
                break;
            case 5:
                ImageTutorial q5 =new ImageTutorial("C:\\Users\\user\\IdeaProjects\\java_b\\src\\Summer_2020_second_term\\images\\Q5.jpg");
                System.out.println(Solutions.five(new int[]{3,5,7,6}));
                break;
            case 6:
                ImageTutorial q6 = new ImageTutorial("C:\\Users\\user\\IdeaProjects\\java_b\\src\\Summer_2020_second_term\\images\\Q6.jpg");
                break;
            case 7:
                Solutions.city city1;
                int count =0;

                do {
                    city1 =Solutions.city.createCity();
                    if(city1.getName().equals("stop")) break;
                    count += (city1.isFit())?0:1;
                    System.out.println(String.format("%s  %s","Matching to survey:",city1.isFit()));
                }while (true);
                System.out.println(String.format("%s  %d","Total settlements that do not match the survey:",count));
                break;
            case 9:
                System.out.println(Solutions.Q9("moshe Gitlin and Shuli"));
                break;
            case 8:
                ImageTutorial q8 = new ImageTutorial("C:\\Users\\user\\IdeaProjects\\java_b\\src\\Summer_2020_second_term\\images\\Q8.jpg");
                break;
            case 10:
                int [] arr3 ={4,10,13,71,10,10,71,71,2,10};
                System.out.println(Solutions.minNum(arr3));
                break;
            case 11:
                ImageTutorial ih = new ImageTutorial("C:\\Users\\user\\IdeaProjects\\java_b\\src\\Summer_2020_second_term\\images\\Q11.jpg");
                break;
            case 12:
                Solutions.Worker w1 =new Solutions.Worker("1234567", Solutions.Worker.workerType.WORKER);
                 Solutions.Worker w2 =new Solutions.Worker("11111111", Solutions.Worker.workerType.WORKER);
                  Solutions.Worker w3 =new Solutions.Worker("222222", Solutions.Worker.workerType.ENGINEER);
                   Solutions.Worker w4 =new Solutions.Worker("444444", Solutions.Worker.workerType.ENGINEER);
                   w1.input();
                   w2.input();
                   w3.input();
                   w4.input();
                   Solutions.Worker []  arr4 ={w1,w2,w3,w4};
                   int totalSalaryW=0;
                   int totalSalaryE=0;
                   for(Solutions.Worker i:arr4){
                           if (i.getStatus().equals(Solutions.Worker.workerType.ENGINEER))
                                totalSalaryE+= i.getSalary();
                           else totalSalaryW+= i.getSalary();
                       System.out.println(String.format("%s  %s%s%s  %d%s%s  %d"," ID:",i.getId(),"\n",
                               "number of working hours:",i.getBasic()+ i.getExtra(),"\n"
                       ,"the amount of the salary:",i.getSalary()));
                   }
                System.out.println(String.format("%s  %d","Total amount paid for all engineers:",totalSalaryE));
                System.out.println(String.format("%s  %d","Total amount paid for all workers",totalSalaryW));
                   break;
        }

    }
}
