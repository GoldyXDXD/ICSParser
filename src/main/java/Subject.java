import java.sql.Date;
import java.sql.Time;

public class Subject {

    private String subject;
    private String teacher;
    private Date date;
    private Time beginning;
    private Time end;

    public Subject() {

    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setBeginning(Time beginning) {
        this.beginning = beginning;
    }

    public void setEnd(Time end) {
        this.end = end;
    }

    public String getSubject() {
        return subject;
    }

    public String getTeacher() {
        return teacher;
    }

    public Date getDate() {
        return date;
    }

    public Time getBeginning() {
        return beginning;
    }

    public Time getEnd() {
        return end;
    }
}
