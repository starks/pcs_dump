package j$.nio.channels;

import com.google.android.apps.aicore.aidl.AIFeature;
import j$.nio.file.attribute.m;
import j$.nio.file.attribute.p;
import j$.time.format.C;
import java.nio.file.attribute.FileAttribute;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class c {
    private static String a(long j, String str, Locale locale) {
        TimeZone timeZone = TimeZone.getTimeZone("UTC");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
        simpleDateFormat.setTimeZone(timeZone);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(timeZone);
        calendar.set(AIFeature.Id.PIXEL_AI_FEATURE_16, 1, (int) j, 0, 0, 0);
        return simpleDateFormat.format(calendar.getTime());
    }

    private static String b(long j, String str, Locale locale) {
        TimeZone timeZone = TimeZone.getTimeZone("UTC");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
        simpleDateFormat.setTimeZone(timeZone);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(timeZone);
        calendar.set(0, (int) j, 0, 0, 0, 0);
        return simpleDateFormat.format(calendar.getTime());
    }

    public static /* synthetic */ m[] c(FileAttribute[] fileAttributeArr) {
        if (fileAttributeArr == null) {
            return null;
        }
        int length = fileAttributeArr.length;
        m[] mVarArr = new m[length];
        for (int i = 0; i < length; i++) {
            mVarArr[i] = p.a(fileAttributeArr[i]);
        }
        return mVarArr;
    }

    public static /* synthetic */ FileAttribute[] d(m[] mVarArr) {
        if (mVarArr == null) {
            return null;
        }
        int length = mVarArr.length;
        FileAttribute[] fileAttributeArr = new FileAttribute[length];
        for (int i = 0; i < length; i++) {
            fileAttributeArr[i] = p.c(mVarArr[i]);
        }
        return fileAttributeArr;
    }

    public static void e(HashMap map, DateFormatSymbols dateFormatSymbols, Locale locale) {
        int length = dateFormatSymbols.getWeekdays().length;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        boolean z = locale == Locale.SIMPLIFIED_CHINESE || locale == Locale.TRADITIONAL_CHINESE;
        for (long j = 1; j <= length; j++) {
            String strA = a(j, "cccc", locale);
            linkedHashMap.put(Long.valueOf(j), strA);
            linkedHashMap2.put(Long.valueOf(j), z ? new StringBuilder().appendCodePoint(strA.codePointBefore(strA.length())).toString() : strA.substring(0, Character.charCount(strA.codePointAt(0))));
            linkedHashMap3.put(Long.valueOf(j), a(j, "ccc", locale));
        }
        if (length > 0) {
            map.put(C.FULL_STANDALONE, linkedHashMap);
            map.put(C.NARROW_STANDALONE, linkedHashMap2);
            map.put(C.SHORT_STANDALONE, linkedHashMap3);
            map.put(C.FULL, linkedHashMap);
            map.put(C.NARROW, linkedHashMap2);
            map.put(C.SHORT, linkedHashMap3);
        }
    }

    public static void f(HashMap map, DateFormatSymbols dateFormatSymbols, Locale locale) {
        int length = dateFormatSymbols.getMonths().length;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (long j = 1; j <= length; j++) {
            String strB = b(j, "LLLL", locale);
            linkedHashMap.put(Long.valueOf(j), strB);
            linkedHashMap2.put(Long.valueOf(j), strB.substring(0, Character.charCount(strB.codePointAt(0))));
            linkedHashMap3.put(Long.valueOf(j), b(j, "LLL", locale));
        }
        if (length > 0) {
            map.put(C.FULL_STANDALONE, linkedHashMap);
            map.put(C.NARROW_STANDALONE, linkedHashMap2);
            map.put(C.SHORT_STANDALONE, linkedHashMap3);
            map.put(C.FULL, linkedHashMap);
            map.put(C.NARROW, linkedHashMap2);
            map.put(C.SHORT, linkedHashMap3);
        }
    }
}
