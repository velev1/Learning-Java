/**
 * Created by velev on 28.1.2018 г..
 */
public class Numbers {
    private static StringBuilder mNumber;

    public static void main(String[] args) {

        mNumber = new StringBuilder();

        for (int i = 0; i < args.length; i++) {
            String[] command = args[i].split(" ");
            switch (command[0]) {
                case "set":
                    setNumber(command[1]);
                    break;
                case "front-add":
                    frontAdd(command[1]);
                    break;
                case "front-remove":
                    frontRemove();
                    break;
                case "back-add":
                    backAdd(command[1]);
                    break;
                case "back-remove":
                    backRemove();
                    break;
                case "reverse":
                    reverse();
                    break;
                case "print":
                    print();
                    break;
                case "end":
                    i = args.length;
                    break;
            }
        }
    }

    private static void setNumber(String number) {
        mNumber.append(number);
    }

    private static void frontAdd(String digit) {
        mNumber.insert(0, digit);
    }

    private static void frontRemove() {
        if (mNumber.length() > 0) {
            mNumber.deleteCharAt(0);
        }
    }

    private static void backAdd(String digit) {
        mNumber.append(digit);
    }

    private static void backRemove() {
        if (mNumber.length() > 0) {
            mNumber.deleteCharAt(mNumber.length() - 1);
        }
    }

    private static void reverse() {
        mNumber = mNumber.reverse();
    }

    private static void print() {
        if (mNumber.length() > 0) {
            System.out.println(mNumber.toString());
        } else {
            System.out.println();
        }
    }
}
