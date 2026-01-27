package Assignmen1.q8;

public class Course {
    private String name;
    private Instructor instructor;
    private TextBook textBook;

    Course(String name, Instructor instructor, TextBook textBook) {

        this.name = name;
        this.instructor = instructor;
        this.textBook = textBook;
    }

    @Override
    public String toString() {
        return "Course Info\n" +
                "Course Name: " + name + "\n" +
                instructor + "\n" +
                "Textbook: " + textBook;
    }

    public TextBook getTextBook() {
        return textBook;
    }

    public void setTextBook(TextBook textBook) {
        this.textBook = textBook;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
