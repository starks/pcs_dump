package j$.util.stream;

import java.util.concurrent.CountedCompleter;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.z, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0083z extends CountedCompleter {
    protected final InterfaceC0073o a;
    protected final int b;

    AbstractC0083z(InterfaceC0073o interfaceC0073o) {
        this.a = interfaceC0073o;
        this.b = 0;
    }

    abstract void a();

    abstract C0082y b(int i, int i2);

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        AbstractC0083z abstractC0083zB = this;
        while (abstractC0083zB.a.i() != 0) {
            abstractC0083zB.setPendingCount(abstractC0083zB.a.i() - 1);
            int i = 0;
            int iA = 0;
            while (i < abstractC0083zB.a.i() - 1) {
                C0082y c0082yB = abstractC0083zB.b(i, abstractC0083zB.b + iA);
                iA = (int) (iA + c0082yB.a.a());
                c0082yB.fork();
                i++;
            }
            abstractC0083zB = abstractC0083zB.b(i, abstractC0083zB.b + iA);
        }
        abstractC0083zB.a();
        abstractC0083zB.propagateCompletion();
    }

    AbstractC0083z(C0082y c0082y, InterfaceC0073o interfaceC0073o, int i) {
        super(c0082y);
        this.a = interfaceC0073o;
        this.b = i;
    }
}
