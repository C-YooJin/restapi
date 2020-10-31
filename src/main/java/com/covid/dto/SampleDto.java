package com.covid.dto;

import com.covid.domain.SampleEntity;
import lombok.*;

@Data
public class SampleDto {
    private Long id;
    private boolean boolcol;
    private String charcol;
    private int intcol;

    public SampleEntity toEntity() {
        return SampleEntity.builder()
                .id(id)
                .boolcol(boolcol)
                .charcol(charcol)
                .intcol(intcol)
                .build();
    }
}

