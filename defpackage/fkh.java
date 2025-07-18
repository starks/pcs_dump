package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public class fkh implements Iterable {
    public static final fjs d = new fjs();
    public final int a;
    public final int b;
    public final int c;

    public fkh(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        this.a = i;
        this.b = fjp.y(i, i2, i3);
        this.c = i3;
    }

    public boolean a() {
        return this.c > 0 ? this.a > this.b : this.a < this.b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof fkh) {
            if (a() && ((fkh) obj).a()) {
                return true;
            }
            fkh fkhVar = (fkh) obj;
            return this.a == fkhVar.a && this.b == fkhVar.b && this.c == fkhVar.c;
        }
        return false;
    }

    public int hashCode() {
        if (a()) {
            return -1;
        }
        return (((this.a * 31) + this.b) * 31) + this.c;
    }

    @Override // java.lang.Iterable
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return new fgp(this.a, this.b, this.c);
    }

    public String toString() {
        StringBuilder sb;
        String str;
        int i = this.c;
        int i2 = this.a;
        int i3 = this.b;
        if (i > 0) {
            sb = new StringBuilder();
            sb.append(i2);
            str = "..";
        } else {
            i = -i;
            sb = new StringBuilder();
            sb.append(i2);
            str = " downTo ";
        }
        sb.append(str);
        sb.append(i3);
        sb.append(" step ");
        sb.append(i);
        return sb.toString();
    }
}
