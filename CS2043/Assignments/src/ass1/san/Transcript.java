package ass1.san;

import java.util.ArrayList;

public class Transcript {
    private int studentId;
    private ArrayList<Grade> grades;

    public Transcript(int studentId) {
        this.studentId = studentId;
        grades = new ArrayList<Grade>();
    }

    public ArrayList<Grade> getGrades() {
        ArrayList<Grade> result = new ArrayList<Grade>();
        for (Grade g : grades) {
            result.add(g);
        }
        return result;
    }

    public void addGrade(Grade grade) {
        grades.add(grade);
    }

    public String toString() {
        return "Student " + studentId + ":" + "  GPA " + Registrar.calculateGPA(this);
    }

    public String printTranscript() {
        String result = this.toString();
        for (int i = 0; i < grades.size(); i++) {
            result += "\n" + grades.get(i).toString();
        }
        return result;
    }

    public void clearGrades() {
        grades.clear();
    }
}

