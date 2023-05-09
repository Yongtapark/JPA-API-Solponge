package com.example.demo.entity.payment;

import com.example.demo.entity.member.Member;
import com.example.demo.entity.product.Product;
import com.example.demo.utils.Auditing;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@NoArgsConstructor
public class Payment extends Auditing {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long paymentNum; //내부용 주문번호
    private Long paymentOrderNum; //외부용 주문번호
    @ManyToOne
    @JoinColumn(name = "member_num")
    private Member member;
    @ManyToOne
    @JoinColumn(name = "product_num")
    private Product product;
    private Long paymentStock;
    private LocalDateTime paymentDate = LocalDateTime.now();
    private String paymentPhone;
    private  String paymentEmail;
    private String paymentAddress;
    private  String deliveryInfo;
    private long deliveryNum;
    private Boolean isDeleted = false;
    private int success=0;

    public Payment(Member member, Product product, Long paymentStock, String paymentPhone, String paymentEmail, String paymentAddress, String deliveryInfo, Long paymentOrderNum) {
        this.member = member;
        this.product = product;
        this.paymentStock = paymentStock;
        this.paymentPhone = paymentPhone;
        this.paymentEmail = paymentEmail;
        this.paymentAddress = paymentAddress;
        this.deliveryInfo = deliveryInfo;
        this.paymentOrderNum = paymentOrderNum;
    }
}
