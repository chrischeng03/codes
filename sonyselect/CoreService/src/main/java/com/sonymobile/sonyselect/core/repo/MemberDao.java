package com.sonymobile.sonyselect.core.repo;

import java.util.List;

import com.sonymobile.sonyselect.core.domain.Member;

public interface MemberDao
{
    public Member findById(Long id);

    public Member findByEmail(String email);

    public List<Member> findAllOrderedByName();

    public void register(Member member);
}
