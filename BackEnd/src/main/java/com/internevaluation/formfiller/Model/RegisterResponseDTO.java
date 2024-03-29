package com.internevaluation.formfiller.Model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class RegisterResponseDTO {
    private User user;
    private String secretImageUri;

    public void setUser(User newUser) {
        this.user = newUser;
    }
}
