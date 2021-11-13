package me.wcaquino.page.login;

import me.wcaquino.core.setup.PaginaBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BarrigaLoginTela extends PaginaBase {

    public BarrigaLoginTela(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "email")
    public WebElement campoEmail;

    @FindBy(id = "senha")
    public WebElement campoSenha;

    @FindBy(xpath = "//div[@class='alert alert-success']")
    public WebElement msgLoginSucesso;

    @FindBy(xpath = "//div[@class='alert alert-danger']")
    public WebElement msgErroLogin;

}
