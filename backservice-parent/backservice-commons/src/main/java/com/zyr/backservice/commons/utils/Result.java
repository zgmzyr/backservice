package com.zyr.backservice.commons.utils;

import java.io.Serializable;

/**
 * @author guangming.zhou
 * 创建时间: 2014-3-29 下午6:37:03
 */
public class Result<T> implements Serializable {

	private static final long serialVersionUID = -6587489866758747629L;

	private T model;

	private boolean isSuccess;

	public boolean isSuccess() {
		return isSuccess;
	}

	public void setSuccess(boolean isSuccess) {
		this.isSuccess = isSuccess;
	}

	public T getModel() {
		return model;
	}

	public void setModel(T model) {
		this.model = model;
	}

}
