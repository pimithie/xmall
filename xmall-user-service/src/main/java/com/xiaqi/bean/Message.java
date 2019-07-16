package com.xiaqi.bean;

import java.util.Objects;

/**
 * @author xiaqi
 * @date 2019/7/16
 */
public class Message {

    /**
     * 状态码
     */
    private int code;

    /**
     * 服务器消息
     */
    private String message;

    /**
     * 服务器数据
     */
    private Object data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Message message1 = (Message) o;
        return code == message1.code &&
                Objects.equals(message, message1.message) &&
                Objects.equals(data, message1.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, message, data);
    }

    @Override
    public String toString() {
        return "Message{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
