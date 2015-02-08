package tests.chapter1;

import junit.framework.TestCase;
import questions.chapter1.Question4;

public class Question4Test extends TestCase {

    private Question4 question4;

    public void setUp() throws Exception {
        question4 = new Question4();

    }

    public void testAnagrams1() throws Exception {
        boolean actual = question4.anagrams("zita", "izta");
        assertEquals(true, actual);
    }

    public void testAnagrams2() throws Exception {
        boolean actual = question4.anagrams("fsddsf", "dd");
        assertEquals(false, actual);
    }

    public void testAnagrams3() throws Exception {
        boolean actual = question4.anagrams("Mik azok az anagrammák?", "Mik azok az anag   rammák?");
        assertEquals(true, actual);
    }

    public void testAnagrams4() throws Exception {
        boolean actual = question4.anagrams("", "");
        assertEquals(true, actual);
    }
}