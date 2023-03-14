package sharma.priyanshu.model;

import sharma.priyanshu.util.QueryItem;

import java.util.Random;

public class Student implements QueryItem, Comparable<Student> {

    private static int LAST_ID = 10_000;
    private final int studentId;

    private final String name;
    private final String course;
    private final int yearStarted;

    protected static Random random = new Random ();

    private static final String[] firstNames = {"Ann", "Bill", "Cathy", "John", "Tim"};
    private static final String[] courses = {"C++", "Java", "Python"};

    public Student () {
        studentId = LAST_ID++;
        int lastNameIndex = random.nextInt (65, 91);
        name = firstNames[random.nextInt (5)] + " " + (char) lastNameIndex;
        course = courses[random.nextInt (3)];
        yearStarted = random.nextInt (2018, 2023);
    }

    @Override
    public String toString () {
        return "%d %-15s %-15s %d".formatted (studentId, name, course, yearStarted);
    }

    public int getYearStarted () {
        return yearStarted;
    }

    @Override
    public boolean matchFieldValue (String fieldName, String value) {

        String fName = fieldName.toUpperCase ();
        return switch (fName) {
            case "NAME" -> name.equalsIgnoreCase (value);
            case "COURSE" -> course.equalsIgnoreCase (value);
            case "YEARSTARTED" -> yearStarted == (Integer.parseInt (value));
            default -> false;
        };
    }

    @Override
    public int compareTo (Student o) {
        return Integer.compare (studentId, o.studentId);
    }
}
