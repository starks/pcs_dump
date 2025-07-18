package j$.time.format;

import j$.time.chrono.AbstractC0033i;
import j$.util.concurrent.ConcurrentHashMap;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* loaded from: classes2.dex */
final class j implements f {
    private static final ConcurrentHashMap c = new ConcurrentHashMap(16, 0.75f, 2);
    private final FormatStyle a;
    private final FormatStyle b;

    j(FormatStyle formatStyle, FormatStyle formatStyle2) {
        this.a = formatStyle;
        this.b = formatStyle2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j$.time.format.f
    public final boolean g(v vVar, StringBuilder sb) {
        j$.time.chrono.n nVarP = AbstractC0033i.p(vVar.d());
        Locale localeC = vVar.c();
        String strO = nVarP.o();
        String string = localeC.toString();
        FormatStyle formatStyle = this.a;
        String strValueOf = String.valueOf(formatStyle);
        FormatStyle formatStyle2 = this.b;
        String str = strO + "|" + string + "|" + strValueOf + String.valueOf(formatStyle2);
        ConcurrentHashMap concurrentHashMap = c;
        DateTimeFormatter dateTimeFormatterZ = (DateTimeFormatter) concurrentHashMap.get(str);
        if (dateTimeFormatterZ == null) {
            if (formatStyle == null && formatStyle2 == null) {
                throw new IllegalArgumentException("Either dateStyle or timeStyle must be non-null");
            }
            DateFormat dateInstance = formatStyle2 == null ? DateFormat.getDateInstance(formatStyle.ordinal(), localeC) : formatStyle == null ? DateFormat.getTimeInstance(formatStyle2.ordinal(), localeC) : DateFormat.getDateTimeInstance(formatStyle.ordinal(), formatStyle2.ordinal(), localeC);
            if (!(dateInstance instanceof SimpleDateFormat)) {
                throw new UnsupportedOperationException("Can't determine pattern from ".concat(String.valueOf(dateInstance)));
            }
            String pattern = ((SimpleDateFormat) dateInstance).toPattern();
            if (pattern == null) {
                pattern = null;
            } else {
                int i = 0;
                boolean z = pattern.indexOf(66) != -1;
                boolean z2 = pattern.indexOf(98) != -1;
                if (z || z2) {
                    StringBuilder sb2 = new StringBuilder(pattern.length());
                    char c2 = ' ';
                    while (i < pattern.length()) {
                        char cCharAt = pattern.charAt(i);
                        if (cCharAt != ' ') {
                            if (cCharAt != 'B' && cCharAt != 'b') {
                                sb2.append(cCharAt);
                            }
                        } else if (i == 0 || (c2 != 'B' && c2 != 'b')) {
                            sb2.append(cCharAt);
                        }
                        i++;
                        c2 = cCharAt;
                    }
                    int length = sb2.length() - 1;
                    if (length >= 0 && sb2.charAt(length) == ' ') {
                        sb2.deleteCharAt(length);
                    }
                    pattern = sb2.toString();
                }
            }
            t tVar = new t();
            tVar.k(pattern);
            dateTimeFormatterZ = tVar.z(localeC);
            DateTimeFormatter dateTimeFormatter = (DateTimeFormatter) concurrentHashMap.putIfAbsent(str, dateTimeFormatterZ);
            if (dateTimeFormatter != null) {
                dateTimeFormatterZ = dateTimeFormatter;
            }
        }
        dateTimeFormatterZ.e().g(vVar, sb);
        return true;
    }

    public final String toString() {
        Object obj = this.a;
        if (obj == null) {
            obj = "";
        }
        String strValueOf = String.valueOf(obj);
        Object obj2 = this.b;
        return "Localized(" + strValueOf + "," + String.valueOf(obj2 != null ? obj2 : "") + ")";
    }
}
