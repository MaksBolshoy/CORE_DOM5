
public class Main {
    public static void main(String[] args) {
        List<Student> students = /* мой список студентов */;

        List<Student> topStudents = students.stream()
                .filter(student -> "Информатика".equals(student.getSpecialty()))
                .filter(student -> student.getAverageGrade() > 4.5)
                .sorted((s1, s2) -> Double.compare(s2.getAverageGrade(), s1.getAverageGrade()))
                .limit(5)
                .collect(Collectors.toList());

        topStudents.forEach(student -> System.out.println(student.getName() + ": " + student.getAverageGrade()));
    }
}