import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.net.MalformedURLException;
import java.net.URL;

public class automatization {
    public static void main (String args[]) throws MalformedURLException {

        DesiredCapabilities dc = new DesiredCapabilities();

        dc.setCapability(MobileCapabilityType.DEVICE_NAME,"4200a624002785bd");
        dc.setCapability("platformName","android");
        dc.setCapability("appPackage","com.qconcursos.QCX");
        dc.setCapability("appActivity","com.qconcursos.qcx_android.presentation.splash.view.SplashActivity");
        dc.setCapability("noReset","true");

        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),dc);

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(By
                .xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText")));

        //final forgot_passwd forgot_passwd = new forgot_passwd(driver);
        //final main_screen main_screen = new main_screen(driver);
        final create_account create_account = new create_account(driver);

    }
}

/*
* {
  "deviceName": "4200a624002785bd",
  "platformName": "android",
  "appPackage": "com.qconcursos.QCX",
  "appActivity": "com.qconcursos.qcx_android.presentation.splash.view.SplashActivity"
}
* */

/*
{
  "deviceName": "4200a624002785bd",
  "platformName": "android",
  "appPackage": "com.qconcursos.QCX",
  "appActivity": "com.qconcursos.qcx_android.presentation.splash.view.SplashActivity",
  "noReset": true
}
*/
