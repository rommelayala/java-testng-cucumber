package example1.example2;

import org.testng.annotations.*;

public class SimpleComplejoTest {
    @BeforeSuite
    public void beforeSuite() {
        System.out.println("|-@BeforeSuite (1,TestNg) SimpleComplejoTest");
    }
    @BeforeClass
    public void setUp() {
        // code that will be invoked when this test is instantiated
        System.out.println("|---@BeforeClass (3,TestNg) / SimpleComplejoTest");
    }
    @BeforeTest
    public void beforeTest() {
        System.out.println("|--@BeforeTest (2,TestNg)/SimpleComplejoTest");
    }

    @Test(groups = {"fast"})
    public void aFastTest() {
        System.out.println("|----@Test (4,TestNg)aFastTest/aFastTest/SimpleComplejoTest");
    }
    @Test(groups = {"slow"})
    public void aSlowTest() {
        System.out.println("|----@Test (4,TestNg)/ aSlowTest/SimpleComplejoTest");
    }
    @AfterTest
    public void afterTest() {
        System.out.println("|----@AfterTest (4,TestNg)afterTest/SimpleComplejoTest");
    }
    @AfterClass
    public void afterClassTest() {
        System.out.println("|--@AfterClassTest (2,TestNg)afterClassTest/SimpleComplejoTest");
    }
    @AfterSuite
    public void afterSuite() {
        System.out.println("|-@AfterSuite (1,TestNg)afterSuite/SimpleComplejoTest");
    }
}
