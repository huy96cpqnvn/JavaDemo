package haquanghuy.demo.service;

import haquanghuy.demo.entity.MemberEntity;
import haquanghuy.demo.repository.MemberRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {
    @Autowired
    MemberRepo memberRepo;

    @Override
    public MemberEntity addMember(MemberEntity memberEntity) {
        MemberEntity member = memberRepo.save(memberEntity);
        return member;
    }

    @Override
    public List<MemberEntity> getAllMember() {
        return memberRepo.findAll();
    }

    @Override
    public MemberEntity getMemberById(int id) {
        return memberRepo.findById(id).get();
    }

    @Override
    public MemberEntity editMember(MemberEntity memberEntity) {
        MemberEntity member = memberRepo.save(memberEntity);
        return member;
    }

    @Override
    public void deleteMember(int id) {
        memberRepo.deleteById(id);
    }
}
