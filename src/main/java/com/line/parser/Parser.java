package com.line.parser;

// Parser를 생성할 때도 타입을 넣을 수 있게 다형성 T 뚤어주기
public interface Parser<T> {
    // 다형성 적용하기
    // Parser만(구현체) 만들어서 사용할 수 있음 (다형성)

    // T를 리턴. 파싱 할때 String을 받음.
    T parse(String str); // 파일의 타입에 따라서 리턴타입(자바의 object)변함 (병원이면 병원, 인구이동이면 인구이동)


}
