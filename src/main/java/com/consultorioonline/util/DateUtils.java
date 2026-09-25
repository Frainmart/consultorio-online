package com.consultorioonline.util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public final class DateUtils {
    private DateUtils() {}
    public static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    public static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    public static String format(LocalDate date) { return date == null ? null : date.format(DATE_FORMATTER); }
    public static String format(LocalDateTime dateTime) { return dateTime == null ? null : dateTime.format(DATE_TIME_FORMATTER); }
}
