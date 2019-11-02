package io.github.kings1990.rap2.generator.test.model;

import lombok.Data;

@Data
public class KingsHobby {
    /**
     * 名称
     */
    private String name;
    /**
     * 喜欢程度【0-不喜欢 1-喜欢 3-超喜欢】
     */
    private Integer level;
}


