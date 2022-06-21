package com.yy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author yeyu
 * @since 2022-06-21 17:29
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result<T> {

    private Integer code;

    private String msg;

    private T data;

    public static <T> Result<T> success() {
        return new Result<>(0, "SUCCESS", null);
    }

    public static <T> Result<T> fail() {
        return new Result<>(-1, "FAILED", null);
    }

    public static <T> Result<T> fail(String msg) {
        return new Result<>(-1, msg, null);
    }
}
