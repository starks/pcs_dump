package j$.nio.file;

/* loaded from: classes2.dex */
final class G implements K {
    private final String a;
    private final Class b;

    G(Class cls, String str) {
        this.a = str;
        this.b = cls;
    }

    @Override // j$.nio.file.K
    public final String name() {
        return this.a;
    }

    public final String toString() {
        return this.a;
    }

    @Override // j$.nio.file.K
    public final Class type() {
        return this.b;
    }
}
