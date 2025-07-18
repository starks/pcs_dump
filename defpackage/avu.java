package defpackage;

import j$.time.Instant;
import j$.util.DesugarDate;
import java.text.DateFormat;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class avu extends awk {
    public final String a;

    public avu(String str) {
        this.a = str;
    }

    public static avu a(Instant instant) {
        return new avu(DateFormat.getTimeInstance().format(DesugarDate.from(instant)));
    }

    @Override // defpackage.awk
    public final awj b() {
        return awj.b;
    }

    @Override // defpackage.awk
    public final boolean c(awk awkVar) {
        return d(awkVar);
    }

    @Override // defpackage.awk
    public final boolean d(awk awkVar) {
        return (awkVar instanceof avu) && this.a.equals(((avu) awkVar).a);
    }
}
