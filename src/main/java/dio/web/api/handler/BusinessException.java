package dio.web.api.handler;

public class BusinessException extends RuntimeException{
    public BusinessException(String m) {
        super(m);
    }
    public BusinessException(String m, Object ... params) {
        super(String.format(m, params));
    }
}
