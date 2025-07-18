package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bgh {
    public final String a;
    public final Object b;
    oc c;
    public int d;
    public int e;
    public final /* synthetic */ bgr f;

    protected bgh(bgr bgrVar, bgh bghVar) {
        this(bgrVar, bghVar.a);
        synchronized (bghVar.b) {
            this.d = bghVar.d;
            oc ocVar = this.c;
            this.c = bghVar.c;
            bghVar.c = ocVar;
            bghVar.d = 0;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AbstractCounter(");
        sb.append(this.a);
        sb.append(")[");
        synchronized (this.b) {
            int i = 0;
            while (true) {
                oc ocVar = this.c;
                if (i < ocVar.f) {
                    nz nzVar = (nz) ocVar.g(i);
                    sb.append(this.c.d(i));
                    sb.append(" -> [");
                    for (int i2 = 0; i2 < nzVar.a(); i2++) {
                        sb.append(nzVar.b(i2));
                        sb.append(" = ");
                        sb.append(((long[]) nzVar.d(i2))[0]);
                        sb.append(", ");
                    }
                    sb.append("], ");
                    i++;
                }
            }
        }
        sb.append("]");
        return sb.toString();
    }

    protected bgh(bgr bgrVar, String str) {
        this.f = bgrVar;
        this.b = new Object();
        this.c = new oc();
        this.e = bgrVar.c;
        Object[] objArr = {str};
        if (!bgrVar.j.containsKey(str)) {
            this.a = str;
            return;
        }
        throw new IllegalStateException(String.format("counter/histogram already exists: %s", objArr));
    }
}
