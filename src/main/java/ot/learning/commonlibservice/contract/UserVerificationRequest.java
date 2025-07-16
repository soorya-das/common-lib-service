package ot.learning.commonlibservice.contract;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import ot.learning.commonlibservice.constants.VerificationStatus;

import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserVerificationRequest {
    private UUID userId;
    private UUID employeeId;
    private VerificationStatus verificationStatus;
}
