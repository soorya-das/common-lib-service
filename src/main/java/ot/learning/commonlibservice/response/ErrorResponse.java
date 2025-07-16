package ot.learning.commonlibservice.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Set;

@Getter
@JsonInclude(
        Include.NON_NULL) // When converting this object to JSON, exclude any fields that are null
public class ErrorResponse {

    @JsonProperty(
            "error_message") // Renames a field in the JSON response without changing the Java field
    // name.
    private String error;

    private Set<String> errorList;
    private Object[] args;
    private Object additionalData;
    private Integer errorCode;
    private Integer status;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime timestamp = LocalDateTime.now();

    @JsonIgnore private Object internalDetails;

    public ErrorResponse(Integer status, String error) {
        this.status = status;
        this.error = error;
    }

    public ErrorResponse(Integer status, String error, Set<String> errors) {
        this.status = status;
        this.error = error;
        this.errorList = errors;
    }

    public void setError(final String error) {
        this.error = error;
    }

    public void setErrorList(final Set<String> errorList) {
        this.errorList = errorList;
    }

    public void setArgs(final Object[] args) {
        this.args = args;
    }

    public void setAdditionalData(final Object additionalData) {
        this.additionalData = additionalData;
    }

    public void setErrorCode(final Integer errorCode) {
        this.errorCode = errorCode;
    }

    public void setStatus(final Integer status) {
        this.status = status;
    }

    public void setTimestamp(final LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public String toString() {
        String var10000 = this.getError();
        return "ErrorResponse(error="
                + var10000
                + ", errorList="
                + String.valueOf(this.getErrorList())
                + ", args="
                + Arrays.deepToString(this.getArgs())
                + ", additionalData="
                + String.valueOf(this.getAdditionalData())
                + ", errorCode="
                + this.getErrorCode()
                + ", status="
                + this.getStatus()
                + ", timestamp="
                + String.valueOf(this.getTimestamp())
                + ")";
    }
}
