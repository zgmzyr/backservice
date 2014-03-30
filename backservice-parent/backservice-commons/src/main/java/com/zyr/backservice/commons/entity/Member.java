package com.zyr.backservice.commons.entity;

import java.io.Serializable;

/**
 * @author guangming.zhou 创建时间: 2014-3-29 下午6:29:32
 */
public class Member implements Serializable {

	private static final long serialVersionUID = -3885388392795496363L;

	private long id;
	private String name;
	private int age;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
