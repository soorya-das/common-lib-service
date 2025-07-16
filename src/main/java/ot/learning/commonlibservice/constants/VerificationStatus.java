package ot.learning.commonlibservice.constants;

public enum VerificationStatus {
    INITIATED(1),
    VERIFIED(2),
    REJECTED(3),
    PENDING(4);

    private final Integer id;

    public static VerificationStatus fromId(Integer id) {
        for (VerificationStatus type : values()) {
            if (type.getId().equals(id)) {
                return type;
            }
        }

        return null;
    }

    private VerificationStatus(int value) {
        this.id = value;
    }

    public int getValue() {
        return this.id;
    }

    public Integer getId() {
        return this.id;
    }

    private VerificationStatus(final Integer id) {
        this.id = id;
    }
}
