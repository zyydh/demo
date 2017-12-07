package com.alibaba.edas.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.edas.springboot.domain.Member;
import com.alibaba.edas.springboot.service.MemberService;
import com.alibaba.edas.springboot.utils.MemberDTO;
import com.alibaba.edas.springboot.utils.PageDTO;
import com.alibaba.edas.springboot.utils.Result;

@RestController
@RequestMapping("/member")
public class MemberController {

	@Autowired
	private MemberService memberService;

	@RequestMapping(method = RequestMethod.GET, path = "/id/{id}")
	public Result<Member> getMembers(@PathVariable("id") long id) {
		System.out.println("start query member info by id");
		return memberService.getMember(id);
	}

	@RequestMapping(method = RequestMethod.GET, path = "/level/{level}")
	public Result<PageDTO<MemberDTO>> getMembersByLevel(@PathVariable("level") Integer level) {
		System.out.println("start query member info by level.");
		return memberService.getMembersByLevel(level);
	}
}
