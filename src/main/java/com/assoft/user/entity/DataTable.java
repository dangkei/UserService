/**
 * 
 */
package com.assoft.user.entity;

/**
 * @author Administrator
 * 返回layui table 数据结构
 */
public class DataTable {
	
	int code;
	String msg;
	int count;
	Object[] data;

	/**
	 * 
	 */
	public DataTable() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the code
	 */
	public int getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(int code) {
		this.code = code;
	}

	/**
	 * @return the msg
	 */
	public String getMsg() {
		return msg;
	}

	/**
	 * @param msg the msg to set
	 */
	public void setMsg(String msg) {
		this.msg = msg;
	}

	/**
	 * @return the count
	 */
	public int getCount() {
		return count;
	}

	/**
	 * @param count the count to set
	 */
	public void setCount(int count) {
		this.count = count;
	}

	/**
	 * @return the data
	 */
	public Object[] getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(Object[] data) {
		this.data = data;
	}

	
	
}
