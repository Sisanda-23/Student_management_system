public class Student {
    private String studentId;
    private String name;
    private String course;
    private double averageMark;

    // Constructor
    public Student(String studentId, String name, String course, double averageMark) {
        this.studentId = studentId;
        this.name = name;
        this.course = course;
        this.averageMark = averageMark;
    }

    // Getters and Setters
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }

    // toString() method
    @Override
    public String toString() {
        return "ID: " + studentId + ", Name: " + name + ", Course: " + course + ", Average Mark: " + averageMark;
    }
}