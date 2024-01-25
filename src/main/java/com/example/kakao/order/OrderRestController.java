package com.example.kakao.order;

import com.example.kakao._core.utils.ApiUtils;
import com.example.kakao.user.User;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class OrderRestController {

    private final OrderService orderService;

    //  TODO : 결재
    //@PostMapping("/orders/save")

    // TODO : 주문 결과 확인
    // @GetMapping("/orders/{id}")


    // TODO : 주문 목록 모두 삭제
    @PostMapping("/orders/clear")
    public ResponseEntity<?> clear(User user) {
        orderService.clear(user);
        ApiUtils.ApiResult<?> apiResult = ApiUtils.success(null);
        return ResponseEntity.ok(apiResult);
    }

}
