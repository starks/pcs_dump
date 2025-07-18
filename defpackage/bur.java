package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bur implements bus {
    private final Context a;

    public bur(Context context) {
        this.a = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0051  */
    @Override // defpackage.bus
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.but a() {
        /*
            r9 = this;
            android.content.IntentFilter r0 = new android.content.IntentFilter
            java.lang.String r1 = "android.intent.action.BATTERY_CHANGED"
            r0.<init>(r1)
            android.content.Context r1 = r9.a
            r2 = 0
            android.content.Intent r0 = defpackage.rm.c(r1, r2, r0)
            java.lang.String r1 = "status"
            r2 = 0
            int r4 = r0.getIntExtra(r1, r2)
            java.lang.String r1 = "plugged"
            int r5 = r0.getIntExtra(r1, r2)
            java.lang.String r1 = "level"
            r2 = -1
            int r1 = r0.getIntExtra(r1, r2)
            java.lang.String r3 = "scale"
            int r0 = r0.getIntExtra(r3, r2)
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 == r2) goto L34
            if (r0 == r2) goto L34
            if (r0 <= 0) goto L34
            float r1 = (float) r1
            float r0 = (float) r0
            float r3 = r1 / r0
        L34:
            r6 = r3
            android.content.Context r9 = r9.a
            java.lang.String r0 = "batterymanager"
            java.lang.Object r9 = r9.getSystemService(r0)
            android.os.BatteryManager r9 = (android.os.BatteryManager) r9
            r0 = 0
            if (r9 == 0) goto L51
            r2 = 5
            long r2 = r9.getLongProperty(r2)
            r7 = -9223372036854775808
            int r9 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r9 != 0) goto L4f
            goto L51
        L4f:
            r7 = r2
            goto L52
        L51:
            r7 = r0
        L52:
            but r3 = new but
            r3.<init>(r4, r5, r6, r7)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bur.a():but");
    }
}
