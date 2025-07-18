package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum yv {
    DESTROYED,
    INITIALIZED,
    CREATED,
    STARTED,
    RESUMED;

    public final boolean a(yv yvVar) {
        yvVar.getClass();
        return compareTo(yvVar) >= 0;
    }
}
