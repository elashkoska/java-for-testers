package com.javafortesters.chapter14.junitExplored;

import com.javaffortesters.domainentities.User;
import com.javafortesters.chapter11.exceptions.ExceptionsExampleTest;
import org.junit.*;
import org.junit.rules.ExpectedException;

public class JunitExplored {
    @Rule
    public ExpectedException expected = ExpectedException.none();

    @BeforeClass
    public static void runOncePerClassBeforeAnyTests() {
        System.out.println("Before class method");
    }

    @Before
    public void runbeforeEveryTest() {
        System.out.println("Run before every test");
    }

    @Test
    @Ignore
    public void tesss() {
        expected.expect(ExceptionsExampleTest.InvalidPassword.class);
        User user = new User("username", "<6");
    }

    @Test(expected = ArithmeticException.class)
    public void expectInvalidPasswordException()
            throws ExceptionsExampleTest.InvalidPassword {
        System.out.println(3 / 0);
    }
}
