package com.tgpms.web.monitor.service;

import java.util.List;

/**
 * @author May
 * <p>
 * 查询日志相关接口
 */
public interface CatLogsService {

    /**
     * 查询 catalina 日志
     *
     * @param location 文件路径
     * @param fileName 文件名称
     * @return null
     */
    List<String> catCatalina(String location, String fileName);

    /**
     * 查询 hostManager 日志
     *
     * @return null
     */
    List<String> catHostManager();

    /**
     * 查询 localhost 日志
     *
     * @return null
     */
    List<String> catLocalhost();

    /**
     * 查询 localhostAccessLog 日志
     *
     * @return null
     */
    List<String> catLocalhostAccessLog();

    /**
     * 查询 manager 日志
     *
     * @return null
     */
    List<String> catManager();

    /**
     * 查询 debug 日志
     *
     * @return null
     */
    List<String> debug();

    /**
     * 当前目录所有日志
     *
     * @return null
     */
    List<String> findAll(String location);
}
