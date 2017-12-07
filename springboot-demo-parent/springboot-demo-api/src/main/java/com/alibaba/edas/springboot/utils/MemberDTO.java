package com.alibaba.edas.springboot.utils;

/**
 * 数据转换对象
 * 
 * @author Jason
 *
 */
public class MemberDTO {

	private Long id;
	private String name;

	public MemberDTO(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "MemberDTO [id=" + id + ", name=" + name + "]";
	}

}
