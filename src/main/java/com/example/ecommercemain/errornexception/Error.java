package com.example.ecommercemain.errornexception;
import lombok.AllArgsConstructor;
import lombok.Getter;
@Getter
@AllArgsConstructor
public enum Error {
    USER_NO("사용자 없음"); private String eDetail;
}
