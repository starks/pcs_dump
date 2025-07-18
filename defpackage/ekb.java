package defpackage;

import android.view.WindowInsetsAnimation;
import j$.util.Optional;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ekb {
    public Object a;

    public ekb(aag aagVar) {
        this.a = aagVar;
    }

    public final void a() {
        this.a = null;
    }

    public final boolean b() {
        return this.a == null;
    }

    public final bmq c() {
        return new bmq((String) this.a);
    }

    public ekb(byte[] bArr) {
    }

    public ekb(byte[] bArr, char[] cArr, byte[] bArr2) {
        this.a = null;
    }

    public ekb() {
        this.a = new HashMap();
    }

    public ekb(WindowInsetsAnimation windowInsetsAnimation) {
        this.a = new vd(new WindowInsetsAnimation(0, null, 0L));
        this.a = new vd(windowInsetsAnimation);
    }

    public ekb(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = Optional.empty();
    }
}
