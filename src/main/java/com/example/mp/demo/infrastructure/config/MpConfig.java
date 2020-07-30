package com.example.mp.demo.infrastructure.config;

import com.baomidou.mybatisplus.core.parser.ISqlParser;
import com.baomidou.mybatisplus.extension.parsers.BlockAttackSqlParser;
import com.baomidou.mybatisplus.extension.plugins.PerformanceInterceptor;
import com.baomidou.mybatisplus.extension.plugins.SqlExplainInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhouR
 * @date 2020-05-14 16:02
 * @function:
 */
@Configuration
@MapperScan("com.example.mp.demo.mapper")
public class MpConfig {

    /**
     * SQL执行效率插件
     */
    @Bean
    // @Profile({"dev","test"})// 设置 dev test 环境开启
    public PerformanceInterceptor performanceInterceptor() {
        PerformanceInterceptor interceptor = new PerformanceInterceptor();
        //设置执行最长时间，超过这个时间就报错  单位：毫秒
        //interceptor.setMaxTime(20);
        //分析sql语句是否格式化
        //interceptor.setFormat(true);
        return interceptor;
    }

    /**
     *  执行分析插件
     */
    @Bean
    //@Profile({"dev","test"})// 设置 dev test 环境开启
    public SqlExplainInterceptor sqlExplainInterceptor() {
        SqlExplainInterceptor sqlExplainInterceptor = new SqlExplainInterceptor();
        List<ISqlParser> sqlParserList = new ArrayList<>();
        // 攻击 SQL 阻断解析器、加入解析链
        sqlParserList.add(new BlockAttackSqlParser());
        sqlExplainInterceptor.setSqlParserList(sqlParserList);
        return sqlExplainInterceptor;
    }

}
