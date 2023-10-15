package com.example.ecommercemain.errornexception;
import lombok.*;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Exception extends RuntimeException{
    private Error error;
    private String errorMessage;
    public Exception(Error error){this.error=error;}
}