import org.apache.commons.io.IOUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) throws IOException {
        InputStream inputStream = new FileInputStream("calendar.ics");
        String calendarBody = IOUtils.toString(inputStream, StandardCharsets.UTF_8);
        ArrayList<String> stringArrayList = convertCalendarBodyToStringArray(calendarBody);
        ArrayList<Subject> subjectArrayList = new ArrayList<>();
        for (String string: stringArrayList) {
            String[] subjectInfo = string.split("\n");

        }
    }

    public static ArrayList<String> convertCalendarBodyToStringArray(String calendarBody) {
        ArrayList<String> stringArrayList = new ArrayList<String>(Arrays.asList(calendarBody.split("BEGIN:VEVENT")));
        stringArrayList.remove(stringArrayList.size() - 1);
        stringArrayList.remove(0);
        return stringArrayList;
    }

    public static void stringToSubject(String string, ArrayList<Subject> subjectArrayList) {
        String[] subjectInfo = string.split("\n");
        Subject subject = new Subject();
        for (String info: subjectInfo) {
            if (info.startsWith(StringBeginnings.TEACHER_STRING_BEGINNING.getStringBeginning())) {
                subject.setTeacher(info.substring(StringBeginnings.TEACHER_STRING_BEGINNING.getStringBeginning().length()));
            }
            else if (info.startsWith(StringBeginnings.SUBJECT_BEGINNING.getStringBeginning())) {
                subject.setSubject(info.substring(StringBeginnings.SUBJECT_BEGINNING.getStringBeginning().length()));
            }
            else if (info.startsWith(StringBeginnings.BEGINNING.getStringBeginning())) {

            }
        }
    }
}
