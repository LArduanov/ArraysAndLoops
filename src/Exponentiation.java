public class Exponentiation {
    public static void main(String[] args){
        int number = 1;
        int degree = 2;

        while (number <= 25){
            double answer = Math.pow(number,degree);
            System.out.println("Квадрат числа " + number + " равен " + answer);
            number++;
        }
    }
}
