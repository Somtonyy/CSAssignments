package ass1.san;

public class Grade {
    private String courseNumber;
    private String gradeLetter;
    private double gradePoint;
    private int creditHour;

    public Grade(String courseNumber, String gradeLetter, int creditHour) {
        this.courseNumber = courseNumber;
        this.creditHour = creditHour;
        this.gradePoint = Registrar.convertToNumber(gradeLetter);
        this.gradeLetter = gradeLetter;
    }

    public Grade(String courseNumber, double gradePoint, int creditHour) {
        this.courseNumber = courseNumber;
        this.creditHour = creditHour;
        this.gradePoint = gradePoint;
        this.gradeLetter = Registrar.convertToLetter(gradePoint, this);
    }

    public int getCreditHours() {
        return creditHour;
    }

    public String toString() {
        return " " + courseNumber + ":   " + creditHour + "ch " + gradePoint + " (" + gradeLetter + ")";
    }

    public double getGradePoint() {
        return gradePoint;
    }

    public void setGradePoint(double num) {
        gradePoint = num;
    }
}
