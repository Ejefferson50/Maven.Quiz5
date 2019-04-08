package rocks.zipcode.io.quiz4.collections;

import java.util.*;

/**
 * @author leon on 11/12/2018.
 */
public class ZipCodeWilmington{
    private Map<Student,Double> studentMap;
    private List<Student> studentList;

    public ZipCodeWilmington() {
        this.studentMap = new LinkedHashMap<>();
        this.studentList = new ArrayList<>();
    }

    public void enroll(Student student) {
        this.studentList.add(student);
    }

    public Boolean isEnrolled(Student student) {
        return this.studentList.contains(student);
    }

    public void lecture(double numberOfHours) {
        studentList.forEach(student -> student.learn(numberOfHours));
    }

    public Map<Student, Double> getStudyMap() {
        for(Student s: this.studentList){
            this.studentMap.put(s,s.getTotalStudyTime());
        }
        return this.studentMap;
    }
}
