package Java_8_Demos;

/**
 * Created by shankarraomata on 12/16/16.
 */
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class BasicJava7_8_Comparison {
    public static void main(String args[]){

        List<String> names1 = new ArrayList<String>();
        names1.add("A");
        names1.add("Z");
        names1.add("C");
        names1.add("N");
        names1.add("B");

        List<String> names2 = new ArrayList<String>();
        names2.add("A");
        names2.add("Z");
        names2.add("C");
        names2.add("N");
        names2.add("B");

        BasicJava7_8_Comparison tester = new BasicJava7_8_Comparison();
        System.out.println("Sort Using J7");

        tester.sortUsingJava7(names1);
        System.out.println(names1);
        System.out.println("Sort using J8");

        tester.sortUsingJava8(names2);
        System.out.println(names2);
    }

    //sort using java 7
    private void sortUsingJava7(List<String> names){
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        });
    }

    //sort using java 8
    private void sortUsingJava8(List<String> names){
        Collections.sort(names, (s1, s2) -> s1.compareTo(s2));
    }
}
