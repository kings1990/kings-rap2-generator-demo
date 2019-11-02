package com.kings.rap2.test.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDate;

@Data
public class TimeQueryVo {

    /**
     * 开始时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate beginTime;

    /**
     * 结束时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate endTime;
}


