import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class main_screen {

    public main_screen(AndroidDriver<AndroidElement> driver) {
        WebDriverWait wait = new WebDriverWait(driver, 20);

        MobileElement el1 = (MobileElement) driver.findElementById("com.qconcursos.QCX:id/email_address_text_input_edit_text");
        el1.sendKeys("     ");
        MobileElement el2 = (MobileElement) driver.findElementById("com.qconcursos.QCX:id/password_text_input_edit_text");
        el2.sendKeys("     ");
        MobileElement el3 = (MobileElement) driver.findElementById("com.qconcursos.QCX:id/login_button");
        int count = 0;
        while(count<10000) {
            el3.click();
            wait.until(ExpectedConditions.elementToBeClickable(By
                    .xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText\n")));

            count++;
        }
        wait.until(ExpectedConditions.elementToBeClickable(By
                .xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText\n")));

        MobileElement el4 = (MobileElement) driver.findElementByAccessibilityId("Show password");
        el4.click();
        el4.click();
        MobileElement el5 = (MobileElement) driver.findElementById("com.qconcursos.QCX:id/email_address_text_input_edit_text");
        el5.clear();


    }
}
