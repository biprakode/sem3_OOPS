package q8;

public class Instructor {
    private String number;
    private String name;

    Instructor(String number, String name) {

        this.number = number;
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("Instructor: %s (ID: %s)", name, number);
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
