import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Hello {
    public static void main(String[] args) {
        System.out.println("HelloGit");
        System.out.println("HelloJava");
        List<Integer> list= Arrays.asList(1,2,3,4,5,6);
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
    }
}
