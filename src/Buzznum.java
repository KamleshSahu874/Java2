class BuzzNumber {
    public static boolean isBuzzNumber(int num) {
        return (num % 7 == 0 || num % 10 == 7);
    }

    public static void main(String[] args) {
        int number1 = 49;
        int number2 = 17;
        int number3 = 21;

        System.out.println(number1 + " is a Buzz number: " + isBuzzNumber(number1)); // true
        System.out.println(number2 + " is a Buzz number: " + isBuzzNumber(number2)); // true
        System.out.println(number3 + " is a Buzz number: " + isBuzzNumber(number3)); // false
    }
}
