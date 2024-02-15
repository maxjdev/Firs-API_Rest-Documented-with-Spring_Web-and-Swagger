package dio.web.api.handler;

public class RequiredFieldException extends BusinessException {
    public RequiredFieldException(String field) {
        super("THE %f FIELD IS REQUIRED", field);
    }
}
