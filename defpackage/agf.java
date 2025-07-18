package defpackage;

import android.os.Trace;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agf {
    public static final agf a = new agf();

    private agf() {
    }

    public static final void a(String str) {
        String strSubstring = str.length() <= 127 ? str : null;
        if (strSubstring == null) {
            strSubstring = str.substring(0, 127);
            strSubstring.getClass();
        }
        Trace.beginSection(strSubstring);
    }
}
