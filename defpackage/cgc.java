package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cgc implements bfz {
    public final fpv a;

    public cgc(fpv fpvVar) {
        this.a = fpvVar;
    }

    @Override // defpackage.bfz
    public final bfx a(bfx bfxVar) {
        if (bfxVar.a.c()) {
            return bfxVar;
        }
        fpv.h(bfxVar, new cfo(this, bfxVar, 2));
        fpv.h(bfxVar, new cfo(this, bfxVar, 3));
        return bfxVar;
    }
}
