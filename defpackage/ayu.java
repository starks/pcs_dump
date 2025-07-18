package defpackage;

import j$.util.Collection;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ayu {
    public static final cwr a;
    public static final cwr b;
    public final cxg c;
    private final cxg d;

    static {
        axm axmVar = axm.UNKNOWN;
        axm axmVar2 = axm.ULTRA_LOW;
        axm axmVar3 = axm.LOW;
        axm axmVar4 = axm.MID;
        axm axmVar5 = axm.HIGH;
        axm axmVar6 = axm.ULTRA;
        dcr.M(axmVar, "");
        dcr.M(axmVar2, "Ultra Low");
        dcr.M(axmVar3, "Low");
        dcr.M(axmVar4, "Mid");
        dcr.M(axmVar5, "High");
        dcr.M(axmVar6, "Ultra");
        a = new cyo(new Object[]{axmVar, "", axmVar2, "Ultra Low", axmVar3, "Low", axmVar4, "Mid", axmVar5, "High", axmVar6, "Ultra"}, 6);
        axj axjVar = axj.ALL;
        axj axjVar2 = axj.BETA;
        axj axjVar3 = axj.ALPHA;
        axj axjVar4 = axj.THIRD_PARTY_EAP;
        axj axjVar5 = axj.THIRD_PARTY_EXPERIMENTAL;
        dcr.M(axjVar, "all");
        dcr.M(axjVar2, "beta");
        dcr.M(axjVar3, "alpha");
        dcr.M(axjVar4, "third_party_eap");
        dcr.M(axjVar5, "third_party_experimental");
        b = new cyo(new Object[]{axjVar, "all", axjVar2, "beta", axjVar3, "alpha", axjVar4, "third_party_eap", axjVar5, "third_party_experimental"}, 5);
    }

    public ayu(cxg cxgVar) {
        this.c = cxgVar;
        cxg cxgVar2 = (cxg) Collection.EL.stream(cxgVar.entrySet()).collect(cvu.a(new alg(16), new alg(17)));
        this.d = cxgVar2;
        clq.w(cxgVar.size() == cxgVar2.size(), "All ClientIds should be unique.");
    }
}
