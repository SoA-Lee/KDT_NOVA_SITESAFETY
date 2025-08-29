package org.example.nova.hello;

public class MyMessage {
    private String content;
    private Integer number;

    public MyMessage(String content) {
        this.content = content;
    }

    public MyMessage(String content, int number) {
        this.content = content;
        this.number = number;
    }

    public String getContent() {
        return content;
    }

    public Integer getNumber() {
        return number;
    }
}
