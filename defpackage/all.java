package defpackage;

import android.content.Context;
import com.google.android.apps.miphone.astrea.networkusage.db.impl.NetworkUsageLogDatabase;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class all implements cel, ejj, ejm, ekc, eki {
    ekr A;
    ekr B;
    ekr C;
    ekr D;
    public ekr E;
    ekr F;
    ekr G;
    public ekr H;
    public ekr I;
    public ekr J;
    public ekr K;
    public ekr L;
    public ekr M;
    public ekr N;
    public ekr O;
    ekr P;
    ekr Q;
    ekr R;
    ekr S;
    ekr T;
    ekr U;
    ekr V;
    ekr W;
    ekr X;
    ekr Y;
    ekr Z;
    public final ekf a;
    ekr aa;
    ekr ab;
    ekr ac;
    ekr ad;
    ekr ae;
    ekr af;
    ekr ag;
    ekr ah;
    ekr ai;
    ekr aj;
    ekr ak;
    ekr al;
    ekr am;
    ekr an;
    public ekr ao;
    public ekr ap;
    private final all aq;
    public ekr b;
    ekr c;
    ekr d;
    public ekr e;
    public ekr f;
    ekr g;
    ekr h;
    public ekr i;
    ekr j;
    ekr k;
    ekr l;
    ekr m;
    ekr n;
    public ekr o;
    ekr p;
    ekr q;
    ekr r;
    ekr s;
    ekr t;
    ekr u;
    ekr v;
    ekr w;
    ekr x;
    public ekr y;
    ekr z;

    public all() {
    }

    public final aoa a() {
        aon aonVar = new aon(((fsc) this.e.b()).ae(aog.DEVICE_PERSONALIZATION_SERVICES, (Executor) this.f.b()));
        aof aofVar = aonVar.b;
        ((aok) aofVar).d.s(new aml(aonVar, 3));
        return aonVar;
    }

    public final aoa b() {
        return wh.j((fsc) this.e.b(), (Executor) this.f.b());
    }

    public final avm c() {
        return new avm((Context) this.a.a, (NetworkUsageLogDatabase) this.l.b(), (avs) this.o.b(), aso.H((fsc) this.e.b()), (Executor) this.k.b());
    }

    @Override // defpackage.ejj
    public final Set d() {
        return cyv.a;
    }

    @Override // defpackage.ekc
    public final ald e() {
        return new ald(this.aq);
    }

    @Override // defpackage.ejm
    public final ald g() {
        return new ald(this.aq);
    }

    /* JADX WARN: Type inference failed for: r1v64, types: [java.lang.Object, java.util.Map] */
    public all(ekf ekfVar) {
        this();
        this.aq = this;
        this.a = ekfVar;
        this.b = ekn.a(aqs.a);
        ekg ekgVar = new ekg(ekfVar);
        this.c = ekgVar;
        aol aolVar = new aol(ekgVar, 0);
        this.d = aolVar;
        this.e = ekn.a(aolVar);
        ekr ekrVarA = ekn.a(anr.a);
        this.f = ekrVarA;
        ekr ekrVarA2 = ekn.a(new ank(this.e, ekrVarA, 1));
        this.g = ekrVarA2;
        ekr ekrVarA3 = ekn.a(new aol(ekrVarA2, 1));
        this.h = ekrVarA3;
        this.i = ekn.a(new aol(ekrVarA3, 3));
        this.j = ekn.a(akv.a);
        ekr ekrVarA4 = ekn.a(ans.a);
        this.k = ekrVarA4;
        this.l = ekn.a(new avl(this.c, ekrVarA4));
        ekr ekrVar = ale.a;
        this.m = ekrVar;
        ekr ekrVar2 = this.c;
        avt avtVar = new avt(ekrVar2, ekrVar);
        this.n = avtVar;
        this.o = ekn.a(new ank(ekrVar2, avtVar, 2, null));
        aus ausVar = new aus(this.e);
        this.p = ausVar;
        avn avnVar = new avn(this.c, this.l, this.o, ausVar, this.k);
        this.q = avnVar;
        this.r = ekn.a(new aqx(this.b, this.i, this.j, avnVar, 0));
        this.s = new arg(this.e, this.f, 1);
        this.t = ekn.a(anm.a);
        ekr ekrVarA5 = ekn.a(aox.a);
        this.u = ekrVarA5;
        ekr ekrVarA6 = ekn.a(new asy(this.t, this.q, ekrVarA5, this.i, this.s, this.c, 1, (byte[]) null));
        this.v = ekrVarA6;
        this.w = ekn.a(new aqx(this.s, ekrVarA6, this.t, this.u, 1, (byte[]) null));
        this.x = new alc(this.b, 1, null);
        ekr ekrVarA7 = ekn.a(ano.a);
        this.y = ekrVarA7;
        ekr ekrVar3 = this.x;
        ekr ekrVar4 = this.c;
        this.z = new aqn(ekrVar3, ekrVar4, ekrVarA7);
        ekr ekrVar5 = this.s;
        ann annVar = aos.a;
        this.A = new ank(ekrVar5, annVar, 0);
        arg argVar = new arg(this.e, this.f, 0);
        this.B = argVar;
        this.C = new asc((ekr) argVar, (ekr) annVar, ekrVar4, 1, (byte[]) null);
        eko ekoVar = ekt.a;
        eks eksVar = new eks(2);
        eksVar.b(this.A);
        eksVar.b(this.C);
        ekt ektVarA = eksVar.a();
        this.D = ektVarA;
        this.E = ekn.a(new bbv(this.z, ektVarA, this.y, this.c, this.i, 1, (byte[]) null));
        this.F = new arg(this.e, this.f, 3);
        asy asyVar = new asy(ata.a, this.q, this.k, this.i, this.F, aos.a, 2, (char[]) null);
        this.G = asyVar;
        this.H = ekn.a(asyVar);
        this.I = ekn.a(new aol(avk.a, 4));
        this.J = ekn.a(anq.a);
        ekr ekrVarA8 = ekn.a(anp.a);
        this.K = ekrVarA8;
        this.L = ekn.a(new aqx(ekrVarA8, this.c, this.i, this.j, 2, (char[]) null));
        this.M = ekn.a(new aqx(this.K, this.c, this.i, this.j, 3, (char[]) null));
        this.N = ekn.a(new aol(this.c, 8));
        this.O = ekn.a(new aol(this.c, 2));
        int i = 5;
        eks eksVar2 = new eks(i);
        eksVar2.b(atb.a);
        eksVar2.b(bdl.a);
        eksVar2.b(bbw.a);
        eksVar2.b(bfs.a);
        eksVar2.b(arx.a);
        this.P = eksVar2.a();
        ekr ekrVar6 = ale.a;
        this.Q = ekrVar6;
        this.R = new aqx(this.z, ekrVar6, this.b, this.y, 4, (int[]) null);
        this.S = new arg(this.e, this.f, 2);
        this.T = new asy(ata.a, this.k, this.q, this.S, this.i, aos.a, 0);
        this.U = ekn.a(ant.a);
        this.V = new bbv(bdk.a, this.U, this.q, this.i, aos.a, 2, (char[]) null);
        this.W = ekn.a(new ank(this.e, this.f, 3));
        this.X = ekn.a(ayq.a);
        ekr ekrVarA9 = ekn.a(anu.a);
        this.Y = ekrVarA9;
        this.Z = ekn.a(new ank(this.c, ekrVarA9, 4, null));
        ekr ekrVarA10 = ekn.a(ban.a);
        this.aa = ekrVarA10;
        this.ab = ekn.a(new aol(ekrVarA10, 6));
        this.ac = ekn.a(new aol(this.q, 7));
        int i2 = ekq.b;
        fsc fscVar = new fsc((byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null);
        fscVar.r(axi.PLAY_PROTECT_SERVICE, bah.a);
        fscVar.r(axi.PLAY_PROTECT_SERVICE_CORE_DEFAULT, bai.a);
        fscVar.r(axi.PLAY_PROTECT_SERVICE_PVM_DEFAULT, baj.a);
        fscVar.r(axi.AI_CORE_TEXT_INPUT, baf.a);
        fscVar.r(axi.AI_CORE_TEXT_OUTPUT, bag.a);
        fscVar.r(axi.AI_CORE_IMAGE_INPUT, bab.a);
        fscVar.r(axi.AI_CORE_IMAGE_OUTPUT, bac.a);
        fscVar.r(axi.AI_CORE_MESSAGES_TEXT, bad.a);
        fscVar.r(axi.AI_CORE_CHROME_SUMMARIZATION_OUTPUT, ayv.a);
        fscVar.r(axi.AI_CORE_CLIENT_12, ayw.a);
        fscVar.r(axi.AI_CORE_CLIENT_13, ayx.a);
        fscVar.r(axi.AI_CORE_CLIENT_14, ayy.a);
        fscVar.r(axi.AI_CORE_CLIENT_15, aza.a);
        fscVar.r(axi.AI_CORE_PROTECTED_DOWNLOAD, bae.a);
        fscVar.r(axi.AI_CORE_CLIENT_16, azb.a);
        fscVar.r(axi.AI_CORE_CLIENT_17, azc.a);
        fscVar.r(axi.AI_CORE_CLIENT_18, azd.a);
        fscVar.r(axi.AI_CORE_CLIENT_19, aze.a);
        fscVar.r(axi.AI_CORE_CLIENT_20, azf.a);
        fscVar.r(axi.AI_CORE_CLIENT_21, azg.a);
        fscVar.r(axi.AI_CORE_CLIENT_22, azh.a);
        fscVar.r(axi.AI_CORE_CLIENT_23, azi.a);
        fscVar.r(axi.AI_CORE_CLIENT_24, azj.a);
        fscVar.r(axi.AI_CORE_CLIENT_25, azk.a);
        fscVar.r(axi.AI_CORE_CLIENT_26, azl.a);
        fscVar.r(axi.AI_CORE_CLIENT_27, azm.a);
        fscVar.r(axi.AI_CORE_CLIENT_28, azn.a);
        fscVar.r(axi.AI_CORE_CLIENT_29, azo.a);
        fscVar.r(axi.AI_CORE_CLIENT_30, azp.a);
        fscVar.r(axi.AI_CORE_CLIENT_31, azq.a);
        fscVar.r(axi.AI_CORE_CLIENT_32, azr.a);
        fscVar.r(axi.AI_CORE_CLIENT_33, azs.a);
        fscVar.r(axi.AI_CORE_CLIENT_34, azt.a);
        fscVar.r(axi.AI_CORE_CLIENT_35, azu.a);
        fscVar.r(axi.AI_CORE_CLIENT_36, azw.a);
        fscVar.r(axi.AI_CORE_CLIENT_37, azx.a);
        fscVar.r(axi.AI_CORE_CLIENT_38, azy.a);
        fscVar.r(axi.AI_CORE_CLIENT_39, azz.a);
        fscVar.r(axi.AI_CORE_CLIENT_40, baa.a);
        ekq ekqVar = new ekq(fscVar.a);
        this.ad = ekqVar;
        this.ae = ekn.a(new aol(ekqVar, 5));
        ekr ekrVarA11 = ekn.a(new asc(this.e, this.f, this.ad, 2, (char[]) null));
        this.af = ekrVarA11;
        this.ag = ekn.a(new asc(this.c, this.ae, ekrVarA11, 3, (short[]) null));
        ekr ekrVarA12 = ekn.a(new aqx(aos.a, this.W, this.v, this.t, 5, (boolean[]) null));
        this.ah = ekrVarA12;
        this.ai = ekn.a(new bbr(this.X, this.Y, this.k, this.u, this.Z, this.ab, this.ac, this.ag, ekrVarA12));
        ekr ekrVarA13 = ekn.a(anv.a);
        this.aj = ekrVarA13;
        ekr ekrVarA14 = ekn.a(new aqx(this.W, this.Z, ekrVarA13, this.c, 6, (float[]) null));
        this.ak = ekrVarA14;
        alc alcVar = new alc(ekrVarA14, 0);
        this.al = alcVar;
        this.am = ekn.a(new bbv(this.W, this.ai, alcVar, this.Y, aos.a, 0));
        eks eksVar3 = new eks(i);
        eksVar3.b(this.R);
        eksVar3.b(this.T);
        eksVar3.b(this.V);
        eksVar3.b(this.am);
        eksVar3.b(this.H);
        this.an = eksVar3.a();
        this.ao = ekn.a(new asc(this.P, ekt.a, this.an, 0));
        this.ap = ekn.a(ase.a);
    }

    @Override // defpackage.cel
    public final void f() {
    }
}
