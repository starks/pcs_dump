package defpackage;

import android.net.Uri;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class bbk implements dis {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ bbk(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r10v31, types: [ciq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v50, types: [crp, java.lang.Object] */
    @Override // defpackage.dis
    public final djy a(Object obj) throws Throwable {
        djy djyVar;
        switch (this.b) {
            case 0:
                bbo bboVar = (bbo) obj;
                Optional optionalOf = bboVar.c() instanceof axu ? Optional.of(((axu) bboVar.c()).d) : Optional.empty();
                Object obj2 = this.a;
                String strD = bboVar.d();
                asr asrVar = (asr) bboVar.b().toBuilder();
                long epochMilli = api.b().toEpochMilli();
                if (!asrVar.a.isMutable()) {
                    asrVar.B();
                }
                bbq bbqVar = (bbq) obj2;
                bnz bnzVar = bbqVar.k;
                bbc bbcVar = (bbc) asrVar.a;
                bbcVar.b |= 4;
                bbcVar.e = epochMilli;
                optionalOf.ifPresent(new awp(asrVar, 6));
                djr djrVarQ = djr.q(bnzVar.e(strD, (bbc) asrVar.z()));
                byte[] bArr = null;
                return dij.i(dhq.j(djrVarQ, Exception.class, new aqf(obj2, bboVar, 4, bArr), bbqVar.d), new ayn(obj2, bboVar, 2, bArr), bbqVar.d);
            case 1:
                Object obj3 = this.a;
                HashSet hashSet = new HashSet(((arp) obj3).b);
                hashSet.addAll((Set) obj);
                Stream map = Collection.EL.stream(hashSet).map(new akn(obj3, 3));
                int i = cxc.d;
                return cnx.z((Iterable) map.collect(cvu.a));
            case 2:
                bcy bcyVar = (bcy) this.a;
                return dij.i(bcyVar.d.d("VM_CLIENT"), new avf(7), bcyVar.c);
            case 3:
                IOException iOException = (IOException) obj;
                bxh.a.j(iOException, "Failed to read from or write to disk");
                ((bxh) this.a).d.k(ccj.dg);
                throw iOException;
            case 4:
                int i2 = ((cfe) obj).a;
                if (i2 == 29501 || i2 == 29537 || i2 == 29538 || i2 == 29539 || i2 == 29540 || i2 == 29541 || i2 == 29542 || i2 == 29543 || i2 == 29544) {
                    cge cgeVar = (cge) this.a;
                    if (!cgeVar.f.d()) {
                        cgeVar.a();
                    }
                }
                return dju.a;
            case 5:
                return ((chc) this.a).c((chd) obj);
            case 6:
                return ((chc) this.a).c((chd) obj);
            case 7:
                return cnx.D((djy) ((chi) this.a).g.a());
            case 8:
                return this.a.c();
            case 9:
                cjd cjdVar = (cjd) this.a;
                cjdVar.c((Uri) cnx.H(cjdVar.b), obj);
                return dju.a;
            case 10:
                cjd cjdVar2 = (cjd) this.a;
                return cnx.C(cjdVar2.b((Uri) cnx.H(cjdVar2.b)));
            case 11:
                Uri uri = (Uri) obj;
                Uri uriM = clq.m(uri, ".bak");
                Object obj4 = this.a;
                try {
                    if (((cjd) obj4).g.i(uriM)) {
                        ((cjd) obj4).g.h(uriM, uri);
                    }
                    return dju.a;
                } catch (IOException e) {
                    return cnx.B(e);
                }
            case 12:
                Object obj5 = this.a;
                synchronized (((cjd) obj5).e) {
                    djyVar = ((cjd) obj5).f;
                }
                return djyVar;
            case 13:
                return cnx.C(this.a.a(obj));
            case 14:
                return ((cjg) this.a).b.c();
            case 15:
                return ((cjg) this.a).e.a();
            default:
                Object obj6 = this.a;
                ((IOException) obj6).addSuppressed((IOException) obj);
                throw ((Throwable) obj6);
        }
    }
}
