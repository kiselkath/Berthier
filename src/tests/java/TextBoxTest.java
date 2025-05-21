package tests;

import base.BaseTest;
import org.junit.jupiter.api.Test;
import pages.TextBoxPage;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TextBoxTest extends BaseTest {

    @Test
    public void testFillTextBoxForm() {
        TextBoxPage textBoxPage = new TextBoxPage(page);
        textBoxPage.navigate();

        String name = "Anna Berthier";
        String email = "anna@example.com";
        String currentAddress = "123 Main St";
        String permanentAddress = "456 Elm St";

        textBoxPage.fillForm(name, email, currentAddress, permanentAddress);
        textBoxPage.submit();

        assertTrue(textBoxPage.getNameOutput().contains(name));
        assertTrue(textBoxPage.getEmailOutput().contains(email));
    }
}
