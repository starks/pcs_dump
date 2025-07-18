package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class aim extends vq {
    protected sb[] m;
    String n;
    int o;
    int p;

    public aim() {
        this.m = null;
        this.o = 0;
    }

    public sb[] getPathData() {
        return this.m;
    }

    public String getPathName() {
        return this.n;
    }

    public boolean m() {
        return false;
    }

    public void setPathData(sb[] sbVarArr) {
        sb[] sbVarArr2 = this.m;
        if (sbVarArr2 != null && sbVarArr != null) {
            if (sbVarArr2.length == sbVarArr.length) {
                for (int i = 0; i < sbVarArr2.length; i++) {
                    sb sbVar = sbVarArr2[i];
                    char c = sbVar.a;
                    sb sbVar2 = sbVarArr[i];
                    if (c == sbVar2.a && sbVar.b.length == sbVar2.b.length) {
                    }
                }
                sb[] sbVarArr3 = this.m;
                for (int i2 = 0; i2 < sbVarArr.length; i2++) {
                    sbVarArr3[i2].a = sbVarArr[i2].a;
                    int i3 = 0;
                    while (true) {
                        float[] fArr = sbVarArr[i2].b;
                        if (i3 < fArr.length) {
                            sbVarArr3[i2].b[i3] = fArr[i3];
                            i3++;
                        }
                    }
                }
                return;
            }
        }
        this.m = ul.o(sbVarArr);
    }

    public aim(aim aimVar) {
        this.m = null;
        this.o = 0;
        this.n = aimVar.n;
        int i = aimVar.p;
        this.p = 0;
        this.m = ul.o(aimVar.m);
    }
}
