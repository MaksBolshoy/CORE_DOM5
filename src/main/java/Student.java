import java.util.List;
import java.util.stream.Collectors;

class Student {
    private String name;
    private List<Double> grades;
    private String specialty;

    public double getAverageGrade() {
        return grades.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0.0);
    }
}
