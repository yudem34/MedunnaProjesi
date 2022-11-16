package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MedunnaPage {

    public MedunnaPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    // ornek
    @FindBy (id="twotabsearchtextbox")
    public WebElement aramaKutusu;

    @FindBy (css = "[class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement girisSimgesi;

    @FindBy (css = "[id='login-item']")
    public WebElement signin; // Giris simgesine tıkladıktan sonra acilan menude signin secenegi

    @FindBy (css = "[name='username']")
    public WebElement usernameBox;

    @FindBy (css = "[name='password']")
    public WebElement passwordBox;

    @FindBy (css = "[class='btn btn-primary']")
    public WebElement singinButonu; // Kullanici girisi kisminda bulunan signin butonu

    @FindBy (css = "[id='entity-menu']")
    public WebElement itemsTitleMenusu;

    @FindBy (xpath = "//span[text()='Test Item']")
    public WebElement testItem; // Item&Title menusunde bulunan bolum

    @FindBy (id = "jh-create-entity")
    public WebElement createANewTestItems;

    @FindBy (css = "[id='c-test-item-name']")
    public WebElement nameBox; // Create a New Test Item butonuna tıkladıktan sonra acilan Menude bulunan name kutusu;

    @FindBy (css = "[class='Toastify__toast-container Toastify__toast-container--top-left toastify-container']")
    public WebElement kaydedildiYazisi; // Test Item kaydı yapıldıktan sonra cikan kaydedildi yazisi









}
