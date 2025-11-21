import java.util.Scanner;

class Student {
    private int nrAbsente;
    private double notaLab;
    private double notaExam;
    private double notaFinala;

    private final int limitaAbsente = 8;
    private final int procentLab = 60;
    private final int procentExam = 40;
    private final int notaLimita = 5;

    public Student(double punctajLab, double punctajExam) {
        this.notaLab = punctajLab;
        this.notaExam = punctajExam;
        this.nrAbsente = 0;
        this.notaFinala = 0;
    }

    public void punemAbsente(int nr) {
        this.nrAbsente += nr;
    }

    public void notaLaborator(double nota) {
        this.notaLab = nota;
    }

    public void notaExamen(double nota) {
        this.notaExam = nota;
    }

    @Override
    public String toString() {
        double media = (notaLab + notaExam) / 2.0;
        return "Situatie student:\n" +
                "Absente: " + nrAbsente + "\n" +
                "Nota laborator: " + notaLab + "\n" +
                "Nota examen: " + notaExam + "\n" +
                "Media aritmetica: " + media;
    }

    public void afiseazaSituatieSpeciala() {
        System.out.println("Absente: " + nrAbsente);
        System.out.println("Nota laborator: " + notaLab);
        System.out.println("Nota examen: " + notaExam);

        if (nrAbsente >= limitaAbsente || notaLab < notaLimita || notaExam < notaLimita) {
            System.out.println("Situatie speciala: Studentul nu poate fi promovat!");
            notaFinala = 0;
        } else {
            notaFinala = (notaLab * procentLab + notaExam * procentExam) / 100.0;
            System.out.println("Nota finala calculata: " + notaFinala);
        }
    }
}


public class exercitiu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student s = new Student(0, 0);

        char optiune;
        do {
            System.out.println("\n--- MENIU ---");
            System.out.println("A - Absente");
            System.out.println("L - Laborator");
            System.out.println("M - Examen");
            System.out.println("I - Situatie student");
            System.out.println("P - Situatie speciala");
            System.out.println("E - Iesire");
            System.out.print("Alege optiunea: ");

            optiune = sc.next().toUpperCase().charAt(0);

            switch (optiune) {
                case 'A':
                    System.out.print("Introdu numarul de absente: ");
                    int abs = sc.nextInt();
                    s.punemAbsente(abs);
                    break;
                case 'L':
                    System.out.print("Introdu nota laborator: ");
                    double lab = sc.nextDouble();
                    s.notaLaborator(lab);
                    break;
                case 'M':
                    System.out.print("Introdu nota examen: ");
                    double exam = sc.nextDouble();
                    s.notaExamen(exam);
                    break;
                case 'I':
                    System.out.println(s.toString());
                    break;
                case 'P':
                    s.afiseazaSituatieSpeciala();
                    break;
                case 'E':
                    System.out.println("Program terminat.");
                    break;
                default:
                    System.out.println("Optiune invalida!");
            }
        } while (optiune != 'E');

        sc.close();
    }
}
