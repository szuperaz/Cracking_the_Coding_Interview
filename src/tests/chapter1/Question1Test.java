package tests.chapter1;

import junit.framework.TestCase;
import questions.chapter1.Question1;

public class Question1Test extends TestCase {
    private Question1 question1;

    public void setUp() throws Exception {
        super.setUp();
        question1 = new Question1();
    }

    public void test1AllUnique() {
        assertEquals(question1.allUnique("almafa"), false);
    }

    public void test2AllUnique() {
        assertEquals(question1.allUnique("unique"), true);
    }

    public void test3AllUnique() {
        assertEquals(question1.allUnique("eelr"), false);
    }
}