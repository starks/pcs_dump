package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fcb extends ess {
    public static final fvk e = new fvk();
    public final epg f;
    public final String g;
    public final fbh h;
    public final String i;
    public boolean j;
    public final evw k;
    private final elp l;
    private final fuu m;

    public fcb(epg epgVar, epc epcVar, fbu fbuVar, fcg fcgVar, fcr fcrVar, Object obj, int i, int i2, String str, String str2, fbh fbhVar, fbn fbnVar, elt eltVar) {
        super(new ffh(), fbhVar, fbnVar, epcVar, eltVar, false);
        this.m = new fuu(this, null);
        this.j = false;
        this.h = fbhVar;
        this.f = epgVar;
        this.i = str;
        this.g = str2;
        this.l = fcgVar.q;
        this.k = new evw(this, i, fbhVar, obj, fbuVar, fcrVar, fcgVar, i2, eltVar);
    }

    @Override // defpackage.etw
    public final elp B() {
        return this.l;
    }

    @Override // defpackage.ess, defpackage.esv
    protected final /* synthetic */ esu a() {
        return this.k;
    }

    @Override // defpackage.ess
    protected final /* synthetic */ esu r() {
        return this.k;
    }

    @Override // defpackage.ess
    protected final /* synthetic */ fuu s() {
        return this.m;
    }

    public final epf u() {
        return this.f.a;
    }
}
