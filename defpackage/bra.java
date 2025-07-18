package defpackage;

import googledata.experiments.mobile.gmscore.brella.ClientConfigToEndorsementOptionsMap;
import googledata.experiments.mobile.gmscore.brella.GmscoreBrella;
import googledata.experiments.mobile.gmscore.brella.TrainingProcessTimeout;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bra implements bpz {
    private static final csd a = csd.b(',').a();

    private static boolean a(String str, String str2) {
        if ("*".equals(str2)) {
            return true;
        }
        Iterator it = a.e(str2).iterator();
        if (str == null) {
            while (it.hasNext()) {
                if (it.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (str.equals(it.next())) {
                return true;
            }
        }
        return false;
    }

    static /* synthetic */ List bN() {
        return ela.a.a().S().b;
    }

    @Override // defpackage.bpz
    public final float A() {
        return (float) p(new bqy(8), elc.F);
    }

    @Override // defpackage.bpz
    public final int B() {
        return cnx.Q(r(new bqv(6), elc.e));
    }

    @Override // defpackage.bpz
    public final int C() {
        return cnx.Q(r(new bqu(1), ekw.b));
    }

    @Override // defpackage.bpz
    public final int D() {
        return cnx.Q(r(new bqx(10), ekw.e));
    }

    @Override // defpackage.bpz
    public final int E() {
        return (int) r(new bqz(16), elc.K);
    }

    @Override // defpackage.bpz
    public final int F() {
        return (int) r(new bqu(15), elc.N);
    }

    @Override // defpackage.bpz
    public final int G() {
        return (int) r(new bqx(6), elc.O);
    }

    @Override // defpackage.bpz
    public final int H() {
        return (int) r(new bqv(2), elc.P);
    }

    @Override // defpackage.bpz
    public final int I() {
        return (int) r(new bqv(7), elc.Q);
    }

    @Override // defpackage.bpz
    public final int J() {
        return (int) r(new bqu(9), elc.R);
    }

    @Override // defpackage.bpz
    public final int K() {
        return (int) r(new bqx(9), elc.ae);
    }

    @Override // defpackage.bpz
    public final int L() {
        return (int) r(new bqu(11), elc.av);
    }

    @Override // defpackage.bpz
    public final int M() {
        return (int) r(new bqu(10), elc.aN);
    }

    @Override // defpackage.bpz
    public final int N() {
        return (int) r(new bqw(10), elc.bh);
    }

    @Override // defpackage.bpz
    public final long O() {
        return r(new bqx(4), elc.i);
    }

    @Override // defpackage.bpz
    public final long P() {
        return r(new bqz(2), elc.n);
    }

    @Override // defpackage.bpz
    public final long Q() {
        return r(new bqu(0), elc.E);
    }

    @Override // defpackage.bpz
    public final long R() {
        return r(new bqw(2), elc.G);
    }

    @Override // defpackage.bpz
    public final long S() {
        return r(new bqx(14), elc.f);
    }

    @Override // defpackage.bpz
    public final long T() {
        return r(new bqu(3), elc.aa);
    }

    @Override // defpackage.bpz
    public final long U() {
        return r(new bqw(0), elc.aO);
    }

    @Override // defpackage.bpz
    public final long V() {
        return r(new bqw(15), elc.aP);
    }

    @Override // defpackage.bpz
    public final long W() {
        return r(new bqx(12), elc.aE);
    }

    @Override // defpackage.bpz
    public final long X() {
        return r(new bqx(18), elc.V);
    }

    @Override // defpackage.bpz
    public final long Y() {
        return r(new bqz(3), elc.X);
    }

    @Override // defpackage.bpz
    public final long Z() {
        return r(new bqx(0), elc.Y);
    }

    @Override // defpackage.bpz
    public final boolean aA() {
        return v(new bqz(13), elc.g);
    }

    @Override // defpackage.bpz
    public final boolean aB() {
        return v(new bqx(1), elc.h);
    }

    @Override // defpackage.bpz
    public final boolean aC() {
        return v(new bqx(8), ekw.c);
    }

    @Override // defpackage.bpz
    public final boolean aD() {
        return v(new bqw(4), elc.o);
    }

    @Override // defpackage.bpz
    public final boolean aE(String str) {
        return a(str, t(new bqu(7), elc.aL));
    }

    @Override // defpackage.bpz
    public final boolean aF(String str) {
        List listU = u(new bqz(10), elc.r);
        return listU.contains(str) || listU.contains("*");
    }

    @Override // defpackage.bpz
    public final boolean aG() {
        return v(new bqx(15), elc.s);
    }

    @Override // defpackage.bpz
    public final boolean aH(String str) {
        return a(str, t(new bqx(17), elc.t));
    }

    @Override // defpackage.bpz
    public final boolean aI() {
        return v(new bqw(6), elc.u);
    }

    @Override // defpackage.bpz
    public final boolean aJ() {
        return v(new bqx(16), elc.v);
    }

    @Override // defpackage.bpz
    public final boolean aK() {
        return v(new bqy(10), elc.w);
    }

    @Override // defpackage.bpz
    public final boolean aL(String str) {
        return a(str, t(new bqv(14), elc.T));
    }

    @Override // defpackage.bpz
    public final boolean aM() {
        return v(new bqv(16), elc.x);
    }

    @Override // defpackage.bpz
    public final boolean aN() {
        return v(new bqw(9), elc.y);
    }

    @Override // defpackage.bpz
    public final boolean aO() {
        return v(new bqz(6), elc.z);
    }

    @Override // defpackage.bpz
    public final boolean aP() {
        return v(new bqz(4), elc.A);
    }

    @Override // defpackage.bpz
    public final boolean aQ(String str) {
        return a(str, t(new bqz(12), elc.aQ));
    }

    @Override // defpackage.bpz
    public final boolean aR() {
        return v(new bqv(5), elc.B);
    }

    @Override // defpackage.bpz
    public final boolean aS() {
        return v(new bqw(19), elc.H);
    }

    @Override // defpackage.bpz
    public final boolean aT() {
        return v(new bqw(8), elc.aF);
    }

    @Override // defpackage.bpz
    public final boolean aU() {
        return v(new bqw(5), elc.J);
    }

    @Override // defpackage.bpz
    public final boolean aV() {
        return v(new bqv(0), elc.L);
    }

    @Override // defpackage.bpz
    public final boolean aW() {
        return v(new bqv(12), elc.S);
    }

    @Override // defpackage.bpz
    public final boolean aX() {
        return v(new bqy(3), elc.W);
    }

    @Override // defpackage.bpz
    public final boolean aY(String str) {
        return !a(str, t(new bqv(9), elc.U));
    }

    @Override // defpackage.bpz
    public final boolean aZ() {
        return v(new bqz(11), ekw.d);
    }

    @Override // defpackage.bpz
    public final long aa() {
        return r(new bqv(8), elc.ab);
    }

    @Override // defpackage.bpz
    public final long ab(String str) {
        Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(((TrainingProcessTimeout) s(TrainingProcessTimeout.a, new bqv(20), elc.aR)).b);
        return mapUnmodifiableMap.containsKey(str) ? ((Long) mapUnmodifiableMap.get(str)).longValue() : mapUnmodifiableMap.containsKey("*") ? ((Long) mapUnmodifiableMap.get("*")).longValue() : r(new bqw(1), elc.ac);
    }

    @Override // defpackage.bpz
    public final long ac() {
        return r(new bqz(5), elc.an);
    }

    @Override // defpackage.bpz
    public final long ad() {
        return r(new bqz(7), elc.ao);
    }

    @Override // defpackage.bpz
    public final long ae() {
        return r(new bqz(8), elc.ap);
    }

    @Override // defpackage.bpz
    public final long af() {
        return r(new bqu(17), elc.aq);
    }

    @Override // defpackage.bpz
    public final long ag() {
        return r(new bqu(14), elc.ar);
    }

    @Override // defpackage.bpz
    public final long ah() {
        return r(new bqv(3), elc.as);
    }

    @Override // defpackage.bpz
    public final long ai() {
        return r(new bqx(5), elc.at);
    }

    @Override // defpackage.bpz
    public final long aj() {
        return r(new bqw(20), elc.au);
    }

    @Override // defpackage.bpz
    public final long ak() {
        return r(new bqx(13), elc.aw);
    }

    @Override // defpackage.bpz
    public final long al() {
        return r(new bqz(0), elc.ax);
    }

    @Override // defpackage.bpz
    public final long am() {
        return r(new bqy(11), elc.aC);
    }

    @Override // defpackage.bpz
    public final long an() {
        return r(new bqy(20), elc.aD);
    }

    @Override // defpackage.bpz
    public final long ao() {
        return r(new bqv(13), elc.aJ);
    }

    @Override // defpackage.bpz
    public final long ap() {
        return r(new bqy(18), elc.aK);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.bpz
    public final dzn aq(String str) {
        if (!aF(str)) {
            return dzn.a;
        }
        ClientConfigToEndorsementOptionsMap clientConfigToEndorsementOptionsMap = (ClientConfigToEndorsementOptionsMap) s(ClientConfigToEndorsementOptionsMap.a, new bqu(16), elc.a);
        dzn dznVar = dzn.a;
        str.getClass();
        egd egdVar = clientConfigToEndorsementOptionsMap.b;
        return egdVar.containsKey(str) ? (dzn) egdVar.get(str) : dznVar;
    }

    @Override // defpackage.bpz
    public final edb ar() {
        return (edb) s(edb.a, new bqx(19), elc.m);
    }

    @Override // defpackage.bpz
    public final String as() {
        return t(new bqy(13), elc.q);
    }

    @Override // defpackage.bpz
    public final String at() {
        return "";
    }

    @Override // defpackage.bpz
    public final String au() {
        return t(new bqy(6), elc.M);
    }

    @Override // defpackage.bpz
    public final List av() {
        return u(new bqy(2), elc.j);
    }

    @Override // defpackage.bpz
    public final List aw() {
        return w(elc.C);
    }

    @Override // defpackage.bpz
    public final List ax() {
        csd csdVar = a;
        String strT = t(new bqv(11), ekw.a);
        strT.getClass();
        Iterator itF = csdVar.f(strT);
        ArrayList arrayList = new ArrayList();
        while (itF.hasNext()) {
            arrayList.add((String) itF.next());
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    @Override // defpackage.bpz
    public final boolean ay() {
        return v(new bqu(19), elc.b);
    }

    @Override // defpackage.bpz
    public final boolean az() {
        return v(new bqu(20), elc.d);
    }

    @Override // defpackage.bpz
    public final boolean bA() {
        return v(new bqx(7), elc.bb);
    }

    @Override // defpackage.bpz
    public final boolean bB() {
        return v(new bqx(11), elc.bc);
    }

    @Override // defpackage.bpz
    public final boolean bC() {
        return v(new bqv(1), elc.bd);
    }

    @Override // defpackage.bpz
    public final boolean bD() {
        return v(new bqu(2), elc.be);
    }

    @Override // defpackage.bpz
    public final boolean bE() {
        return v(new bqy(12), elc.bf);
    }

    @Override // defpackage.bpz
    public final boolean bF() {
        return v(new bqv(19), elc.bg);
    }

    @Override // defpackage.bpz
    public final boolean bG() {
        return v(new bqw(7), elc.bi);
    }

    @Override // defpackage.bpz
    public final boolean bH() {
        return false;
    }

    @Override // defpackage.bpz
    public final boolean ba() {
        return v(new bqu(8), ekw.f);
    }

    @Override // defpackage.bpz
    public final boolean bb() {
        return v(new bqz(15), ekw.i);
    }

    @Override // defpackage.bpz
    public final boolean bc() {
        return v(new bqx(20), elc.ad);
    }

    @Override // defpackage.bpz
    public final boolean bd(String str) {
        return a(str, t(new bqv(4), elc.af));
    }

    @Override // defpackage.bpz
    public final boolean be() {
        return v(new bqy(4), elc.ag);
    }

    @Override // defpackage.bpz
    public final boolean bf() {
        return v(new bqy(0), elc.ah);
    }

    @Override // defpackage.bpz
    public final boolean bg() {
        return v(new bqv(15), elc.ai);
    }

    @Override // defpackage.bpz
    public final boolean bh() {
        return v(new bqy(19), elc.aj);
    }

    @Override // defpackage.bpz
    public final boolean bi() {
        return v(new bqu(12), elc.ak);
    }

    @Override // defpackage.bpz
    public final boolean bj() {
        return v(new bqz(1), elc.al);
    }

    @Override // defpackage.bpz
    public final boolean bk() {
        return v(new bqy(5), ekw.h);
    }

    @Override // defpackage.bpz
    public final boolean bl() {
        return v(new bqz(14), elc.am);
    }

    @Override // defpackage.bpz
    public final boolean bm() {
        return v(new bqy(15), elc.ay);
    }

    @Override // defpackage.bpz
    public final boolean bn() {
        return v(new bqu(18), elc.az);
    }

    @Override // defpackage.bpz
    public final boolean bo() {
        return v(new bqu(5), elc.aA);
    }

    @Override // defpackage.bpz
    public final boolean bp() {
        return v(new bqv(10), elc.aB);
    }

    @Override // defpackage.bpz
    public final boolean bq() {
        return v(new bqy(14), ekz.a);
    }

    @Override // defpackage.bpz
    public final boolean br(String str) {
        return a(str, t(new bqu(13), elc.aG));
    }

    @Override // defpackage.bpz
    public final boolean bs() {
        return v(new bqv(17), elc.aH);
    }

    @Override // defpackage.bpz
    public final boolean bt() {
        return v(new bqu(6), elc.aI);
    }

    @Override // defpackage.bpz
    public final boolean bu(String str) {
        return a(str, t(new bqv(18), elc.aM));
    }

    @Override // defpackage.bpz
    public final boolean bv(String str) {
        return v(new bqz(9), elc.aS) || a(str, t(new bqz(17), elc.aT));
    }

    @Override // defpackage.bpz
    public final boolean bw(String str) {
        return v(new bqw(14), elc.aU) || a(str, t(new bqw(16), elc.aV));
    }

    @Override // defpackage.bpz
    public final boolean bx(String str) {
        return v(new bqw(17), elc.aW) || a(str, t(new bqw(18), elc.aX));
    }

    @Override // defpackage.bpz
    public final boolean by(String str) {
        return v(new bqy(16), elc.aY) || a(str, t(new bqy(17), elc.aZ));
    }

    @Override // defpackage.bpz
    public final boolean bz() {
        return v(new bqy(7), elc.ba);
    }

    @Override // defpackage.bpz
    public String f() {
        return (String) GmscoreBrella.a.a();
    }

    @Override // defpackage.bpz
    public boolean h() {
        return v(new bqu(4), elc.c);
    }

    @Override // defpackage.bpz
    public boolean n() {
        return v(new bqy(9), ekw.g);
    }

    @Override // defpackage.bpz
    public boolean o() {
        return v(new bqw(11), elc.p);
    }

    protected double p(tn tnVar, cgr cgrVar) {
        return ((Double) tnVar.a()).doubleValue();
    }

    @Override // defpackage.bpz
    public int q() {
        return cnx.Q(r(new bqw(13), elc.Z));
    }

    protected long r(tn tnVar, cgr cgrVar) {
        return ((Long) tnVar.a()).longValue();
    }

    protected egi s(egi egiVar, tn tnVar, cgr cgrVar) {
        return (egi) tnVar.a();
    }

    protected String t(tn tnVar, cgr cgrVar) {
        return (String) tnVar.a();
    }

    protected List u(tn tnVar, cgr cgrVar) {
        return (List) tnVar.a();
    }

    protected boolean v(tn tnVar, cgr cgrVar) {
        return ((Boolean) tnVar.a()).booleanValue();
    }

    protected List w(cgr cgrVar) {
        return bN();
    }

    @Override // defpackage.bpz
    public final double x() {
        return p(new bqw(3), elc.I);
    }

    @Override // defpackage.bpz
    public final double y(String str) {
        if (a(str, t(new bqx(2), ekw.j))) {
            return p(new bqx(3), ekw.k);
        }
        return 1.0d;
    }

    @Override // defpackage.bpz
    public final float z() {
        return (float) p(new bqw(12), elc.D);
    }

    @Override // defpackage.bpz
    public final void bI() {
    }

    @Override // defpackage.bpz
    public final void bJ() {
    }

    @Override // defpackage.bpz
    public final void bK() {
    }

    @Override // defpackage.bpz
    public final void bL() {
    }

    @Override // defpackage.bpz
    public final /* synthetic */ void bM() {
    }
}
