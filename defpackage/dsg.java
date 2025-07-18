package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dsg implements dsk {
    public final dwt a;
    public final dve b;

    private dsg(dve dveVar, dwt dwtVar) {
        this.b = dveVar;
        this.a = dwtVar;
    }

    public static dsg a(dve dveVar) {
        return new dsg(dveVar, dsp.a(dveVar.b));
    }

    public static dsg b(dve dveVar) {
        return new dsg(dveVar, dsp.b(dveVar.b));
    }
}
