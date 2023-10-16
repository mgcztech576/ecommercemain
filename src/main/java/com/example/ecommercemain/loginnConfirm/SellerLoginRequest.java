package com.example.ecommercemain.loginnConfirm;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class SellerLoginRequest {
    @JsonProperty("sname")
    private String sName;
    @JsonProperty("spw")
    private Long sPW;
}