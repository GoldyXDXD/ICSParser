package string_enum;

public enum StringLength {
    TEACHER_LENGTH(12),
    SUBJECT_LENGTH(8),
    DATE_LENGTH(27),
    BEGINNING_LENGTH(36),
    END_LENGTH(34);

    private final int length;

    StringLength(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }
}
