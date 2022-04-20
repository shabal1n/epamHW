import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class StreamsTransformation {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("text_task_3.txt");
        StringBuilder text = new StringBuilder();
        int i;
        while ((i = reader.read()) != -1) {
            text.append((char) i);
        }
        reader.close();
        System.out.println("Original line: " + text);
        String reversed = "\nReversed line: " + TasksWithString.reverseWordsOfLine(text.toString());
        String frequency = "\nFrequency of each character: " + TasksWithString.symbolFrequency(text.toString());
        String wordsCounter = "\nNumber of words: " + TasksWithString.wordsCounter(text.toString());

        FileWriter writer = new FileWriter("task_3_answer.txt");
        writer.write("Original line: " + text + reversed + frequency + wordsCounter);
        writer.flush();
        writer.close();
    }
}
