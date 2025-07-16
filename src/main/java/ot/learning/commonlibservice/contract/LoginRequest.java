package ot.learning.commonlibservice.contract;

import lombok.*;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginRequest {

    private UUID id;
    private String userName;
    private String password;
    private String role;
}
