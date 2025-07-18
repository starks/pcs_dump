package j$.time.format;

import j$.time.ZoneId;
import j$.time.temporal.TemporalAccessor;
import j$.util.Objects;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class DateTimeFormatter {
    public static final DateTimeFormatter g;
    private final e a;
    private final Locale b;
    private final z c;
    private final A d;
    private final j$.time.chrono.u e;
    private final ZoneId f;

    static {
        t tVar = new t();
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        B b = B.EXCEEDS_PAD;
        tVar.q(aVar, 4, 10, b);
        tVar.e('-');
        j$.time.temporal.a aVar2 = j$.time.temporal.a.MONTH_OF_YEAR;
        tVar.p(aVar2, 2);
        tVar.e('-');
        j$.time.temporal.a aVar3 = j$.time.temporal.a.DAY_OF_MONTH;
        tVar.p(aVar3, 2);
        A a = A.STRICT;
        j$.time.chrono.u uVar = j$.time.chrono.u.d;
        DateTimeFormatter dateTimeFormatterY = tVar.y(a, uVar);
        t tVar2 = new t();
        tVar2.u();
        tVar2.a(dateTimeFormatterY);
        tVar2.j();
        tVar2.y(a, uVar);
        t tVar3 = new t();
        tVar3.u();
        tVar3.a(dateTimeFormatterY);
        tVar3.t();
        tVar3.j();
        tVar3.y(a, uVar);
        t tVar4 = new t();
        j$.time.temporal.a aVar4 = j$.time.temporal.a.HOUR_OF_DAY;
        tVar4.p(aVar4, 2);
        tVar4.e(':');
        j$.time.temporal.a aVar5 = j$.time.temporal.a.MINUTE_OF_HOUR;
        tVar4.p(aVar5, 2);
        tVar4.t();
        tVar4.e(':');
        j$.time.temporal.a aVar6 = j$.time.temporal.a.SECOND_OF_MINUTE;
        tVar4.p(aVar6, 2);
        tVar4.t();
        tVar4.b(j$.time.temporal.a.NANO_OF_SECOND, 0, 9, true);
        DateTimeFormatter dateTimeFormatterY2 = tVar4.y(a, null);
        t tVar5 = new t();
        tVar5.u();
        tVar5.a(dateTimeFormatterY2);
        tVar5.j();
        tVar5.y(a, null);
        t tVar6 = new t();
        tVar6.u();
        tVar6.a(dateTimeFormatterY2);
        tVar6.t();
        tVar6.j();
        tVar6.y(a, null);
        t tVar7 = new t();
        tVar7.u();
        tVar7.a(dateTimeFormatterY);
        tVar7.e('T');
        tVar7.a(dateTimeFormatterY2);
        DateTimeFormatter dateTimeFormatterY3 = tVar7.y(a, uVar);
        t tVar8 = new t();
        tVar8.u();
        tVar8.a(dateTimeFormatterY3);
        tVar8.w();
        tVar8.j();
        tVar8.x();
        DateTimeFormatter dateTimeFormatterY4 = tVar8.y(a, uVar);
        t tVar9 = new t();
        tVar9.a(dateTimeFormatterY4);
        tVar9.t();
        tVar9.e('[');
        tVar9.v();
        tVar9.r();
        tVar9.e(']');
        tVar9.y(a, uVar);
        t tVar10 = new t();
        tVar10.a(dateTimeFormatterY3);
        tVar10.t();
        tVar10.j();
        tVar10.t();
        tVar10.e('[');
        tVar10.v();
        tVar10.r();
        tVar10.e(']');
        tVar10.y(a, uVar);
        t tVar11 = new t();
        tVar11.u();
        tVar11.q(aVar, 4, 10, b);
        tVar11.e('-');
        tVar11.p(j$.time.temporal.a.DAY_OF_YEAR, 3);
        tVar11.t();
        tVar11.j();
        tVar11.y(a, uVar);
        t tVar12 = new t();
        tVar12.u();
        tVar12.q(j$.time.temporal.h.c, 4, 10, b);
        tVar12.f("-W");
        tVar12.p(j$.time.temporal.h.b, 2);
        tVar12.e('-');
        j$.time.temporal.a aVar7 = j$.time.temporal.a.DAY_OF_WEEK;
        tVar12.p(aVar7, 1);
        tVar12.t();
        tVar12.j();
        tVar12.y(a, uVar);
        t tVar13 = new t();
        tVar13.u();
        tVar13.c();
        g = tVar13.y(a, null);
        t tVar14 = new t();
        tVar14.u();
        tVar14.p(aVar, 4);
        tVar14.p(aVar2, 2);
        tVar14.p(aVar3, 2);
        tVar14.t();
        tVar14.w();
        tVar14.i("+HHMMss", "Z");
        tVar14.x();
        tVar14.y(a, uVar);
        HashMap map = new HashMap();
        map.put(1L, "Mon");
        map.put(2L, "Tue");
        map.put(3L, "Wed");
        map.put(4L, "Thu");
        map.put(5L, "Fri");
        map.put(6L, "Sat");
        map.put(7L, "Sun");
        HashMap map2 = new HashMap();
        map2.put(1L, "Jan");
        map2.put(2L, "Feb");
        map2.put(3L, "Mar");
        map2.put(4L, "Apr");
        map2.put(5L, "May");
        map2.put(6L, "Jun");
        map2.put(7L, "Jul");
        map2.put(8L, "Aug");
        map2.put(9L, "Sep");
        map2.put(10L, "Oct");
        map2.put(11L, "Nov");
        map2.put(12L, "Dec");
        t tVar15 = new t();
        tVar15.u();
        tVar15.w();
        tVar15.t();
        tVar15.l(aVar7, map);
        tVar15.f(", ");
        tVar15.s();
        tVar15.q(aVar3, 1, 2, B.NOT_NEGATIVE);
        tVar15.e(' ');
        tVar15.l(aVar2, map2);
        tVar15.e(' ');
        tVar15.p(aVar, 4);
        tVar15.e(' ');
        tVar15.p(aVar4, 2);
        tVar15.e(':');
        tVar15.p(aVar5, 2);
        tVar15.t();
        tVar15.e(':');
        tVar15.p(aVar6, 2);
        tVar15.s();
        tVar15.e(' ');
        tVar15.i("+HHMM", "GMT");
        tVar15.y(A.SMART, uVar);
    }

    DateTimeFormatter(e eVar, Locale locale, z zVar, A a, j$.time.chrono.u uVar, ZoneId zoneId) {
        Objects.a(eVar, "printerParser");
        this.a = eVar;
        Objects.a(locale, "locale");
        this.b = locale;
        Objects.a(zVar, "decimalStyle");
        this.c = zVar;
        Objects.a(a, "resolverStyle");
        this.d = a;
        this.e = uVar;
        this.f = zoneId;
    }

    public static DateTimeFormatter ofLocalizedDate(FormatStyle formatStyle) {
        Objects.a(formatStyle, "dateStyle");
        t tVar = new t();
        tVar.g(formatStyle, null);
        return tVar.y(A.SMART, j$.time.chrono.u.d);
    }

    public static DateTimeFormatter ofLocalizedTime(FormatStyle formatStyle) {
        Objects.a(formatStyle, "timeStyle");
        t tVar = new t();
        tVar.g(null, formatStyle);
        return tVar.y(A.SMART, j$.time.chrono.u.d);
    }

    public final j$.time.chrono.n a() {
        return this.e;
    }

    public final z b() {
        return this.c;
    }

    public final Locale c() {
        return this.b;
    }

    public final ZoneId d() {
        return this.f;
    }

    final e e() {
        return this.a.a();
    }

    public String format(TemporalAccessor temporalAccessor) {
        StringBuilder sb = new StringBuilder(32);
        Objects.a(temporalAccessor, "temporal");
        try {
            this.a.g(new v(temporalAccessor, this), sb);
            return sb.toString();
        } catch (IOException e) {
            throw new j$.time.c(e.getMessage(), e);
        }
    }

    public final String toString() {
        String string = this.a.toString();
        return string.startsWith("[") ? string : string.substring(1, string.length() - 1);
    }

    public DateTimeFormatter withZone(ZoneId zoneId) {
        if (Objects.equals(this.f, zoneId)) {
            return this;
        }
        return new DateTimeFormatter(this.a, this.b, this.c, this.d, this.e, zoneId);
    }
}
