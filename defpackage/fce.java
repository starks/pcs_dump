package defpackage;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fce implements Runnable {
    final /* synthetic */ CountDownLatch a;
    final /* synthetic */ CyclicBarrier b;
    final /* synthetic */ fbs c;
    final /* synthetic */ CountDownLatch d;
    final /* synthetic */ fcg e;

    public fce(fcg fcgVar, CountDownLatch countDownLatch, CyclicBarrier cyclicBarrier, fbs fbsVar, CountDownLatch countDownLatch2) {
        this.a = countDownLatch;
        this.b = cyclicBarrier;
        this.c = fbsVar;
        this.d = countDownLatch2;
        this.e = fcgVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d5, code lost:
    
        r8 = new defpackage.fvk();
        r8.V(r14, 0, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00dd, code lost:
    
        if (r7 >= r15) goto L337;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00df, code lost:
    
        r2 = r14.codePointAt(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e3, code lost:
    
        if (r2 != r6) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00e5, code lost:
    
        r2 = r7 + 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e7, code lost:
    
        if (r2 >= r15) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e9, code lost:
    
        r6 = defpackage.fdx.a(r14.charAt(r7 + 1));
        r2 = defpackage.fdx.a(r14.charAt(r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00fd, code lost:
    
        r18 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0100, code lost:
    
        if (r6 == (-1)) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0102, code lost:
    
        if (r2 == (-1)) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0107, code lost:
    
        r8.P((r6 << 4) + r2);
        r7 = r2;
        r2 = 37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x010f, code lost:
    
        r2 = 37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0112, code lost:
    
        r2 = 37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0114, code lost:
    
        r18 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0116, code lost:
    
        r8.W(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0119, code lost:
    
        r7 = r7 + java.lang.Character.charCount(r2);
        r3 = r18;
        r6 = 37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0124, code lost:
    
        r2 = r8.l();
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1755
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fce.run():void");
    }
}
