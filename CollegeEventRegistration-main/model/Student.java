
package model;

public class Student {

    int id;
    String name;
    String event;

    public Student(int id, String name, String event) {
        this.id = id;
        this.name = name;
        this.event = event;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getEvent() { return event; }
}
