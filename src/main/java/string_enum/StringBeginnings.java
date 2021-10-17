package string_enum;

public enum StringBeginnings {
    TEACHER_STRING_BEGINNING("DESCRIPTION:"),
    SUBJECT_BEGINNING("SUMMARY:"),
    BEGINNING_TIME("DTSTART;TZID=Europe/Moscow:"),
    END_TIME("DTEND;TZID=Europe/Moscow:");

    private final String stringBeginning;

    StringBeginnings(String stringBeginning) {
        this.stringBeginning = stringBeginning;
    }

    public String getStringBeginning() {
        return stringBeginning;
    }
}
