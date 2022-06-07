public class Cycle {
    public static void main(String[] args){
        int number = 100;

        while (number <= 1000) {
            if (number % 3 == 0 && number % 9 != 0)
                System.out.println(number);
            number ++;
        }
    }
}
