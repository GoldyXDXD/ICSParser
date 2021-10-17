import org.apache.commons.io.IOUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Arrays;

import static string_enum.StringBeginnings.*;
import static string_enum.StringLength.*;

public class Main {

    public static void main(String[] args) throws IOException {
        InputStream inputStream = new FileInputStream("calendar.ics");
        String calendarBody = IOUtils.toString(inputStream, StandardCharsets.UTF_8);
        ArrayList<String> stringArrayList = convertCalendarBodyToStringArray(calendarBody);
        ArrayList<Subject> subjectArrayList = new ArrayList<>();
        for (int i = 0; i < stringArrayList.size(); i++) {
            ArrayList<String> subjectInfo = new ArrayList<>(Arrays.asList(stringArrayList.get(i).split("\n")));
            subjectInfo.remove(0);
            Subject subject = new Subject(subjectInfo);
            subjectArrayList.add(subject);
        }
        System.out.println(stringArrayList.size());
        System.out.println(subjectArrayList.size());
    }

    public static ArrayList<String> convertCalendarBodyToStringArray(String calendarBody) {
        ArrayList<String> stringArrayList = new ArrayList<String>(Arrays.asList(calendarBody.split("BEGIN:VEVENT")));
        stringArrayList.remove(stringArrayList.size() - 1);
        stringArrayList.remove(0);
        return stringArrayList;
    }
}
