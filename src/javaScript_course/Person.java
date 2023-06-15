package javaScript_course;

import java.time.LocalDateTime;

public abstract class Person implements AcadenicType{
    private double age;
    private String name;
    static long idCounter =0;
   private long id;
   private LocalDateTime createionTime;
    static long incrementAndGet(){
        idCounter ++;
        return idCounter;
    }

    public Person(double age, String name) {
        this.age = age;
        this.name = name;
        this.id = incrementAndGet();
        this.createionTime =LocalDateTime.now();
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public abstract long getId();


    @Override
    public LocalDateTime createdAt() {
        return this.createionTime;
    }

}
