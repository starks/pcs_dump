package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
final class buy implements buu {
    public buy(Context context) {
        brg.b();
        cbq cbqVarB = cbq.b(context);
        try {
            ((bqm) cbqVarB.c(bqm.class)).h(ccd.FAT_DYNAMITE_LOADER_USED);
            if (cbqVarB != null) {
                cbqVarB.close();
            }
        } catch (Throwable th) {
            if (cbqVarB != null) {
                try {
                    cbqVarB.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // defpackage.buu
    public final void a(Context context) throws buv {
        if (bpx.a() == null) {
            throw new buv("BrellaInit.setFatSdkConfig(...) must be called in Application#onCreate");
        }
        System.loadLibrary("pcs_tensorflow_jni");
        cbq cbqVarB = cbq.b(context);
        try {
            ((bqm) cbqVarB.c(bqm.class)).h(ccd.CUSTOM_NATIVE_LIBRARY_LOADED);
            if (cbqVarB != null) {
                cbqVarB.close();
            }
        } catch (Throwable th) {
            if (cbqVarB != null) {
                try {
                    cbqVarB.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004f  */
    @Override // defpackage.buu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.os.IInterface b(java.lang.String r6, defpackage.buw r7) throws defpackage.buv {
        /*
            r5 = this;
            bsp r5 = defpackage.bpx.a()
            if (r5 == 0) goto L9e
            int r5 = r6.hashCode()
            r0 = 5
            r1 = 4
            r2 = 3
            r3 = 2
            r4 = 1
            switch(r5) {
                case -1192512253: goto L45;
                case -573641281: goto L3b;
                case -487058244: goto L31;
                case 1142080332: goto L27;
                case 1556299985: goto L1d;
                case 2016770690: goto L13;
                default: goto L12;
            }
        L12:
            goto L4f
        L13:
            java.lang.String r5 = "com.google.android.gms.learning.dynamite.training.InAppTrainingServiceImpl"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L4f
            r5 = r4
            goto L50
        L1d:
            java.lang.String r5 = "com.google.android.gms.learning.dynamite.training.InAppJobServiceImpl"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L4f
            r5 = 0
            goto L50
        L27:
            java.lang.String r5 = "com.google.android.gms.learning.dynamite.proxy.InAppExampleStoreProxyImpl"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L4f
            r5 = r1
            goto L50
        L31:
            java.lang.String r5 = "com.google.android.gms.learning.dynamite.training.InAppTrainerImpl"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L4f
            r5 = r3
            goto L50
        L3b:
            java.lang.String r5 = "com.google.android.gms.learning.dynamite.training.BrellaInvocationImpl"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L4f
            r5 = r0
            goto L50
        L45:
            java.lang.String r5 = "com.google.android.gms.learning.dynamite.training.InAppTrainerCancellerImpl"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L4f
            r5 = r2
            goto L50
        L4f:
            r5 = -1
        L50:
            if (r5 == 0) goto L86
            if (r5 == r4) goto L80
            if (r5 == r3) goto L7a
            if (r5 == r2) goto L74
            if (r5 == r1) goto L6e
            if (r5 != r0) goto L62
            com.google.android.gms.learning.dynamite.training.BrellaInvocationImpl r5 = new com.google.android.gms.learning.dynamite.training.BrellaInvocationImpl
            r5.<init>()
            goto L8b
        L62:
            java.lang.String r5 = "no impl found for "
            java.lang.String r5 = r5.concat(r6)
            buv r6 = new buv
            r6.<init>(r5)
            throw r6
        L6e:
            com.google.android.gms.learning.dynamite.proxy.InAppExampleStoreProxyImpl r5 = new com.google.android.gms.learning.dynamite.proxy.InAppExampleStoreProxyImpl
            r5.<init>()
            goto L8b
        L74:
            com.google.android.gms.learning.dynamite.training.InAppTrainerCancellerImpl r5 = new com.google.android.gms.learning.dynamite.training.InAppTrainerCancellerImpl
            r5.<init>()
            goto L8b
        L7a:
            com.google.android.gms.learning.dynamite.training.InAppTrainerImpl r5 = new com.google.android.gms.learning.dynamite.training.InAppTrainerImpl
            r5.<init>()
            goto L8b
        L80:
            com.google.android.gms.learning.dynamite.training.InAppTrainingServiceImpl r5 = new com.google.android.gms.learning.dynamite.training.InAppTrainingServiceImpl
            r5.<init>()
            goto L8b
        L86:
            com.google.android.gms.learning.dynamite.training.InAppJobServiceImpl r5 = new com.google.android.gms.learning.dynamite.training.InAppJobServiceImpl
            r5.<init>()
        L8b:
            android.os.IInterface r5 = r7.a(r5)
            if (r5 == 0) goto L92
            return r5
        L92:
            java.lang.String r5 = "null impl for "
            java.lang.String r5 = r5.concat(r6)
            buv r6 = new buv
            r6.<init>(r5)
            throw r6
        L9e:
            buv r5 = new buv
            java.lang.String r6 = "BrellaInit.setFatSdkConfig(...) must be called in Application#onCreate"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.buy.b(java.lang.String, buw):android.os.IInterface");
    }
}
