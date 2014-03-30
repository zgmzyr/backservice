package com.zyr.backservice.commons.service;

import com.zyr.backservice.commons.entity.Member;
import com.zyr.backservice.commons.utils.Result;

/**
 * @author guangming.zhou
 * 创建时间: 2014-3-29 下午6:34:56
 */
public interface MemberService {

	public Result<Member> save(Member member);
}
