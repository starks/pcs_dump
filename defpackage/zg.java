package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class zg {
    final zj c;
    boolean d;
    int e = -1;
    final /* synthetic */ zh f;

    public zg(zh zhVar, zj zjVar) {
        this.f = zhVar;
        this.c = zjVar;
    }

    public abstract boolean a();

    public boolean c(yz yzVar) {
        return false;
    }

    public final void d(boolean z) {
        boolean z2;
        if (z == this.d) {
            return;
        }
        this.d = z;
        zh zhVar = this.f;
        int i = true != z ? -1 : 1;
        int i2 = zhVar.d;
        zhVar.d = i + i2;
        if (!zhVar.e) {
            zhVar.e = true;
            while (true) {
                try {
                    int i3 = zhVar.d;
                    if (i2 == i3) {
                        break;
                    }
                    if (i2 != 0) {
                        z2 = false;
                    } else if (i3 > 0) {
                        i2 = 0;
                        z2 = true;
                    } else {
                        i2 = 0;
                        z2 = false;
                    }
                    boolean z3 = i2 > 0 && i3 == 0;
                    if (z2) {
                        zhVar.e();
                    } else if (z3) {
                        zhVar.f();
                    }
                    i2 = i3;
                } finally {
                    zhVar.e = false;
                }
            }
        }
        if (this.d) {
            this.f.c(this);
        }
    }

    public void b() {
    }
}
