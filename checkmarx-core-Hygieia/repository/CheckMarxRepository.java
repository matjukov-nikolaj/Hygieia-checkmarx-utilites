package com.capitalone.dashboard.repository;

import com.capitalone.dashboard.model.CheckMarx;

import org.bson.types.ObjectId;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Repository for {@link CheckMarx} data.
 */

public interface CheckMarxRepository extends CrudRepository<CheckMarx, ObjectId>, QueryDslPredicateExecutor<CheckMarx> {
    /**
     * Finds the {@link CheckMarx} data point at the given timestamp for a specific
     * {@link com.capitalone.dashboard.model.CollectorItem}.
     *
     * @param collectorItemId collector item id
     * @param timestamp timestamp
     * @return a {@link CheckMarx}
     */
    CheckMarx findByCollectorItemIdAndTimestamp(ObjectId collectorItemId, long timestamp);


    /**
     * Finds the {@link List<CheckMarx>}
     * {@link com.capitalone.dashboard.model.CollectorItem}.
     *
     * @param projectName project name
     *
     * @return a {@link List<CheckMarx>}
     */
    List<CheckMarx> findByProjectName(String projectName);

}
