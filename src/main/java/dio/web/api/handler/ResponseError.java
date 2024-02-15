package dio.web.api.handler;

import lombok.*;
import java.util.Date;

@Getter @Setter
public class ResponseError {
    private Date timeStamp = new Date();
    private String status = "error";
    private int statusCode = 400;
    private String error;
}
