package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fhh implements Serializable {
    private static final long serialVersionUID = 0;
    private final fhq[] a;

    public fhh(fhq[] fhqVarArr) {
        this.a = fhqVarArr;
    }

    private final Object readResolve() {
        fhq fhqVarPlus = fhr.a;
        int i = 0;
        while (true) {
            fhq[] fhqVarArr = this.a;
            if (i >= fhqVarArr.length) {
                return fhqVarPlus;
            }
            fhqVarPlus = fhqVarPlus.plus(fhqVarArr[i]);
            i++;
        }
    }
}
