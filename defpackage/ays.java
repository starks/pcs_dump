package defpackage;

import j$.util.Optional;
import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ays {
    public Object a;
    public Object b;

    public ays() {
    }

    public final ayt a() {
        Object obj = this.a;
        if (obj == null) {
            throw new IllegalStateException("Missing required properties: clientId");
        }
        return new ayt((String) obj, (Optional) this.b);
    }

    public final void b(ayr ayrVar) {
        this.b = Optional.of(ayrVar);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, yx] */
    public final void c(yz yzVar, yu yuVar) {
        yv yvVarA = yuVar.a();
        this.a = up.c((yv) this.a, yvVarA);
        this.b.g(yzVar, yuVar);
        this.a = yvVarA;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0010  */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int d(int r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.b
            r1 = -1
            if (r0 != 0) goto L7
            goto L7f
        L7:
            int[] r0 = (int[]) r0
            int r0 = r0.length
            if (r5 >= r0) goto L7f
            java.lang.Object r0 = r4.a
            if (r0 != 0) goto L12
        L10:
            r0 = r1
            goto L5c
        L12:
            int r0 = r0.size()
            int r0 = r0 + r1
        L17:
            if (r0 < 0) goto L29
            java.lang.Object r2 = r4.a
            java.lang.Object r2 = r2.get(r0)
            kv r2 = (defpackage.kv) r2
            int r3 = r2.a
            if (r3 != r5) goto L26
            goto L2a
        L26:
            int r0 = r0 + (-1)
            goto L17
        L29:
            r2 = 0
        L2a:
            if (r2 == 0) goto L31
            java.lang.Object r0 = r4.a
            r0.remove(r2)
        L31:
            java.lang.Object r0 = r4.a
            int r0 = r0.size()
            r2 = 0
        L38:
            if (r2 >= r0) goto L4a
            java.lang.Object r3 = r4.a
            java.lang.Object r3 = r3.get(r2)
            kv r3 = (defpackage.kv) r3
            int r3 = r3.a
            if (r3 < r5) goto L47
            goto L4b
        L47:
            int r2 = r2 + 1
            goto L38
        L4a:
            r2 = r1
        L4b:
            if (r2 == r1) goto L10
            java.lang.Object r0 = r4.a
            java.lang.Object r0 = r0.get(r2)
            kv r0 = (defpackage.kv) r0
            java.lang.Object r3 = r4.a
            r3.remove(r2)
            int r0 = r0.a
        L5c:
            if (r0 != r1) goto L6c
            java.lang.Object r0 = r4.b
            int[] r0 = (int[]) r0
            int r2 = r0.length
            java.util.Arrays.fill(r0, r5, r2, r1)
            java.lang.Object r4 = r4.b
            int[] r4 = (int[]) r4
            int r4 = r4.length
            return r4
        L6c:
            int r0 = r0 + 1
            java.lang.Object r2 = r4.b
            int[] r2 = (int[]) r2
            int r2 = r2.length
            int r0 = java.lang.Math.min(r0, r2)
            java.lang.Object r4 = r4.b
            int[] r4 = (int[]) r4
            java.util.Arrays.fill(r4, r5, r0, r1)
            return r0
        L7f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ays.d(int):int");
    }

    public final void e() {
        Object obj = this.b;
        if (obj != null) {
            Arrays.fill((int[]) obj, -1);
        }
        this.a = null;
    }

    public final void f(int i) {
        Object obj = this.b;
        if (obj == null) {
            int[] iArr = new int[Math.max(i, 10) + 1];
            this.b = iArr;
            Arrays.fill(iArr, -1);
            return;
        }
        int[] iArr2 = (int[]) obj;
        int length = iArr2.length;
        if (i >= length) {
            while (length <= i) {
                length += length;
            }
            int[] iArr3 = new int[length];
            this.b = iArr3;
            int length2 = iArr2.length;
            System.arraycopy(obj, 0, iArr3, 0, length2);
            int[] iArr4 = (int[]) this.b;
            Arrays.fill(iArr4, length2, iArr4.length, -1);
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.List] */
    public final void g(int i, int i2) {
        Object obj = this.b;
        if (obj == null || i >= ((int[]) obj).length) {
            return;
        }
        int i3 = i + i2;
        f(i3);
        Object obj2 = this.b;
        System.arraycopy(obj2, i, obj2, i3, (((int[]) obj2).length - i) - i2);
        Arrays.fill((int[]) this.b, i, i3, -1);
        ?? r0 = this.a;
        if (r0 != 0) {
            for (int size = r0.size() - 1; size >= 0; size--) {
                kv kvVar = (kv) this.a.get(size);
                int i4 = kvVar.a;
                if (i4 >= i) {
                    kvVar.a = i4 + i2;
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, java.util.List] */
    public final void h(int i, int i2) {
        Object obj = this.b;
        if (obj == null || i >= ((int[]) obj).length) {
            return;
        }
        int i3 = i + i2;
        f(i3);
        Object obj2 = this.b;
        System.arraycopy(obj2, i3, obj2, i, (((int[]) obj2).length - i) - i2);
        int[] iArr = (int[]) this.b;
        int length = iArr.length;
        Arrays.fill(iArr, length - i2, length, -1);
        ?? r1 = this.a;
        if (r1 != 0) {
            for (int size = r1.size() - 1; size >= 0; size--) {
                kv kvVar = (kv) this.a.get(size);
                int i4 = kvVar.a;
                if (i4 >= i) {
                    if (i4 < i3) {
                        this.a.remove(size);
                    } else {
                        kvVar.a = i4 - i2;
                    }
                }
            }
        }
    }

    public ays(yy yyVar, yv yvVar) {
        Object zkVar;
        yvVar.getClass();
        zd zdVar = zd.a;
        boolean z = yyVar instanceof yx;
        boolean z2 = yyVar instanceof yp;
        if (z && z2) {
            zkVar = new yq((yp) yyVar, (yx) yyVar);
        } else if (z2) {
            zkVar = new yq((yp) yyVar, null);
        } else if (z) {
            zkVar = (yx) yyVar;
        } else {
            Class<?> cls = yyVar.getClass();
            if (zd.a.a(cls) == 2) {
                Object obj = zd.b.get(cls);
                obj.getClass();
                List list = (List) obj;
                if (list.size() == 1) {
                    zkVar = new zp(zd.b((Constructor) list.get(0), yyVar), 2);
                } else {
                    int size = list.size();
                    yr[] yrVarArr = new yr[size];
                    for (int i = 0; i < size; i++) {
                        yrVarArr[i] = zd.b((Constructor) list.get(i), yyVar);
                    }
                    zkVar = new zp(yrVarArr, 1);
                }
            } else {
                zkVar = new zk(yyVar);
            }
        }
        this.b = zkVar;
        this.a = yvVar;
    }

    public ays(byte[] bArr) {
        this();
        this.b = Optional.empty();
    }
}
