package com.sa;

/**
 * 
 * <br> 學生管理系統 <br>
 */
public class Student {
	private String name;

	/**
	 * 
	 * @param Super方法
	 */
	public Student(String name) {
		super();
		this.name = name;
	}

	/**
	 * 
	 * @return 取得學生姓名
	 */
	public String getName() {
		return name;
	}

	/**
	 * 
	 * @param name 設定學生姓名
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	
	/**
	 * 
	 * @return 顯示學生姓名
	 */
	public String show()
	{
		return "名:"+name;
	}

}