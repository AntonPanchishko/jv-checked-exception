package core.basesyntax;

public class PasswordValidator {
    public boolean validate(String password, String repeatPassword) {
        if(password.length() >= 10 || password.equals(repeatPassword)){
            return true;
        }else {
            throw new PasswordValidationException("Wrong password");
        }
    }
}
