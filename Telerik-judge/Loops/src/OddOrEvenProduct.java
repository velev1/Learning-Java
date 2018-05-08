import java.util.Scanner;

public class OddOrEvenProduct {
    private static long mOddProduct = 1L;
    private static long mEvenProduct = 1L;

    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();
        String[] strNumbers = input.split(" ");
        int[] numbers = new int[n];


        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(strNumbers[i]);
        }

        Thread[] threads = new Thread[2];

        threads[0] = new Thread(new Runnable() {
            @Override
            public void run() {
                mOddProduct = getOddProduct(numbers);

            }
        });
        threads[0].start();

        threads[1] = new Thread(new Runnable() {
            @Override
            public void run() {
                mEvenProduct = getEvenProduct(numbers);
            }
        });
        threads[1].start();

        for(Thread thread: threads) {
            thread.join();
        }

        if (mOddProduct == mEvenProduct) {
            System.out.println("yes " + mOddProduct);
        } else {
            System.out.println("no " + mEvenProduct + " " + mOddProduct);
        }
    }

    private static long getOddProduct(int[] numbers) {
        long oddProduct = 1L;
        for (int i = 1; i < numbers.length; i += 2) {
            oddProduct *= numbers[i];
        }

        return oddProduct;
    }

    private static long getEvenProduct(int[] numbers) {
        long evenProduct = 1L;
        for (int i = 0; i < numbers.length; i += 2) {
            evenProduct *= numbers[i];
        }

        return evenProduct;
    }
}

