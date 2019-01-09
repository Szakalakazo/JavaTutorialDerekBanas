package p11_collections_arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class JavaLessonEleven {
    public static void main(String[] args) {

        ArrayList arrayListOne;
        arrayListOne = new ArrayList();

        ArrayList arrayListTwo = new ArrayList();
        ArrayList<String> names = new ArrayList<>();

        names.add("John Smith");
        names.add("Mohamed Alami");
        names.add("Olivier Miller");

        names.set(0,"John Adams");
        names.add(2, "Jack Ryan");
        names.remove(3);

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        System.out.println(names);
        for (String s : names) System.out.println(s);

        Iterator indivItems = names.iterator();

        while (indivItems.hasNext()) {
            System.out.println(indivItems.next());
        }

        ArrayList nameCopy = new ArrayList();
        ArrayList nameBackup = new ArrayList();

        nameCopy.addAll(names);
        String paulYoung = "Paul Young";
        names.add(paulYoung);

        if(names.contains(paulYoung)) {
            System.out.println("Paul is here");
        }

        if(nameCopy.containsAll(names)) {
            System.out.println("Everything in nameCopy is in mames");
        }

        names.clear();
        if(names.isEmpty()) {
            System.out.println("Array is empty!");
        }

        Object[] moreNames = new Object[4];
        moreNames = nameCopy.toArray();

        System.out.println(Arrays.toString(moreNames));


    }

}
