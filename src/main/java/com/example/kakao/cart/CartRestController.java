package com.example.kakao.cart;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class CartRestController {

    private final CartService cartListService;

    // TODO :  장바구니 담기
    //@PostMapping("/carts/add")

    // TODO : 주문하기 - (장바구니 업데이트)
    //@PostMapping("/carts/update")

    // TODO : 장바구니 보기 - (주문화면, 결재화면)
    //@GetMapping("/carts")

    // TODO : 장바구니 비우기
    //@PostMapping("/carts/clear")

}
