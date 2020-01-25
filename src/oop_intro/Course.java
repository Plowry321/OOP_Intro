package oop_intro;

public class Course {
    //Member Variables
    private int ID;
    private int code;
    private String name;
    private String description;
    private int credit;

    //Constructor
    public Course (int ID, int code, String name, String description, int credit) {
        this.ID = ID;
        this.code = code;
        this.name = name;
        this.description = description;
        this.credit = credit;
    }

    //Member Method

    public int getID() {
        return ID;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getCredit() {
        return credit;
    }

    @Override
    public String toString() {
        return "Course{" +
                "ID = " + ID +
                ", code = " + code +
                ", name = '" + name + '\'' +
                ", description = '" + description + '\'' +
                ", credit = " + credit +
                '}';
    }
}
