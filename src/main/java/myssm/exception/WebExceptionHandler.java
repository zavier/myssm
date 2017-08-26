package myssm.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class WebExceptionHandler {

    @ExceptionHandler({Exception.class})
    public String handlerSimpleException() {
        return "error/error";
    }
}
