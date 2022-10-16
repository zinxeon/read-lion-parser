package com.line;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// String으로 한줄 읽어오는 거
public class LineReader {
    // List형태의 String 리턴할꺼 (String filename받음)
    List<String> readLines(String filename) throws IOException {
        // 리스트 형식으로 리턴.
        List<String> result = new ArrayList<>();

        // BufferedReader 사용. 그리고 fileReader 불러옴. filename에서 오류나면 위로 던져주기
        BufferedReader br = new BufferedReader(new FileReader(filename));

        // 파일 한줄씩 읽어오기
        String str;
        // 한줄 읽어오는데 null이 아닌 동안 계속 돌아감
        while ((str = br.readLine()) != null) {
            result.add(str); // result 에 한줄 넣어주기
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        // String filename = "파일경로\\파일명.csv"
        String filename = "C:\\Users\\zinxe\\Downloads\\seoul_hospital.csv";
        LineReader lr = new LineReader();

        // 파일 명 넘기면 라인은 리스트 리턴. 스트링으로 받아옴
        List<String> lines = lr.readLines(filename); // filename 오류 발생시 위로 던져줌
        // 제대로 읽어오면 줄의 수를 추가하다가 결과 나옴
        System.out.println(lines.size());
    }


}
