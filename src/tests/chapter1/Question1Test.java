package tests.chapter1;

import junit.framework.TestCase;
import questions.chapter1.Question1;
import questions.chapter1.Question2;

public class Question1Test extends TestCase {
    private Question1 question1;

    public void setUp() throws Exception {
        super.setUp();
        question1 = new Question1();
    }

    public void test1AllUnique() {
        assertEquals(false, question1.allUnique("almafa"));
    }

    public void test2AllUnique() {
        assertEquals(true, question1.allUnique("unique"));
    }

    public void test3AllUnique() {
        assertEquals(false, question1.allUnique("eelr"));
    }
}