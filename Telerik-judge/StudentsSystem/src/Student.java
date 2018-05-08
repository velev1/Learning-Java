public class Student implements Comparable<Student> {
    private String name;
    private int course;
    private String specialty;
    private int facultyNumber;
    private double averageSuccess;

    public Student(String name, int course, String specialty, int facultyNumber, double averageSuccess) {
        this.name = name;
        this.course = course;
        this.specialty = specialty;
        this.facultyNumber = facultyNumber;
        this.averageSuccess = averageSuccess;
    }

    public String getName() {
        return name;
    }

    public int getCourese() {
        return course;
    }

    public String getSpecialty() {
        return specialty;
    }

    public int getFacultyNumber() {
        return facultyNumber;
    }

    public double getAverageSuccess() {
        return averageSuccess;
    }

    @Override
    public int compareTo(Student student) {

        if (this.averageSuccess > student.getAverageSuccess()) {
            return 1;
        } else if (this.averageSuccess < student.getAverageSuccess()) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        String result;

        result = this.name + " " + this.course + " " + this.specialty + " " + this.facultyNumber + " " + this.averageSuccess;
        return result;
    }
}
