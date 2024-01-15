package com.example.kakao.option;

import com.example.kakao._core.utils.ApiUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class OptionRestController {

    private final OptionService optionService;

    // TODO : product에 해당하는 상세 옵션 반환
    // @GetMapping("/products/{id}/options")


    // TODO : 옵션 전체 반환
    //@GetMapping("/options")

}
