package com.guava.practice.cache;

import java.util.concurrent.TimeUnit;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

public class EmployeeGuavaCacheUtil {
	private static LoadingCache<Integer, Employee> empCache;
    static {
		empCache = CacheBuilder.newBuilder()
		       .maximumSize(100)
		       .expireAfterWrite(10, TimeUnit.SECONDS)
		       .build(
		           new CacheLoader<Integer, Employee>() {
						@Override
						public Employee load(Integer id) throws Exception {
							return getEmployeeById(id);
						}
		           }
		       );
    }
    public static LoadingCache<Integer, Employee> getLoadingCache() {
		System.out.println(empCache.asMap());
		return empCache;
    }
	public static Employee getEmployeeById(int id) {
		System.out.println("--Executing getEmployeeById--");
		//Perform any expensive or time consuming task like fetching data from Database.
		Employee emp1 = new Employee(1, "Ramesh");
		Employee emp2 = new Employee(2, "Mohan");
		if(id == 1 ) {
			return emp1;
		} else {
			return emp2;
		}
	}
}
