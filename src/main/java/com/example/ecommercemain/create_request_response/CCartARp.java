package com.example.ecommercemain.create_request_response;
import com.example.ecommercemain.domain.Basis;
import jakarta.persistence.*;
import lombok.*;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CCartARp extends Basis {@Id//CreateCartAccountResponse
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cAccountNumber;
    private Long cID;
    private String pName;
    private Long count;
    private Long sID;
//    public static Cart cartfrom(CreateCart createCart){
//        Cart cart=Cart.builder().cAccountNumber(createCart.getCAccountNumber())
//                .cID(createCart.getCID())
//                .ProductName(createCart.getProductName())
//                .count(createCart.getCount())
//                .sID(createCart.getSID())
//                .build(); return cart;}
}