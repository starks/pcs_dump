package defpackage;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class sw {
    public static final ob a = new ob(16);
    public static final ExecutorService b;
    public static final Object c;
    public static final oc d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new ta());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        b = threadPoolExecutor;
        c = new Object();
        d = new oc();
    }

    public static String a(List list, int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < list.size(); i2++) {
            sb.append(((ss) list.get(i2)).e);
            sb.append("-");
            sb.append(i);
            if (i2 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x0280, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0284, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x030b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x030f, code lost:
    
        throw r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:61:0x017c A[Catch: all -> 0x0231, TryCatch #1 {all -> 0x0231, blocks: (B:59:0x0177, B:61:0x017c, B:63:0x0182, B:64:0x01af, B:68:0x01b8, B:71:0x01c3, B:74:0x01ce, B:78:0x01e6, B:82:0x01f1, B:86:0x01fd, B:75:0x01d8), top: B:164:0x0177 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0213 A[Catch: all -> 0x0243, Merged into TryCatch #11 {all -> 0x030b, all -> 0x0280, all -> 0x0243, blocks: (B:8:0x0025, B:9:0x002c, B:11:0x0032, B:14:0x005b, B:40:0x00ef, B:44:0x00fc, B:92:0x0222, B:106:0x0244, B:107:0x0247, B:37:0x00e4, B:38:0x00e9, B:113:0x0281, B:114:0x0284, B:115:0x0285, B:12:0x0046, B:16:0x0060, B:18:0x0068, B:20:0x0072, B:22:0x0085, B:23:0x0091, B:24:0x0097, B:26:0x009d, B:35:0x00dc, B:30:0x00bb, B:32:0x00c1, B:34:0x00d7, B:36:0x00df, B:108:0x0248, B:109:0x0268, B:110:0x0269, B:111:0x027f, B:45:0x0103, B:90:0x0213, B:91:0x0216, B:102:0x023c, B:103:0x023f, B:104:0x0242), top: B:182:0x0025 }, TRY_ENTER] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.sx b(java.lang.String r25, android.content.Context r26, java.util.List r27, int r28) {
        /*
            Method dump skipped, instructions count: 799
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sw.b(java.lang.String, android.content.Context, java.util.List, int):sx");
    }
}
