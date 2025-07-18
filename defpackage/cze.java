package defpackage;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class cze {
    public final dbc a;

    protected cze(dbc dbcVar) {
        this.a = dbcVar;
    }

    public static void g(String str, daz dazVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").format(new Date(TimeUnit.NANOSECONDS.toMillis(dazVar.e()))));
        sb.append(": logging error [");
        dbb.DEFAULT.a(dazVar.f(), sb);
        sb.append("]: ");
        sb.append(str);
        System.err.println(sb);
        System.err.flush();
    }

    public abstract dab a(Level level);

    public final dab b() {
        return a(Level.FINE);
    }

    public final dab c() {
        return a(Level.INFO);
    }

    public final dab d() {
        return a(Level.SEVERE);
    }

    public final dab e() {
        return a(Level.WARNING);
    }

    protected final String f() {
        return this.a.a();
    }

    protected final boolean h(Level level) {
        return this.a.d(level);
    }
}
