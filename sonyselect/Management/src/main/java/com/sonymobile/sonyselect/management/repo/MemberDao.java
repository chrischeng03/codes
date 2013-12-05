package com.sonymobile.sonyselect.management.repo;

import java.util.List;

import com.sonymobile.sonyselect.management.domain.Member;

public interface MemberDao
{
    public Member findById(Long id);

    public Member findByEmail(String email);

    public List<Member> findAllOrderedByName();

    public void register(Member member);
}
