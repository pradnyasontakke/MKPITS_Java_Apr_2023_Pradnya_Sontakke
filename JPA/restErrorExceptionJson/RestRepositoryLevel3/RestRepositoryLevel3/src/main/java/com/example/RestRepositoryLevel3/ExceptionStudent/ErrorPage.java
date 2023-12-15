package com.example.RestRepositoryLevel3.ExceptionStudent;

public class ErrorPage {
    private int status_code;
    private String message;
    private long time;

    public ErrorPage() {
    }

    public ErrorPage(int status_code, String message, long time) {
        this.status_code = status_code;
        this.message = message;
        this.time = time;
    }

    public int getStatus_code() {
        return status_code;
    }

    public void setStatus_code(int status_code) {
        this.status_code = status_code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }
}
