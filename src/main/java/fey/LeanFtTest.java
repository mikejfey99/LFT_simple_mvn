package fey;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import com.hp.lft.sdk.*;
import com.hp.lft.verifications.*;
import com.hp.lft.sdk.web.*;
import com.hp.lft.report.*;


import unittesting.*;

public class LeanFtTest extends UnitTestClassBase {

    public LeanFtTest() {
        //Change this constructor to private if you supply your own public constructor
    }

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        instance = new LeanFtTest();
        globalSetup(LeanFtTest.class);
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        globalTearDown();
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testlft() throws GeneralLeanFtException, ReportException {
        Browser browser = BrowserFactory.launch(BrowserType.CHROME);

        browser.navigate("http://www.google.com");

        Reporter.reportEvent("status", "checkpoint", Status.Passed);

        if  (Verify.areEqual(1,1)) {
            Reporter.reportEvent("messages are equal", "passed", Status.Passed);
        }
        else {
            Reporter.reportEvent("not equal", "failed", Status.Failed);
        }

    }

}