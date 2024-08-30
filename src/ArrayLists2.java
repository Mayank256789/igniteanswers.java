import java.util.ArrayList;


public class ArrayLists2 {
    ArrayList<Integer>list = new ArrayList<Integer>();
        public void pass(int number){
            for(int i=0; i<number; i++){
                list.add(i);
            }
            for(int i=0; i<list.size(); i++){
                System.out.println(list.get(i));
            }
            System.out.println(list);


     }

}



