import org.testng.annotations.Test;




public class RegistrationTests extends BaseUi {

    @Test
    public void testRegistration(){
        registrationPage.clickJoinButton();
        registrationPage.completeFirstPartOfRegistration();
        registrationPage.completeSecondPartOfRegistration();
    }
}












