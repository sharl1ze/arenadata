package ru.sharl1ze.tech_2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;


import static org.junit.jupiter.api.Assertions.*;

class RegexTest {

    @Test
    void matches_ShouldThrowNPE_WhenRegexIsNull() {
        assertThrows(NullPointerException.class, () -> Regex.matches(null, ""));
    }

    @Test
    void matches_ShouldThrowNPE_WhenTextIsNull() {
        assertThrows(NullPointerException.class, () -> Regex.matches("", null));
    }

    @Test
    void matches_ShouldReturnTrue_WhenMatch() {
        assertTrue(Regex.matches("\\d+", "53"));
    }

    @Test
    void matches_ShouldReturnFalse_WhenNotMatch() {
        assertFalse(Regex.matches("\\d+", "hd"));
    }
}