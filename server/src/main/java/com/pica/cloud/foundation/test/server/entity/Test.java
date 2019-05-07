// Copyright 2016-2101 Pica.
package com.pica.cloud.foundation.test.server.entity;


import org.apache.commons.collections.CollectionUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

/**
 * @ClassName Test
 * @Description TODO
 * @Author karl Kang
 * @Date 2018/12/6 19:43
 * @ModifyDate 2018/12/6 19:43
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for(int i = 0; i<=1000000; i++) {
            list1.add(i);
        }
        for(int i = 500000; i<=1500000; i++) {
            list2.add(i);
        }
        System.out.println("start: " + new Date());
        list2.removeAll(list1);
        System.out.println("end: " + new Date());
//        Collection intersection = CollectionUtils.intersection(list1, list2);
//        Collection disjunction = CollectionUtils.disjunction(list2, intersection);



    }
}
