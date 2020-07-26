package com.shardingsphere.sharding.jpa.algorithm;

import java.util.Collection;
import java.util.Collections;

import org.apache.shardingsphere.api.sharding.hint.HintShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.hint.HintShardingValue;

public class TableHintShardingAlgorithm implements HintShardingAlgorithm {

    @Override
    // availableTargetNames 表示可选择的表名，shardingValue为之前设置好的分表键值
    public Collection<String> doSharding(Collection availableTargetNames, HintShardingValue shardingValue) {
        return Collections.singletonList("tb_student_1");
    }

}
