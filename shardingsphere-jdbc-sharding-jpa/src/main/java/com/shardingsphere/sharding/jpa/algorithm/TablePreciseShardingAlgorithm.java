package com.shardingsphere.sharding.jpa.algorithm;

import java.util.Collection;

import org.apache.shardingsphere.api.sharding.standard.PreciseShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;

public class TablePreciseShardingAlgorithm implements PreciseShardingAlgorithm<Integer> {

    @Override
    public String doSharding(Collection<String> availableTargetNames, PreciseShardingValue<Integer> shardingValue) {
        /*
           在路由到对应数据库的基础上
           奇数id 1、3、5 -> db1
           偶数id 2、4、6 -> db2
           再做一次表路由
           奇数先加1后除以2 -> 1、2、3，其中奇数对应db1
           偶数直接除以2 -> 1、2、3，其中偶数对应db2
         */
        int value = shardingValue.getValue();
        value = (value & 1) == 1 ? (value + 1)/2 : value/2;
        return "tb_student_" + (2 - value % 2);
    }

}
