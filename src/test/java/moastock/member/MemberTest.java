package moastock.member;


import lombok.RequiredArgsConstructor;
import moastock.member.domain.Member;
import moastock.member.domain.MemberJpaRepository;
import moastock.member.dto.MemberRequest;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class MemberTest {

    private final MemberJpaRepository memberJpaRepository;

    @Test
    @DisplayName("회원가입 테스트")
    void joinTest() throws Exception {
        //given
        MemberRequest member = new MemberRequest("강재혁", "rkdwogur@naver.com", "1234", "rkdwogur");
        Member joinMember = member.toMember();
        //when
        memberJpaRepository.save(joinMember);
        //then
        Optional<Member> findMember = Optional.of(memberJpaRepository.findById(1L).get());
        Assertions.assertThat(joinMember.getEmail().equals(findMember.get().getEmail()));
    }

}
