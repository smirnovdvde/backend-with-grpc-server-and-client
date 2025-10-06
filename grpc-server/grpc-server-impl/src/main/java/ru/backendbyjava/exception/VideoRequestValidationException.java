package ru.backendbyjava.exception;

public class VideoRequestValidationException extends RuntimeException {
    public VideoRequestValidationException(String message) {
        super(message);
    }
}
