package com.example.kakao.order;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class OrderRestController {

    private final OrderService orderService;

    //  TODO : 결재
    //@PostMapping("/orders/save")

    // TODO : 주문 결과 확인
    // @GetMapping("/orders/{id}")


    // TODO : 주문 목록 모두 삭제
    //@PostMapping("/orders/clear")



}
