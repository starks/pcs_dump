package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.Status;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.concurrent.atomic.DesugarAtomicInteger;
import j$.util.function.Consumer$CC;
import j$.util.function.IntUnaryOperator$CC;
import java.io.OutputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.function.Consumer;
import java.util.function.IntUnaryOperator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fpv {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public fpv(Context context, List list, bqm bqmVar, bpz bpzVar, cbx cbxVar) {
        this.e = context;
        this.c = list;
        this.d = bqmVar;
        this.a = bpzVar;
        this.b = cbxVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0084 A[EDGE_INSN: B:151:0x0084->B:25:0x0084 BREAK  A[LOOP:1: B:17:0x0060->B:152:?]] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0177  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void h(defpackage.bfx r20, defpackage.csg r21) {
        /*
            Method dump skipped, instructions count: 589
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fpv.h(bfx, csg):void");
    }

    public static final void i(cgb cgbVar, Object obj, ConcurrentMap concurrentMap) {
        Set set = (Set) concurrentMap.putIfAbsent(obj, new cyz(cgbVar));
        if (set != null) {
            cxm cxmVar = new cxm();
            cxmVar.k(set);
            cxmVar.c(cgbVar);
            concurrentMap.put(obj, cxmVar.i());
        }
    }

    public static void n(boq boqVar, bln blnVar, brb brbVar) {
        try {
            brbVar.D(boqVar.a(blnVar));
        } catch (bix e) {
            brbVar.C(e);
        }
    }

    private static String p(String str) {
        try {
            String rawPath = new URI(str).getRawPath();
            if (rawPath != null) {
                return rawPath;
            }
            throw new IllegalArgumentException("Invalid collection uri.");
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException("Invalid collection uri.", e);
        }
    }

    public final int a() {
        return ((flg) this.c).a - ((flg) this.d).a;
    }

    public final fpr b() {
        fpr fprVar;
        while (true) {
            Object obj = this.d;
            Object obj2 = this.c;
            int i = ((flg) obj).a;
            if (i - ((flg) obj2).a == 0) {
                return null;
            }
            int i2 = i & 127;
            if (((flg) this.d).c(i, i + 1) && (fprVar = (fpr) ((AtomicReferenceArray) this.a).getAndSet(i2, null)) != null) {
                if (fprVar.h) {
                    ((flg) this.e).a();
                    boolean z = fmd.a;
                }
                return fprVar;
            }
        }
    }

    public final fpr c(int i, boolean z) {
        AtomicReferenceArray atomicReferenceArray;
        int i2 = i & 127;
        fpr fprVar = (fpr) ((AtomicReferenceArray) this.a).get(i2);
        if (fprVar != null && fprVar.h == z) {
            Object obj = this.a;
            do {
                atomicReferenceArray = (AtomicReferenceArray) obj;
                if (atomicReferenceArray.compareAndSet(i2, fprVar, null)) {
                    if (z) {
                        ((flg) this.e).a();
                    }
                    return fprVar;
                }
            } while (atomicReferenceArray.get(i2) == fprVar);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final Collection d() {
        return this.e.values();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final List e(byte[] bArr) {
        List list = (List) this.e.get(dwt.b(bArr));
        return list != null ? list : Collections.EMPTY_LIST;
    }

    public final boolean f() {
        return !((dri) this.a).b.isEmpty();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.List] */
    public final List g(OutputStream outputStream) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(outputStream);
        if (!this.b.isEmpty()) {
            ?? r1 = this.b;
            int i = chl.a;
            ArrayList arrayList2 = new ArrayList();
            Iterator it = r1.iterator();
            while (it.hasNext()) {
                cin cinVarB = ((cio) it.next()).b();
                if (cinVarB != null) {
                    arrayList2.add(cinVarB);
                }
            }
            chl chlVar = !arrayList2.isEmpty() ? new chl(outputStream, arrayList2) : null;
            if (chlVar != null) {
                arrayList.add(chlVar);
            }
        }
        for (cip cipVar : this.e) {
            arrayList.add(cipVar.d());
        }
        Collections.reverse(arrayList);
        return arrayList;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:123|19|(1:21)(2:22|(1:24)(1:25))|26|125|27|(6:115|28|(3:30|(4:32|(1:34)|35|(1:37)(7:38|(2:41|39)|127|42|(2:45|43)|128|46))(3:47|(3:49|(1:51)|52)|53)|54)(1:55)|(5:57|(2:59|(1:61)(2:62|63))(2:64|65)|113|85|88)|66|67)|92|120|93|96) */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x02a4, code lost:
    
        r16.d.k(defpackage.ccj.dD);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:81:0x026e  */
    /* JADX WARN: Type inference failed for: r0v10, types: [bqm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v11, types: [bqm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13, types: [bqm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [bqm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16, types: [bqm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [bqm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v23, types: [bqm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v26, types: [bqm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27, types: [bpz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v28, types: [bqm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v29, types: [bpz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v38, types: [bpz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [bqm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [bpz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v53, types: [bqm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v54, types: [bpz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v56, types: [bqm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v57 */
    /* JADX WARN: Type inference failed for: r0v58 */
    /* JADX WARN: Type inference failed for: r0v6, types: [bqm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [bpz] */
    /* JADX WARN: Type inference failed for: r1v1, types: [bqm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [bpz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12, types: [bqm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2, types: [bpz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v8, types: [bvu] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v9, types: [char[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int j(java.lang.String r17, defpackage.btw r18, byte[] r19, boolean r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 714
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fpv.j(java.lang.String, btw, byte[], boolean):int");
    }

    public final int k() {
        return ((AtomicInteger) this.c).get();
    }

    public final cag l(final int i, final int i2, final boq boqVar) {
        ((AtomicInteger) this.b).incrementAndGet();
        final brb brbVar = new brb((byte[]) null, (char[]) null, (byte[]) null);
        Runnable runnable = new Runnable() { // from class: bon
            @Override // java.lang.Runnable
            public final void run() throws PackageManager.NameNotFoundException {
                fpv fpvVar = this.c;
                aso.A((Handler) fpvVar.d);
                boolean zK = ((blg) fpvVar.e).k();
                boq boqVar2 = boqVar;
                brb brbVar2 = brbVar;
                if (zK) {
                    fpv.n(boqVar2, (bln) fpvVar.e, brbVar2);
                    return;
                }
                if (((blg) fpvVar.e).l()) {
                    fpvVar.o(boqVar2, brbVar2);
                } else if (i - 1 != 0) {
                    brbVar2.C(api.d(((bor) fpvVar.a).b.a() ? new Status(8, "GmsClient is disconnected with SUCCESS connection status.") : ((bor) fpvVar.a).b));
                } else {
                    fpvVar.o(boqVar2, brbVar2);
                    ((blg) fpvVar.e).w();
                }
            }
        };
        Handler handler = (Handler) this.d;
        if (Looper.myLooper() == handler.getLooper()) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
        Object obj = brbVar.a;
        final Handler handler2 = (Handler) this.d;
        cag cagVar = (cag) obj;
        cagVar.h(new Executor() { // from class: boo
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable2) {
                handler2.post(runnable2);
            }
        }, new cab() { // from class: bop
            @Override // defpackage.cab
            public final void a(cag cagVar2) {
                int iIncrementAndGet;
                fpv fpvVar = this.b;
                aso.A((Handler) fpvVar.d);
                aso.A((Handler) fpvVar.d);
                if (cagVar2.e()) {
                    int i3 = i2 - 1;
                    if (i3 == 0) {
                        iIncrementAndGet = ((AtomicInteger) fpvVar.c).incrementAndGet();
                    } else if (i3 != 2) {
                        iIncrementAndGet = ((AtomicInteger) fpvVar.c).get();
                    } else {
                        iIncrementAndGet = DesugarAtomicInteger.updateAndGet((AtomicInteger) fpvVar.c, new IntUnaryOperator() { // from class: bol
                            public final /* synthetic */ IntUnaryOperator andThen(IntUnaryOperator intUnaryOperator) {
                                return IntUnaryOperator$CC.$default$andThen(this, intUnaryOperator);
                            }

                            @Override // java.util.function.IntUnaryOperator
                            public final int applyAsInt(int i4) {
                                return Math.max(i4 - 1, 0);
                            }

                            public final /* synthetic */ IntUnaryOperator compose(IntUnaryOperator intUnaryOperator) {
                                return IntUnaryOperator$CC.$default$compose(this, intUnaryOperator);
                            }
                        });
                    }
                } else {
                    iIncrementAndGet = ((AtomicInteger) fpvVar.c).get();
                }
                int iDecrementAndGet = ((AtomicInteger) fpvVar.b).decrementAndGet();
                if (iIncrementAndGet > 0 || iDecrementAndGet > 0 || !((blg) fpvVar.e).k()) {
                    return;
                }
                ((blg) fpvVar.e).x();
            }
        });
        return cagVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final void m(String str, Object obj) {
        str.getClass();
        this.c.put(str, obj);
        fui fuiVar = (fui) this.e.get(str);
        if (fuiVar != null) {
            fuiVar.k(obj);
        }
        fui fuiVar2 = (fui) this.a.get(str);
        if (fuiVar2 == null) {
            return;
        }
        fuiVar2.k(obj);
    }

    public final void o(final boq boqVar, final brb brbVar) {
        ((bor) this.a).a.add(new Consumer() { // from class: bom
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                fpv fpvVar = this.b;
                Status status = (Status) obj;
                aso.A((Handler) fpvVar.d);
                boolean zA = status.a();
                brb brbVar2 = brbVar;
                if (zA) {
                    fpv.n(boqVar, (bln) fpvVar.e, brbVar2);
                } else {
                    brbVar2.C(api.d(status));
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    public fpv(dpa dpaVar) {
        this.c = dpaVar.a;
        this.e = dpaVar.e;
        this.b = dpaVar.d;
        this.d = dpaVar.b;
        this.a = dpaVar.f;
    }

    public fpv(Map map, List list, dsd dsdVar, dri driVar, Class cls) {
        this.e = map;
        this.b = list;
        this.d = dsdVar;
        this.c = cls;
        this.a = driVar;
    }

    public fpv() {
        this.a = new AtomicReferenceArray(128);
        this.b = fjp.v(null);
        this.c = fjp.t(0);
        this.d = fjp.t(0);
        this.e = fjp.t(0);
    }

    public fpv(Map map) {
        this.c = new LinkedHashMap(map);
        this.b = new LinkedHashMap();
        this.e = new LinkedHashMap();
        this.a = new LinkedHashMap();
        this.d = new am(this, 4);
    }

    public fpv(byte[] bArr) {
        this.c = new AtomicBoolean(false);
        this.e = new ConcurrentHashMap();
        this.d = new ConcurrentHashMap();
        this.a = new ConcurrentHashMap();
        this.b = new ConcurrentHashMap();
    }

    public /* synthetic */ fpv(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this(fgn.a);
    }

    public fpv(Handler handler, bln blnVar, bor borVar) {
        this.c = new AtomicInteger();
        this.b = new AtomicInteger();
        aso.z(blnVar.b == handler.getLooper(), "GmsClient invokes callbacks is on an unexpected worker thread");
        this.d = handler;
        this.e = blnVar;
        this.a = borVar;
    }

    public fpv(Context context, dyf dyfVar, bqm bqmVar, bpz bpzVar, cbx cbxVar) {
        dzi dziVar = dyfVar.b;
        dziVar = dziVar == null ? dzi.a : dziVar;
        ArrayList arrayList = new ArrayList();
        for (dzk dzkVar : dyfVar.c) {
            bqa bqaVar = new bqa();
            bqaVar.e = dziVar.toByteArray();
            bqaVar.a = p(dzkVar.b);
            edl edlVar = dzkVar.c;
            if (edlVar == null) {
                edlVar = edl.a;
            }
            bqaVar.b = edlVar.toByteArray();
            bqaVar.c = dzkVar.d;
            arrayList.add(bqaVar.a());
        }
        this(context, arrayList, bqmVar, bpzVar, cbxVar);
    }
}
