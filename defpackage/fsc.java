package defpackage;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.view.ScrollFeedbackProvider;
import android.view.View;
import com.google.android.apps.aicore.aidl.AIFeature;
import com.google.android.as.oss.R;
import j$.util.Optional;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fsc {
    private static fsc b;
    public final Object a;

    public fsc(ehs ehsVar, Object obj, ehs ehsVar2, Object obj2) {
        this.a = new egc(ehsVar, "", ehsVar2, obj2);
    }

    private static final int aC(int i) {
        int iBinarySearch = Arrays.binarySearch(egw.a, i);
        return iBinarySearch < 0 ? (-(iBinarySearch + 1)) - 1 : iBinarySearch;
    }

    private final byte[] aD(byte[] bArr, byte[] bArr2, int i) throws IllegalStateException, GeneralSecurityException {
        Mac mac = (Mac) dwj.b.a((String) this.a);
        if (i > mac.getMacLength() * AIFeature.Id.ROSIE_ROBOT_TRANSLATE) {
            throw new GeneralSecurityException("size too large");
        }
        byte[] bArr3 = new byte[i];
        mac.init(new SecretKeySpec(bArr, (String) this.a));
        byte[] bArrDoFinal = new byte[0];
        int i2 = 1;
        int i3 = 0;
        while (true) {
            mac.update(bArrDoFinal);
            mac.update(bArr2);
            mac.update((byte) i2);
            bArrDoFinal = mac.doFinal();
            int length = bArrDoFinal.length;
            int i4 = i3 + length;
            if (i4 >= i) {
                System.arraycopy(bArrDoFinal, 0, bArr3, i3, i - i3);
                return bArr3;
            }
            System.arraycopy(bArrDoFinal, 0, bArr3, i3, length);
            i2++;
            i3 = i4;
        }
    }

    private final byte[] aE(byte[] bArr, byte[] bArr2) throws InvalidKeyException {
        Mac mac = (Mac) dwj.b.a((String) this.a);
        if (bArr2 == null || bArr2.length == 0) {
            mac.init(new SecretKeySpec(new byte[mac.getMacLength()], (String) this.a));
        } else {
            mac.init(new SecretKeySpec(bArr2, (String) this.a));
        }
        return mac.doFinal(bArr);
    }

    public static fsc ay(int i) {
        return new fsc(dwt.b(dsi.b(i)));
    }

    public static fsc az(byte[] bArr) {
        return new fsc(dwt.b(bArr));
    }

    public static final void e(frn frnVar) {
        frnVar.notify();
    }

    public static final void f(frn frnVar, long j) throws InterruptedException {
        long j2 = j / 1000000;
        if (j2 > 0 || j > 0) {
            frnVar.wait(j2, (int) (j - (1000000 * j2)));
        }
    }

    public static final long g() {
        return System.nanoTime();
    }

    public static synchronized fsc s() {
        if (b == null) {
            b = new fsc((byte[]) null, (char[]) null);
        }
        return b;
    }

    public static int u(egc egcVar, Object obj, Object obj2) {
        return eep.a((ehs) egcVar.c, 1, obj) + eep.a((ehs) egcVar.d, 2, obj2);
    }

    public static void v(eei eeiVar, egc egcVar, Object obj, Object obj2) {
        eep.g(eeiVar, (ehs) egcVar.c, 1, obj);
        eep.g(eeiVar, (ehs) egcVar.d, 2, obj2);
    }

    public final void A(int i, int i2) {
        ((eei) this.a).s(i, i2);
    }

    public final void B(int i, int i2) {
        ((eei) this.a).o(i, i2);
    }

    public final void C(int i, long j) {
        ((eei) this.a).q(i, j);
    }

    public final void D(int i, float f) {
        ((eei) this.a).ak(i, f);
    }

    public final void E(int i, Object obj, egx egxVar) {
        eei eeiVar = (eei) this.a;
        eeiVar.A(i, 3);
        egxVar.m((egi) obj, eeiVar.f);
        eeiVar.A(i, 4);
    }

    public final void F(int i, int i2) {
        ((eei) this.a).s(i, i2);
    }

    public final void G(int i, long j) {
        ((eei) this.a).D(i, j);
    }

    public final void H(int i, Object obj, egx egxVar) {
        ((eei) this.a).u(i, (egi) obj, egxVar);
    }

    public final void I(int i, Object obj) {
        boolean z = obj instanceof eea;
        Object obj2 = this.a;
        if (z) {
            ((eei) obj2).x(i, (eea) obj);
        } else {
            ((eei) obj2).w(i, (egi) obj);
        }
    }

    public final void J(int i, int i2) {
        ((eei) this.a).o(i, i2);
    }

    public final void K(int i, long j) {
        ((eei) this.a).q(i, j);
    }

    public final void L(int i, int i2) {
        ((eei) this.a).an(i, i2);
    }

    public final void M(int i, long j) {
        ((eei) this.a).ap(i, j);
    }

    @Deprecated
    public final void N(int i) {
        ((eei) this.a).A(i, 3);
    }

    public final void O(int i, String str) {
        ((eei) this.a).y(i, str);
    }

    public final void P(int i, int i2) {
        ((eei) this.a).B(i, i2);
    }

    public final void Q(int i, long j) {
        ((eei) this.a).D(i, j);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.lang.Thread$UncaughtExceptionHandler] */
    public final Object R(dww dwwVar) {
        try {
            return dwwVar.call();
        } catch (Throwable th) {
            this.a.uncaughtException(Thread.currentThread(), th);
            throw new dwv(th);
        }
    }

    public final void S(Runnable runnable) {
        R(new bri(runnable, 5));
    }

    public final int T() {
        return ((dwt) this.a).a();
    }

    public final byte[] U() {
        return ((dwt) this.a).c();
    }

    public final int V() {
        return Mac.getInstance((String) this.a).getMacLength();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final byte[] W() throws java.security.GeneralSecurityException {
        /*
            r4 = this;
            java.lang.Object r4 = r4.a
            java.lang.String r4 = (java.lang.String) r4
            int r0 = r4.hashCode()
            r1 = 984523022(0x3aaea10e, float:0.0013323145)
            r2 = 2
            r3 = 1
            if (r0 == r1) goto L2e
            r1 = 984524074(0x3aaea52a, float:0.0013324369)
            if (r0 == r1) goto L24
            r1 = 984525777(0x3aaeabd1, float:0.0013326352)
            if (r0 == r1) goto L1a
            goto L38
        L1a:
            java.lang.String r0 = "HmacSha512"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L38
            r4 = r2
            goto L39
        L24:
            java.lang.String r0 = "HmacSha384"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L38
            r4 = r3
            goto L39
        L2e:
            java.lang.String r0 = "HmacSha256"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L38
            r4 = 0
            goto L39
        L38:
            r4 = -1
        L39:
            if (r4 == 0) goto L4d
            if (r4 == r3) goto L4a
            if (r4 != r2) goto L42
            byte[] r4 = defpackage.dql.h
            return r4
        L42:
            java.security.GeneralSecurityException r4 = new java.security.GeneralSecurityException
            java.lang.String r0 = "Could not determine HPKE KDF ID"
            r4.<init>(r0)
            throw r4
        L4a:
            byte[] r4 = defpackage.dql.g
            return r4
        L4d:
            byte[] r4 = defpackage.dql.f
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fsc.W():byte[]");
    }

    public final byte[] X(byte[] bArr, byte[] bArr2, String str, byte[] bArr3, int i) {
        return aD(bArr, dql.e(str, bArr2, bArr3, i), i);
    }

    public final byte[] Y(byte[] bArr, byte[] bArr2, String str, byte[] bArr3) {
        return aE(dql.d(str, bArr2, bArr3), bArr);
    }

    public final byte[] Z(byte[] bArr, byte[] bArr2, byte[] bArr3, int i) {
        return aD(aE(dql.d("eae_prk", bArr, bArr3), null), dql.e("shared_secret", bArr2, bArr3, i), i);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Set] */
    public final synchronized void a(fre freVar) {
        this.a.remove(freVar);
    }

    public final void aB(fuu fuuVar) {
        View view = (View) ((WeakReference) this.a).get();
        if (view != null) {
            view.animate().setUpdateListener(fuuVar != null ? new afu(fuuVar, view, 1) : null);
        }
    }

    public final dve aa() {
        try {
            Object obj = this.a;
            return obj instanceof drh ? ((drh) obj).a.b : ((dsg) drt.a.d((dli) this.a, dsg.class)).b;
        } catch (GeneralSecurityException e) {
            throw new dso("Parsing parameters failed in getProto(). You probably want to call some Tink register function for ".concat(String.valueOf(String.valueOf(this.a))), e);
        }
    }

    public final void ab(Object obj, int i) throws IllegalAccessException, IllegalArgumentException {
        try {
            ((Field) this.a).set(obj, Integer.valueOf(i));
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        }
    }

    public final void ac(Object obj, Object obj2) throws IllegalAccessException, IllegalArgumentException {
        try {
            ((Field) this.a).set(obj, obj2);
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        }
    }

    public final Optional ad(axi axiVar) {
        return Optional.ofNullable((bal) ((cxg) this.a).get(axiVar)).map(new alg(18));
    }

    public final aof ae(aog aogVar, Executor executor) {
        czn cznVar = aok.a;
        Binder.clearCallingIdentity();
        return new aok(aogVar, executor, new fuu(this.a, null));
    }

    public final Bundle af(String str) {
        Bundle bundle;
        aez aezVar = (aez) this.a;
        if (!aezVar.e) {
            throw new IllegalStateException("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
        }
        Bundle bundle2 = aezVar.d;
        if (bundle2 == null) {
            return null;
        }
        if (!bundle2.containsKey(str)) {
            bundle = null;
        } else {
            if (!bundle2.containsKey(str)) {
                throw new IllegalArgumentException(a.z(str, "No saved state was found associated with the key '", "'."));
            }
            bundle = bundle2.getBundle(str);
            if (bundle == null) {
                throw new IllegalStateException(a.z(str, "The saved state value associated with the key '", "' is either null or not of the expected type. This might happen if the value was saved with a different type or if the saved state has been modified unexpectedly."));
            }
        }
        bundle2.remove(str);
        if (bundle2.isEmpty()) {
            aezVar.d = null;
        }
        return bundle;
    }

    public final void ag(String str, aew aewVar) {
        Object obj = this.a;
        synchronized (((aez) obj).g) {
            if (((aez) obj).b.containsKey(str)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            ((aez) obj).b.put(str, aewVar);
        }
    }

    public final aew ah() {
        aew aewVar;
        Object obj = this.a;
        synchronized (((aez) obj).g) {
            Iterator it = ((aez) obj).b.entrySet().iterator();
            do {
                aewVar = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                aew aewVar2 = (aew) entry.getValue();
                if (true == fjs.c(str, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                    aewVar = aewVar2;
                }
            } while (aewVar == null);
        }
        return aewVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final zx ai(String str) {
        return (zx) this.a.get(str);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    public final void aj() {
        Iterator it = this.a.values().iterator();
        while (it.hasNext()) {
            ((zx) it.next()).f();
        }
        this.a.clear();
    }

    public final void ak() {
        View view = (View) ((WeakReference) this.a).get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void al(float f) {
        View view = (View) ((WeakReference) this.a).get();
        if (view != null) {
            view.animate().alpha(f);
        }
    }

    public final void am(long j) {
        View view = (View) ((WeakReference) this.a).get();
        if (view != null) {
            view.animate().setDuration(j);
        }
    }

    public final void an(uz uzVar) {
        View view = (View) ((WeakReference) this.a).get();
        if (view != null) {
            if (uzVar != null) {
                view.animate().setListener(new uy(uzVar, view));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void ao(float f) {
        View view = (View) ((WeakReference) this.a).get();
        if (view != null) {
            view.animate().translationY(f);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.ScrollFeedbackProvider, java.lang.Object] */
    public final void ap(int i, int i2, int i3, boolean z) {
        this.a.onScrollLimit(i, i2, i3, z);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.ScrollFeedbackProvider, java.lang.Object] */
    public final void aq(int i, int i2, int i3, int i4) {
        this.a.onScrollProgress(i, i2, i3, i4);
    }

    public final void ar() {
        Object obj = this.a;
        if (obj != null) {
            ((ContentProviderClient) obj).release();
        }
    }

    public final boolean as() {
        return ((LinkedHashMap) this.a).isEmpty();
    }

    public final int at() {
        Configuration configuration = ((Context) this.a).getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i > 600) {
            return 5;
        }
        if (i >= 500) {
            return 4;
        }
        if (i <= 480 || i2 <= 640) {
            return i >= 360 ? 3 : 2;
        }
        return 4;
    }

    public final boolean au() {
        return ((Context) this.a).getResources().getBoolean(R.bool.abc_action_bar_embed_tabs);
    }

    public final ax av() {
        return ((aj) this.a).e;
    }

    public final void aw() {
        ((aj) this.a).e.L();
    }

    public final void ax() {
        ((aj) this.a).e.W(true);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Set] */
    public final synchronized void b(fre freVar) {
        this.a.add(freVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Set] */
    public final synchronized boolean c(fre freVar) {
        return this.a.contains(freVar);
    }

    public final void d(Runnable runnable) {
        runnable.getClass();
        ((ThreadPoolExecutor) this.a).execute(runnable);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Collection] */
    public final fqo h() {
        return new fqo((String[]) this.a.toArray(new String[0]));
    }

    public final void i(String str, String str2) {
        fwv.F(str);
        fwv.G(str2, str);
        j(str, str2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    public final void j(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a.add(str);
        this.a.add(fjz.i(str2).toString());
    }

    public final void k(String str, String str2) {
        fwv.F(str);
        fwv.G(str2, str);
        l(str);
        j(str, str2);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, java.util.List] */
    public final fsc l(String str) {
        int i = 0;
        while (i < this.a.size()) {
            if (fjz.q(str, (String) this.a.get(i))) {
                this.a.remove(i);
                this.a.remove(i);
                i -= 2;
            }
            i += 2;
        }
        return this;
    }

    public final long m(long j) {
        return ((AtomicLong) this.a).addAndGet(j);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [eui, java.lang.Object] */
    public final void n() {
        this.a.e(eqo.l.e("Keepalive failed. The connection is likely gone"));
    }

    public final void o() {
        long jNextLong;
        fuu fuuVar = new fuu(this, null);
        Object obj = this.a;
        diy diyVar = diy.a;
        synchronized (((fcg) obj).l) {
            boolean z = true;
            clq.F(((fcg) obj).j != null);
            if (((fcg) obj).t) {
                evy.b(fuuVar, diyVar, ((fcg) obj).i());
                return;
            }
            evy evyVar = ((fcg) obj).s;
            if (evyVar != null) {
                jNextLong = 0;
                z = false;
            } else {
                jNextLong = ((fcg) obj).e.nextLong();
                csf csfVar = (csf) ((fcg) obj).f.a();
                csfVar.d();
                evy evyVar2 = new evy(jNextLong, csfVar);
                ((fcg) obj).s = evyVar2;
                ((fcg) obj).F.e++;
                evyVar = evyVar2;
            }
            if (z) {
                ((fcg) obj).j.b(false, (int) (jNextLong >>> 32), (int) jNextLong);
            }
            synchronized (evyVar) {
                if (!evyVar.d) {
                    evyVar.c.put(fuuVar, diyVar);
                } else {
                    Throwable th = evyVar.e;
                    evy.a(diyVar, th != null ? new euy(fuuVar, th, 2) : new evx(fuuVar, evyVar.f));
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    public final synchronized List p() {
        return this.a;
    }

    public final synchronized void q() {
    }

    public final void r(Object obj, ekr ekrVar) {
        obj.getClass();
        ((LinkedHashMap) this.a).put(obj, ekrVar);
    }

    public final void t(eea eeaVar) {
        if (!eeaVar.h()) {
            if (!(eeaVar instanceof egw)) {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(String.valueOf(eeaVar.getClass()))));
            }
            egw egwVar = (egw) eeaVar;
            int[] iArr = egw.a;
            t(egwVar.e);
            t(egwVar.f);
            return;
        }
        int iAC = aC(eeaVar.d());
        Object obj = this.a;
        int iC = egw.c(iAC + 1);
        if (((ArrayDeque) obj).isEmpty() || ((eea) ((ArrayDeque) this.a).peek()).d() >= iC) {
            ((ArrayDeque) this.a).push(eeaVar);
            return;
        }
        int iC2 = egw.c(iAC);
        eea egwVar2 = (eea) ((ArrayDeque) this.a).pop();
        while (!((ArrayDeque) this.a).isEmpty() && ((eea) ((ArrayDeque) this.a).peek()).d() < iC2) {
            egwVar2 = new egw((eea) ((ArrayDeque) this.a).pop(), egwVar2);
        }
        egw egwVar3 = new egw(egwVar2, eeaVar);
        while (!((ArrayDeque) this.a).isEmpty()) {
            int iAC2 = aC(egwVar3.d) + 1;
            Object obj2 = this.a;
            if (((eea) ((ArrayDeque) obj2).peek()).d() >= egw.c(iAC2)) {
                break;
            } else {
                egwVar3 = new egw((eea) ((ArrayDeque) this.a).pop(), egwVar3);
            }
        }
        ((ArrayDeque) this.a).push(egwVar3);
    }

    public final void w(int i, boolean z) {
        ((eei) this.a).l(i, z);
    }

    public final void x(int i, eea eeaVar) {
        ((eei) this.a).m(i, eeaVar);
    }

    public final void y(int i, double d) {
        ((eei) this.a).ai(i, d);
    }

    @Deprecated
    public final void z(int i) {
        ((eei) this.a).A(i, 4);
    }

    public fsc(Object obj) {
        this.a = obj;
    }

    public fsc(Object obj, byte[] bArr) {
        this.a = obj;
    }

    public fsc(int i, byte[] bArr) {
        this.a = new LinkedHashMap(i, 0.75f, true);
    }

    public fsc(char[] cArr, byte[] bArr) {
        this.a = new AtomicInteger(0);
    }

    public fsc(short[] sArr) {
        this.a = new ArrayDeque();
    }

    public fsc(Context context, Uri uri) {
        this.a = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    public fsc(Field field) {
        this.a = field;
        field.setAccessible(true);
    }

    public fsc(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = ebq.t(39);
    }

    public fsc(View view, byte[] bArr) {
        this.a = ScrollFeedbackProvider.createProvider(view);
    }

    public fsc(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this((byte[]) null, (byte[]) null, (byte[]) null);
    }

    public fsc(byte[] bArr, short[] sArr) {
        this.a = new HashMap();
    }

    public fsc(View view) {
        this.a = new WeakReference(view);
    }

    public fsc(eei eeiVar) {
        byte[] bArr = efn.b;
        this.a = eeiVar;
        eeiVar.f = this;
    }

    public fsc(byte[] bArr, char[] cArr) {
        this.a = Collections.EMPTY_LIST;
    }

    public fsc(byte[] bArr, byte[] bArr2, byte[] bArr3, char[] cArr) {
        this.a = new LinkedHashMap();
    }

    public fsc(char[] cArr) {
        this.a = new AtomicLong();
    }

    public fsc(int i) {
        this.a = fjs.r(new int[i]);
    }

    public fsc(byte[] bArr, byte[] bArr2) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        timeUnit.getClass();
        this.a = new fsb(frn.a, timeUnit);
    }

    public fsc(byte[] bArr, byte[] bArr2, char[] cArr) {
        this.a = new LinkedHashMap();
    }

    public fsc(afe afeVar) {
        afeVar.getClass();
        this.a = afeVar;
    }

    public fsc(byte[] bArr) {
        this.a = new ArrayList(20);
    }

    public fsc(ThreadFactory threadFactory) {
        this.a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
    }

    public fsc() {
        this.a = new LinkedHashSet();
    }
}
