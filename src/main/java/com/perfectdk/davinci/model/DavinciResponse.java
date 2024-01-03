package com.perfectdk.davinci.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter
@ToString
@AllArgsConstructor
public class DavinciResponse<T> {

    private int code;
    private T data;
}
