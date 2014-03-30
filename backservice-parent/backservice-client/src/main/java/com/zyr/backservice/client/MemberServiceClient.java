package com.zyr.backservice.client;

import com.zyr.backservice.commons.entity.Member;
import com.zyr.backservice.commons.service.MemberService;
import com.zyr.backservice.commons.utils.Result;

/**
 * @author guangming.zhou
 * 创建时间: 2014-3-29 下午6:52:26
 */
public class MemberServiceClient implements MemberService {
	
	private MemberService memberService;

	public void setMemberService(MemberService memberService) {
		this.memberService = memberService;
	}

	public Result<Member> save(Member member) {
		return memberService.save(member);
	}

}
