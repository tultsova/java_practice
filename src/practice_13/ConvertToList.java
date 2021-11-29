package practice_13;

import java.util.ArrayList;

public class ConvertToList {
   public <E> ArrayList<E> ConvertArrayList(E[] array) {
       ArrayList<E> list = new ArrayList<>();
       for (E element: array)
           list.add(element);
       return list;
   }
    public static void main(String[] args) {
        ConvertToList ctl = new ConvertToList();
        Integer arrayInt[] = {1,2,3};
        Double arrayDouble[] = {1.1, 2.2, 3.3};
        String arrayString[] = {"a", "b", "c"};

        ArrayList<Integer> listInt = ctl.ConvertArrayList(arrayInt);
        ArrayList<Double> listDouble = ctl.ConvertArrayList(arrayDouble);
        ArrayList<String> listString = ctl.ConvertArrayList(arrayString);

        System.out.println(listInt);
        System.out.println(listDouble);
        System.out.println(listString);

        System.out.println(listInt.get(0).getClass().getSimpleName());
        System.out.println(listDouble.get(0).getClass().getSimpleName());
        System.out.println(listString.get(0).getClass().getSimpleName());

    }
}
