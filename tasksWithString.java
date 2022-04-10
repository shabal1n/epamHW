import java.util.*;

public class tasksWithString {
    public static void main(String[] args) {
//        divideEvenOdd();
//        countDigitsFromString();
//        createOnlyDigitLine();
//        deleteSameCharacters();
//        symbolFrequency();
//        lineReverse();
//        substringInString();
//        reverseWordsOfLine();
//        arrayAlphabeticalSort();
//        shortestWordLength();
//        wordsCounter();
//        addSpaces();
//        isPalindrome();
//        replaceSubString();
//        subStringDistance();
    }

    private static void divideEvenOdd() {
        StringBuilder text = new StringBuilder("test");
        StringBuilder even = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) % 2 == 0) {
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
        StringBuilder text = new StringBuilder("Okkayy");
        LinkedHashSet<Character> formattedText = new LinkedHashSet<>();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            formattedText.add(text.charAt(i));
        }

        for (char i: formattedText) {
            result.append(i);
        }
        System.out.println("Removed duplicates: " + result);
    }

    private static void symbolFrequency() {
        String text = "This is test text";
        HashMap<Character, Integer> frequency = new HashMap<>();

        for(int i = 0; i < text.length(); i++) {
            if (frequency.containsKey(text.charAt(i))) {
                frequency.replace(text.charAt(i), frequency.get(text.charAt(i)) + 1);
            } else {
                frequency.put(text.charAt(i), 1);
            }
        }
        System.out.println(frequency);
    }

    private static void lineReverse() {
        String text = "This is not palindrome";
        StringBuilder result = new StringBuilder();

        for (int i = text.length() - 1; i >= 0; i--) {
            result.append(text.charAt(i));
        }

        System.out.println(result);
    }

    private static void substringInString() {
        String text = "Next text is best";
        String subString = "ext";

        String result = text.replaceAll(subString, "");
        int number = (text.length() - result.length()) / subString.length();
        System.out.println("Number of " + subString + " substring in string "
                + text + ": " + number);
    }

    private static void reverseWordsOfLine() {
        String text = "friend my Hello";
        Stack<String> words = new Stack<>();

        StringBuilder tempWord = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                words.push(tempWord.toString());
                tempWord.delete(0, tempWord.length());
            } else if (i == text.length() - 1) {
                tempWord.append(text.charAt(i));
                words.push(tempWord.toString());
            } else {
                tempWord.append(text.charAt(i));
            }
        }
        tempWord.delete(0, tempWord.length());
        while (!words.isEmpty()) {
            tempWord.append(words.pop()).append(" ");
        }
        System.out.println(tempWord);
    }

    private static void arrayAlphabeticalSort() {
        String[] linesArr = new String[] {"sort", "Alphabetical", "array"};
        Arrays.sort(linesArr);
        for (String word: linesArr) {
            System.out.print(word + " ");
        }
    }

    private static void shortestWordLength() {
        String text = "Find shortest word in this line";
        List<String> words = new ArrayList<>();

        StringBuilder tempWord = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ' || i == text.length() - 1) {
                words.add(tempWord.toString());
                tempWord.delete(0, tempWord.length());
            } else {
                tempWord.append(text.charAt(i));
            }
        }

        int min = words.get(0).length();
        String shortestWord = "";

        for (String word: words) {
            if (word.length() < min) {
                min = word.length();
                shortestWord = word;
            }
        }
        System.out.println("Shortest substring is '" + shortestWord + "' with length " + min);
    }

    private static void wordsCounter() {
        String text = "Count words in this line";

        int nullValidator = 0;
        int wordsCounter = 0;
        for(int i = 0; i < text.length(); i++) {
            if ((text.charAt(i) == ' ' || i == text.length() - 1) && nullValidator > 0) {
                wordsCounter++;
                nullValidator = 0;
            } else if(text.charAt(i) != ' ') {
                nullValidator++;
            }
        }

        System.out.println("Words: " + wordsCounter);
    }

    private static void addSpaces() {
        List<Integer> spacesIndex = new ArrayList<>();
        spacesIndex.add(4);
        spacesIndex.add(12);
        StringBuilder text = new StringBuilder("Textwithoutspaces");

        for (int space: spacesIndex) {
            text.insert(space, " ");
        }
        System.out.println(text);
    }

    private static void isPalindrome() {
        StringBuilder text = new StringBuilder("Yo, banana boy!");
        StringBuilder reversed = new StringBuilder();

        for (int i = text.length() - 1; i >= 0 ; i--) {
            if (Character.isLetterOrDigit(text.charAt(i))) {
                reversed.append(text.charAt(i));
            } else {
                text.deleteCharAt(i);
            }
        }

        System.out.println(text.toString().equalsIgnoreCase(reversed.toString()));
    }

    private static void replaceSubString() {
        String text = "substring of string";
        String substring = "string";
        System.out.println("Text: " + text);
        System.out.println("Substring to replace: " + substring);

        text = text.replaceAll(substring, "text");
        System.out.println(text);
    }

    private static void subStringDistance() {
        StringBuilder text = new StringBuilder("Find difference between two substrings");
        String subString1 = "diff";
        String subString2 = "sub";

        System.out.println(text.indexOf(subString2) - (text.indexOf(subString1) + subString1.length()));
    }
}
