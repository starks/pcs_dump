package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.google.android.gms.common.api.Status;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class brb {
    private static brb b;
    public final Object a;

    public brb(TextView textView) {
        this.a = new xv(textView);
    }

    public static cag K(final Context context, final Executor executor, final bqg bqgVar) {
        final brb brbVar = new brb((byte[]) null, (char[]) null, (byte[]) null);
        executor.execute(new Runnable() { // from class: bwg
            @Override // java.lang.Runnable
            public final void run() {
                boolean z;
                Executor executor2 = executor;
                bqg bqgVar2 = bqgVar;
                synchronized (bpx.a) {
                    z = bpx.b;
                }
                brb brbVar2 = brbVar;
                Context context2 = context;
                if (!z) {
                    Class<?> cls = context2.getApplicationContext().getClass();
                    if (!cls.equals(Application.class) && !"android.support.multidex.MultiDexApplication".equals(cls.getName())) {
                        brbVar2.E(new bix(new Status(10, "Cannot create in-app trainer: android.app.Application class has been subclassed (" + cls.getName() + ") and BrellaInit.myAppCanHandleMultipleProcesses() was not called")));
                        return;
                    }
                }
                try {
                    bvx bvxVar = (bvx) bux.a(context2, "com.google.android.gms.learning.dynamite.training.InAppTrainerImpl", new bwe(2));
                    bwh bwhVar = new bwh(brbVar2, bvxVar);
                    try {
                        if (bvxVar.initY2023W12(new bpe(context2), new bpe(executor2), bqgVar2, bwhVar)) {
                            return;
                        }
                        if (!bqgVar2.l.isEmpty()) {
                            brbVar2.E(new bix(new Status(10, "Input resources are not supported.")));
                            return;
                        }
                        try {
                            if (bvxVar.initY2022W24(new bpe(context2), new bpe(executor2), bqgVar2, bwhVar)) {
                                return;
                            }
                            if (brb.M(bqgVar2.k) || brb.M(bqgVar2.i) || brb.M(bqgVar2.f)) {
                                brbVar2.E(new bix(new Status(10, "appdata Uri scheme is not supported.")));
                                return;
                            }
                            try {
                                if (bvxVar.initY2020W36(new bpe(context2), new bpe(executor2), bqgVar2, bwhVar)) {
                                    return;
                                }
                                if (bqgVar2.k != null) {
                                    brbVar2.E(new bix(new Status(10, "local computation plan with TensorflowSpec is not supported.")));
                                    return;
                                }
                                try {
                                    if (bvxVar.initY2020W30(new bpe(context2), new bpe(executor2), bqgVar2, bwhVar)) {
                                        return;
                                    }
                                    if (bqgVar2.c().length > 0) {
                                        brbVar2.E(new bix(new Status(10, "Context data is not supported.")));
                                        return;
                                    }
                                    try {
                                        if (bvxVar.initY2020W18(new bpe(context2), new bpe(executor2), bqgVar2, bwhVar)) {
                                            return;
                                        }
                                        if (bqgVar2.d != null && bqgVar2.j != null) {
                                            brbVar2.E(new bix(new Status(10, "Training interval is not supported for federated computation.")));
                                            return;
                                        }
                                        try {
                                            if (bvxVar.initW24(new bpe(context2), new bpe(executor2), bqgVar2, bwhVar)) {
                                                return;
                                            }
                                            int i = bqgVar2.e;
                                            if (i != 0 && i != 1) {
                                                brbVar2.E(new bix(new Status(10, "Unsupported AttestationMode")));
                                                return;
                                            }
                                            try {
                                                if (bvxVar.initV26(new bpe(context2), new bpe(executor2), bqgVar2, bwhVar)) {
                                                    return;
                                                }
                                                brbVar2.E(new bix(new Status(17, "Failed to init impl")));
                                            } catch (RemoteException e) {
                                                brbVar2.E(new bix(new Status(8, csk.a(e))));
                                            }
                                        } catch (RemoteException e2) {
                                            brbVar2.E(new bix(new Status(8, csk.a(e2))));
                                        }
                                    } catch (RemoteException e3) {
                                        brbVar2.E(new bix(new Status(8, csk.a(e3))));
                                    }
                                } catch (RemoteException e4) {
                                    brbVar2.E(new bix(new Status(8, csk.a(e4))));
                                }
                            } catch (RemoteException e5) {
                                brbVar2.E(new bix(new Status(8, csk.a(e5))));
                            }
                        } catch (RemoteException e6) {
                            brbVar2.E(new bix(new Status(8, csk.a(e6))));
                        }
                    } catch (RemoteException e7) {
                        brbVar2.E(new bix(new Status(8, csk.a(e7))));
                    }
                } catch (buv e8) {
                    brbVar2.E(new bix(new Status(17, "Cannot create in-app trainer: ".concat(String.valueOf(e8.getMessage())))));
                }
            }
        });
        return (cag) brbVar.a;
    }

    public static boolean M(Uri uri) {
        return uri != null && "appdir".equals(uri.getScheme());
    }

    public static brb N() {
        if (b == null) {
            b = new brb((byte[]) null, (char[]) null);
        }
        return b;
    }

    private static djy P(cag cagVar) {
        cbo cboVar = new cbo(cagVar, null);
        cagVar.h(diy.a, new cbn(cboVar, 0));
        return dhq.j(cboVar, bix.class, new ciw(1), diy.a);
    }

    public static boolean a(File file) {
        if (file.isFile()) {
            return file.delete();
        }
        if (!file.isDirectory()) {
            return true;
        }
        boolean zA = true;
        for (File file2 : file.listFiles()) {
            zA &= a(file2);
        }
        return file.delete() && zA;
    }

    public static brb m(int i, int i2, int i3, int i4) {
        return new brb(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, false, false));
    }

    static final CharSequence r(Object obj) {
        obj.getClass();
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    public final djy A(String str, String[] strArr, byte[] bArr) {
        return P(((byw) this.a).b(str, 173000, strArr, bArr));
    }

    public final String B(Uri uri, String str, String str2) {
        oc ocVar;
        if (uri != null) {
            ocVar = (oc) ((oc) this.a).get(uri.toString());
        } else {
            ocVar = null;
        }
        if (ocVar == null) {
            return null;
        }
        if (str != null) {
            str2 = str.concat(str2);
        }
        return (String) ocVar.get(str2);
    }

    public final void C(Exception exc) {
        ((cal) this.a).m(exc);
    }

    public final void D(Object obj) {
        ((cal) this.a).n(obj);
    }

    public final void E(Exception exc) {
        aso.G(exc, "Exception must not be null");
        Object obj = this.a;
        cal calVar = (cal) obj;
        synchronized (calVar.a) {
            if (((cal) obj).b) {
                return;
            }
            ((cal) obj).b = true;
            ((cal) obj).d = exc;
            calVar.e.d((cag) obj);
        }
    }

    public final void F(Object obj) {
        ((cal) this.a).o(obj);
    }

    public final void G() {
        ((cal) this.a).o(null);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.List] */
    public final synchronized bxl H(String str, edl edlVar, dzi dziVar) {
        bxl bxlVar;
        bxlVar = new bxl(str, edlVar, dziVar);
        this.a.add(bxlVar);
        return bxlVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List] */
    public final synchronized List I() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            arrayList.add(((bxl) it.next()).a());
        }
        this.a.clear();
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [bvx, java.lang.Object] */
    public final cag J() {
        brb brbVar = new brb((byte[]) null, (char[]) null, (byte[]) null);
        try {
            this.a.stop(new bwj(brbVar));
        } catch (RemoteException e) {
            brbVar.E(new bix(new Status(8, csk.a(e))));
        }
        return (cag) brbVar.a;
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [bvx, java.lang.Object] */
    public final cag L() {
        brb brbVar = new brb((byte[]) null, (char[]) null, (byte[]) null);
        try {
            this.a.start(0, new bwi(brbVar));
        } catch (RemoteException e) {
            brbVar.E(new bix(new Status(8, csk.a(e))));
        }
        return (cag) brbVar.a;
    }

    public final djy O(IOException iOException, brb brbVar) {
        if (!(iOException.getCause() instanceof efp)) {
            return cnx.B(iOException);
        }
        Object obj = this.a;
        Object obj2 = brbVar.a;
        return dhq.j(dij.j(cnx.C(obj), cqt.b(new bbk(obj2, 9)), ((cjd) obj2).c), IOException.class, new bbk(iOException, 16), diy.a);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [bkj, java.lang.Object] */
    public final void b(Status status) {
        try {
            this.a.a(status);
        } catch (RemoteException unused) {
            Log.w("brella.ResultHdlingSvc", "An error occurred when trying to communicate with Brella.");
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final Object c(Object obj) {
        return this.a.get(obj);
    }

    public final ApplicationInfo d(String str, int i) {
        return ((Context) this.a).getPackageManager().getApplicationInfo(str, i);
    }

    public final PackageInfo e(String str, int i) {
        return ((Context) this.a).getPackageManager().getPackageInfo(str, i);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final void f() {
        for (int iA = ffh.A(this.a); iA >= 0; iA--) {
            ((wm) ((ArrayList) this.a).get(iA)).a();
        }
    }

    public final void g(boolean z) {
        ((uq) this.a).g(z);
    }

    public final void h(boolean z) {
        ((uq) this.a).h(z);
    }

    public final vs i() {
        return ((vi) this.a).a();
    }

    @Deprecated
    public final void j(rz rzVar) {
        ((vi) this.a).c(rzVar);
    }

    public final void k(int i, int i2, int i3, boolean z) {
        ((fsc) this.a).ap(i, i2, i3, z);
    }

    public final void l(int i, int i2, int i3, int i4) {
        ((fsc) this.a).aq(i, i2, i3, i4);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    public final void n(cyl cylVar) {
        clq.A(!cylVar.b(), "range must not be empty, but was %s", cylVar);
        this.a.add(cylVar);
    }

    public final String o(Iterable iterable) throws IOException {
        Iterator it = iterable.iterator();
        StringBuilder sb = new StringBuilder();
        q(sb, it);
        return sb.toString();
    }

    public final StringBuilder p(StringBuilder sb, Iterable iterable) throws IOException {
        q(sb, iterable.iterator());
        return sb;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.CharSequence, java.lang.Object] */
    public final void q(StringBuilder sb, Iterator it) throws IOException {
        try {
            if (it.hasNext()) {
                sb.append(r(it.next()));
                while (it.hasNext()) {
                    sb.append((CharSequence) this.a);
                    sb.append(r(it.next()));
                }
            }
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final int s() {
        return ((AtomicInteger) this.a).get();
    }

    public final void t(String str) {
        cge[] cgeVarArrU = u(str);
        if (cgeVarArrU != null) {
            for (cge cgeVar : cgeVarArrU) {
                brb brbVar = cge.h;
                cgeVar.a();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    public final cge[] u(String str) {
        AtomicReference atomicReference = (AtomicReference) this.a.get(str);
        if (atomicReference == null) {
            return null;
        }
        return (cge[]) atomicReference.get();
    }

    public final djy v(String str) {
        str.getClass();
        return P(((byw) this.a).a(str));
    }

    public final djy w(cfa cfaVar) {
        cfaVar.getClass();
        bku bkuVar = new bku();
        bkuVar.a = new byr(cfaVar, 3);
        bkuVar.b = new bhq[]{byj.a};
        bkuVar.b();
        bkv bkvVarA = bkuVar.a();
        Object obj = this.a;
        return P(((biz) obj).f(bkvVarA).a(diy.a, new bgz((byw) obj, cfaVar, 2)));
    }

    public final djy x(String str, String str2) {
        str2.getClass();
        bku bkuVar = new bku();
        bkuVar.a = new bys(str, str2, 0);
        cag cagVarF = ((biz) this.a).f(bkuVar.a());
        diy diyVar = diy.a;
        bzx bzxVar = new bzx() { // from class: cff
            @Override // defpackage.bzx
            public final Object a(cag cagVar) {
                int i;
                cfd cfdVar;
                int i2;
                bye byeVar = (bye) cagVar.c();
                asr asrVar = (asr) cfb.a.createBuilder();
                String str3 = byeVar.a;
                if (!asrVar.a.isMutable()) {
                    asrVar.B();
                }
                cfb cfbVar = (cfb) asrVar.a;
                str3.getClass();
                int i3 = 1;
                cfbVar.b |= 1;
                cfbVar.c = str3;
                String str4 = byeVar.c;
                if (!asrVar.a.isMutable()) {
                    asrVar.B();
                }
                cfb cfbVar2 = (cfb) asrVar.a;
                str4.getClass();
                cfbVar2.b |= 4;
                cfbVar2.e = str4;
                boolean z = byeVar.f;
                if (!asrVar.a.isMutable()) {
                    asrVar.B();
                }
                cfb cfbVar3 = (cfb) asrVar.a;
                cfbVar3.b |= 8;
                cfbVar3.h = z;
                long j = byeVar.g;
                if (!asrVar.a.isMutable()) {
                    asrVar.B();
                }
                cfb cfbVar4 = (cfb) asrVar.a;
                cfbVar4.b |= 16;
                cfbVar4.i = j;
                byte[] bArr = byeVar.b;
                if (bArr != null) {
                    eea eeaVarR = eea.r(bArr);
                    if (!asrVar.a.isMutable()) {
                        asrVar.B();
                    }
                    cfb cfbVar5 = (cfb) asrVar.a;
                    cfbVar5.b |= 2;
                    cfbVar5.d = eeaVarR;
                }
                byd[] bydVarArr = byeVar.d;
                int length = bydVarArr.length;
                int i4 = 0;
                while (i4 < length) {
                    byd bydVar = bydVarArr[i4];
                    byk[] bykVarArr = bydVar.b;
                    int length2 = bykVarArr.length;
                    int i5 = 0;
                    while (i5 < length2) {
                        byk bykVar = bykVarArr[i5];
                        int i6 = bykVar.g;
                        if (i6 != i3) {
                            if (i6 == 2) {
                                i2 = i3;
                                asr asrVar2 = (asr) cfd.a.createBuilder();
                                String str5 = bykVar.a;
                                if (!asrVar2.a.isMutable()) {
                                    asrVar2.B();
                                }
                                cfd cfdVar2 = (cfd) asrVar2.a;
                                str5.getClass();
                                cfdVar2.b |= 1;
                                cfdVar2.e = str5;
                                if (bykVar.g != 2) {
                                    throw new IllegalArgumentException("Not a boolean type");
                                }
                                boolean z2 = bykVar.c;
                                if (!asrVar2.a.isMutable()) {
                                    asrVar2.B();
                                }
                                cfd cfdVar3 = (cfd) asrVar2.a;
                                cfdVar3.c = 2;
                                cfdVar3.d = Boolean.valueOf(z2);
                                cfdVar = (cfd) asrVar2.z();
                            } else if (i6 == 3) {
                                i2 = i3;
                                asr asrVar3 = (asr) cfd.a.createBuilder();
                                String str6 = bykVar.a;
                                if (!asrVar3.a.isMutable()) {
                                    asrVar3.B();
                                }
                                cfd cfdVar4 = (cfd) asrVar3.a;
                                str6.getClass();
                                cfdVar4.b |= 1;
                                cfdVar4.e = str6;
                                if (bykVar.g != 3) {
                                    throw new IllegalArgumentException("Not a double type");
                                }
                                double d = bykVar.d;
                                if (!asrVar3.a.isMutable()) {
                                    asrVar3.B();
                                }
                                cfd cfdVar5 = (cfd) asrVar3.a;
                                cfdVar5.c = 3;
                                cfdVar5.d = Double.valueOf(d);
                                cfdVar = (cfd) asrVar3.z();
                            } else if (i6 == 4) {
                                i2 = i3;
                                asr asrVar4 = (asr) cfd.a.createBuilder();
                                String str7 = bykVar.a;
                                if (!asrVar4.a.isMutable()) {
                                    asrVar4.B();
                                }
                                cfd cfdVar6 = (cfd) asrVar4.a;
                                str7.getClass();
                                cfdVar6.b |= 1;
                                cfdVar6.e = str7;
                                if (bykVar.g != 4) {
                                    throw new IllegalArgumentException("Not a String type");
                                }
                                String str8 = bykVar.e;
                                aso.F(str8);
                                if (!asrVar4.a.isMutable()) {
                                    asrVar4.B();
                                }
                                cfd cfdVar7 = (cfd) asrVar4.a;
                                cfdVar7.c = 4;
                                cfdVar7.d = str8;
                                cfdVar = (cfd) asrVar4.z();
                            } else {
                                if (i6 != 5) {
                                    throw new IllegalArgumentException(a.x(i6, "Unrecognized flag type: "));
                                }
                                asr asrVar5 = (asr) cfd.a.createBuilder();
                                String str9 = bykVar.a;
                                if (!asrVar5.a.isMutable()) {
                                    asrVar5.B();
                                }
                                cfd cfdVar8 = (cfd) asrVar5.a;
                                str9.getClass();
                                i2 = i3;
                                cfdVar8.b |= 1;
                                cfdVar8.e = str9;
                                if (bykVar.g != 5) {
                                    throw new IllegalArgumentException("Not a bytes type");
                                }
                                byte[] bArr2 = bykVar.f;
                                aso.F(bArr2);
                                eea eeaVarR2 = eea.r(bArr2);
                                if (!asrVar5.a.isMutable()) {
                                    asrVar5.B();
                                }
                                cfd cfdVar9 = (cfd) asrVar5.a;
                                cfdVar9.c = 5;
                                cfdVar9.d = eeaVarR2;
                                cfdVar = (cfd) asrVar5.z();
                            }
                            i = i2;
                        } else {
                            int i7 = i3;
                            asr asrVar6 = (asr) cfd.a.createBuilder();
                            String str10 = bykVar.a;
                            if (!asrVar6.a.isMutable()) {
                                asrVar6.B();
                            }
                            cfd cfdVar10 = (cfd) asrVar6.a;
                            str10.getClass();
                            cfdVar10.b |= 1;
                            cfdVar10.e = str10;
                            i = i7;
                            if (bykVar.g != i) {
                                throw new IllegalArgumentException("Not a long type");
                            }
                            long j2 = bykVar.b;
                            if (!asrVar6.a.isMutable()) {
                                asrVar6.B();
                            }
                            cfd cfdVar11 = (cfd) asrVar6.a;
                            cfdVar11.c = i;
                            cfdVar11.d = Long.valueOf(j2);
                            cfdVar = (cfd) asrVar6.z();
                        }
                        if (!asrVar.a.isMutable()) {
                            asrVar.B();
                        }
                        cfb cfbVar6 = (cfb) asrVar.a;
                        cfdVar.getClass();
                        efm efmVar = cfbVar6.f;
                        if (!efmVar.c()) {
                            cfbVar6.f = efb.mutableCopy(efmVar);
                        }
                        cfbVar6.f.add(cfdVar);
                        i5++;
                        i3 = i;
                    }
                    int i8 = i3;
                    String[] strArr = bydVar.c;
                    if (strArr != null) {
                        for (String str11 : strArr) {
                            if (!asrVar.a.isMutable()) {
                                asrVar.B();
                            }
                            cfb cfbVar7 = (cfb) asrVar.a;
                            str11.getClass();
                            efm efmVar2 = cfbVar7.g;
                            if (!efmVar2.c()) {
                                cfbVar7.g = efb.mutableCopy(efmVar2);
                            }
                            cfbVar7.g.add(str11);
                        }
                    }
                    i4++;
                    i3 = i8;
                }
                return (cfb) asrVar.z();
            }
        };
        cal calVar = new cal();
        cal calVar2 = (cal) cagVarF;
        calVar2.e.c(new bzz(cam.a(diyVar), bzxVar, calVar, 1));
        calVar2.l();
        return P(calVar);
    }

    public final djy y() {
        bku bkuVar = new bku();
        Object obj = this.a;
        bkuVar.a = new byr(obj, 0);
        bkuVar.b = new bhq[]{byj.i};
        bkuVar.b();
        return P(((biz) obj).f(bkuVar.a()));
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, java.lang.Runnable] */
    public final djy z(cgj cgjVar) {
        final String str;
        Object obj = this.a;
        String simpleName = bzf.class.getSimpleName();
        biz bizVar = (biz) obj;
        Looper looper = bizVar.f;
        aso.G(looper, "Looper must not be null");
        aso.G(simpleName, "Listener type must not be null");
        final bkl bklVar = new bkl(looper, cgjVar, simpleName);
        String strA = bng.a();
        if (strA == null) {
            str = "__PH_INTERNAL__NO_PROCESS__";
        } else {
            str = strA + "|" + System.identityHashCode(bzf.class);
        }
        final byw bywVar = (byw) obj;
        bkr bkrVar = new bkr() { // from class: byt
            @Override // defpackage.bkr
            public final void a(Object obj2, Object obj3) {
                int i = byw.a;
                ((bze) ((bzf) obj2).t()).e(str, new byx(bklVar));
            }
        };
        bkr bkrVar2 = new bkr() { // from class: byu
            @Override // defpackage.bkr
            public final void a(Object obj2, Object obj3) {
                int i = byw.a;
            }
        };
        bkq bkqVar = new bkq();
        bkqVar.d = bklVar;
        bkqVar.a = bkrVar;
        bkqVar.b = bkrVar2;
        bkqVar.e = new bhq[]{byj.d};
        bkqVar.f = false;
        aso.z(bkqVar.a != null, "Must set register function");
        aso.z(bkqVar.b != null, "Must set unregister function");
        aso.z(bkqVar.d != null, "Must set holder");
        bkk bkkVar = bkqVar.d.c;
        aso.G(bkkVar, "Key must not be null");
        fcy fcyVar = new fcy(new bko(bkqVar, bkqVar.d, bkqVar.e, bkqVar.f), new bkx(bkqVar, bkkVar), bkqVar.c);
        aso.G(((bko) fcyVar.c).a(), "Listener has already been released.");
        aso.G(((bkx) fcyVar.a).a, "Listener has already been released.");
        bkf bkfVar = bizVar.i;
        Object obj2 = fcyVar.c;
        Object obj3 = fcyVar.a;
        ?? r0 = fcyVar.b;
        brb brbVar = new brb((byte[]) null, (char[]) null, (byte[]) null);
        bjn bjnVar = new bjn(new fcy((bko) obj2, (bkx) obj3, r0, null), brbVar);
        Handler handler = bkfVar.n;
        handler.sendMessage(handler.obtainMessage(8, new cgm(bjnVar, bkfVar.k.get(), bizVar)));
        return P((cag) brbVar.a);
    }

    public brb(egi egiVar) {
        this((char[]) null, (char[]) null);
        this.a = egiVar;
    }

    public brb(Object obj) {
        this.a = obj;
    }

    public brb(Object obj, byte[] bArr) {
        this.a = obj;
    }

    public brb(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this((char[]) null, (char[]) null);
        this.a = new cal();
    }

    public brb(byte[] bArr, char[] cArr, byte[] bArr2) {
        this.a = new cal();
    }

    public brb(char[] cArr, byte[] bArr, byte[] bArr2) {
        this.a = new brb(null, null, null, null, null);
    }

    public brb(char[] cArr, char[] cArr2) {
    }

    public brb() {
        this.a = DesugarCollections.synchronizedMap(new HashMap());
    }

    public brb(View view) {
        this.a = new fsc(view, (byte[]) null);
    }

    public brb(brb brbVar) {
        this.a = new cal();
        fuu fuuVar = new fuu(this, null);
        Object obj = brbVar.a;
        cal calVar = (cal) obj;
        calVar.k(cak.a, new bzw(fuuVar));
    }

    private brb(byte[] bArr, char[] cArr) {
        this.a = new Object();
        new Handler(Looper.getMainLooper(), new coy(this));
    }

    public brb(char[] cArr, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = new ArrayList();
    }

    public brb(String str) {
        str.getClass();
        this.a = str;
    }

    public brb(char[] cArr, byte[] bArr) {
        this.a = new vh();
    }

    public brb(short[] sArr, byte[] bArr) {
        this.a = new ConcurrentHashMap();
    }

    public brb(vs vsVar) {
        this.a = new vh(vsVar);
    }

    public brb(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = new AtomicInteger();
    }

    public brb(short[] sArr) {
        this.a = new ArrayList();
    }

    public brb(Window window, View view) {
        this.a = new vt(window, this, new ul(), null);
    }

    public brb(char[] cArr) {
        this.a = new ArrayList();
    }
}
