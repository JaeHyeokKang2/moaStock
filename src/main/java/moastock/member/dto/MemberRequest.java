package moastock.member.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import moastock.member.domain.Member;
import org.hibernate.validator.constraints.Range;

@Getter
@Setter
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@NoArgsConstructor
public class MemberRequest {
    @NotBlank(message = "이름은 필수 입력입니다.")
    private String name;
    @NotBlank(message = "이메일 형식이 올바르지 않습니다.")
    private String email;
    @NotBlank
    @Range(min = 8, max = 16, message = "8 ~ 16사이로 입력해주세요")
    private String password;
    @NotBlank
    private String nickName;

    public Member toMember(){
        return Member.builder()
                .Name(name)
                .password(password)
                .nickName(nickName)
                .email(email)
                .build();
    }
}
