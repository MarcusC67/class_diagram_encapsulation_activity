public class student {

    private final String name;
    private char grade;
    private int group;
    private final String secretNickName = "MySecretNickName";
    private int gradeIndex;

    private final String allGrades = "ABCDEF";

    public student(String name, char grade, int group, String secretNickName) {

        // constructor
        this.name = name;
        this.grade = grade;
        this.group = group;
        this.gradeIndex = allGrades.indexOf(grade); // set gradeIndex to index of grade character A,B,C,D,E or F
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    private char getGrade() {
        return grade;
    }

    public int getGroup() {
        return group;
    }

    private String getSecretNickName() {
        return secretNickName;
    }

    // Subtract 1 from grade index and return char value at new index - ie: B to A, C to D, E to D, etc
    public char getUpGrade() {
        if (gradeIndex > 0) gradeIndex--;
            return allGrades.charAt(gradeIndex);
    }

    // Add 1 to grade index and return char value at new index - ie: A to B, B to C, D to E, etc
    public char getDownGrade() {
        if (gradeIndex < 6) gradeIndex++;
            return allGrades.charAt(gradeIndex);
    }

}
