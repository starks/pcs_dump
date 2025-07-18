package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cpv extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ Object initialValue() {
        chj.c();
        ezn eznVar = new ezn((byte[]) null);
        Thread threadCurrentThread = Thread.currentThread();
        synchronized (cqa.b) {
            cqa.b.put(threadCurrentThread, eznVar);
        }
        return eznVar;
    }
}
