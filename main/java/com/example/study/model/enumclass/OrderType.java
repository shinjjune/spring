package com.example.study.model.enumclass;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum OrderType {

    ALL(0,"묶음","모든 상품을 묶음 배송"),
    EACH(1,"개별","모든 상품을 개별 배송")
    ;

    private Integer id;
    private String title;
    private String description;
}
