package com.example.demo.entity.cart;

import com.example.demo.utils.Auditing;
import com.example.demo.entity.member.Member;
import com.example.demo.entity.product.Product;
import lombok.*;

import javax.persistence.*;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class CartList extends Auditing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cartNum;
    @ManyToOne
    private Member member;
    @ManyToOne
    private Product product;
    private String cartDate;
    private int cartItemStock;

    public CartList(Member member, Product product, String cartDate, int cartItemStock) {
        this.member = member;
        this.product = product;
        this.cartDate = cartDate;
        this.cartItemStock = cartItemStock;
    }

}
