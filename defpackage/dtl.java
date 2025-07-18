package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dtl {
    public static final drx a;
    public static final drx b;
    public static final drx c;
    public static final drx d;
    public static final exo e;
    public static final exo f;
    private static final dwt g;

    static {
        dwt dwtVarB = dsp.b("type.googleapis.com/google.crypto.tink.HmacKey");
        g = dwtVarB;
        eqh eqhVar = new eqh();
        eqhVar.b(dvn.RAW, dta.d);
        eqhVar.b(dvn.TINK, dta.a);
        eqhVar.b(dvn.LEGACY, dta.c);
        eqhVar.b(dvn.CRUNCHY, dta.b);
        e = eqhVar.n();
        eqh eqhVar2 = new eqh();
        eqhVar2.b(duq.SHA1, dsz.a);
        eqhVar2.b(duq.SHA224, dsz.b);
        eqhVar2.b(duq.SHA256, dsz.c);
        eqhVar2.b(duq.SHA384, dsz.d);
        eqhVar2.b(duq.SHA512, dsz.e);
        f = eqhVar2.n();
        int i = 13;
        a = new drx(dtb.class, dsg.class, new dnb(i));
        b = new drx(dwtVarB, dsg.class, new dnc(i));
        c = new drx(dsx.class, dsf.class, new dnd(16));
        d = new drx(dwtVarB, dsf.class, new dne(15));
    }

    public static dut a(dtb dtbVar) {
        asr asrVar = (asr) dut.a.createBuilder();
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        ((dut) asrVar.a).c = dtbVar.b;
        duq duqVar = (duq) f.d(dtbVar.d);
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        ((dut) asrVar.a).b = duqVar.a();
        return (dut) asrVar.z();
    }
}
