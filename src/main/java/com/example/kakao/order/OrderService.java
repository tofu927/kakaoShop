package com.example.kakao.order;

import com.example.kakao.cart.CartJPARepository;
import com.example.kakao.option.OptionJPARepository;
import com.example.kakao.order.item.ItemJPARepository;
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

}
