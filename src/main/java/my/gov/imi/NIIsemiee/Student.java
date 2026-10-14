package my.gov.imi.NIIsemiee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Student {
    @Autowired
    private Grades grades;

    public void retrieveGrades() {
        grades.getGrades();
    }
}
