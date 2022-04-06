/*
 *
 *  * 盛建辉：毕设
 *  *
 *  * 版权归本公司所有，不得私自使用、拷贝、修改、删除，否则视为侵权
 *
 */

package com.example.property.configure;

import java.io.Serializable;

/**
 * 传给前端的一个封装
 * @param <T>
 */
public class CommonResult<T> implements Serializable {

    private Integer code;
    private String message;
    private Integer count;
    private T data;

    public CommonResult(Integer code, String message, Integer count, T data) {
        this.code = code;
        this.message = message;
        this.count = count;
        this.data = data;
    }

    public CommonResult(Integer code, String message, T data){
        this.code = code;
        this.message = message;
        this.data = data;
        this.count = 0;
    }

    public CommonResult(Integer code, String message){
        this.code = code;
        this.message = message;
        this.data = null;
        this.count = 0;
    }

    public CommonResult() {
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "CommonResult{" +
                "code=" + code +
                ", msg='" + message + '\'' +
                ", count=" + count +
                ", data=" + data +
                '}';
    }
}