package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bjj extends UnsupportedOperationException {
    private final bhq a;

    public bjj(bhq bhqVar) {
        this.a = bhqVar;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Missing ".concat(String.valueOf(String.valueOf(this.a)));
    }
}
