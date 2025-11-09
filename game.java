import java.util.Arrays;
import java.util.Scanner;

class Game {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter word :- ");
        String word = in.next();

        // clear screen so Player B can't see the word

        char[] wordArr = word.toCharArray();
        char[] gashArray = new char[word.length()];

        Arrays.fill(gashArray, '*');

        int len = word.length() + (word.length() / 2);
        int correctWordLen = 0;
        boolean isWin = false;

        while (len-- > 0) {
            System.out.print("Enter a character :- ");
            char inputChar = in.next().charAt(0);

            int count = setNewChar(wordArr, gashArray, inputChar);

            System.out.println("Word progress: " + String.valueOf(gashArray));

            if (count > 0) {
                System.out.println("✅ Character is correct");
                correctWordLen = correctWordLen + count;
            } else {
                System.err.println("❌ Character is invalid!");
            }

            if (correctWordLen == word.length()) {
                isWin = true;
                break;
            }

            System.out.println("Remaining steps :- " + len);
        }

        if (isWin == true) {
            System.out.println("🎉 Player A wins!");
        } else {
            System.err.println("❌ Player A loses");
            System.out.println("The correct word was: " + word);
        }

        in.close();
    }

    public static int setNewChar(char[] wordArr, char[] gashArray, char input) {
        int foundCount = 0;

        for (int i = 0; i < wordArr.length; i++) {
            if (wordArr[i] == input && gashArray[i] == '*') {
                gashArray[i] = input;
                foundCount++;
                break;
            }
        }
        return foundCount;
    }
}
