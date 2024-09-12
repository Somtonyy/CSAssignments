package ass1.san;

public class TranscriptDriver {
    public static void main(String[] args) {
        Transcript transcript = new Transcript(8510804);
        Grade grade1 = new Grade("CS1003", "B", 4);
        Grade grade2 = new Grade("CS2033", "A", 4);
        Grade grade3 = new Grade("ECE2213", 3.5, 4);
        Grade grade4 = new Grade("ECON1001", 2.0, 3);

        transcript.addGrade(grade1);
        transcript.addGrade(grade2);
        transcript.addGrade(grade3);
        transcript.addGrade(grade4);
        System.out.println(transcript.printTranscript());
        System.out.println("\nGrades Count: " + transcript.getGrades().size());
        transcript.clearGrades();
        System.out.println(transcript.printTranscript());
    }
}

