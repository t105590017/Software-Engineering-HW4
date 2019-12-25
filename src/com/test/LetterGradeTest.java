package com.test;

import com.company.LetterGrade;
import com.company.Main;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LetterGradeTest {
    Main main;
    LetterGrade letterGrade;

    @BeforeEach
    void setUp() {
        main = new Main();
        letterGrade = new LetterGrade();
    }

    @AfterEach
    void tearDown() {
        main = null;
        letterGrade = null;
    }

    @Test
    void LetterGradeTest1() {
        assertEquals(LetterGrade.letterGrade(95), 'A');
        assertEquals(LetterGrade.letterGrade(85), 'B');
        assertEquals(LetterGrade.letterGrade(75), 'C');
        assertEquals(LetterGrade.letterGrade(65), 'D');
        assertEquals(LetterGrade.letterGrade(55), 'F');
        assertEquals(LetterGrade.letterGrade(101), 'X');
        assertEquals(LetterGrade.letterGrade(-1), 'X');
    }

    @Test
    void LetterGradeTest2() {
        assertEquals(LetterGrade.letterGrade(100), 'A');
        assertEquals(LetterGrade.letterGrade(99), 'A');
        assertEquals(LetterGrade.letterGrade(90), 'A');
        assertEquals(LetterGrade.letterGrade(80), 'B');
        assertEquals(LetterGrade.letterGrade(80), 'B');
        assertEquals(LetterGrade.letterGrade(79), 'C');
        assertEquals(LetterGrade.letterGrade(70), 'C');
        assertEquals(LetterGrade.letterGrade(69), 'D');
        assertEquals(LetterGrade.letterGrade(60), 'D');
        assertEquals(LetterGrade.letterGrade(59), 'F');
        assertEquals(LetterGrade.letterGrade(1), 'F');
        assertEquals(LetterGrade.letterGrade(-1), 'X');
        assertEquals(LetterGrade.letterGrade(101), 'X');
    }
}