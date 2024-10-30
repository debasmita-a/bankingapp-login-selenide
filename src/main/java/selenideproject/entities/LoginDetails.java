package selenideproject.entities;

import lombok.Data;
import uk.co.jemos.podam.PodamStringValue;

@Data
public class LoginDetails {

    @PodamStringValue(strValue = "demo")
    private String username;

    @PodamStringValue(strValue = "demo")
    private String password;

    @PodamStringValue(strValue = "0000")
    private String otpCode;

}
