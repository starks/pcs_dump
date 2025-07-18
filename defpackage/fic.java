package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fic extends fib implements fjq, fjc {
    int a;
    final /* synthetic */ View b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public fic(View view, fhk fhkVar) {
        this(fhkVar);
        this.b = view;
    }

    @Override // defpackage.fjc
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fic) c((fkw) obj, (fhk) obj2)).b(ffz.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
    
        if (r4 == r0) goto L18;
     */
    @Override // defpackage.fhx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r5) throws java.lang.Throwable {
        /*
            r4 = this;
            fhs r0 = defpackage.fhs.a
            int r1 = r4.a
            r2 = 1
            if (r1 == 0) goto L15
            if (r1 == r2) goto Ld
            defpackage.ffh.c(r5)
            goto L4e
        Ld:
            java.lang.Object r1 = r4.c
            fkw r1 = (defpackage.fkw) r1
            defpackage.ffh.c(r5)
            goto L29
        L15:
            defpackage.ffh.c(r5)
            java.lang.Object r5 = r4.c
            r1 = r5
            fkw r1 = (defpackage.fkw) r1
            android.view.View r5 = r4.b
            r4.c = r1
            r4.a = r2
            java.lang.Object r5 = r1.a(r5, r4)
            if (r5 == r0) goto L51
        L29:
            android.view.View r5 = r4.b
            boolean r2 = r5 instanceof android.view.ViewGroup
            if (r2 == 0) goto L4e
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            ux r2 = new ux
            r3 = 0
            r2.<init>(r5, r3)
            r5 = 0
            r4.c = r5
            r5 = 2
            r4.a = r5
            java.util.Iterator r5 = r2.a()
            java.lang.Object r4 = r1.b(r5, r4)
            fhs r5 = defpackage.fhs.a
            if (r4 == r5) goto L4b
            ffz r4 = defpackage.ffz.a
        L4b:
            if (r4 != r0) goto L4e
            goto L51
        L4e:
            ffz r4 = defpackage.ffz.a
            return r4
        L51:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fic.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fhx
    public final fhk c(Object obj, fhk fhkVar) {
        fic ficVar = new fic(this.b, fhkVar);
        ficVar.c = obj;
        return ficVar;
    }

    @Override // defpackage.fjq
    public final int i() {
        return 2;
    }

    @Override // defpackage.fhx
    public final String toString() {
        if (this.k != null) {
            return super.toString();
        }
        String strA = fjy.a(this);
        strA.getClass();
        return strA;
    }

    public fic(fhk fhkVar) {
        super(fhkVar);
    }
}
