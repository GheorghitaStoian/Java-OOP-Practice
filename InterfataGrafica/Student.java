package InterfataGrafica;

public class Student {

    private int absences;
    private double labGrade;
    private double examGrade;
    private double finalGrade;

    private final int maxAbsences = 8;
    private final int passGrade = 5;

    public void addAbsences(int nr) {
        this.absences += nr;
    }

    public void setLabGrade(double grade) {
        this.labGrade = grade;
    }

    public void setExamGrade(double grade) {
        this.examGrade = grade;
    }

    public String getStatus() {
        double average = (labGrade + examGrade) / 2.0;
        return "Absences: " + absences +
                "\nLab grade: " + labGrade +
                "\nExam grade: " + examGrade +
                "\nArithmetic average: " + average;
    }

    public String getSpecialStatus() {
        if (absences >= maxAbsences || labGrade < passGrade || examGrade < passGrade) {
            finalGrade = 0;
            return "Special status: Student CANNOT pass!";
        } else {
            finalGrade = labGrade * 0.6 + examGrade * 0.4;
            return "Final grade: " + finalGrade;
        }
    }
}

