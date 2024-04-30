package week4.homework.answer;

public class Main {
    public static void main(String[] args) {
        boolean calculateEnded = false;

        while (!calculateEnded) {
            try {
                calculateEnded = CalculatorApp.start();
                // calculateEnded = true
                // while문 조건 !calculateEnded = false가 됨.
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}