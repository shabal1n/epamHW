public class divideEvenOdd {
    public static void main(String[] args) {
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
}
