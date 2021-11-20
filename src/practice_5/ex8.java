package practice_5;

public class ex8 {
    public static void recursion(String s) {
        if (s.length()==1) { // если слово сост. из одной буквы - оно палиндром
            System.out.println("YES");
        }
        else {
            // сравниваем первый и последний элементы строки
            if (s.substring(0, 1).equals(s.substring(s.length() - 1))) {
                // если они равны, то слово из двух букв - палиндром
                if (s.length() == 2) {
                    System.out.println("YES");
                }
                // если букв в слове больше - проверяем оставшиеся
                else recursion(s.substring(1, s.length() - 1));
            } else {
                // если буквы не равны - слово не палиндром
                System.out.println("NO");
            }
        }
    }

    public static void main(String[] args) {
        recursion("mama");
        recursion("abba");
        recursion("a");
        recursion("abc");
        recursion("aba");
    }
}