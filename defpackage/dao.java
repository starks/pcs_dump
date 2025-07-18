package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum dao {
    SMALL(10),
    MEDIUM(20),
    LARGE(50),
    FULL(-1),
    NONE(0);

    public final int f;

    dao(int i) {
        this.f = i;
    }
}
