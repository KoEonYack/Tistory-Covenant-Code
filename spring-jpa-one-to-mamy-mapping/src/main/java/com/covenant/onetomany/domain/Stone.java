package com.covenant.onetomany.domain;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Stone {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "stone_id")
    private int id;

    private String stoneName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pocket_id")
    private Pocket pocket;

    @Builder
    public Stone(String stoneName, Pocket pocket) {
        this.stoneName = stoneName;
        this.pocket = pocket;
    }

    public static Stone createStone(String stoneName, Pocket pocket) {
        return Stone.builder()
                .stoneName(stoneName)
                .pocket(pocket)
                .build();
    }
}
