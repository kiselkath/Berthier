package pages;

import com.microsoft.playwright.Page;

public class TextBoxPage {
    private final Page page;

    // Конструктор
    public TextBoxPage(Page page) {
        this.page = page;
    }

    // Локаторы
    private final String fullNameInput = "#userName";
    private final String emailInput = "#userEmail";
    private final String currentAddressInput = "#currentAddress";
    private final String permanentAddressInput = "#permanentAddress";
    private final String submitButton = "#submit";

    // Методы взаимодействия
    public void navigate() {
        page.navigate("https://demoqa.com/text-box");
    }

    public void fillForm(String name, String email, String currentAddress, String permanentAddress) {
        page.fill(fullNameInput, name);
        page.fill(emailInput, email);
        page.fill(currentAddressInput, currentAddress);
        page.fill(permanentAddressInput, permanentAddress);
    }

    public void submit() {
        page.click(submitButton);
    }

    // Методы для получения результата
    public String getNameOutput() {
        return page.textContent("#output #name");
    }

    public String getEmailOutput() {
        return page.textContent("#output #email");
    }
}
