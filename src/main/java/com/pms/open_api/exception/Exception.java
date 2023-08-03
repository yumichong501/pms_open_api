package com.pms.open_api.exception;

import com.pms.open_api.util.JsonResponse;
import com.pms.open_api.util.Response;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.ConstraintViolationException;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.stream.Collectors;

@RestControllerAdvice
public class Exception {

    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public JsonResponse handleValidException(MethodArgumentNotValidException e){
        ObjectError objectError = e.getBindingResult().getAllErrors().get(0);
        return Response.ExceptionReturn(1,objectError.getDefaultMessage());
    }

    @ExceptionHandler(value = ConstraintViolationException.class)
    public JsonResponse handleConstraintViolationException(ConstraintViolationException e){
        return Response.ExceptionReturn(
                1,
                e.getConstraintViolations().stream().map(ConstraintViolation::getMessage).collect(Collectors.toList()).get(0)
        );
    }

    @ExceptionHandler(value = java.lang.Exception.class)
    public JsonResponse handleException(java.lang.Exception e){
        return Response.ExceptionReturn(1,e.getMessage());
    }
}
