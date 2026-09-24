import java.util.*;

public class ArrayListEx 
{
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Apple");
        al.add("Kiwi");
        al.add("Promogranate");

        al.remove(1);

        al.set(0, "Guava");

        System.out.println(al);
        System.out.println(al.get(0));
        System.out.println(al.size());

        Collections.sort(al);

        System.out.println(al);
        for(String fruit: al)
        {
            System.out.println(fruit);
        }

    }
}
