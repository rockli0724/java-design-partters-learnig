package com.lilin.basic.date;

import java.net.URLDecoder;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.chrono.Chronology;
import java.time.temporal.*;
import java.util.Date;

/**
 * @author lilin
 * @Title: DateQuery
 * @date 2019/9/1下午9:51
 */
public class DateQuery {


    public static void main(String[] args) throws Exception{
        TemporalQuery<TemporalUnit> precision = TemporalQueries.precision();
        TemporalQuery<Chronology> chronology = TemporalQueries.chronology();
        TemporalQuery<LocalDate> localDateTemporalQuery = TemporalQueries.localDate();

        // Query a LocalDate
        LocalDate ld = LocalDate.now();
        TemporalUnit query = ld.query(precision);
        Chronology query1 = ld.query(chronology);
        LocalDate query2 = ld.query(localDateTemporalQuery);

        LocalDate with =LocalDate.now().with(TemporalAdjusters.previousOrSame(DayOfWeek.MONDAY));
        LocalDate with2 =LocalDate.now().with(TemporalAdjusters.previousOrSame(DayOfWeek.SUNDAY));
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
