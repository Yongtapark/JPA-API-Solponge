package com.example.demo.entity.cart;

import com.example.demo.utils.Auditing;
import com.example.demo.entity.member.Member;
import com.example.demo.entity.product.Product;
import lombok.*;

import javax.persistence.*;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class CartItem extends Auditing {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cartItemNum;
    @ManyToOne
    @JoinColumn(name = "member_num")
    private Member member;
    @ManyToOne
    @JoinColumn(name = "product_num")
    private Product product;
    private int cartItemStock;
    @Transient
    private boolean selected=true;

    private Boolean isDeleted=false;


    public CartItem(Member member, Product product, int cartItemStock) {
        this.member = member;
        this.product = product;
        this.cartItemStock = cartItemStock;
    }

    public CartItem(Long cartItemNum, Member member, Product product, int cartItemStock) {
        this.cartItemNum = cartItemNum;
        this.member = member;
        this.product = product;
        this.cartItemStock = cartItemStock;
    }


    public int getTotalPrice(){
        int totalPrice = 0;
        if (this.cartItemStock > 0) {
            totalPrice += this.cartItemStock * this.product.getProductPrice();
        }
        return totalPrice;
    }


}
