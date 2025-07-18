package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cqk {
    int a;
    final int b;
    cqk c;
    final Map d = new HashMap(0);

    public cqk(int i, int i2) {
        if (i > i2) {
            throw new IllegalArgumentException();
        }
        this.a = i;
        this.b = i2;
        this.c = null;
    }

    public final String toString() {
        return "Node" + System.identityHashCode(this);
    }
}
