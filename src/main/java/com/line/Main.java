package com.line;

import com.line.domain.Hospital;
import com.line.parser.HospitalParser;

import java.io.IOException;
import java.util.List;

// 실행하기
public class Main {
    public static void main(String[] args) throws IOException {
        // Hospital 객체 넣어서 LineReader01 만들기

        // new LineReader01는 parser를 주입 받아야 됨
        LineReader01<Hospital> hospitalLineReader = new LineReader01<>(new HospitalParser());
        String filename = "C:\\Users\\zinxe\\Downloads\\seoul_hospital.csv";

        // List를 Hospital의 형태를 받을 수 있음.
        List<Hospital> hospitals = hospitalLineReader.readLines(filename); // filename 넘겨주기

        // 파일의 한줄 길이를 출력
        System.out.println(hospitals.size());

        // id 전체를 출력하기 위해서 for문 사용
        for (Hospital hospital : hospitals) {
            System.out.println(hospital.getId());
        }
    }
}
