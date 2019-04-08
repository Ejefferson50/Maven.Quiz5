package rocks.zipcode.io.quiz4.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author leon on 11/12/2018.
 */
public class ZipCodeWilmington {
    private Map<Student,Double> studentMap;
    private List<Student> studentList;
    private Double hours;

    public ZipCodeWilmington() {
        this.studentMap = new HashMap<>();
        this.studentList = new ArrayList<>();
        this.hours = 0.0;
    }

    public void enroll(Student student) {
        this.studentList.add(student);
    }

    public Boolean isEnrolled(Student student) {
        return this.studentList.contains(student);
    }

    public void lecture(double numberOfHours) {
        this.hours += numberOfHours;
    }

    public Map<Student, Double> getStudyMap() {
        return null;
    }
}
