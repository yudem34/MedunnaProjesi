package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.MedunnaPage;
import utilities.ConfigReader;
import utilities.Driver;

import static org.junit.Assert.assertTrue;

public class MedunnaStepDefinitions {
    MedunnaPage medunna = new MedunnaPage();

    @Given("Admin www.medunna.com adresine gider")
    public void adminWwwMedunnaComAdresineGider() {
        Driver.getDriver().get(ConfigReader.getProperty("www.medunna.com"));
    }

    @Then("Giris yap simgesine ve acilan menude Sign-in secenegine tiklar")
    public void girisYapSimgesineVeAcilanMenudeSignInSecenegineTiklar() {
        medunna.girisSimgesi.click();
        medunna.signin.click();
    }

    @And("Admin gecerli bir Username girer")
    public void adminGecerliBirUsernameGirer() throws InterruptedException {
        medunna.usernameBox.sendKeys(ConfigReader.getProperty("username"));
        Thread.sleep(2);
    }

    @And("Admin gecerli bir password girer")
    public void adminGecerliBirPasswordGirer() throws InterruptedException {
        medunna.passwordBox.sendKeys(ConfigReader.getProperty("password"));
        Thread.sleep(2);
    }

    @And("Sign in butonuna tiklar")
    public void signInButonunaTiklar() {
        medunna.singinButonu.click();
    }

    @And("Items&Title menusunden Test Item secenegine tiklar")
    public void ItemsTitleMenusundenTestItemSecenegineTiklar() {
        medunna.itemsTitleMenusu.click();
        medunna.testItem.click();
    }

    @And("Create a new Test Item butonuna tiklar")
    public void createANewTestItemButonunaTiklar() {
        medunna.createANewTestItems.click();
    }

    @And("Istenilen bilgileri doldurur ve Save butonuna tiklar")
    public void IstenilenBilgileriDoldururVeSaveButonunaTiklar() throws InterruptedException {
        Actions actions = new Actions(Driver.getDriver());
        medunna.nameBox.sendKeys("Serum");
        actions.sendKeys(Keys.TAB).sendKeys("Sarı ve berrak bir sıvıdır", Keys.TAB).
                sendKeys("100", Keys.TAB).sendKeys("150", Keys.TAB).
                sendKeys("250", Keys.ENTER).perform();
        Thread.sleep(3);
    }

    @And("Kaydedildi yazisinin gorunurlugunu kontrol eder")
    public void kaydedildiYazisininGorunurlugunuKontrolEder() {
        assertTrue(medunna.kaydedildiYazisi.isDisplayed());
    }

    @And("Sayfayi kapatir")
    public void sayfayiKapatir() {
        Driver.closeDriver();
    }
}
