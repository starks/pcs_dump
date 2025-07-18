package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aaq extends aau implements Runnable {
    public boolean a;
    final /* synthetic */ aar b;

    public aaq(aar aarVar) {
        this.b = aarVar;
    }

    @Override // defpackage.aau
    public final Object a() {
        try {
            return this.b.c();
        } catch (so e) {
            if (this.f()) {
                return null;
            }
            throw e;
        }
    }

    @Override // defpackage.aau
    public final void b(Object obj) {
        this.b.h(this);
    }

    @Override // defpackage.aau
    public final void c(Object obj) {
        aar aarVar = this.b;
        if (aarVar.a != this) {
            aarVar.h(this);
        } else {
            if (aarVar.f) {
                return;
            }
            SystemClock.uptimeMillis();
            aarVar.a = null;
            aarVar.d(obj);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a = false;
        this.b.a();
    }
}
