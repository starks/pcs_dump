package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ebk {
    private boolean a = false;
    private boolean b = false;

    public final synchronized boolean a(cbx cbxVar) {
        if (this.a) {
        } else {
            this.a = true;
            try {
                System.loadLibrary("client_android_jni");
                this.b = true;
            } catch (NullPointerException | SecurityException | UnsatisfiedLinkError e) {
                this.b = false;
                cbxVar.f(e, "PIR native library load failed.");
            }
        }
        return this.b;
    }
}
