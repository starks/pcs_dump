package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bko {
    public final bkl a;
    public final bhq[] b;
    public final boolean c;
    final /* synthetic */ bkq d;

    protected bko(bkl bklVar, bhq[] bhqVarArr, boolean z) {
        this.a = bklVar;
        this.b = bhqVarArr;
        this.c = z;
    }

    public final bkk a() {
        return this.a.c;
    }

    protected final void b(bir birVar, brb brbVar) {
        this.d.a.a(birVar, brbVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public bko(bkq bkqVar, bkl bklVar, bhq[] bhqVarArr, boolean z) {
        this(bklVar, bhqVarArr, z);
        this.d = bkqVar;
    }
}
