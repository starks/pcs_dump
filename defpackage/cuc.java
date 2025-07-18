package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
enum cuc {
    STRONG,
    SOFT,
    WEAK;

    final cro a() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return crm.a;
        }
        if (iOrdinal == 1 || iOrdinal == 2) {
            return crn.a;
        }
        throw null;
    }
}
