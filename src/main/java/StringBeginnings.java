public enum StringBeginnings {
    TEACHER_STRING_BEGINNING("DESCRIPTION:"),
    SUBJECT_BEGINNING("SUMMARY:"),
    BEGINNING("DTSTART;TZID=Europe/Moscow:"),
    END("DTEND;TZID=Europe/Moscow:");

    private final String stringBeginning;

    StringBeginnings(String stringBeginning) {
        this.stringBeginning = stringBeginning;
    }

    public String getStringBeginning() {
        return stringBeginning;
    }
}
