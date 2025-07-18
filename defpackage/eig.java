package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum eig implements eff {
    UNDEFINED_CRYPTO_OPERATION(0),
    SHAMIR_SHARING(1),
    KEY_AGREEMENT(2),
    AES_ENCRYPTION(3),
    AES_DECRYPTION(4),
    PRG_EXPANSION(5);

    public final int g;

    eig(int i) {
        this.g = i;
    }

    public static eig b(int i) {
        if (i == 0) {
            return UNDEFINED_CRYPTO_OPERATION;
        }
        if (i == 1) {
            return SHAMIR_SHARING;
        }
        if (i == 2) {
            return KEY_AGREEMENT;
        }
        if (i == 3) {
            return AES_ENCRYPTION;
        }
        if (i == 4) {
            return AES_DECRYPTION;
        }
        if (i != 5) {
            return null;
        }
        return PRG_EXPANSION;
    }

    @Override // defpackage.eff
    public final int a() {
        return this.g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.g);
    }
}
