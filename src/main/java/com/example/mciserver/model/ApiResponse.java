package com.example.mciserver.model;

import java.time.Instant;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class ApiResponse {
    private String code;
    private String message;
    private String localizedMessage;
    private String traceId;
    private Map<String, Object> data;
    private String timestamp;

    public ApiResponse() {
        this.timestamp = Instant.now().toString();
        this.traceId = UUID.randomUUID().toString();
        this.data = new HashMap<>(); // initializing with empty map
    }

    // Constructors (default and parameterized), getters, setters, etc.

  // Getter and Setter for code
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    // Getter and Setter for message
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    // Getter and Setter for localizedMessage
    public String getLocalizedMessage() {
        return localizedMessage;
    }

    public void setLocalizedMessage(String localizedMessage) {
        this.localizedMessage = localizedMessage;
    }

    // Getter and Setter for traceId
    public String getTraceId() {
        return traceId;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    // Getter and Setter for data
    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }

    // Getter for timestamp (We generally don't provide a setter for the timestamp, as it's set at object creation. But you can add one if needed.)
    public String getTimestamp() {
        return timestamp;
    }
}
