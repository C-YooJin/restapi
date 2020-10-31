package com.covid.domain;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
public class SampleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 20)
    private boolean boolcol;

    @Column(length = 20)
    private String charcol;

    @Column(length = 20)
    private int intcol;

    @Builder
    public SampleEntity(Long id, boolean boolcol, String charcol, int intcol) {
        this.id = id;
        this.boolcol = boolcol;
        this.charcol = charcol;
        this.intcol = intcol;
    }

}
