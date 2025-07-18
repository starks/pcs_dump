package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class drk {
    private final dri a;
    private final List b;
    private final Integer c;

    public drk(dri driVar, List list, Integer num) {
        this.a = driVar;
        this.b = list;
        this.c = num;
    }

    public final String toString() {
        return String.format("(annotations=%s, entries=%s, primaryKeyId=%s)", this.a, this.b, this.c);
    }
}
