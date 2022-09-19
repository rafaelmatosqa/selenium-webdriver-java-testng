package utils;

import org.testng.annotations.DataProvider;

public class TestUtilities extends BaseTest {

    protected void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @DataProvider(name = "InvalidLoginData")
    public Object[][] getInvalidLoginData() {
        return new Object[][]
                {
                        {"incorrectUsername", "SuperSecretPassword","Your username is invalid!"},
                        {"tomsmith", "incorrectPassword","Your password is invalid!"},

                };

    }
}
