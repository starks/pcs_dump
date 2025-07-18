package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
final class dee implements def {
    public static final dee a;
    private static final /* synthetic */ dee[] b;

    static {
        dee deeVar = new dee();
        a = deeVar;
        b = new dee[]{deeVar};
    }

    private dee() {
    }

    public static dee[] values() {
        return (dee[]) b.clone();
    }

    @Override // defpackage.def
    public final /* synthetic */ long a(byte[] bArr, int i) {
        if (ordinal() != 0) {
            throw null;
        }
        byte b2 = bArr[i + 7];
        return ((bArr[i + 6] & 255) << 48) | ((b2 & 255) << 56) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
    }
}
