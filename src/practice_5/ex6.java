package practice_5;

public class ex6 {
    public static void recursion(int n, int i) {
        // i - вспомогательное число, изначально всегда равное двум
        // оно помогает проверить, не делится ли входное число на другие
        if (n == 2) { // два - простое число, сразу выводим ответ для него
            System.out.println("YES");
        }
        else if (n % i == 0 || n<2) { // если число делится на вспомогательное или равно 0 или 1, оно не явл простым
            System.out.println("NO");
        }
        else if (i < n/2){ // если число не делится на первоначальное значение вспомогательного и 2,
            // проверяем, чтобы не делилось на другие
            recursion(n, i+1);
        }
        else { // если число ни на что не делится кроме 1 и самого себя - оно простое
            System.out.println("YES");
        }
    }

    public static void main(String[] args) {
        recursion(17,2);
        recursion(2, 2);
        recursion(5,2);
        recursion(12, 2);
    }
}