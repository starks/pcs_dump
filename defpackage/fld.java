package defpackage;

import java.io.Serializable;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fld implements Serializable {
    private final Pattern a;

    public fld(Pattern pattern) {
        this.a = pattern;
    }

    private final Object writeReplace() {
        String strPattern = this.a.pattern();
        strPattern.getClass();
        return new flc(strPattern, this.a.flags());
    }

    public final boolean a(CharSequence charSequence) {
        return this.a.matcher(charSequence).matches();
    }

    public final String b(CharSequence charSequence) {
        String strReplaceAll = this.a.matcher(charSequence).replaceAll("");
        strReplaceAll.getClass();
        return strReplaceAll;
    }

    public final String toString() {
        String string = this.a.toString();
        string.getClass();
        return string;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public fld(String str) {
        Pattern patternCompile = Pattern.compile(str);
        patternCompile.getClass();
        this(patternCompile);
    }
}
