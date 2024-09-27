package example1;

import org.testng.annotations.*;

public class SimpleTest {
    @BeforeSuite
    public void beforeSuite() {
        System.out.println("|-@BeforeSuite (1,TestNg)/SimpleTest");
    }
    @BeforeClass
    public void setUp() {
        // code that will be invoked when this test is instantiated
        System.out.println("|---@BeforeClass (3,TestNg)/SimpleTest");
    }
    @BeforeTest
    public void beforeTest() {
        System.out.println("|--@BeforeTest (2,TestNg)/SimpleTest");
    }
    @Test(groups = {"fast"})
    public void aFastTest() {
        System.out.println("|----@Test (4,TestNg)aFastTest/Simpletest");
    }
    @Test(groups = {"slow"})
    public void aSlowTest() {
        System.out.println("|----@Test (4,TestNg)aSlowTest/SimpleTesst");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("|----@AfterTest (4,TestNg)afterTest/SimpleTesst");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("|--@AfterClassTest (2,TestNg)afterClass/SimpleTesst");
    }
    @AfterSuite
    public void afterSuite() {
        System.out.println("|-@AfterSuite (1,TestNg)afterSuite/SimpleTest");
    }


}
