package com.example.ecommercemain.errornexception;
import lombok.*;
@Getter
@Setter
@NoArgsConstructor
@Builder
public class Except extends RuntimeException{
    private Error error;
    private String errorMessage;
    public Except(Error error,String message){
        super(message);
        this.error=error;}
}