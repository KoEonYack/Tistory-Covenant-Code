package com.covenant.onetomany.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class PocketDTO {

    private String pocketName;
    private String pocketColor;
    private List<StoneDTO> stones;
}
