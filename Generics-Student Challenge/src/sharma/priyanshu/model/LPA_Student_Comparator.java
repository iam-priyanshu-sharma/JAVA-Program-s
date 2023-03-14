package sharma.priyanshu.model;

import java.util.Comparator;

public class LPA_Student_Comparator implements Comparator<LPA_Student> {

    @Override
    public int compare (LPA_Student o1, LPA_Student o2) {
        return (int) (o1.getPercentComplete () - o2.getPercentComplete ());
    }
}
