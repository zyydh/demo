package com.alibaba.edas.springboot.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.alibaba.edas.springboot.domain.Member;
import com.alibaba.edas.springboot.service.MemberService;
import com.alibaba.edas.springboot.utils.MemberDTO;
import com.alibaba.edas.springboot.utils.PageDTO;
import com.alibaba.edas.springboot.utils.Result;

@Service
public class MemberServiceImpl implements MemberService {

	@Override
	public Result<Member> getMember(Long id) {
		Member m = new Member();
		m.setAddr("杭州");
		m.setId(id);
		m.setLevel(2);
		m.setName("Rita");
		System.out.println("模拟业务处理完毕，Member:" + m.toString());
		// 返回结果
		return new Result<Member>(m);
	}

	@Override
	public Result<PageDTO<MemberDTO>> getMembersByLevel(Integer level) {
		Result<PageDTO<MemberDTO>> ret = null;
		// 这里模拟查询数据库，实际简单构造一下
		try {
			MemberDTO dto1 = new MemberDTO(1l, "YAZHOU");
			MemberDTO dto2 = new MemberDTO(1l, "SHIBO");
			MemberDTO dto3 = new MemberDTO(1l, "CHENGJI");
			List<MemberDTO> list = new ArrayList<MemberDTO>();
			list.add(dto1);
			list.add(dto2);
			list.add(dto3);
			ret = new Result<PageDTO<MemberDTO>>(new PageDTO<>(2, 10, 1, list));
		} catch (Exception e) {
			// e.printStackTrace();
			ret = new Result<>("BZ-0001", e.getMessage());
		}

		return ret;
	}

}
