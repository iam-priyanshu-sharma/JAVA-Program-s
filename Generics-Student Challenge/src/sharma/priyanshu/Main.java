package sharma.priyanshu;

import sharma.priyanshu.model.LPA_Student;
import sharma.priyanshu.model.LPA_Student_Comparator;
import sharma.priyanshu.util.QueryList;

import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main (String[] args) {

        QueryList<LPA_Student> queryList = new QueryList<> ();
        for (int i = 0; i < 25; i++) {
            queryList.add (new LPA_Student ());
        }

        System.out.println ("Ordered");
        queryList.sort (Comparator.naturalOrder ());
        printList (queryList);

        System.out.println ("Matches");
        var matches = queryList.getMatches ("PercentComplete", "50").getMatches ("Course", "Python");

        matches.sort (new LPA_Student_Comparator ());
        printList (matches);

        System.out.println ("Ordered");
        matches.sort (null);
        printList (matches);

    }

    public static void printList (List<?> students) {

        for (var student : students) {
            System.out.println (student);
        }
    }
}
