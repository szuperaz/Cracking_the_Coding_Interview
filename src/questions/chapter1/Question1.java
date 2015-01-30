package questions.chapter1;

/**
 * Created by szuperaz on 25/01/15.
 */
/* Implement an algorithm to determine if a string has all unique characters.
What if you can not use additional (built-in) data structures?
 */
/* My solution: merge sort
    - time complexity: O(n*logn)
    - space complexity: O(n)
 */
public class Question1 {
    private char[] string, helperString;

    public boolean allUnique(String string){
        alphabeticOrder(string);
        for (int i = 0; i < string.length()-1; i++) {
            if (this.string[i] == this.string[i+1]) {
                return false;
            }
        }
        return true;
    }

    private void alphabeticOrder (String string) {
        this.string = new char[string.length()];
        this.string = string.toCharArray();
        helperString = string.toCharArray();
        int lengthA = string.length() / 2 + string.length()%2;
        int lengthB = string.length() / 2;          //lengthB will be equal to the integer part of the division
        mergeSort(0, lengthA, 0+lengthA, lengthB);
    }

    private void mergeSort(int startA, int lengthA, int startB, int lengthB){
        if (lengthA == 1 && lengthB == 1) {
            if (helperString[startA] > helperString[startB]) {
                char temp = helperString[startA];
                helperString[startA] = helperString[startB];
                helperString[startB] = temp;
            }
            return;
        }
        if (lengthA > 1) {
            int lengtha = lengthA / 2 + lengthA%2;
            int lengthb = lengthA / 2;              //lengthb will be equal to the integer part of the division
            mergeSort(startA, lengtha, startA+lengtha, lengthb);
        }
        if (lengthB > 1) {
            int lengtha = lengthB / 2 + lengthB%2;
            int lengthb = lengthB / 2;              //lengthb will be equal to the integer part of the division
            mergeSort(startB, lengtha, startB+lengtha, lengthb);
        }
        int j = startB;
        int i = startA;
        int stringIndex = startA;
        while(i < startA + lengthA){
            if (j < startB+lengthB && helperString[i] > helperString[j]){
                this.string[stringIndex] = helperString[j];
                j++;
                stringIndex++;
            }
            else {
                this.string[stringIndex] = helperString[i];
                i++;
                stringIndex++;
            }
        }
        while(j < startB+lengthB){
            this.string[stringIndex] = helperString[j];
            j++;
            stringIndex++;
        }
    }
}