package ru.backendbyjava.service;

import org.springframework.stereotype.Service;
import ru.backendbyjava.exception.VideoRequestValidationException;
import ru.backendbyjava.proto.VideoRequest;

import java.util.Objects;

@Service
public class VideoRequestValidator {
    public void validate(VideoRequest videoRequest) {
        if (Objects.isNull(videoRequest.getUserid()) || videoRequest.getUserid().isEmpty()) {
            throw new VideoRequestValidationException("User id in the request is not valid");
        }

        if (Objects.isNull(videoRequest.getCategory())) {
            throw new VideoRequestValidationException("Video category is not provided");
        }
    }
}
