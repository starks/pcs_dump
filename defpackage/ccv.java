package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ccv implements Runnable {
    public final /* synthetic */ ccw a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ String f;
    public final /* synthetic */ long g;

    public /* synthetic */ ccv(ccw ccwVar, int i, int i2, int i3, int i4, String str, long j) {
        this.a = ccwVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = str;
        this.g = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dyw dywVarB = dyw.b(this.b);
        dywVarB.getClass();
        int iA = dfs.a(this.c);
        if (iA == 0) {
            throw null;
        }
        ccw ccwVar = this.a;
        dfv dfvVar = ccwVar.c.d;
        if (dfvVar == null) {
            dfvVar = dfv.a;
        }
        asr asrVar = (asr) dfvVar.toBuilder();
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        int i = this.d;
        dfv dfvVar2 = (dfv) asrVar.a;
        dfvVar2.b |= 32;
        dfvVar2.h = i;
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        int i2 = this.e;
        dfv dfvVar3 = (dfv) asrVar.a;
        dfvVar3.b |= 64;
        dfvVar3.i = i2;
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        String str = this.f;
        dfv dfvVar4 = (dfv) asrVar.a;
        dfvVar4.r = iA - 1;
        dfvVar4.b |= 262144;
        if (str != null) {
            if (!asrVar.a.isMutable()) {
                asrVar.B();
            }
            dfv dfvVar5 = (dfv) asrVar.a;
            dfvVar5.b |= 4096;
            dfvVar5.m = str;
        }
        asr asrVar2 = (asr) ccwVar.c.toBuilder();
        if (!asrVar2.a.isMutable()) {
            asrVar2.B();
        }
        long j = this.g;
        dfa dfaVar = (dfa) asrVar2.a;
        dfv dfvVar6 = (dfv) asrVar.z();
        dfvVar6.getClass();
        dfaVar.d = dfvVar6;
        dfaVar.b |= 4;
        ccwVar.a.g(dywVarB, (dfa) asrVar2.z(), j);
    }
}
