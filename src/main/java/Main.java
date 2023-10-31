

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Nick", List.of(Double.valueOf(2), Double.valueOf(4.5), Double.valueOf(3)), "Информатика"),
                new Student("Bob", List.of(Double.valueOf(2), Double.valueOf(3.5), Double.valueOf(4)), "Биология"),
                new Student("Kitty", List.of(Double.valueOf(3), Double.valueOf(4.5), Double.valueOf(5)), "Информатика"),
                new Student("Alice", List.of(Double.valueOf(2), Double.valueOf(4.5), Double.valueOf(3)), "Биология"),
                new Student("John", List.of(Double.valueOf(5), Double.valueOf(5), Double.valueOf(5)), "Информатика")
        );

        List<Student> topStudents = students.stream()
                .filter(student -> "Информатика".equals(student.getSpecialty()))
                .filter(student -> student.getAverageGrade() > 4.5)
                .sorted((s1, s2) -> Double.compare(s2.getAverageGrade(), s1.getAverageGrade()))
                .limit(5)
                .collect(Collectors.toList());

        topStudents.forEach(student -> System.out.println(student.getName() + ": " + student.getAverageGrade()));
    }
}