package defpackage;

import android.app.Notification;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.location.Location;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.core.graphics.drawable.IconCompat;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fcy {
    public static fcy d;
    public final Object a;
    public final Object b;
    public final Object c;

    public fcy(Context context, LocationManager locationManager) {
        this.a = new dk();
        this.b = context;
        this.c = locationManager;
    }

    public static final void D(fcy fcyVar) throws bnx {
        Object obj = fcyVar.c;
        try {
            if (!((File) obj).exists() && !((File) obj).createNewFile()) {
                throw new bnx(a.G(fcyVar, "Failed to touch last-used file for ", "."));
            }
            if (!((File) obj).setLastModified(System.currentTimeMillis())) {
                throw new bnx(a.G(fcyVar, "Failed to update last-used timestamp for ", "."));
            }
        } catch (IOException e) {
            throw new bnx("Failed to touch last-used file for " + fcyVar.toString() + ": " + e.toString());
        }
    }

    private final Method G(Class cls) throws NoSuchMethodException, SecurityException {
        Object obj;
        Method methodH = H(cls, (String) this.b, (Class[]) this.c);
        if (methodH != null && (obj = this.a) != null) {
            if (!((Class) obj).isAssignableFrom(methodH.getReturnType())) {
                return null;
            }
        }
        return methodH;
    }

    private static Method H(Class cls, String str, Class[] clsArr) throws NoSuchMethodException, SecurityException {
        if (cls == null) {
            return null;
        }
        try {
            if ((cls.getModifiers() & 1) == 0) {
                return H(cls.getSuperclass(), str, clsArr);
            }
            Method method = cls.getMethod(str, clsArr);
            try {
                if (1 != (method.getModifiers() & 1)) {
                    return null;
                }
            } catch (NoSuchMethodException unused) {
            }
            return method;
        } catch (NoSuchMethodException unused2) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void I(defpackage.rg r7) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fcy.I(rg):void");
    }

    public static bow l(bln blnVar, String str, bok bokVar, int i, boi boiVar) throws bix {
        exo exoVarB;
        boiVar.c(cqw.c, boh.FINE);
        try {
            bnu bnuVarA = ((bnw) blnVar.t()).a();
            boiVar.c(cqw.d, boh.FINE);
            bnj bnjVar = new bnj();
            int i2 = bnjVar.a.getInt("clientVersion");
            bnjVar.a.putInt("clientVersion", (i2 - (i2 % 10)) + 2);
            bnjVar.a.putAll(bokVar.e);
            bnjVar.b(i);
            try {
                bnq bnqVarA = bnuVarA.a(str, bnjVar);
                if (bnqVarA == null) {
                    try {
                        bnuVarA.c(str);
                    } catch (RemoteException e) {
                        throw ayg.i(e, "Failed on init() call");
                    }
                }
                boiVar.c(cqw.e, boh.FINE);
                if (bnqVarA != null) {
                    try {
                        exoVarB = bnh.B(blnVar.a, boiVar, bnqVarA);
                    } catch (bob | boe | IOException e2) {
                        throw ayg.h(e2, 8, "Failed to start the app-side VM process");
                    }
                } else {
                    exoVarB = null;
                }
                boiVar.c(cqw.m, boh.COARSE);
                return new bow(bnuVarA, exoVarB);
            } catch (RemoteException e3) {
                throw ayg.i(e3, "Failed on initWithExtras() call");
            }
        } catch (RemoteException e4) {
            throw ayg.i(e4, "Failed to create DroidGuard handle");
        }
    }

    public static File p(Context context) {
        return context.getDir("dg_cache", 0);
    }

    public static void r(File file, File file2) throws bnx {
        if (file.renameTo(file2)) {
            return;
        }
        throw new bnx("Failed to rename " + String.valueOf(file) + " -> " + String.valueOf(file2) + ".");
    }

    public final fcy A() {
        return B("tmp_".concat(String.valueOf(UUID.randomUUID().toString())));
    }

    public final fcy B(String str) {
        bdg bdgVar = bxv.a;
        File file = new File(bdg.e(p((Context) this.b), str));
        bnz bnzVar = new bnz(file, "the.apk");
        bdg bdgVar2 = bxv.a;
        File file2 = new File(bdg.e(file, "opt"));
        bdg bdgVar3 = bxv.a;
        return new fcy(bnzVar, file2, new File(bdg.e(file, "t")));
    }

    public final fcy C(boc bocVar) throws bnx {
        fcy fcyVarB = B(bocVar.a);
        if (!fcyVarB.o()) {
            return null;
        }
        D(fcyVarB);
        return fcyVarB;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.lang.Runnable] */
    public final void E(fuu fuuVar) {
        ((CopyOnWriteArrayList) this.b).add(fuuVar);
        this.c.run();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.lang.Runnable] */
    public final void F(fuu fuuVar) {
        ((CopyOnWriteArrayList) this.b).remove(fuuVar);
        if (((ul) this.a.remove(fuuVar)) != null) {
            throw null;
        }
        this.c.run();
    }

    public final Object a(Object obj, Object... objArr) throws NoSuchMethodException, SecurityException {
        try {
            Method methodG = G(obj.getClass());
            if (methodG != null) {
                try {
                    return methodG.invoke(obj, objArr);
                } catch (IllegalAccessException e) {
                    AssertionError assertionError = new AssertionError("Unexpectedly could not call: ".concat(methodG.toString()));
                    assertionError.initCause(e);
                    throw assertionError;
                }
            }
            Object obj2 = this.b;
            throw new AssertionError("Method " + ((String) obj2) + " not supported for object " + String.valueOf(obj));
        } catch (InvocationTargetException e2) {
            Throwable targetException = e2.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError2 = new AssertionError("Unexpected exception");
            assertionError2.initCause(targetException);
            throw assertionError2;
        }
    }

    public final boolean b(Object obj) {
        return G(obj.getClass()) != null;
    }

    public final void c(Object obj, Object... objArr) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        try {
            Method methodG = G(obj.getClass());
            if (methodG == null) {
                return;
            }
            try {
                methodG.invoke(obj, objArr);
            } catch (IllegalAccessException unused) {
            }
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, java.util.Map] */
    public final fcy d(epg epgVar, eqd eqdVar) {
        exo exoVar = new exo(epgVar, eqdVar, (byte[]) null);
        epg epgVar2 = (epg) exoVar.a;
        clq.D(((String) this.c).equals(epgVar2.c), "Method name should be prefixed with service name and separated with '/'. Expected service name: '%s'. Actual fully qualifed method name: '%s'.", this.c, epgVar2.b);
        String str = epgVar2.b;
        clq.J(!this.b.containsKey(str), "Method by same name already registered: %s", str);
        this.b.put(str, exoVar);
        return this;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.util.Map] */
    public final exo e() {
        HashMap map = new HashMap((Map) this.b);
        eqi eqiVar = (eqi) this.a;
        for (epg epgVar : eqiVar.b) {
            exo exoVar = (exo) map.remove(epgVar.b);
            if (exoVar == null) {
                throw new IllegalStateException("No method bound for descriptor entry ".concat(epgVar.b));
            }
            if (exoVar.a != epgVar) {
                throw new IllegalStateException("Bound method for " + epgVar.b + " not same instance as method in service descriptor");
            }
        }
        if (map.size() <= 0) {
            return new exo(eqiVar, (Map) this.b);
        }
        throw new IllegalStateException("No entry in descriptor matching bound method ".concat(((epg) ((exo) map.values().iterator().next()).a).b));
    }

    public final IllegalArgumentException f() {
        Object obj = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        return new IllegalArgumentException("Multiple entries with same key: " + obj3.toString() + "=" + obj2.toString() + " and " + obj3.toString() + "=" + obj.toString());
    }

    public final Object g(Uri uri, chm chmVar) {
        return chmVar.a(j(uri));
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [cik, java.lang.Object] */
    public final void h(Uri uri, Uri uri2) throws chy {
        fpv fpvVarJ = j(uri);
        Object obj = fpvVarJ.c;
        fpv fpvVarJ2 = j(uri2);
        if (obj != fpvVarJ2.c) {
            throw new chy("Cannot rename file across backends");
        }
        fpvVarJ.c.g((Uri) fpvVarJ.a, (Uri) fpvVarJ2.a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [cik, java.lang.Object] */
    public final boolean i(Uri uri) throws chy {
        fpv fpvVarJ = j(uri);
        return fpvVarJ.c.f((Uri) fpvVarJ.a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, java.util.Map] */
    public final fpv j(Uri uri) throws chy {
        int i = cxc.d;
        cwy cwyVar = new cwy();
        Pattern pattern = cid.a;
        cwy cwyVar2 = new cwy();
        String encodedFragment = uri.getEncodedFragment();
        cxc cxcVarN = (TextUtils.isEmpty(encodedFragment) || !encodedFragment.startsWith("transform=")) ? cyp.a : cxc.n(csd.c("+").a().e(encodedFragment.substring(10)));
        int size = cxcVarN.size();
        for (int i2 = 0; i2 < size; i2++) {
            String str = (String) cxcVarN.get(i2);
            Matcher matcher = cid.a.matcher(str);
            if (!matcher.matches()) {
                throw new IllegalArgumentException("Invalid fragment spec: ".concat(String.valueOf(str)));
            }
            cwyVar2.h(matcher.group(1));
        }
        cxc cxcVarG = cwyVar2.g();
        int i3 = ((cyp) cxcVarG).c;
        for (int i4 = 0; i4 < i3; i4++) {
            String str2 = (String) cxcVarG.get(i4);
            cip cipVar = (cip) this.a.get(str2);
            if (cipVar == null) {
                throw new chy("Requested transform isn't registered: " + str2 + ": " + String.valueOf(uri));
            }
            cwyVar.h(cipVar);
        }
        cxc cxcVarH = cwyVar.g().h();
        dpa dpaVar = new dpa(null, null);
        dpaVar.c = this;
        String scheme = uri.getScheme();
        cik cikVar = (cik) this.c.get(scheme);
        if (cikVar == null) {
            throw new chy(String.format("Requested backend isn't registered: %s", scheme));
        }
        dpaVar.a = cikVar;
        dpaVar.d = this.b;
        dpaVar.e = cxcVarH;
        dpaVar.b = uri;
        if (!cxcVarH.isEmpty()) {
            ArrayList arrayList = new ArrayList(uri.getPathSegments());
            if (!arrayList.isEmpty() && !uri.getPath().endsWith("/")) {
                String strB = (String) arrayList.get(arrayList.size() - 1);
                ListIterator listIterator = cxcVarH.listIterator(cxcVarH.size());
                while (listIterator.hasPrevious()) {
                    strB = ((cip) listIterator.previous()).b();
                }
                arrayList.set(arrayList.size() - 1, strB);
                uri = uri.buildUpon().path(TextUtils.join("/", arrayList)).encodedFragment(null).build();
            }
        }
        dpaVar.f = uri;
        return new fpv(dpaVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final cag k(final String str, Map map, final bok bokVar) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        final boi boiVar = new boi(Arrays.asList(elk.c().split(",", -1)).contains(str) ? boh.FINE : boh.COARSE, bnc.a);
        boiVar.c(cqw.b, boh.COARSE);
        cag cagVarM = uo.m(this.c, ((fpv) this.b).l(1, 1, new boq() { // from class: bou
            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.util.concurrent.Executor] */
            @Override // defpackage.boq
            public final Object a(bln blnVar) throws bix {
                Executor executor;
                bos bosVar;
                String str2;
                bok bokVar2;
                boi boiVar2;
                bnu bnuVar;
                fcy fcyVar = this.d;
                int iK = ((fpv) fcyVar.b).k();
                String str3 = str;
                bok bokVar3 = bokVar;
                boi boiVar3 = boiVar;
                bow bowVarL = fcy.l(blnVar, str3, bokVar3, iK, boiVar3);
                bpa bpaVar = new bpa(null);
                bpaVar.g = (fpv) fcyVar.b;
                ?? r4 = fcyVar.c;
                if (r4 == 0) {
                    throw new NullPointerException("Null executor");
                }
                bpaVar.a = r4;
                bpaVar.b = (bos) fcyVar.a;
                if (str3 == null) {
                    throw new NullPointerException("Null flowName");
                }
                bpaVar.c = str3;
                bpaVar.d = bokVar3;
                bpaVar.f = boiVar3;
                bpaVar.e = bowVarL.a;
                bpaVar.h = bowVarL.b;
                fpv fpvVar = bpaVar.g;
                if (fpvVar != null && (executor = bpaVar.a) != null && (bosVar = bpaVar.b) != null && (str2 = bpaVar.c) != null && (bokVar2 = bpaVar.d) != null && (boiVar2 = bpaVar.f) != null && (bnuVar = bpaVar.e) != null) {
                    return new bpb(fpvVar, executor, bosVar, str2, bokVar2, boiVar2, bnuVar);
                }
                StringBuilder sb = new StringBuilder();
                if (bpaVar.g == null) {
                    sb.append(" connection");
                }
                if (bpaVar.a == null) {
                    sb.append(" executor");
                }
                if (bpaVar.b == null) {
                    sb.append(" telemetryLogger");
                }
                if (bpaVar.c == null) {
                    sb.append(" flowName");
                }
                if (bpaVar.d == null) {
                    sb.append(" options");
                }
                if (bpaVar.f == null) {
                    sb.append(" telemetryCollector");
                }
                if (bpaVar.e == null) {
                    sb.append(" binderHandle");
                }
                throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
            }
        }), bokVar.b);
        cagVarM.h(this.c, new bov(this, jCurrentTimeMillis2, 0));
        ?? r2 = this.c;
        bot botVar = new bot(this, map);
        cal calVar = new cal();
        cal calVar2 = (cal) cagVarM;
        calVar2.e.c(new cae(cam.a(r2), botVar, calVar, 0));
        calVar2.l();
        calVar.h(this.c, new bov(this, jCurrentTimeMillis, 1));
        return calVar;
    }

    public final File m() {
        return (File) ((bnz) this.b).b;
    }

    public final File n() {
        return (File) ((bnz) this.b).a;
    }

    public final boolean o() {
        return m().isFile() && ((File) this.a).isDirectory();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.List] */
    public final void q() {
        for (File file : this.a) {
            if (!bnh.x(file)) {
                Log.e("DG", a.H(file, "Failed to clean up temporary file ", "."));
            }
        }
        this.a.clear();
    }

    public final void s(Object obj) {
        ((CopyOnWriteArrayList) this.a).add(obj);
    }

    public final void t(Menu menu, MenuInflater menuInflater) {
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        while (it.hasNext()) {
            ((fuu) it.next()).O(menu, menuInflater);
        }
    }

    public final void u(Menu menu) {
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        while (it.hasNext()) {
            ((fuu) it.next()).Q(menu);
        }
    }

    public final boolean v(MenuItem menuItem) {
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        while (it.hasNext()) {
            if (((fuu) it.next()).R(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final void w(ph phVar) {
        ((ArrayList) this.a).clear();
        int size = phVar.aJ.size();
        for (int i = 0; i < size; i++) {
            pg pgVar = (pg) phVar.aJ.get(i);
            if (pgVar.N() == 3 || pgVar.O() == 3) {
                ((ArrayList) this.a).add(pgVar);
            }
        }
        phVar.c();
    }

    public final boolean x(qg qgVar, pg pgVar, int i) {
        ((po) this.c).k = pgVar.N();
        ((po) this.c).l = pgVar.O();
        ((po) this.c).c = pgVar.j();
        ((po) this.c).d = pgVar.h();
        po poVar = (po) this.c;
        poVar.i = false;
        poVar.j = i;
        int i2 = poVar.k;
        po poVar2 = (po) this.c;
        int i3 = poVar2.l;
        boolean z = i2 == 3 && pgVar.Y > 0.0f;
        boolean z2 = i3 == 3 && pgVar.Y > 0.0f;
        if (z && pgVar.v[0] == 4) {
            poVar2.k = 1;
        }
        if (z2 && pgVar.v[1] == 4) {
            poVar2.l = 1;
        }
        qgVar.a(pgVar, poVar2);
        pgVar.C(((po) this.c).e);
        pgVar.x(((po) this.c).f);
        po poVar3 = (po) this.c;
        pgVar.G = poVar3.h;
        pgVar.u(poVar3.g);
        po poVar4 = (po) this.c;
        poVar4.j = 0;
        return poVar4.i;
    }

    public final void y(ph phVar, int i, int i2, int i3) {
        int i4 = phVar.ad;
        int i5 = phVar.ae;
        phVar.B(0);
        phVar.A(0);
        phVar.C(i2);
        phVar.x(i3);
        phVar.B(i4);
        phVar.A(i5);
        Object obj = this.b;
        ((ph) obj).b = i;
        ((pn) obj).T();
    }

    public final Location z(String str) {
        try {
            if (((LocationManager) this.c).isProviderEnabled(str)) {
                return ((LocationManager) this.c).getLastKnownLocation(str);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public fcy(bko bkoVar, bkx bkxVar, Runnable runnable) {
        this.c = bkoVar;
        this.a = bkxVar;
        this.b = runnable;
    }

    public fcy(bko bkoVar, bkx bkxVar, Runnable runnable, byte[] bArr) {
        this.c = bkoVar;
        this.a = bkxVar;
        this.b = runnable;
    }

    public fcy(bnz bnzVar, File file, File file2) {
        this.b = bnzVar;
        this.a = file;
        this.c = file2;
    }

    public fcy(bsx bsxVar, djy djyVar, bqm bqmVar) {
        this.a = bsxVar;
        this.c = djyVar;
        this.b = bqmVar;
    }

    public fcy(eqo eqoVar, etx etxVar, epc epcVar) {
        this.c = eqoVar;
        this.b = etxVar;
        this.a = epcVar;
    }

    public fcy(Class cls, String str, Class... clsArr) {
        this.a = cls;
        this.b = str;
        this.c = clsArr;
    }

    public fcy(Object obj, Object obj2, Object obj3) {
        this.b = obj;
        this.c = obj2;
        this.a = obj3;
    }

    public fcy(Context context, byte[] bArr) {
        this.b = context;
        this.a = bnr.c(context);
        this.c = new bya(context.getMainLooper());
    }

    public fcy(eea eeaVar, String str, String str2) {
        this.c = det.f;
        int i = 0;
        this.b = clq.t(new cfo(this, eeaVar, i));
        this.a = clq.t(new cfp(this, str, str2, i));
    }

    public fcy(eqi eqiVar) {
        this.b = new HashMap();
        this.a = eqiVar;
        this.c = eqiVar.a;
    }

    public fcy(ph phVar) {
        this.a = new ArrayList();
        this.c = new po();
        this.b = phVar;
    }

    public fcy(ri riVar) {
        Bundle[] bundleArr;
        new ArrayList();
        this.a = new Bundle();
        this.b = riVar;
        Notification.Builder builder = new Notification.Builder(riVar.a, riVar.m);
        this.c = builder;
        Notification notification = riVar.o;
        builder.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(riVar.e).setContentText(riVar.f).setContentInfo(null).setContentIntent(riVar.g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(0).setProgress(0, 0, false);
        builder.setLargeIcon((Icon) null);
        builder.setSubText(null).setUsesChronometer(false).setPriority(riVar.h);
        ArrayList arrayList = riVar.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            I((rg) arrayList.get(i));
        }
        Bundle bundle = riVar.l;
        if (bundle != null) {
            ((Bundle) this.a).putAll(bundle);
        }
        ((Notification.Builder) this.c).setShowWhen(true);
        ((Notification.Builder) this.c).setLocalOnly(riVar.k);
        ((Notification.Builder) this.c).setGroup(null);
        ((Notification.Builder) this.c).setSortKey(null);
        ((Notification.Builder) this.c).setGroupSummary(false);
        ((Notification.Builder) this.c).setCategory(null);
        ((Notification.Builder) this.c).setColor(0);
        ((Notification.Builder) this.c).setVisibility(0);
        ((Notification.Builder) this.c).setPublicVersion(null);
        ((Notification.Builder) this.c).setSound(notification.sound, notification.audioAttributes);
        ArrayList arrayList2 = riVar.p;
        if (!arrayList2.isEmpty()) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((Notification.Builder) this.c).addPerson((String) it.next());
            }
        }
        if (riVar.d.size() > 0) {
            Bundle bundle2 = riVar.a().getBundle("android.car.EXTENSIONS");
            bundle2 = bundle2 == null ? new Bundle() : bundle2;
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundle4 = new Bundle();
            for (int i2 = 0; i2 < riVar.d.size(); i2++) {
                String string = Integer.toString(i2);
                rg rgVar = (rg) riVar.d.get(i2);
                Bundle bundle5 = new Bundle();
                IconCompat iconCompatA = rgVar.a();
                bundle5.putInt("icon", iconCompatA != null ? iconCompatA.a() : 0);
                bundle5.putCharSequence("title", rgVar.e);
                bundle5.putParcelable("actionIntent", rgVar.f);
                Bundle bundle6 = new Bundle(rgVar.a);
                bundle6.putBoolean("android.support.allowGeneratedReplies", rgVar.b);
                bundle5.putBundle("extras", bundle6);
                qy[] qyVarArr = rgVar.g;
                if (qyVarArr == null) {
                    bundleArr = null;
                } else {
                    int length = qyVarArr.length;
                    bundleArr = new Bundle[length];
                    if (length > 0) {
                        qy qyVar = qyVarArr[0];
                        new Bundle();
                        throw null;
                    }
                }
                bundle5.putParcelableArray("remoteInputs", bundleArr);
                bundle5.putBoolean("showsUserInterface", rgVar.c);
                bundle5.putInt("semanticAction", 0);
                bundle4.putBundle(string, bundle5);
            }
            bundle2.putBundle("invisible_actions", bundle4);
            bundle3.putBundle("invisible_actions", bundle4);
            riVar.a().putBundle("android.car.EXTENSIONS", bundle2);
            ((Bundle) this.a).putBundle("android.car.EXTENSIONS", bundle3);
        }
        ((Notification.Builder) this.c).setExtras(riVar.l);
        ((Notification.Builder) this.c).setRemoteInputHistory(null);
        ((Notification.Builder) this.c).setBadgeIconType(0);
        ((Notification.Builder) this.c).setSettingsText(null);
        ((Notification.Builder) this.c).setShortcutId(null);
        ((Notification.Builder) this.c).setTimeoutAfter(0L);
        ((Notification.Builder) this.c).setGroupAlertBehavior(0);
        if (!TextUtils.isEmpty(riVar.m)) {
            ((Notification.Builder) this.c).setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
        }
        ArrayList arrayList3 = riVar.c;
        if (arrayList3.size() <= 0) {
            ((Notification.Builder) this.c).setAllowSystemGeneratedContextualActions(true);
            ((Notification.Builder) this.c).setBubbleMetadata(null);
        } else {
            throw null;
        }
    }

    public fcy(Context context) {
        bnc bncVar = bnc.a;
        this.a = new ArrayList();
        this.b = context;
        this.c = bncVar;
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.List] */
    public fcy(List list) {
        List<cip> list2 = Collections.EMPTY_LIST;
        List list3 = Collections.EMPTY_LIST;
        this.c = new HashMap();
        this.a = new HashMap();
        this.b = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            cik cikVar = (cik) it.next();
            if (TextUtils.isEmpty(cikVar.e())) {
                Log.w("MobStore.FileStorage", "Cannot register backend, name empty");
            } else {
                cik cikVar2 = (cik) this.c.put(cikVar.e(), cikVar);
                if (cikVar2 != null) {
                    throw new IllegalArgumentException("Cannot override Backend " + cikVar2.getClass().getCanonicalName() + " with " + cikVar.getClass().getCanonicalName());
                }
            }
        }
        for (cip cipVar : list2) {
            if (TextUtils.isEmpty(cipVar.a())) {
                Log.w("MobStore.FileStorage", "Cannot register transform, name empty");
            } else {
                cip cipVar2 = (cip) this.a.put(cipVar.a(), cipVar);
                if (cipVar2 != null) {
                    throw new IllegalArgumentException("Cannot to override Transform " + cipVar2.getClass().getCanonicalName() + " with " + cipVar.getClass().getCanonicalName());
                }
            }
        }
        this.b.addAll(list3);
    }

    public fcy(Runnable runnable) {
        this.b = new CopyOnWriteArrayList();
        this.a = new HashMap();
        this.c = runnable;
    }

    public fcy(Executor executor) {
        this.a = new CopyOnWriteArrayList();
        this.c = new CopyOnWriteArrayList();
        this.b = executor;
    }
}
