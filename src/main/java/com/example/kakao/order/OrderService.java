package com.example.kakao.order;

import com.example.kakao._core.errors.exception.Exception500;
import com.example.kakao.cart.CartJPARepository;
import com.example.kakao.option.OptionJPARepository;
import com.example.kakao.order.item.ItemJPARepository;
import com.example.kakao.user.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = true)
@RequiredArgsConstructor
@Service
public class OrderService {

    private final ItemJPARepository ItemJPARepository;
    private final OrderJPARepository orderJPARepository;
    private final OptionJPARepository optionJPARepository;
    private final CartJPARepository cartJPARepository;

    @Transactional
    public void clear(User user) {
        try {
            orderJPARepository.deleteByUserId(user.getId());
        }catch (Exception e){
            throw new Exception500("주문 목록 초기화 실패 : "+e.getMessage());
        }

    }
}
