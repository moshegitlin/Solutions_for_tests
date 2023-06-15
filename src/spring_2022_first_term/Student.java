package spring_2022_first_term;

import java.util.Arrays;

public class Student {
    private String id; // זהות תעודת
    private int[] arrGradesSemesterA;
    private int[] arrGradesSemesterB;

    public Student(String id, int[] arrGradesSemesterA, int[] arrGradesSemesterB) {
        this.id = id;
        this.arrGradesSemesterA = arrGradesSemesterA;
        this.arrGradesSemesterB = arrGradesSemesterB;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int[] getArrGradesSemesterA() {
        return arrGradesSemesterA;
    }

    public void setArrGradesSemesterA(int[] arrGradesSemesterA) {
        this.arrGradesSemesterA = arrGradesSemesterA;
    }

    public int[] getArrGradesSemesterB() {
        return arrGradesSemesterB;
    }

    public void setArrGradesSemesterB(int[] arrGradesSemesterB) {
        this.arrGradesSemesterB = arrGradesSemesterB;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", arrGradesSemesterA=" + Arrays.toString(arrGradesSemesterA) +
                ", arrGradesSemesterB=" + Arrays.toString(arrGradesSemesterB) +
                '}';
    }
    public boolean isImproved(){
        for (int i = 0; i < arrGradesSemesterA.length; i++) {
            if (arrGradesSemesterA[i]> arrGradesSemesterB[i] &&arrGradesSemesterB[i]!=-1)return false;
        }
        return true;
    }
    public  static String[] Q7_b(Student[] arr){
        String [] result =null;
        int count=0;
        for (Student s:arr){
            if (s.isImproved())count++;
        }
        if (count ==0) return result;
        result = new String[count];
        for (int i = 0; i < count; i++) {
            result[i] = arr[i].getId();
        }
        return result;
    }
}
