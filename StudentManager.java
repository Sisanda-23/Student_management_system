import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class StudentManager {
    private ArrayList<Student> students;
    private static final String FILE_NAME = "students.json";
    private Gson gson;

    public StudentManager() {
        gson = new Gson();
        students = new ArrayList<>();
        loadFromJson();
    }

    public void addStudent(Student student) {
        students.add(student);
        saveToJson();
    }

    public boolean removeStudentById(String id) {
        for (Student student : students) {
            if (student.getStudentId().equalsIgnoreCase(id)) {
                students.remove(student);
                saveToJson();
                return true;
            }
        }
        return false;
    }

    public Student findStudentById(String id) {
        for (Student student : students) {
            if (student.getStudentId().equalsIgnoreCase(id)) {
                return student;
            }
        }
        return null;
    }

    public ArrayList<Student> getAllStudents() {
        return students;
    }

    private void loadFromJson() {
        File file = new File(FILE_NAME);
        if (!file.exists()) return;

        try (Reader reader = new FileReader(file)) {
            Type listType = new TypeToken<ArrayList<Student>>() {}.getType();
            students = gson.fromJson(reader, listType);
            if (students == null) {
                students = new ArrayList<>();
            }
        } catch (IOException e) {
            System.out.println("Failed to load JSON: " + e.getMessage());
        }
    }

    private void saveToJson() {
        try (Writer writer = new FileWriter(FILE_NAME)) {
            gson.toJson(students, writer);
        } catch (IOException e) {
            System.out.println("Failed to save JSON: " + e.getMessage());
        }
    }
}