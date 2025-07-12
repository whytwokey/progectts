import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scan1 = new Scanner (System.in);
        System.out.println("Введите первое число: ");
        int num1 = scan1.nextInt();

        System.out.println("Введите второе число: ");
        int num2 = scan1.nextInt();

        int res;
        
        System.out.println("Действие: ");
        String move = scan1.nextLine();
        move = scan1.nextLine();
        
        switch (move){
            case "+":
                res = num1 + num2;
                System.out.println("Результат: " + res);
                break;
            case "-":
                res = num1 - num2;
                System.out.println("Результат: " + res);
                break;
            case "*":
                res = num1 * num2;
                System.out.println("Результат: " + res);
                break;
            case "/":
                if(num2 == 0)
                    System.out.println("Невозможно решить! ");
                else {
                    res = num1 / num2;
                    System.out.println("Результат: " + res);
                }
                break;
            default:
                System.out.println("Что то не так... ");
        }
    }
}
