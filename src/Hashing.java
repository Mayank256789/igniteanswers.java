import java.util.HashSet;
import java.util.Iterator;
import java.util.Spliterator;

public class Hashing {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<Integer>();
        set.add(1);
        set.add(3);
        set.add(5);
        set.add(7);
        set.add(9);
        System.out.println(set);
        System.out.println("Size of set:" + set.size());
        if(set.contains(1))
        {
            System.out.println("The set is the same");
        }
        if(!set.contains(10))
        {
            System.out.println("Element is not present");
        }
        set.remove(1);
        System.out.println(set);
        System.out.println("Size of set:" + set.size());
        set.add(0);
        Iterator<Integer> it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next() + " ");
        }
        System.out.println();
        if(!set.isEmpty()){
            System.out.println("Set is not absent");
        }
        Spliterator<Integer> spliterator = set.spliterator();
        while(spliterator.tryAdvance(System.out::println)){
            
        }




    }
}
