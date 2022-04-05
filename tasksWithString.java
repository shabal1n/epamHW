public class tasksWithString {
    public static void main(String[] args) {
//        divideEvenOdd();
//        countDigitsFromString();
//        createOnlyDigitLine();

    }

    private static void divideEvenOdd() {
        StringBuilder text = new StringBuilder("test");
        StringBuilder even = new StringBuilder();

        for(int i = 0; i < text.length(); i++) {
            if(text.charAt(i) % 2 == 0) {
                even.append(text.charAt(i));
                text.deleteCharAt(i);
            }
        }
        System.out.println("Even: " + even);
        System.out.println("Odd: " + text);
    }

    private static void countDigitsFromString() {
        String text = "this 2 is 4 text with numbers 123";
        int counter = 0;

        for (int i = 0; i < text.length(); i++) {
            if (Character.isDigit(text.charAt(i))) {
                counter++;
            }
        }
        System.out.println("Digits in text: " + counter);
    }

    private static void createOnlyDigitLine() {
        StringBuilder text = new StringBuilder("1a2b3d4e5f6g7h8i9j");

        for (int i = 0; i < text.length(); i++) {
            if (!Character.isDigit(text.charAt(i))) {
                text.deleteCharAt(i);
            }
        }
        System.out.println("Digits text: " + text);
    }

    private static void deleteSameCharacters() {
        
    }
}
