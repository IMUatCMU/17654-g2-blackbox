package blackbox;

/**
 * Created by davidiamyou on 2016-10-09.
 */
public class MismatchResultException extends RuntimeException {

    public String result;

    public MismatchResultException(String result) {
        this.result = result;
    }
}
