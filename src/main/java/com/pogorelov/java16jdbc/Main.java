package com.pogorelov.java16jdbc;

import com.pogorelov.java16jdbc.domain.Department;
import com.pogorelov.java16jdbc.service.ServiceFactory;
import net.sf.ehcache.CacheManager;
import org.hibernate.annotations.Cache;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    private static final ServiceFactory serviceFactory = new ServiceFactory();

    public static void main(String[] args) {
//        Department department = serviceFactory.getDepartmentService().findDepartmentById(1L);
//        int size = CacheManager.ALL_CACHE_MANAGERS.get(0).getCache("com.pogorelov.java16jdbc.domain.Department").getSize();
//        System.out.println(department);
//        department = serviceFactory.getDepartmentService().findDepartmentById(1L);
//        System.out.println(department);
//        System.out.println(size);

    }
}
