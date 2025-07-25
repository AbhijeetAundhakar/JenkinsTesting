import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main{
    public static void main(String[] args) {
        System.out.println("This is testing of jenkins");
        System.out.println(new Date());
        System.out.println("This is third line");

        List<Student> list = new ArrayList<>(List.of(
            new Student("Abhijeet", 23),
            new Student("Santosh", 23),
            new Student("Pradeep", 23)
        ));

        System.out.println(list);

       
    }
}