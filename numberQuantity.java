public class numberQuantity {
    public static void main(String[] args) {
        String text = "this 2 is 4 text with numbers 123";
        int counter = 0;
        
        for(int i = 0; i < text.length(); i++) {
            if(Character.isDigit(text.charAt(i))) {
                counter++;
            }
        }
        System.out.println("Digits in text: " + counter);
    }
}
