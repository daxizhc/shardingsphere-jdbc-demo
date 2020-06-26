package com.shardingsphere.sharding.jpa.algorithm;

import java.util.Collection;

import org.apache.shardingsphere.api.sharding.standard.PreciseShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;

public class DatabasePreciseShardingAlgorithm implements PreciseShardingAlgorithm<Integer> {

    @Override
    public String doSharding(Collection<String> collection, PreciseShardingValue<Integer> preciseShardingValue) {
//      数据库为db1，和db2，student中id为奇数的路由到db1，偶数路由到db2，preciseShardingValue为分片键id
        return "db" + (2 - (preciseShardingValue.getValue() % 2));
    }

}
