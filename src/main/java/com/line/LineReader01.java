package com.line;

import com.line.parser.Parser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// readLines를 재사용할 수 있도록 리팩토링하기
public class LineReader01<T> {
    // interface 생성
    // Parser<제네릭> parser; 제네릭 이유: parser 인터페이스도 넘겨받은 타입을 다룰 수 있음
    Parser<T> parser; // LineReader01는 인테페이스에 의존하게 됨

    // main에서 사용하기 위해 생성자 생성 ( 생성자 통해 주입 받을 수 있음)
    public LineReader01(Parser<T> parser) {
        this.parser = parser;
    }

    // List<String> 을 파싱위해서 구조개선
    List<T> readLines(String filename) throws IOException {
        // 리스트 형식으로 리턴.
        List<T> result = new ArrayList<>();

        // BufferedReader 사용. 그리고 fileReader 불러옴. filename에서 오류나면 위로 던져주기
        BufferedReader br = new BufferedReader(new FileReader(filename));

        // 파일 한줄씩 읽어오기
        String str;
        br.readLine(); // 첫번째 줄 출력시 문제가 발생 되기 때문에 한줄 허공에 날리기
        // 한줄 읽어오는데 null이 아닌 동안 계속 돌아감
        while ((str = br.readLine()) != null) {
            // result 에 한줄 넣어주기

            System.out.println(str);
            result.add(parser.parse(str)); // parser.parse() 인터페이스가 T를 리턴하고 있기 때문에 데이터가 들어갈 수 있도록 처리
        }
        return result;
    }

    /*
    // 변경했기 때문에 요류발생하기 때문에 지움
    public static void main(String[] args) throws IOException {
        // String filename = "파일경로\\파일명.csv"
        String filename = "C:\\Users\\zinxe\\Downloads\\seoul_hospital.csv";
        LineReader01 lr = new LineReader01();

        // 파일 명 넘기면 라인은 리스트 리턴. 스트링으로 받아옴
        List<String> lines = lr.readLines(filename); // filename 오류 발생시 위로 던져줌
        // 제대로 읽어오면 줄의 수를 추가하다가 결과 나옴
        System.out.println(lines.size());
    }
     */


}
