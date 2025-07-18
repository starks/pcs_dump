package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bpx {
    public static final Object a = new Object();
    public static boolean b;
    public static bsp c;

    public static bsp a() {
        bsp bspVar;
        synchronized (a) {
            bspVar = c;
        }
        return bspVar;
    }
}
