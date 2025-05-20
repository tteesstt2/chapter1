package hello.hello_spring.repository;

import hello.hello_spring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {

    Member sage(Member member);
    Optional<Member> findById(Long id);
    Optional<Member> fintByName(String name);
    List<Member> findAll();
}
