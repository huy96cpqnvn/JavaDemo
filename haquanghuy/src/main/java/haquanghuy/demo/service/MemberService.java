package haquanghuy.demo.service;

import haquanghuy.demo.entity.MemberEntity;

import java.util.List;

public interface MemberService {
    MemberEntity addMember(MemberEntity memberEntity);
    List<MemberEntity> getAllMember();
    MemberEntity getMemberById(int id);
    MemberEntity editMember(MemberEntity memberEntity);
    void deleteMember(int id);
}
