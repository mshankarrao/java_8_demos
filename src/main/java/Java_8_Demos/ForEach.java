package Java_8_Demos;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shankarraomata on 12/27/16.
 * Method references help to point to methods by their names. A method reference is described using :: (double colon) symbol. A method reference can be used to point the following types of methods −
 * <p>
 * Static methods
 * Instance methods
 * Constructors using new operator (TreeSet::new)
 */
public class ForEach {

    public static void jilele(String abc) {
        System.out.println(abc);
    }

    public void instanceCheck(String kbc) {
        System.out.println(kbc);
    }

    public static void main(String args[]) {
        List<String> names = new ArrayList();

        names.add("Shankar");
        names.add("Suresh");
        names.add("Ramesh");

        names.forEach(ForEach::jilele);
        ForEach e = new ForEach();
        names.forEach(e::instanceCheck);
    }

}
