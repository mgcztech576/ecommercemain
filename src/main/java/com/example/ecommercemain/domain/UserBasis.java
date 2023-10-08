//package com.example.ecommercemain.domain;
//import jakarta.persistence.Entity;
//import jakarta.persistence.EntityListeners;
//import jakarta.persistence.MappedSuperclass;
//import lombok.Getter;
//import lombok.Setter;
//import org.springframework.data.annotation.CreatedBy;
//import org.springframework.data.annotation.LastModifiedBy;
//import org.springframework.data.jpa.domain.support.AuditingEntityListener;
//import java.time.LocalDateTime;
//@Getter @MappedSuperclass
//@EntityListeners(value = {AuditingEntityListener.class})
//public abstract class UserBasis {
//    @CreatedBy
//    private LocalDateTime createdAt;
//    @LastModifiedBy
//    private LocalDateTime modifiedAt;
//}