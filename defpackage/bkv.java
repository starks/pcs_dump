package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bkv {
    public final bhq[] a;
    public final boolean b;
    final /* synthetic */ bku c;

    protected bkv(bhq[] bhqVarArr, boolean z) {
        this.a = bhqVarArr;
        boolean z2 = false;
        if (bhqVarArr != null && z) {
            z2 = true;
        }
        this.b = z2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public bkv(bku bkuVar, bhq[] bhqVarArr, boolean z) {
        this(bhqVarArr, z);
        this.c = bkuVar;
    }
}
