package validate;

import exception.WrongLoginException;
import exception.WrongPasswordException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationService {

    public static void verification(String login, String password, String confirmPassword) {
        validateLogin(login);
        validatePassword(password, confirmPassword);
    }

    private static void validateLogin(String login) {
        if (login.length() > 20) {
            throw new WrongLoginException("Слишком длинный логин!", login);
        }
        if (!login.matches("[A-Za-z0-9_]+")) {
            throw new WrongLoginException("Недопустимые знаки!", login);
        }
    }

    private static void validatePassword(String password, String confirmPassword) {
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException(password, confirmPassword);
        }
        if (password.length() > 20) {
            throw new WrongPasswordException(password);
        }
        if (!password.matches("[A-Za-z0-9_]+")) {
            throw new WrongPasswordException(password);
        }
    }
}
