package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Future;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bgr {
    public final int c;
    public final ReentrantReadWriteLock d;
    public final bga e;
    public boolean f;
    public volatile int g;
    public volatile Future h;
    public long i;
    public final Map j;
    public bgm k;
    public final LinkedHashSet l;
    private final String o;
    private volatile bgo p;
    private final bnc q;
    public static final bgk m = new bgk(1);
    private static final Charset n = Charset.forName("UTF-8");
    public static final bgm a = new bgm();
    public static final bgm b = new bgm();

    public bgr(bga bgaVar, String str, int i, bnc bncVar) {
        this.d = new ReentrantReadWriteLock();
        this.j = new TreeMap();
        this.k = a;
        this.l = new LinkedHashSet();
        this.p = null;
        this.e = bgaVar;
        aso.F("BRELLA_COUNTERS");
        this.o = "BRELLA_COUNTERS";
        aso.y(i > 0);
        this.c = i;
        aso.F(bncVar);
        this.q = bncVar;
        this.i = bncVar.a();
    }

    public static long a(String str) throws NoSuchAlgorithmException {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes(n));
            return ByteBuffer.wrap(messageDigest.digest()).getLong();
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() throws NoSuchAlgorithmException {
        this.d.writeLock().lock();
        try {
            bgr bgrVar = new bgr(this);
            this.d.writeLock().unlock();
            int size = bgrVar.l.size();
            bfx[] bfxVarArr = new bfx[size];
            Iterator it = bgrVar.l.iterator();
            int i = 0;
            while (it.hasNext()) {
                bgm bgmVar = (bgm) it.next();
                bga bgaVar = bgrVar.e;
                aso.F(bgmVar);
                bkx bkxVar = new bkx(bgrVar, bgmVar);
                ArrayList arrayList = new ArrayList(((bgr) bkxVar.b).j.size());
                for (bgh bghVar : ((bgr) bkxVar.b).j.values()) {
                    if (bghVar.c.containsKey(bkxVar.a)) {
                        arrayList.add(bghVar);
                    }
                }
                asr asrVar = (asr) ejd.a.createBuilder();
                long j = ((bgr) bkxVar.b).i;
                if (!asrVar.a.isMutable()) {
                    asrVar.B();
                }
                ejd ejdVar = (ejd) asrVar.a;
                int i2 = 1;
                ejdVar.b |= 1;
                ejdVar.c = j;
                aso.C(!b.equals(bkxVar.a));
                if (!a.equals(bkxVar.a)) {
                    egi egiVar = ((bgm) bkxVar.a).a;
                    aso.F(egiVar);
                    eea byteString = egiVar.toByteString();
                    if (!asrVar.a.isMutable()) {
                        asrVar.B();
                    }
                    ejd ejdVar2 = (ejd) asrVar.a;
                    ejdVar2.b |= 4;
                    ejdVar2.e = byteString;
                }
                int size2 = arrayList.size();
                int i3 = 0;
                while (i3 < size2) {
                    bgh bghVar2 = (bgh) arrayList.get(i3);
                    nz nzVar = (nz) bghVar2.c.get(bkxVar.a);
                    aso.F(nzVar);
                    asr asrVar2 = (asr) ejc.a.createBuilder();
                    long jA = a(bghVar2.a);
                    if (!asrVar2.a.isMutable()) {
                        asrVar2.B();
                    }
                    ejc ejcVar = (ejc) asrVar2.a;
                    ejcVar.b = i2;
                    int i4 = i2;
                    ejcVar.c = Long.valueOf(jA);
                    ArrayList arrayList2 = new ArrayList(nzVar.a());
                    int i5 = 0;
                    bfx[] bfxVarArr2 = bfxVarArr;
                    while (i5 < nzVar.a()) {
                        asr asrVar3 = (asr) ejb.a.createBuilder();
                        bkx bkxVar2 = bkxVar;
                        ArrayList arrayList3 = arrayList;
                        long j2 = ((long[]) nzVar.d(i5))[0];
                        Iterator it2 = it;
                        if (!asrVar3.a.isMutable()) {
                            asrVar3.B();
                        }
                        ejb ejbVar = (ejb) asrVar3.a;
                        int i6 = i;
                        ejbVar.b |= 2;
                        ejbVar.d = j2;
                        long jB = nzVar.b(i5);
                        if (bghVar2 instanceof bgl) {
                            aso.C(jB == 0 ? i4 : 0);
                        } else {
                            if (!asrVar3.a.isMutable()) {
                                asrVar3.B();
                            }
                            ejb ejbVar2 = (ejb) asrVar3.a;
                            ejbVar2.b |= 1;
                            ejbVar2.c = jB;
                        }
                        arrayList2.add((ejb) asrVar3.z());
                        i5++;
                        it = it2;
                        bkxVar = bkxVar2;
                        arrayList = arrayList3;
                        i = i6;
                    }
                    Iterator it3 = it;
                    int i7 = i;
                    bkx bkxVar3 = bkxVar;
                    ArrayList arrayList4 = arrayList;
                    Collections.sort(arrayList2, new aep(5));
                    if (!asrVar2.a.isMutable()) {
                        asrVar2.B();
                    }
                    ejc ejcVar2 = (ejc) asrVar2.a;
                    efm efmVar = ejcVar2.d;
                    if (!efmVar.c()) {
                        ejcVar2.d = efb.mutableCopy(efmVar);
                    }
                    edg.addAll(arrayList2, ejcVar2.d);
                    ejc ejcVar3 = (ejc) asrVar2.z();
                    if (!asrVar.a.isMutable()) {
                        asrVar.B();
                    }
                    ejd ejdVar3 = (ejd) asrVar.a;
                    ejcVar3.getClass();
                    efm efmVar2 = ejdVar3.d;
                    if (!efmVar2.c()) {
                        ejdVar3.d = efb.mutableCopy(efmVar2);
                    }
                    ejdVar3.d.add(ejcVar3);
                    i3++;
                    bfxVarArr = bfxVarArr2;
                    it = it3;
                    i2 = i4;
                    bkxVar = bkxVar3;
                    arrayList = arrayList4;
                    i = i7;
                }
                bfx[] bfxVarArr3 = bfxVarArr;
                int i8 = i;
                i = i8 + 1;
                bfxVarArr3[i8] = bgaVar.f((ejd) asrVar.z());
                bfxVarArr = bfxVarArr3;
            }
            bfx[] bfxVarArr4 = bfxVarArr;
            cag cagVarC = null;
            for (int i9 = 0; i9 < size; i9++) {
                bfx bfxVar = bfxVarArr4[i9];
                bfxVar.h = bgrVar.o;
                cagVarC = bfxVar.c();
            }
            if (cagVarC != null) {
                return;
            }
            up.o(null);
        } catch (Throwable th) {
            this.d.writeLock().unlock();
            throw th;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        this.d.readLock().lock();
        try {
            sb.append("{");
            new brb(", ").p(sb, this.l);
            sb.append("}\n");
            new brb("\n").p(sb, this.j.values());
            this.d.readLock().unlock();
            return sb.toString();
        } catch (Throwable th) {
            this.d.readLock().unlock();
            throw th;
        }
    }

    private bgr(bgr bgrVar) {
        bgh bgjVar;
        this(bgrVar.e, bgrVar.o, bgrVar.c, bgrVar.q);
        ReentrantReadWriteLock.WriteLock writeLock = bgrVar.d.writeLock();
        writeLock.lock();
        try {
            this.k = bgrVar.k;
            this.i = bgrVar.i;
            for (Map.Entry entry : bgrVar.j.entrySet()) {
                Map map = this.j;
                String str = (String) entry.getKey();
                bgh bghVar = (bgh) entry.getValue();
                if (bghVar instanceof bgl) {
                    bgjVar = new bgl(this, (bgl) bghVar);
                } else if (bghVar instanceof bgq) {
                    bgjVar = new bgq(this, (bgq) bghVar);
                } else if (bghVar instanceof bgn) {
                    bgjVar = new bgn(this, (bgn) bghVar);
                } else if (bghVar instanceof bgp) {
                    bgjVar = new bgp(this, (bgp) bghVar);
                } else if (bghVar instanceof bgj) {
                    bgjVar = new bgj(this, (bgj) bghVar);
                } else {
                    throw new IllegalArgumentException("Unknown counter type: ".concat(String.valueOf(String.valueOf(bghVar))));
                }
                map.put(str, bgjVar);
            }
            this.l.addAll(bgrVar.l);
            bgrVar.l.clear();
            bgrVar.i = this.q.a();
        } finally {
            writeLock.unlock();
        }
    }
}
