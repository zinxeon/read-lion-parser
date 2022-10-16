package com.line.parser;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HospitalParserTest {
    // annotation (어노테이션) - 특정 메소드에 기능을 넣어주는 기능.
    // 엑셀 파일 1행 가져오기

    @Test
    void name() {
        HospitalParser hospitalParser = new HospitalParser();

        hospitalParser.parse("");

    }
}