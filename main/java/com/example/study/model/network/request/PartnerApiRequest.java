package com.example.study.model.network.request;

import com.example.study.model.enumclass.PartnerStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class PartnerApiRequest {

    private Long id;

    private String name;

    private PartnerStatus status;

    private String address;

    private String callCenter;

    private String partnerNumber;

    private String businessNumber;

    private String ceoName;

    private LocalDateTime registeredAt;

    private LocalDateTime unregisteredAt;

    private Long categoryId;

}
