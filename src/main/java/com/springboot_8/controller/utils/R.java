package com.springboot_8.controller.utils;

import lombok.Data;

@Data
public class R {
    private Boolean flag;
    private Object data;

    public R() {
    }

    /**
     * 不返回数据的构造方法
     *
     * @param flag
     */
    public R(Boolean flag) {
        this.flag = flag;
    }

    /**
     * 返回数据的构造方法
     *
     * @param flag
     * @param data
     */
    public R(Boolean flag, Object data) {
        this.flag = flag;
        this.data = data;
    }
}
