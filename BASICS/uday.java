package Collections.ArrayList;

import java.util.ArrayList;
import java.util.ListIterator;

public class Task {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) { 
        @SuppressWarnings("rawtypes")
        ArrayList a= new ArrayList();
        a.add("Mango");
        a.add("Orange");
        a.add("Banana");
        a.add("Tomato");
        a.add("PineApple");
        a.add(true);
        a.add("guava");
        System.out.println(a);
        @SuppressWarnings("rawtypes")
        ListIterator itr= a.listIterator(); 
        while(itr.hasNext()){
            Object obj=itr.next();
           ; if(obj.equals("Tomato")){
                itr.set("kiwi");
            }
            if(itr.nextIndex()==1){
                itr.add("DragonFruit");
            }
            if(obj.equals(true)){
                itr.remove();
            }
        }
        System.out.println(a);
    }
}
