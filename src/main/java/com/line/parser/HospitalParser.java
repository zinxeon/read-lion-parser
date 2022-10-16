package com.line.parser;

import com.line.domain.Hospital;

// HospitalParser는 Parser interface를 구현한다.
public class HospitalParser implements Parser<Hospital>{
    @Override
    public Hospital parse(String str) {

        // .csv 파일이라서 String 배열
        String[] splitted = str.split(","); // 쉼표(,)를 기준으로 자르기
        // split으로 자른 내용을 Hospital Object로 전달 하기

        // splitted의 0번 index의 값을 넣기
        return new Hospital(splitted[0]); // Hospital.java로 이동
    } // Parser interface가 타입을 넣어주게 되어있기때문에 똑같이 넣어줌
}
