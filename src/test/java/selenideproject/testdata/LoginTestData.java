package selenideproject.testdata;

import selenideproject.entities.LoginDetails;
import uk.co.jemos.podam.api.PodamFactory;
import uk.co.jemos.podam.api.PodamFactoryImpl;

public class LoginTestData {

    private static final PodamFactory FACTORY = new PodamFactoryImpl();

    public static LoginDetails getValidaLoginDetails() {
        return FACTORY.manufacturePojo(LoginDetails.class);
    }
    
}
