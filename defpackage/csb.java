package defpackage;

import java.io.IOException;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class csb implements Iterable {
    final /* synthetic */ CharSequence a;
    final /* synthetic */ csd b;

    public csb(csd csdVar, CharSequence charSequence) {
        this.a = charSequence;
        this.b = csdVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.b.f(this.a);
    }

    public final String toString() throws IOException {
        brb brbVar = new brb(", ");
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        StringBuilder sbP = brbVar.p(sb, this);
        sbP.append(']');
        return sbP.toString();
    }
}
