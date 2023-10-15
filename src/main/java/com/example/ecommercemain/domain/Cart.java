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
    private Long cID;//고객 id
    private Long count;//주문 물건 개수
    private String pName;
    private Long cAccountNumber;
    private Long sID;
    public void cartUpdate(CreateCart createCart){
        this.count=createCart.getCount();}
    //private Long sID;//판매 회사 id
//    public static Cart cartfrom(CreateCart createCart){
//        Cart cart=Cart.builder()
//                .cAccountNumber(createCart.getCAccountNumber())
//                .cID(createCart.getCID())
//                .ProductName(createCart.getProductName())
//                .count(createCart.getCount())
//                .sID(createCart.getSID())
//                .build(); return cart;}
}