package com.example.ecommercemain.domain;
import com.example.ecommercemain.signup.CreateCart;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
@Getter @Setter @NoArgsConstructor
@AllArgsConstructor
@Builder @Entity
@EntityListeners(AuditingEntityListener.class)
public class Cart extends Basis{ @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cartID;
    private Long cAccountNumber;
    private Long cID;
    private String ProductName;
    private Long count;//물건 개수
    private Long sID;//판매자 id
//    public static Cart cartfrom(CreateCart createCart){
//        Cart cart=Cart.builder().cartID(createCart.getCartID())
//                .cAccountNumber(createCart.getCAccountNumber())
//                .cID(createCart.getCID())
//                .ProductName(createCart.getProductName())
//                .count(createCart.getCount())
//                .sID(createCart.getSID())
//                .build(); return cart;}
}