package ot.learning.commonlibservice.exception;

import lombok.Getter;
import lombok.Setter;

import org.springframework.http.HttpStatus;

import java.io.Serializable;

@Getter
@Setter
public class RestException extends RuntimeException implements Serializable {

    /** */
    private static final long serialVersionUID = 4234756587212959185L;

    private String loggerMessage;

    private Object[] args;

    private Object additionalData;

    private HttpStatus status = HttpStatus.BAD_REQUEST;

    public RestException(String loggerMessage) {
        super(loggerMessage);
        this.loggerMessage = loggerMessage;
    }

    public RestException(String loggerMessage, Object[] args) {
        super(loggerMessage);
        this.loggerMessage = loggerMessage;
        this.args = args;
    }

    public RestException(String loggerMessage, Object additionalData) {
        super(loggerMessage);
        this.loggerMessage = loggerMessage;
        this.additionalData = additionalData;
    }

    public RestException(String loggerMessage, HttpStatus status) {
        super(loggerMessage);
        this.loggerMessage = loggerMessage;
        this.status = status;
    }

    public RestException(String loggerMessage, Object[] args, HttpStatus status) {
        super(loggerMessage);
        this.args = args;
        this.status = status;
    }

    public RestException(String loggerMessage, Object additionalData, HttpStatus status) {
        super(loggerMessage);
        this.loggerMessage = loggerMessage;
        this.additionalData = additionalData;
        this.status = status;
    }
}
