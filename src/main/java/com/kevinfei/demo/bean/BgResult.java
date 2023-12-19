package com.kevinfei.demo.bean;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Data
public class BgResult implements Serializable {

    @Getter
    @Setter

    private String success;
    private String message;
    private Integer code;
    private List<String> data;

}
