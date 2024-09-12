package ass1.san;

import java.text.NumberFormat;

public class Registrar {
    public Registrar() {
    }

    public static double convertToNumber(String gradeLetter) {
        double gradePoint = 0;
        switch (gradeLetter) {
            case "A+":
                gradePoint = 4.3;
                break;
            case "A":
                gradePoint = 4.0;
                break;
            case "A-":
                gradePoint = 3.7;
                break;
            case "B+":
                gradePoint = 3.3;
                break;
            case "B":
                gradePoint = 3.0;
                break;
            case "B-":
                gradePoint = 2.7;
                break;
            case "C+":
                gradePoint = 2.3;
                break;
            case "C":
                gradePoint = 2.0;
                break;
            case "D":
                gradePoint = 1.0;
                break;
            default:
                break;
        }
        return gradePoint;
    }

    public static String convertToLetter(double gradePoint, Grade grade) {
        String gradeLetter = "";
        double num = 0;
        if (gradePoint == 4.3) {
            gradeLetter = "A+";
            num = 4.3;
        } else if (gradePoint >= 4.0) {
            gradeLetter = "A";
            num = 4.0;
        } else if (gradePoint >= 3.7) {
            gradeLetter = "A-";
            num = 3.7;
        } else if (gradePoint >= 3.3) {
            gradeLetter = "B+";
            num = 3.3;
        } else if (gradePoint >= 3.0) {
            gradeLetter = "B";
            num = 3.0;
        } else if (gradePoint >= 2.7) {
            gradeLetter = "B-";
            num = 2.7;
        } else if (gradePoint >= 2.3) {
            gradeLetter = "C+";
            num = 2.3;
        } else if (gradePoint >= 2.0) {
            gradeLetter = "C";
            num = 2.0;
        } else if (gradePoint >= 1.0) {
            gradeLetter = "D";
            num = 1.0;
        }  else if (gradePoint >= 0) {
            gradeLetter = "F";
        }
        grade.setGradePoint(num);
        return gradeLetter;
    }

    public static String calculateGPA(Transcript transcript) {
        double totalCreditHours = 0;
        double total = 0;
        for (int i = 0; i < transcript.getGrades().size(); i++) {
            totalCreditHours += transcript.getGrades().get(i).getCreditHours();
            total += transcript.getGrades().get(i).getCreditHours() * transcript.getGrades().get(i).getGradePoint();
        }
        NumberFormat formatter = NumberFormat.getNumberInstance();
        formatter.setMinimumFractionDigits(2);
        formatter.setMaximumFractionDigits(2);
        String GPA = formatter.format(total / totalCreditHours);
        return GPA;
    }
}

