package com.jzh.utils;

import org.apache.log4j.Logger;

/**
 * 对日志的基础功能做了封装，最好统一使用这个类，需要复杂日志的还是使用{@link Logger}等。
 *
 * @author Junhao Zhou 2016/12/17
 */
public class Log {

    private Logger logger;

    public static Log getLog(Class clazz) {
        return new Log(clazz.getName());
    }

    public static Log getLog(Object obj) {
        return new Log(obj.getClass().getName());
    }

    public static Log getLog(String name) {
        return new Log(name);
    }

    private Log(String name) {
        logger = Logger.getLogger(name);
    }

    public void info(Object message) {
        logger.info(message, null);
    }

    public void info(Object message, Throwable throwable) {
        logger.info(message, throwable);
    }

    public void debug(Object message) {
        logger.debug(message, null);
    }

    public void debug(Object message, Throwable throwable) {
        logger.debug(message, throwable);
    }

    public void warn(Object message) {
        logger.warn(message, null);
    }

    public void warn(Object message, Throwable throwable) {
        logger.warn(message, throwable);
    }

    public void error(Object message) {
        logger.error(message, null);
    }

    public void error(Object message, Throwable throwable) {
        logger.error(message, throwable);
    }

}
