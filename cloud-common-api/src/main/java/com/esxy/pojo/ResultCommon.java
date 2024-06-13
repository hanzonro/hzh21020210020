package com.esxy.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResultCommon<T> {
    public ResultCommon(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    private Integer code;//状态码

    private String msg;//提示详细

    private T data;//返回的数据
}
