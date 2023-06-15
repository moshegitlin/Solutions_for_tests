package javaScript_course;

public class Student extends Person{
    private String degreeName;

    @Override
    public long getId() {
        String StudentId = String.valueOf(this.getId()) +"000";

        return Long.valueOf(StudentId);
    }

    public Student(double age, String name, String degreeName) {
        super(age, name);
        this.degreeName = degreeName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (this == null || !(this.getClass()==o.getClass())) return false;
        Student anotherStudent = (Student) o;
          return (this.degreeName == anotherStudent.degreeName
                  && this.getName() == anotherStudent.getName()
                  &&  this.getAge() == anotherStudent.getAge());
    }
}
