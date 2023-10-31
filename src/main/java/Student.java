
import java.util.List;
import java.util.stream.Collectors;

class Student {
    private String name;
    private List<Double> grades;
    private String specialty;

    public Student(String name, List<Double> list, String specialty) {
        this.name = name;
        this.grades = list;
        this.specialty = specialty;
    }

    public double getAverageGrade() {
        return grades.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0.0);
    }

    public String getName() {
        return name;
    }

    public List<Double> getGrades() {
        return grades;
    }

    public String getSpecialty() {
        return specialty;
    }
}