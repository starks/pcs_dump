package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adb {
    public final fkk a;
    public final Context b;
    public Executor f;
    public Executor g;
    public boolean l;
    public final List d = new ArrayList();
    public final List e = new ArrayList();
    public final int n = adc.a;
    public final fsc o = new fsc((byte[]) null, (byte[]) null, (char[]) null);
    public final Set h = new LinkedHashSet();
    public final Set i = new LinkedHashSet();
    public final List j = new ArrayList();
    public boolean k = true;
    public final boolean m = true;
    public final String c = "network_usage_db";

    public adb(Context context, Class cls) {
        this.a = fjp.n(cls);
        this.b = context;
    }
}
