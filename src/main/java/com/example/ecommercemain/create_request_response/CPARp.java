package com.example.ecommercemain.create_request_response;
import com.example.ecommercemain.domain.Basis;
import jakarta.persistence.*;
import lombok.*;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CPARp extends Basis {@Id//CreateProductAccountResponse
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long companyName;//회사 이름
    private Long price;
    private Long remainCount;//남은 개수
    private String pName;//물품 이름
    private String detail;//상세 설명
    private String category;//범주
}