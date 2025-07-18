package defpackage;

import android.os.Build;
import dalvik.system.VMStack;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dcj extends dca {
    private static final boolean a = dci.a();
    private static final boolean b;
    private static final dbz c;

    static {
        boolean z = true;
        if (Build.FINGERPRINT != null && !"robolectric".equals(Build.FINGERPRINT)) {
            z = false;
        }
        b = z;
        c = new dch();
    }

    static Class p() {
        return VMStack.getStackClass2();
    }

    static String q() {
        try {
            return VMStack.getStackClass2().getName();
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean t() {
        try {
            Class.forName("dalvik.system.VMStack").getMethod("getStackClass2", null);
            return dci.class.getName().equals(q());
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // defpackage.dca
    protected dbc e(String str) {
        if (dcm.d.get() != null) {
            return ((dcf) dcm.d.get()).a(str);
        }
        int length = str.length();
        while (true) {
            length--;
            if (length >= 0) {
                char cCharAt = str.charAt(length);
                if (cCharAt != '$') {
                    if (cCharAt == '.') {
                        break;
                    }
                } else {
                    str = str.replace('$', '.');
                    break;
                }
            } else {
                break;
            }
        }
        dcm dcmVar = new dcm(str);
        dcl.a.offer(dcmVar);
        if (dcm.d.get() == null) {
            return dcmVar;
        }
        dcm.e();
        return dcmVar;
    }

    @Override // defpackage.dca
    protected dbz h() {
        return c;
    }

    @Override // defpackage.dca
    protected dcr j() {
        return dcn.a;
    }

    @Override // defpackage.dca
    protected String m() {
        return "platform: Android";
    }
}
