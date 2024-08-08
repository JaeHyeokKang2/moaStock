package moastock.member.exception;

import lombok.Data;

@Data
public class ErrorResult {
    private String error;

    public ErrorResult(String bad) {
        this.error = bad;
    }
}
