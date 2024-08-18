package exception;

public class WrongPasswordException extends RuntimeException {
    private String password;
    private String confirmPassword;

    public WrongPasswordException(String password) {
        super("Неверный формат пароля: %s".formatted(password));
        this.password = password;
    }

    public WrongPasswordException(String confirmPassword, String password) {
        super("Пароль: %s не совпадает с основным: %s".formatted(confirmPassword, password));
        this.confirmPassword = confirmPassword;
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public String getPassword() {
        return password;
    }
}
