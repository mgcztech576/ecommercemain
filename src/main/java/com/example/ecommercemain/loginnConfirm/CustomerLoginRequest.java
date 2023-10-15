package com.example.ecommercemain.loginnConfirm;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CustomerLoginRequest {
    @JsonProperty("name")
    private String cName;
    @JsonProperty("pw")
    private Long cPW;
}