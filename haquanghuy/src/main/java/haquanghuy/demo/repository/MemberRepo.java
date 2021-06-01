package haquanghuy.demo.repository;

import haquanghuy.demo.entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepo extends JpaRepository<MemberEntity, Integer> {
}
