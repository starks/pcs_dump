package j$.time.format;

import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class t {
    private static final C0037a h = new C0037a();
    private static final HashMap i;
    private t a;
    private final t b;
    private final ArrayList c;
    private final boolean d;
    private int e;
    private char f;
    private int g;

    static {
        HashMap map = new HashMap();
        i = map;
        map.put('G', j$.time.temporal.a.ERA);
        map.put('y', j$.time.temporal.a.YEAR_OF_ERA);
        map.put('u', j$.time.temporal.a.YEAR);
        j$.time.temporal.n nVar = j$.time.temporal.h.a;
        map.put('Q', nVar);
        map.put('q', nVar);
        j$.time.temporal.a aVar = j$.time.temporal.a.MONTH_OF_YEAR;
        map.put('M', aVar);
        map.put('L', aVar);
        map.put('D', j$.time.temporal.a.DAY_OF_YEAR);
        map.put('d', j$.time.temporal.a.DAY_OF_MONTH);
        map.put('F', j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH);
        j$.time.temporal.a aVar2 = j$.time.temporal.a.DAY_OF_WEEK;
        map.put('E', aVar2);
        map.put('c', aVar2);
        map.put('e', aVar2);
        map.put('a', j$.time.temporal.a.AMPM_OF_DAY);
        map.put('H', j$.time.temporal.a.HOUR_OF_DAY);
        map.put('k', j$.time.temporal.a.CLOCK_HOUR_OF_DAY);
        map.put('K', j$.time.temporal.a.HOUR_OF_AMPM);
        map.put('h', j$.time.temporal.a.CLOCK_HOUR_OF_AMPM);
        map.put('m', j$.time.temporal.a.MINUTE_OF_HOUR);
        map.put('s', j$.time.temporal.a.SECOND_OF_MINUTE);
        j$.time.temporal.a aVar3 = j$.time.temporal.a.NANO_OF_SECOND;
        map.put('S', aVar3);
        map.put('A', j$.time.temporal.a.MILLI_OF_DAY);
        map.put('n', aVar3);
        map.put('N', j$.time.temporal.a.NANO_OF_DAY);
        map.put('g', j$.time.temporal.j.a);
    }

    public t() {
        this.a = this;
        this.c = new ArrayList();
        this.g = -1;
        this.b = null;
        this.d = false;
    }

    private DateTimeFormatter A(Locale locale, A a, j$.time.chrono.u uVar) {
        Objects.a(locale, "locale");
        while (this.a.b != null) {
            s();
        }
        return new DateTimeFormatter(new e(this.c, false), locale, z.a, a, uVar, null);
    }

    private int d(f fVar) {
        Objects.a(fVar, "pp");
        t tVar = this.a;
        int i2 = tVar.e;
        if (i2 > 0) {
            m mVar = new m(fVar, i2, tVar.f);
            tVar.e = 0;
            tVar.f = (char) 0;
            fVar = mVar;
        }
        tVar.c.add(fVar);
        this.a.g = -1;
        return r5.c.size() - 1;
    }

    private void n(k kVar) {
        k kVarC;
        t tVar = this.a;
        int i2 = tVar.g;
        if (i2 < 0) {
            tVar.g = d(kVar);
            return;
        }
        k kVar2 = (k) tVar.c.get(i2);
        int i3 = kVar.b;
        int i4 = kVar.c;
        if (i3 == i4 && kVar.d == B.NOT_NEGATIVE) {
            kVarC = kVar2.d(i4);
            d(kVar.c());
            this.a.g = i2;
        } else {
            kVarC = kVar2.c();
            this.a.g = d(kVar);
        }
        this.a.c.set(i2, kVarC);
    }

    public final void a(DateTimeFormatter dateTimeFormatter) {
        d(dateTimeFormatter.e());
    }

    public final void b(j$.time.temporal.a aVar, int i2, int i3, boolean z) {
        if (i2 != i3 || z) {
            d(new g(aVar, i2, i3, z));
        } else {
            n(new g(aVar, i2, i3, z));
        }
    }

    public final void c() {
        d(new h());
    }

    public final void e(char c) {
        d(new d(c));
    }

    public final void f(String str) {
        Objects.a(str, "literal");
        if (str.isEmpty()) {
            return;
        }
        if (str.length() == 1) {
            d(new d(str.charAt(0)));
        } else {
            d(new i(1, str));
        }
    }

    public final void g(FormatStyle formatStyle, FormatStyle formatStyle2) {
        if (formatStyle == null && formatStyle2 == null) {
            throw new IllegalArgumentException("Either the date or time style must be non-null");
        }
        d(new j(formatStyle, formatStyle2));
    }

    public final void h(C c) {
        Objects.a(c, "style");
        if (c != C.FULL && c != C.SHORT) {
            throw new IllegalArgumentException("Style must be either full or short");
        }
        d(new i(0, c));
    }

    public final void i(String str, String str2) {
        d(new l(str, str2));
    }

    public final void j() {
        d(l.e);
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x020c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0485 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 1278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.t.k(java.lang.String):void");
    }

    public final void l(j$.time.temporal.a aVar, HashMap map) {
        Objects.a(aVar, "field");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        C c = C.FULL;
        d(new p(aVar, c, new C0038b(new x(Collections.singletonMap(c, linkedHashMap)))));
    }

    public final void m(j$.time.temporal.n nVar, C c) {
        Objects.a(c, "textStyle");
        d(new p(nVar, c, y.b()));
    }

    public final void o(j$.time.temporal.n nVar) {
        n(new k(nVar, 1, 19, B.NORMAL));
    }

    public final void p(j$.time.temporal.n nVar, int i2) {
        Objects.a(nVar, "field");
        if (i2 >= 1 && i2 <= 19) {
            n(new k(nVar, i2, i2, B.NOT_NEGATIVE));
        } else {
            throw new IllegalArgumentException("The width must be from 1 to 19 inclusive but was " + i2);
        }
    }

    public final void q(j$.time.temporal.n nVar, int i2, int i3, B b) {
        if (i2 == i3 && b == B.NOT_NEGATIVE) {
            p(nVar, i3);
            return;
        }
        Objects.a(nVar, "field");
        Objects.a(b, "signStyle");
        if (i2 < 1 || i2 > 19) {
            throw new IllegalArgumentException("The minimum width must be from 1 to 19 inclusive but was " + i2);
        }
        if (i3 < 1 || i3 > 19) {
            throw new IllegalArgumentException("The maximum width must be from 1 to 19 inclusive but was " + i3);
        }
        if (i3 >= i2) {
            n(new k(nVar, i2, i3, b));
            return;
        }
        throw new IllegalArgumentException("The maximum width must exceed or equal the minimum width but " + i3 + " < " + i2);
    }

    public final void r() {
        d(new r(h, "ZoneRegionId()"));
    }

    public final void s() {
        t tVar = this.a;
        if (tVar.b == null) {
            throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
        }
        if (tVar.c.size() <= 0) {
            this.a = this.a.b;
            return;
        }
        t tVar2 = this.a;
        e eVar = new e(tVar2.c, tVar2.d);
        this.a = this.a.b;
        d(eVar);
    }

    public final void t() {
        t tVar = this.a;
        tVar.g = -1;
        this.a = new t(tVar);
    }

    public final void u() {
        d(o.INSENSITIVE);
    }

    public final void v() {
        d(o.SENSITIVE);
    }

    public final void w() {
        d(o.LENIENT);
    }

    public final void x() {
        d(o.STRICT);
    }

    final DateTimeFormatter y(A a, j$.time.chrono.u uVar) {
        return A(Locale.getDefault(), a, uVar);
    }

    public final DateTimeFormatter z(Locale locale) {
        return A(locale, A.SMART, null);
    }

    private t(t tVar) {
        this.a = this;
        this.c = new ArrayList();
        this.g = -1;
        this.b = tVar;
        this.d = true;
    }
}
