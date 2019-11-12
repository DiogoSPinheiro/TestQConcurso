import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class forgot_passwd {

    public forgot_passwd(AndroidDriver<AndroidElement> driver) {

        // Entrando na tela e Esqueci minha Senha
        MobileElement el1 = (MobileElement) driver.findElementById("com.qconcursos.QCX:id/forget_password_text_view_login");
        el1.click();

        //Atribuindo os componentes de Esqueci minha senha

        WebDriverWait wait2 = new WebDriverWait(driver, 20);
        wait2.until(ExpectedConditions.elementToBeClickable(By
                .xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ImageView\n")));

        MobileElement el2 = (MobileElement) driver.findElementById("com.qconcursos.QCX:id/forget_password_email_edit_text");
        MobileElement el3 = (MobileElement) driver.findElementById("com.qconcursos.QCX:id/forget_password_send_button");
        WebDriverWait wait3 = new WebDriverWait(driver, 20);
        int count = 0;
        String teste;

        // Teste varias entradas erradas
        teste = "bchao@hotmail.com";

        while(true) {
            count++;
            el2.click();
            el2.sendKeys(teste);
            teste = "bchaohotmailcom"+ teste;

            driver.hideKeyboard();
            el3.click();
            System.out.println(count);
            wait3.until(ExpectedConditions.elementToBeClickable(By
                    .xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText\n")));

            //try{Assert.assertEquals(driver.findElementById("com.qconcursos.QCX:id/forget_password_send_button").isEnabled(), true);}
            //catch(AssertionError e){System.out.println(e.toString()+(teste.length()-17));}
        }
    }
}
