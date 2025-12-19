public class Student {

    private int id;
    private String name;
    private double gpa;

    // Constructor
    public Student(int id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    // Convert student to file format
    public String toFileString() {
        return id + "," + name + "," + gpa;
    }

    // Create student object from file line
    public static Student fromFileString(String line) {
        String[] parts = line.split(",");
        int id = Integer.parseInt(parts[0]);
        String name = parts[1];
        double gpa = Double.parseDouble(parts[2]);
        return new Student(id, name, gpa);
    }

    @Override
    public String toString() {
        return "ID: " + id +
                ", Name: " + name +
                ", GPA: " + gpa;
    }
}
