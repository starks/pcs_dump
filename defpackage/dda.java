package defpackage;

import java.util.Calendar;
import java.util.Date;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dda extends ddb {
    private final dcz c;

    public dda(daw dawVar, int i, dcz dczVar) {
        super(dawVar, i);
        this.c = dczVar;
        StringBuilder sb = new StringBuilder("%");
        dawVar.f(sb);
        sb.append(true != dawVar.d() ? 't' : 'T');
        sb.append(dczVar.G);
    }

    @Override // defpackage.ddb
    public final void a(ddf ddfVar, Object obj) {
        dcz dczVar = this.c;
        if (!(obj instanceof Date) && !(obj instanceof Calendar) && !(obj instanceof Long)) {
            ddf.e(ddfVar.d, obj, "%t" + dczVar.G);
            return;
        }
        daw dawVar = this.b;
        StringBuilder sb = new StringBuilder("%");
        dawVar.f(sb);
        sb.append(true != dawVar.d() ? 't' : 'T');
        sb.append(dczVar.G);
        ddfVar.d.append(String.format(dbe.a, sb.toString(), obj));
    }
}
