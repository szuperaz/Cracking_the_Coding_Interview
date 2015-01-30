package questions.chapter1;

/**
 * Created by szuperaz on 30/01/15.
 */
/* Write code to reverse a C-Style String.
(C-String means that “abcd” is represented as five characters, including the null character.)
*/
/* Solution complexity:
    - time: O(n)
    - space: O(n)
 */
public class Question2 {

    public String reverse (String inputString) {
        char[] output = new char[inputString.length()];
        char[] input = inputString.toCharArray();
        for (int i=0; i < input.length-1; i++) {
            output[i] = input[input.length-2 - i];
        }
        output[input.length-1] = '\0';
        return new String(output);
    }
}
