package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum atp implements eff {
    CLIENT_UNDEFINED_ROUND(0),
    CLIENT_ADVERTISE_KEYS(1),
    CLIENT_SHARE_KEYS(2),
    CLIENT_MASKED_INPUT_COLLECTION(3),
    CLIENT_UNMASKING(4),
    CLIENT_PROTOCOL_COMPLETED(5),
    CLIENT_ABORTED(6);

    public final int h;

    atp(int i2) {
        this.h = i2;
    }

    public static atp b(int i2) {
        switch (i2) {
            case 0:
                return CLIENT_UNDEFINED_ROUND;
            case 1:
                return CLIENT_ADVERTISE_KEYS;
            case 2:
                return CLIENT_SHARE_KEYS;
            case 3:
                return CLIENT_MASKED_INPUT_COLLECTION;
            case 4:
                return CLIENT_UNMASKING;
            case 5:
                return CLIENT_PROTOCOL_COMPLETED;
            case 6:
                return CLIENT_ABORTED;
            default:
                return null;
        }
    }

    @Override // defpackage.eff
    public final int a() {
        return this.h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.h);
    }
}
