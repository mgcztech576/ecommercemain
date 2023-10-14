package com.example.ecommercemain.signup;
import com.example.ecommercemain.domain.Cart;
import jakarta.persistence.*;
import lombok.*;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreateCart{@Id
    @GeneratedValue
    private Long cAccountNumber;
    private Long cID;
    private String pName;
    private Long count;//물건 개수
    private Long sID;//판매자 id
    public static Cart cartfrom(CreateCart createCart){
        Cart cart=Cart.builder()
                .cAccountNumber(createCart.getCAccountNumber())
                .cID(createCart.getCID())
                .pName(createCart.getPName())
                .count(createCart.getCount())
                .sID(createCart.getSID())
                .build(); return cart;}
}