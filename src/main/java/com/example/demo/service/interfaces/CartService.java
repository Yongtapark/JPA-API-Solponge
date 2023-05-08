package com.example.demo.service.interfaces;

import com.example.demo.entity.cart.Cart;
import com.example.demo.entity.cart.CartItem;

public interface CartService {
    /**
     * cart_item
     * 상품 추가, 수정, 삭제, 확인
     */
    CartItem addItem(CartItem cartItem);

    void deleteItem(Long cartItemNum);

    CartItem findItem(Long cartItemNum);

    /**
     * cart
     * 상품 리스트 확인
     */
    Cart createCart(Cart cart);

    Cart getMyCart(Long memberNum);

    void deleteCartByMemberNum(Long memberNum);



}