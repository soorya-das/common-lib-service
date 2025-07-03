package ot.learning.commonlibservice.contract;

import lombok.Builder;
import lombok.Data;
import ot.learning.commonlibservice.constants.VerificationStatus;

import java.util.UUID;

@Data
@Builder
public class UserVerificationRequest {
    private UUID userId;
    private UUID employeeId;
    private VerificationStatus verificationStatus;
}
