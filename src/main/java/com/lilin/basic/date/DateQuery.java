package com.lilin.basic.date;

import java.net.URLDecoder;
import java.time.*;
import java.time.chrono.Chronology;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.TemporalQueries;
import java.time.temporal.TemporalQuery;
import java.time.temporal.TemporalUnit;

/**
 * @author lilin
 * @Title: DateQuery
 * @date 2019/9/1下午9:51
 */
public class DateQuery {


    public static void main(String[] args) throws Exception {
        TemporalQuery<TemporalUnit> precision = TemporalQueries.precision();
        TemporalQuery<Chronology> chronology = TemporalQueries.chronology();
        TemporalQuery<LocalDate> localDateTemporalQuery = TemporalQueries.localDate();
        TemporalQuery<LocalTime> localTimeTemporalQuery = TemporalQueries.localTime();
        TemporalQuery<ZoneId> zoneIdTemporalQuery = TemporalQueries.zone();
        // Query a LocalDate
        LocalDateTime ld = LocalDateTime.now();
        TemporalUnit query = ld.query(precision);
        Chronology query1 = ld.query(chronology);
        LocalDate query2 = ld.query(localDateTemporalQuery);
        LocalTime localTime = ld.query(localTimeTemporalQuery);
        ZoneId zoneId = ld.query(zoneIdTemporalQuery);

        System.out.println("LocalDateTime=" + ld.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        System.out.println("TemporalUnit=" + query);
        System.out.println("Chronology=" + query1);
        System.out.println("LocalDate=" + query2);
        System.out.println("LocalTime=" + localTime);
        System.out.println("ZoneId=" + zoneId);
        LocalDate with = LocalDate.now().with(TemporalAdjusters.previousOrSame(DayOfWeek.MONDAY));
        LocalDate with2 = LocalDate.now().with(TemporalAdjusters.previousOrSame(DayOfWeek.SUNDAY));
        System.out.println(with);
        System.out.println(with2);


        System.out.println(query);
        System.out.println(query1);
        System.out.println(query2);
        String gbk = URLDecoder.decode("%BF%A8%BA%C5%B2%BB%B4%E6%D4%DA", "GBK");
//        String gbk = URLDecoder.decode("%25BF%25A8%25BA%25C5%25B2%25BB%25B4%25E6%25D4%25DA", "GBK");
        System.out.println(gbk);
    }
}
