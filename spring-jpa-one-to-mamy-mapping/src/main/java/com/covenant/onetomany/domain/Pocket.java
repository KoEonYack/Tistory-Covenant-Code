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
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Pocket {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "pocket_id")
    private int id;

    private String pocketName;
    private String pocketColor;

    @OneToMany(mappedBy = "pocket", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Stone> stones = new ArrayList<>();

    @Builder
    public Pocket(String pocketName, String pocketColor) {
        this.pocketName = pocketName;
        this.pocketColor = pocketColor;
    }

    public static Pocket createPocket(String pocketName, String pocketColor) {
        return Pocket.builder()
                .pocketName(pocketName)
                .pocketColor(pocketColor)
                .build();
    }

    public void putStone(Stone stone) {
        this.stones.add(stone);
    }
}
