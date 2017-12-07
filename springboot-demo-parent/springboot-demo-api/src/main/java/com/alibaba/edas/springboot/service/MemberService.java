package com.alibaba.edas.springboot.service;

import com.alibaba.edas.springboot.domain.Member;
import com.alibaba.edas.springboot.utils.MemberDTO;
import com.alibaba.edas.springboot.utils.PageDTO;
import com.alibaba.edas.springboot.utils.Result;

public interface MemberService {

	/**
	 * 通过ID获取用户信息
	 * @param id 会员ID
 	 * @return 会员所有信息
	 */
	public Result<Member> getMember(Long id);
	
	/**
	 * 通过会员级别获取所有该级别下的会员信息（ID，姓名，其他不需要）
	 * @param level
	 * @return
	 */
	public Result<PageDTO<MemberDTO>> getMembersByLevel(Integer level);
}
