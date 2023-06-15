package Summer_2022_second_term.Q4;

import java.util.Arrays;

public class Act {
    private String actName;
    private int len;
    private Actor [] actArr;
    private int currentNum;

    public Act(String actName, int len) {
        this.actName = actName;
        this.len = len;
        this.currentNum =0;
        this.actArr =new Actor[20];
    }
    public String Add_actor(Actor act){
        if(actArr.length<=currentNum)
            return "no room";
        if(act.age <45 || act.numActs <4)
            return "Not suitable";
        actArr[currentNum++]=act;
//        currentNum++;
        return "was added";
    }
    public int The_Number_of_pro_actors(){
        int count =0;
        for (int i = 0; i < this.actArr.length; i++) {
        if (this.actArr[i].numActs >9)
            count++;
        }
        return count;
    }

    @Override
    public String toString() {
        return "Act{" +
                "actName='" + actName + '\'' +
                ", len=" + len +
                ", actArr=" + Arrays.toString(this.actArr) +
                ", currentNum=" + currentNum +
                '}';
    }

    public String getActArr() {
        return Arrays.toString(this.actArr);
    }
}
