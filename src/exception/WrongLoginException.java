package exception;

public class WrongLoginException extends RuntimeException {
    private String login;

    public WrongLoginException(String message, String login) {
        super("Неверный формат логина: %s".formatted(login));
        this.login = login;
    }

    public String getLogin() {
        return login;
    }
}
