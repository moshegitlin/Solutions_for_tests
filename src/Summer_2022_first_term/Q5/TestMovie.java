package Summer_2022_first_term.Q5;

public class TestMovie {
    public static double totalSum(Movie m)
    {
        return m.getPrice()*m.getNum();
    }
    public static String getMostPopularMovie(Movie[] t){
        Movie maxMove= t[0];
        for (int i = 1; i < t.length; i++) {
           if(t[i].getNum()>maxMove.getNum()) maxMove = t[i];
        }
        return maxMove.getName();
    }
}
