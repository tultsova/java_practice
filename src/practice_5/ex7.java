package practice_5;

public class ex7 {
    public static void recursion(int n, int i) {
        // i- вспмогательное число(см. ex6)
        if (i > n / 2) { // если вспомогательное число больше половины n, то n - простое
            System.out.println(n);
            return;
        }
        if (n % i == 0) { // проверка: i - явл простым множителем?
            // если да, вывести i, продолжить работу с числом, оставшимся при делениии n на i
            System.out.println(i);
            recursion(n / i, i);
        }
        else { // если нет, увеличить i и проверять его
            recursion(n, i+1);
        }
    }

    public static void main(String[] args) {
        recursion(15,2);
        System.out.println("-------");
        recursion(7, 2);
        System.out.println("-------");
        recursion(134,2);
    }
}
