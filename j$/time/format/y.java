package j$.time.format;

import j$.util.concurrent.ConcurrentHashMap;
import java.text.DateFormatSymbols;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Locale;

/* loaded from: classes2.dex */
class y {
    private static final ConcurrentHashMap a = new ConcurrentHashMap(16, 0.75f, 2);
    private static final Comparator b = new w();
    private static final y c = new y();
    public static final /* synthetic */ int d = 0;

    static y b() {
        return c;
    }

    public String c(j$.time.chrono.n nVar, j$.time.temporal.n nVar2, long j, C c2, Locale locale) {
        if (nVar == j$.time.chrono.u.d || !(nVar2 instanceof j$.time.temporal.a)) {
            return d(nVar2, j, c2, locale);
        }
        return null;
    }

    public String d(j$.time.temporal.n nVar, long j, C c2, Locale locale) {
        Object xVar;
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(nVar, locale);
        ConcurrentHashMap concurrentHashMap = a;
        Object obj = concurrentHashMap.get(simpleImmutableEntry);
        if (obj == null) {
            HashMap map = new HashMap();
            if (nVar == j$.time.temporal.a.ERA) {
                DateFormatSymbols dateFormatSymbols = DateFormatSymbols.getInstance(locale);
                HashMap map2 = new HashMap();
                HashMap map3 = new HashMap();
                String[] eras = dateFormatSymbols.getEras();
                for (int i = 0; i < eras.length; i++) {
                    if (!eras[i].isEmpty()) {
                        long j2 = i;
                        map2.put(Long.valueOf(j2), eras[i]);
                        Long lValueOf = Long.valueOf(j2);
                        String str = eras[i];
                        map3.put(lValueOf, str.substring(0, Character.charCount(str.codePointAt(0))));
                    }
                }
                if (!map2.isEmpty()) {
                    map.put(C.FULL, map2);
                    map.put(C.SHORT, map2);
                    map.put(C.NARROW, map3);
                }
                xVar = new x(map);
            } else if (nVar == j$.time.temporal.a.MONTH_OF_YEAR) {
                j$.nio.channels.c.f(map, DateFormatSymbols.getInstance(locale), locale);
                xVar = new x(map);
            } else if (nVar == j$.time.temporal.a.DAY_OF_WEEK) {
                j$.nio.channels.c.e(map, DateFormatSymbols.getInstance(locale), locale);
                xVar = new x(map);
            } else if (nVar == j$.time.temporal.a.AMPM_OF_DAY) {
                DateFormatSymbols dateFormatSymbols2 = DateFormatSymbols.getInstance(locale);
                HashMap map4 = new HashMap();
                HashMap map5 = new HashMap();
                String[] amPmStrings = dateFormatSymbols2.getAmPmStrings();
                for (int i2 = 0; i2 < amPmStrings.length; i2++) {
                    if (!amPmStrings[i2].isEmpty()) {
                        long j3 = i2;
                        map4.put(Long.valueOf(j3), amPmStrings[i2]);
                        Long lValueOf2 = Long.valueOf(j3);
                        String str2 = amPmStrings[i2];
                        map5.put(lValueOf2, str2.substring(0, Character.charCount(str2.codePointAt(0))));
                    }
                }
                if (!map4.isEmpty()) {
                    map.put(C.FULL, map4);
                    map.put(C.SHORT, map4);
                    map.put(C.NARROW, map5);
                }
                xVar = new x(map);
            } else {
                xVar = "";
            }
            concurrentHashMap.putIfAbsent(simpleImmutableEntry, xVar);
            obj = concurrentHashMap.get(simpleImmutableEntry);
        }
        if (obj instanceof x) {
            return ((x) obj).a(j, c2);
        }
        return null;
    }
}
