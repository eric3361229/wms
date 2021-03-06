package com.gionee.wms.service.log;

import com.gionee.wms.entity.OrderOutlierLog;

import java.util.List;
import java.util.Map;

/**
 * Date: 2017/10/31
 * Time: 15:30
 *
 * @author huyunfan
 */
public interface OrderOutlierLogService {
    /**
     * @param params
     * @return
     */
    List<OrderOutlierLog> query(Map<String, Object> params);

    /**
     * @param params
     * @return
     */
    int queryCount(Map<String, Object> params);

    /**
     * @param logList
     * @return
     */
    int insertBatch(List<OrderOutlierLog> logList);
}
