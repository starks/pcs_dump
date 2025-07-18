package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class emf {
    public static final emf a = new emf(new emc(1), emc.a);
    private final ConcurrentMap b = new ConcurrentHashMap();

    public emf(eme... emeVarArr) {
        for (eme emeVar : emeVarArr) {
            this.b.put(emeVar.c(), emeVar);
        }
    }
}
