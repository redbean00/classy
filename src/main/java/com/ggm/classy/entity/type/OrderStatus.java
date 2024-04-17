package com.ggm.classy.entity.type;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum OrderStatus {
    ACCEPTING("ACCEPTING", "주문 접수중"),
    PREPARING("PREPARING", "상품 준비중"),
    DELIVERING("DELIVERING", "배송 중");

    private final String status;
    private final String description;



}
