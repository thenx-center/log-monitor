package com.tgpms.web.monitor.service;

import com.tgpms.common.PageView;
import com.tgpms.web.monitor.dto.LogsDto;

import java.util.List;

/**
 * @author May
 * <p>
 * 查询日志相关接口
 */
public interface CatLogsService {

    /**
     * 查询 对应 日志
     *
     * @param location 文件路径
     * @param fileName 文件名称
     * @return null
     */
    List<String> catLogs(String location, String fileName);

    /**
     * 当前目录所有日志
     *
     * @return null
     */
    List<LogsDto> findAll(String location);

    /**
     * 查询对应日志 分页版
     *
     * @param pageView 分页
     * @return null
     */
    PageView catLogsPage(PageView pageView);

    /**
     * 查询所有日志 分页版
     *
     * @param pageView 分页
     * @return null
     */
    PageView findAllPage(PageView pageView);
}