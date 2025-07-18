package defpackage;

import android.content.Context;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aci {
    public final Context a;
    public final String b;
    public final List c;
    public final Executor d;
    public final Executor e;
    public final boolean f;
    public final boolean g;
    public final Set h;
    public final List i;
    public final List j;
    public boolean k;
    public final int l;
    public final ur m;
    public final fsc n;

    public aci(Context context, String str, ur urVar, fsc fscVar, List list, int i, Executor executor, Executor executor2, boolean z, boolean z2, Set set, List list2, List list3) {
        if (i == 0) {
            throw null;
        }
        this.a = context;
        this.b = "network_usage_db";
        this.m = urVar;
        this.n = fscVar;
        this.c = list;
        this.l = i;
        this.d = executor;
        this.e = executor2;
        this.f = z;
        this.g = z2;
        this.h = set;
        this.i = list2;
        this.j = list3;
        this.k = true;
    }
}
