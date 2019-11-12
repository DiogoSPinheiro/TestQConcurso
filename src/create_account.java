import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;

public class create_account {

    public create_account(AndroidDriver<AndroidElement> driver) {

        MobileElement el1 = (MobileElement) driver.findElementById("com.qconcursos.QCX:id/dont_have_account_text_view");
        el1.click();

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(By
                .xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText\n")));


        MobileElement el2 = (MobileElement) driver.findElementById("com.qconcursos.QCX:id/register_name_edit_text");
        el2.sendKeys("12356123465789132456789000000");
        MobileElement el3 = (MobileElement) driver.findElementById("com.qconcursos.QCX:id/register_password_edit_text");
        el3.sendKeys("12345678");
        MobileElement el4 = (MobileElement) driver.findElementById("com.qconcursos.QCX:id/register_password_confirmation_edit_text");
        el4.sendKeys("12345678");
        MobileElement el5 = (MobileElement) driver.findElementById("com.qconcursos.QCX:id/register_email_edit_text");
        el5.sendKeys("teste_auto_createuser2@mailhub24.com");
        MobileElement el6 = (MobileElement) driver.findElementById("com.qconcursos.QCX:id/register_create_account_button");
        el6.click();


    }
}
