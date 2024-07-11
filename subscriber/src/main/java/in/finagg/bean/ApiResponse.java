package in.finagg.bean;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ApiResponse<T> {

    private T data;
    private String status;
    private String message;

    // Default constructor
    public ApiResponse() {
    }

    // Parameterized constructor
    @JsonCreator
    public ApiResponse(@JsonProperty("data") T data, @JsonProperty("status") String status, @JsonProperty("message") String message) {
        this.data = data;
        this.status = status;
        this.message = message;
    }

    // Getters and setters
    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
