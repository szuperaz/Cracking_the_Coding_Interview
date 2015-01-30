package tests.chapter1;

import junit.framework.TestCase;
import questions.chapter1.Question2;

public class Question2Test extends TestCase {

    private Question2 question2;

    public void setUp() throws Exception {
        question2 = new Question2();
    }

    public void test1Reverse() throws Exception {
        assertEquals("amla\0", question2.reverse("alma\0"));
    }

    public void test2Reverse() throws Exception {
        assertEquals("palak\0", question2.reverse("kalap\0"));
    }
}