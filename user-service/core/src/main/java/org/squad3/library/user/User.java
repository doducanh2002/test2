package org.squad3.library.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.squad3.library.shared.SelfValidating;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Objects;

@Data
@Builder
@AllArgsConstructor
public class User extends SelfValidating<User> implements Serializable {

    @NotNull
    @Min(0)
    private Integer id;

    @NotBlank
    private String name;

    @NotBlank
    @Length(max = 10)
    private String userCode;

    @Override
    public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof User)) return false;
            User user = (User)  o;
            return Objects.equals(getId(), user.getId());
        }

        @Override
        public int hashCode() {
            return 31;
        }
    }


