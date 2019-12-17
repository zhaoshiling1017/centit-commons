package com.centit.support.database.orm;

/**
 * Created by codefan on 17-8-29.
 */
public enum GeneratorType {
    /**
     * 这个其实什么都不做，就是依赖数据库自动增长；程序中什么也不做
     */
    AUTO,
    /**
     * 数据库序列, 序列名称保存在value中, 形式可以为：
     * 1, SEQ_NAME  , 序列名称
     * 2, SEQ_NAME:PREFIX  , 序列名称+ 前缀
     * 3, SEQ_NAME:PREFIX:LEN:PAD_STRING , 序列名称 + 前缀 + 长度 + 中间不空字符串
     */
    SEQUENCE,
    /**
     * uuid 32bit
     */
    UUID,
    /**
     * uuid 22bit base64 编码
     */
    UUID22,
    /**
     * 常量 , 保存在value中
     */
    CONSTANT,
    /**
     * 函数，比如 当前日期
     * 这个调用compiler中的表达式运行，可以将同一个对象中的其他字段作为参数
     */
    FUNCTION,
    /**
     * 流水号； 代码（sequence）：模板 function  seqNo:序列号
     * serial number 和 FUNCTION 一样，只是多了一个 序列变量可以使用
     */
    SERIAL_NO,
    /**
     * 表的主键,只能是单主键，随机生成;  长度(长度不包括前缀)：前缀(可以为空)
     */
    RANDOM_ID,
    /**
     * 符合主键，一个表中只能有一个这个字段, 并且只能用于 整型（int、long） 类型字段
     */
    SUB_ORDER
}
