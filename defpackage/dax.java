package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum dax {
    GENERAL(true),
    BOOLEAN(false),
    CHARACTER(false),
    INTEGRAL(false),
    FLOAT(true);

    public final boolean f;

    dax(boolean z) {
        this.f = z;
    }
}
