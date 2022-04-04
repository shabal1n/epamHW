import java.util.List;
import java.util.ArrayList;
public class divideEvenOdd {
    public static void main(String[] args) {
        String text = "test";
        List<Character> even = new ArrayList<>();
        List<Character> odd = new ArrayList<>();

        for(int i = 0; i < text.length(); i++) {
            if(text.charAt(i) % 2 == 0) {
                even.add(text.charAt(i));
            } else {
                odd.add(text.charAt(i));
            }
        }
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
