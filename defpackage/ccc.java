package defpackage;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ccc extends cbx {
    public ccc(String str) {
        super("PIR");
    }

    @Override // defpackage.cbx
    public final void a(Level level, String str, Throwable th, String str2, Object... objArr) {
        if (objArr.length > 0) {
            str2 = String.format(str2, objArr);
        }
        if (th != null) {
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            str2 = str2 + "\n" + stringWriter.toString();
        }
        System.out.printf("[%s] %s: %s%n", level, str, str2);
    }

    @Override // defpackage.cbx
    public final void b(String str) {
    }
}
