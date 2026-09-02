import java.util.*;

class Student {
    private int id;
    private String name;
    private double cgpa;

    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }
}

public class cgpa {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ArrayList<Student> students = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            int id = sc.nextInt();
            String name = sc.next();
            double cgpa = sc.nextDouble();

            students.add(new Student(id, name, cgpa));
        }

        students.sort((s1, s2) -> {

            // CGPA in decreasing order
            if (s1.getCgpa() != s2.getCgpa()) {
                return Double.compare(s2.getCgpa(), s1.getCgpa());
            }

            // Name in alphabetical order
            if (!s1.getName().equals(s2.getName())) {
                return s1.getName().compareTo(s2.getName());
            }

            // ID in increasing order
            return Integer.compare(s1.getId(), s2.getId());
        });

        for (Student student : students) {
            System.out.println(student.getName());
        }

        sc.close();
    }
}