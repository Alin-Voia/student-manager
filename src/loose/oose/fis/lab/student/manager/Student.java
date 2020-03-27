package loose.oose.fis.lab.student.manager;

import java.util.Objects;

public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private double meanGrade;
}


    public Student(String firstName, String lastName, int age, double meanGrade) {
        //assignments
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.meanGrade = meanGrade;
    }

    @Override
    public String toString() {
        return firstName+" "+lastName+" "+age+" "+meanGrade;
    }

    @Override
    public boolean equals(Object o) {
        //equals generated implementation
        // self check
        if (this == o)
            return true;
        // null check
        if (o == null)
            return false;
        // type check and cast
        if (getClass() != o.getClass())
            return false;
        Student student = (Student) o;
        // field comparison
        return Objects.equals(firstName, student.firstName)
                && Objects.equals(lastName, student.lastName)
                && Objects.equals(age, student.age)
                && Objects.equals(meanGrade, student.meanGrade);
    }

    @Override
    public int hashCode() {

        int result = (int) (age ^ (age>>> 32));
        int result = (double) (meanGrade ^ (meanGrade >>> 10))
        result = 31 * result + firstName.hashCode();
        result = 31 * result + lastName.hashCode();

        return result;

    }

    //generated getters and setters for all fields

}

