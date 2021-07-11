import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class contacts {
    public static boolean answer = true;

    public static boolean solution(String[] phone_book) {
        for (int i = 0; i < phone_book.length; i++) {
            for (int j = i + 1; j < phone_book.length; j++) {
                if (phone_book[i].length() <= phone_book[j].length()) {
                    String new_phone_book = phone_book[j].substring(0, phone_book[i].length());
                    if (phone_book[i].equals(new_phone_book)) {
                        answer = false;
                    }
                } else {
                    String new_phone_book = phone_book[i].substring(0, phone_book[j].length());
                    if (phone_book[j].equals(new_phone_book)) {
                        answer = false;
                    }
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        String[] phone_book = new String[]{"123", "456", "789"};
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        if (solution(phone_book)){
            bw.write("접두사가 아닙니다.");
        } else {
            bw.write("접두사입니다.");
        }
        bw.flush();
        bw.close();
    }
}
