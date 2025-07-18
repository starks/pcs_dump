package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acs {
    public final add a;
    public final adu b;
    public final Map c;
    public final ReentrantLock d;
    public final fin e;
    public final fin f;
    public final Object g;
    public wh h;
    public final ayo i;
    private final Map j;
    private final Map k;
    private final String[] l;

    public acs(add addVar, Map map, Map map2, String... strArr) {
        this.a = addVar;
        this.j = map;
        this.k = map2;
        this.l = strArr;
        adu aduVar = new adu(addVar, map, map2, strArr, addVar.g, new fnd(this, 1, null));
        this.b = aduVar;
        this.c = new LinkedHashMap();
        this.d = new ReentrantLock();
        this.e = new acp(this, 1);
        this.f = new acp(this, 0);
        this.i = new ayo(addVar);
        this.g = new Object();
        aduVar.e = new acp(this, 2);
    }
}
