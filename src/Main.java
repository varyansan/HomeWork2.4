import exception.WrongLoginException;
import exception.WrongPasswordException;
import validate.ValidationService;

import static validate.ValidationService.verification;

public class Main {

    public static void main(String[] args) {
        try {
            verification("carrot", "159k", "159k");
            System.out.println("Успешно!\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25");
        } catch (WrongLoginException ex) {
            System.out.println(ex.getLogin());
            System.out.println("Упс! Произошла ошибка \uD83D\uDE2D");
        } catch (WrongPasswordException ex) {
            System.out.println(ex.getPassword());
            System.out.println("Что-то пошло не так \uD83D\uDE22");
        } finally {
            System.out.println("Программа завершена!");
        }

    }

}