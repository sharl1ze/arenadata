package ru.sharl1ze.tech_2;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    /**
     * 1) Происходит боксинг, анбоксинг(после компиляции метода компилятор
     * будет вынужден преобразовать класс-обертку к булеву значению из-за сигнатуры метода)
     * <p>
     * 2) Переменная result избыточна. Она не вводит ясности в код, не структурирует его.
     * <p>
     * 3) Нет нулл-чеков.
     * <p>
     * 4) {@link Pattern#matches(String, CharSequence) аналог}, {@link String#matches аналог}
     */
    public static boolean sourceMatches(String regex, String text) {
        Boolean result = Pattern.compile(regex).matcher(text).matches();
        return result;
    }

    public static boolean matches(String regex, String text) {
        Objects.requireNonNull(regex, "Regex couldn't be null");
        Objects.requireNonNull(text, "Text couldn't be null");
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        return matcher.matches();
    }
}
