import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;

import static string_enum.StringBeginnings.*;
import static string_enum.StringLength.*;

public class Subject {

    private String subject;
    private String teacher;
    private Date date;
    private Time beginning;
    private Time end;

    public Subject() {
    }

    public Subject(ArrayList<String> infoArray) {
        for (String info: infoArray) {
            if (info.startsWith(TEACHER_STRING_BEGINNING.getStringBeginning())) {
                this.teacher = info.substring(TEACHER_LENGTH.getLength());
            }
            else if (info.startsWith(SUBJECT_BEGINNING.getStringBeginning())) {
                this.subject = info.substring(SUBJECT_LENGTH.getLength());
            }
            else if (info.startsWith(BEGINNING_TIME.getStringBeginning())) {
                this.date = Date.valueOf(info.substring(DATE_LENGTH.getLength(), DATE_LENGTH.getLength() + 4) + "-" + info.substring(DATE_LENGTH.getLength() + 4, DATE_LENGTH.getLength() + 6) + "-" + info.substring(DATE_LENGTH.getLength() + 6, DATE_LENGTH.getLength() + 8));
                this.beginning = Time.valueOf(info.substring(BEGINNING_LENGTH.getLength(), BEGINNING_LENGTH.getLength() + 2) + ":" + info.substring(BEGINNING_LENGTH.getLength() + 2, BEGINNING_LENGTH.getLength() + 4) + ":" + info.substring(BEGINNING_LENGTH.getLength() + 4, BEGINNING_LENGTH.getLength() + 6));
            } else if (info.startsWith(END_TIME.getStringBeginning())) {
                this.end = Time.valueOf(info.substring(END_LENGTH.getLength(), END_LENGTH.getLength() + 2) + ":" + info.substring(END_LENGTH.getLength() + 2, END_LENGTH.getLength() + 4) + ":" + info.substring(END_LENGTH.getLength() + 4));
            }
        }
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

    @Override
    public String toString() {
        return subject + " " + teacher + ":" + date.toString() + "\n" + beginning.toString() + " - " + end.toString();
    }
}
