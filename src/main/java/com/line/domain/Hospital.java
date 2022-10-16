package com.line.domain;

public class Hospital {
    // 값들을 넣어주기
    private String id;

    // id를 생성자를 통해 초기화 할 수 있음
    public Hospital(String id) {
        this.id = id;
    }

    // getId라는 메소드를 통해서 id에 접근 가능
    public String getId() {
        return id;
    }
}
