package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cqm {
    public final int[] a;
    public final cqk b;
    public cqk c;
    public int d;
    public int e;
    public int f;

    public cqm(int[] iArr) {
        this.a = iArr;
        cqk cqkVar = new cqk(-1, -1);
        this.b = cqkVar;
        this.c = cqkVar;
    }

    private final void d(cqk cqkVar, StringBuilder sb) {
        for (cqk cqkVar2 : cqkVar.d.values()) {
            sb.append("  ");
            sb.append(cqkVar);
            sb.append(" -> ");
            sb.append(cqkVar2);
            sb.append(" [label=\"");
            int[] iArr = this.a;
            sb.append(Arrays.toString(Arrays.copyOfRange(iArr, cqkVar2.a, Math.min(iArr.length, cqkVar2.b + 1))));
            sb.append("\"]\n");
            d(cqkVar2, sb);
        }
    }

    final void a() {
        cqk cqkVar = this.c.c;
        if (cqkVar != null) {
            this.c = cqkVar;
        } else {
            this.c = this.b;
            int i = this.e;
            if (i > 0) {
                this.e = i - 1;
            }
            if (this.f > 0) {
                this.d++;
            }
        }
        b();
    }

    final void b() {
        if (this.e == 0) {
            return;
        }
        cqk cqkVar = (cqk) this.c.d.get(Integer.valueOf(this.a[this.d]));
        while (true) {
            int i = (cqkVar.b - cqkVar.a) + 1;
            int i2 = this.e;
            if (i > i2) {
                return;
            }
            int i3 = this.d + i;
            this.d = i3;
            this.c = cqkVar;
            int i4 = i2 - i;
            this.e = i4;
            if (i4 > 0) {
                cqkVar = (cqk) cqkVar.d.get(Integer.valueOf(this.a[i3]));
            }
        }
    }

    public final boolean c(int i, int i2, int i3, int i4) {
        if (i >= 0 && i3 >= 0) {
            int iMin = Math.min(this.a.length, i2);
            if (iMin - i == Math.min(this.a.length, i4) - i3) {
                for (int i5 = i; i5 <= iMin; i5++) {
                    int[] iArr = this.a;
                    if (iArr[i5] != iArr[(i3 + i5) - i]) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("digraph {\n");
        d(this.b, sb);
        sb.append("}");
        return sb.toString();
    }
}
