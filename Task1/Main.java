import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Student s1 = new Student(1, "shaden", 21, 82);
        Student s2 = new Student(2, "omar", 16, 70);
        Student s3 = new Student(3, "lana", 22, 90);
        Student s4 = new Student(4, "nour", 20, 80);
        List<Student> students = Arrays.asList(s1, s2, s3, s4);

        List<Student> higher80 = students.stream().filter(n -> n.getGrade() > 80).toList();
        System.out.println(higher80);

        students.forEach(n -> {
            if (n.getAge() > 18) {
                System.out.println(n.getName() + " " + n.getAge() + " " + n.getGrade());
            }

        });

        System.out.println(s1.getId());
        Class<?> s1Id = s1.getClass();
        Field idfield = s1Id.getDeclaredField("name");
        idfield.setAccessible(true);
        idfield.set(s1,"rami");
        System.out.println(s1.getName());

    }
}