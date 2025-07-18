package defpackage;

import android.animation.Animator;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ahz extends ahc {
    private static final String[] v = {"android:visibility:visibility", "android:visibility:parent"};
    public int u = 3;

    public static final void N(ahl ahlVar) {
        ahlVar.a.put("android:visibility:visibility", Integer.valueOf(ahlVar.b.getVisibility()));
        ahlVar.a.put("android:visibility:parent", ahlVar.b.getParent());
        int[] iArr = new int[2];
        ahlVar.b.getLocationOnScreen(iArr);
        ahlVar.a.put("android:visibility:screenLocation", iArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0078, code lost:
    
        if (r8 == 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0084, code lost:
    
        if (r0.e == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0092, code lost:
    
        if (r0.c == 0) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final defpackage.ahy O(defpackage.ahl r7, defpackage.ahl r8) {
        /*
            ahy r0 = new ahy
            r0.<init>()
            r1 = 0
            r0.a = r1
            r0.b = r1
            java.lang.String r2 = "android:visibility:parent"
            r3 = 0
            r4 = -1
            java.lang.String r5 = "android:visibility:visibility"
            if (r7 == 0) goto L33
            java.util.Map r6 = r7.a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L33
            java.util.Map r6 = r7.a
            java.lang.Object r6 = r6.get(r5)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r0.c = r6
            java.util.Map r6 = r7.a
            java.lang.Object r6 = r6.get(r2)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.e = r6
            goto L37
        L33:
            r0.c = r4
            r0.e = r3
        L37:
            if (r8 == 0) goto L5a
            java.util.Map r6 = r8.a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L5a
            java.util.Map r3 = r8.a
            java.lang.Object r3 = r3.get(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0.d = r3
            java.util.Map r3 = r8.a
            java.lang.Object r2 = r3.get(r2)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f = r2
            goto L5e
        L5a:
            r0.d = r4
            r0.f = r3
        L5e:
            r2 = 1
            if (r7 == 0) goto L87
            if (r8 == 0) goto L87
            int r7 = r0.c
            int r8 = r0.d
            if (r7 != r8) goto L6f
            android.view.ViewGroup r3 = r0.e
            android.view.ViewGroup r4 = r0.f
            if (r3 == r4) goto L95
        L6f:
            if (r7 == r8) goto L7d
            if (r7 != 0) goto L78
        L73:
            r0.b = r1
        L75:
            r0.a = r2
            return r0
        L78:
            if (r8 != 0) goto L95
        L7a:
            r0.b = r2
            goto L75
        L7d:
            android.view.ViewGroup r7 = r0.f
            if (r7 != 0) goto L82
            goto L73
        L82:
            android.view.ViewGroup r7 = r0.e
            if (r7 != 0) goto L95
            goto L7a
        L87:
            if (r7 != 0) goto L8e
            int r7 = r0.d
            if (r7 != 0) goto L8e
            goto L7a
        L8e:
            if (r8 != 0) goto L95
            int r7 = r0.c
            if (r7 != 0) goto L95
            goto L73
        L95:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahz.O(ahl, ahl):ahy");
    }

    @Override // defpackage.ahc
    public final boolean B(ahl ahlVar, ahl ahlVar2) {
        if (ahlVar == null && ahlVar2 == null) {
            return false;
        }
        if (ahlVar != null && ahlVar2 != null) {
            if (ahlVar2.a.containsKey("android:visibility:visibility") != ahlVar.a.containsKey("android:visibility:visibility")) {
                return false;
            }
        }
        ahy ahyVarO = O(ahlVar, ahlVar2);
        if (ahyVarO.a) {
            return ahyVarO.c == 0 || ahyVarO.d == 0;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01ed  */
    @Override // defpackage.ahc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.animation.Animator a(android.view.ViewGroup r25, defpackage.ahl r26, defpackage.ahl r27) {
        /*
            Method dump skipped, instructions count: 646
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahz.a(android.view.ViewGroup, ahl, ahl):android.animation.Animator");
    }

    @Override // defpackage.ahc
    public final void b(ahl ahlVar) {
        N(ahlVar);
    }

    @Override // defpackage.ahc
    public void c(ahl ahlVar) {
        throw null;
    }

    @Override // defpackage.ahc
    public final String[] e() {
        return v;
    }

    public Animator f(View view, ahl ahlVar) {
        throw null;
    }

    public Animator g(View view, ahl ahlVar, ahl ahlVar2) {
        throw null;
    }
}
