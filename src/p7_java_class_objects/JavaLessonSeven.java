package p7_java_class_objects;

public class JavaLessonSeven {
    public static void main(String[] args) {
        Monster Frank = new Monster();
        Frank.name = "Frank";
        System.out.println(Frank.name + " has an atack of " + Frank.getAttack());
    }
}
