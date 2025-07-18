package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum eii implements eff {
    CLIENT_UNDEFINED_EVENT(0),
    CLIENT_STARTED(1),
    CLIENT_COMPLETED(2),
    CLIENT_ROUND_STARTED(3),
    CLIENT_ROUND_COMPLETED(4),
    CLIENT_CRYPTO_STARTED(5),
    CLIENT_CRYPTO_COMPLETED(6),
    CLIENT_INPUT_SET(7),
    CLIENT_ERROR(8),
    CLIENT_CRYPTO_ERROR(9);

    public final int k;

    eii(int i) {
        this.k = i;
    }

    public static eii b(int i) {
        switch (i) {
            case 0:
                return CLIENT_UNDEFINED_EVENT;
            case 1:
                return CLIENT_STARTED;
            case 2:
                return CLIENT_COMPLETED;
            case 3:
                return CLIENT_ROUND_STARTED;
            case 4:
                return CLIENT_ROUND_COMPLETED;
            case 5:
                return CLIENT_CRYPTO_STARTED;
            case 6:
                return CLIENT_CRYPTO_COMPLETED;
            case 7:
                return CLIENT_INPUT_SET;
            case 8:
                return CLIENT_ERROR;
            case 9:
                return CLIENT_CRYPTO_ERROR;
            default:
                return null;
        }
    }

    @Override // defpackage.eff
    public final int a() {
        return this.k;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.k);
    }
}
