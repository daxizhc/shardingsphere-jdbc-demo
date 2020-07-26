package com.shardingsphere.sharding.jpa.algorithm;

import java.util.Collection;
import java.util.Collections;

import org.apache.shardingsphere.api.sharding.hint.HintShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.hint.HintShardingValue;

public class DatabaseHintShardingAlgorithm implements HintShardingAlgorithm {

    @Override
    // availableTargetNames 表示可选择的库名，shardingValue为之前设置好的分库键值
    public Collection<String> doSharding(Collection availableTargetNames, HintShardingValue shardingValue) {
        return Collections.singletonList("db1");
    }

}
