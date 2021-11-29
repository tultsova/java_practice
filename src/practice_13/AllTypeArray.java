package practice_13;

import java.util.Arrays;

public class AllTypeArray<T> {
    private T [] array;
    public AllTypeArray(T [] array) {
        this.array = array;
    }

    public T get(int i) { // возврат элемента по индексу (4 пункт)
        return array[i];
    }



    @Override
    public String toString() {
        return "array=" + Arrays.toString(array) + ", " +
                array[0].getClass().getSimpleName() + "}" ;
    }

    public static void main(String[] args) {
        Integer arrayInt[] = {1,2,3};
        Double arrayDouble[] = {1.1, 2.2, 3.3};
        String arrayString[] = {"a", "b", "c"};


        AllTypeArray etInt = new AllTypeArray<>(arrayInt);
        AllTypeArray etDouble = new AllTypeArray<>(arrayDouble);
        AllTypeArray etString = new AllTypeArray<>(arrayString);

        System.out.println(etInt);
        System.out.println(etDouble);
        System.out.println(etString);

        System.out.println("================");

        System.out.println(etInt.get(0));
        System.out.println(etDouble.get(1));
        System.out.println(etString.get(2));
    }
}
