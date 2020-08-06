package com.kodilla.testing.forum;

import com.kodilla.testing.user.SimpleUser;
import org.junit.jupiter.api.*;

@DisplayName("Forum Test Suite")
public class ForumTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test Suite: Begin");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Test Suite: end");
    }

    @DisplayName(
            "when create SimpleUser with realName, " +
                    "then getRealName should return real user name"
    )
    @Test
    void testCaseRealName() {
        //Give
        SimpleUser simpleUser = new SimpleUser("theForumUser", "Jan Kowalski");
        //When
        String result = simpleUser.getRealName();
        System.out.println("Testing " + result);
        //Then
        Assertions.assertEquals("Jan Kowalski", result);
    }

    @DisplayName(
            "When create SimpleUser with name, " +
                    "then getUser shoult return correct name"
    )

    @Test
    void testCaseUsername() {
        //Give
        SimpleUser simpleUser = new SimpleUser("theForumUser");
        //When
        String result = simpleUser.getUsername();

        String expectedResult = "theForumUser";
        //Then
        Assertions.assertEquals(expectedResult, result);
    }
}
