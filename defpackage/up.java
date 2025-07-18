package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.as.oss.R;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class up {
    public up(byte[] bArr) {
    }

    public static int a(View view) {
        return view.getImportantForAutofill();
    }

    public static void b(View view, int i) {
        view.setImportantForAutofill(8);
    }

    public static final yv c(yv yvVar, yv yvVar2) {
        yvVar.getClass();
        return (yvVar2 == null || yvVar2.compareTo(yvVar) >= 0) ? yvVar : yvVar2;
    }

    public static final void d(View view, aey aeyVar) {
        view.getClass();
        view.setTag(R.id.view_tree_saved_state_registry_owner, aeyVar);
    }

    public static final aex e(aey aeyVar) {
        return new aex(new aez(aeyVar, new lw(aeyVar, 6)));
    }

    public static final String f(Collection collection) {
        return !collection.isEmpty() ? String.valueOf(fjs.h(new fkz(fjz.k(ffh.S(collection, ",\n", "\n", "\n", null, 56)), (fiy) new mf(5, (byte[]) null), 0), "\n")).concat("},") : " }";
    }

    public static final String g(aet aetVar) {
        StringBuilder sb = new StringBuilder("\n            |TableInfo {\n            |    name = '");
        sb.append(aetVar.a);
        sb.append("',\n            |    columns = {");
        sb.append(f(ffh.K(aetVar.b.values(), new aep(3))));
        sb.append("\n            |    foreignKeys = {");
        sb.append(f(aetVar.c));
        sb.append("\n            |    indices = {");
        Set set = aetVar.d;
        sb.append(f(set != null ? ffh.K(set, new aep(4)) : fgm.a));
        sb.append("\n            |}\n        ");
        return fjz.G(sb.toString());
    }

    public static final void h(Collection collection) throws IOException {
        fjs.h(new fkz(fjz.k(ffh.S(collection, ",", null, null, null, 62)), (fiy) new mf(5, (byte[]) null), 0), "\n");
        fjs.h(new fkz(fjz.k(" }"), (fiy) new mf(5, (byte[]) null), 0), "\n");
    }

    public static final void i(Collection collection) throws IOException {
        fjs.h(new fkz(fjz.k(ffh.S(collection, ",", null, null, null, 62)), (fiy) new mf(5, (byte[]) null), 0), "\n");
        fjs.h(new fkz(fjz.k("},"), (fiy) new mf(5, (byte[]) null), 0), "\n");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean j(java.lang.String r8, java.lang.String r9) {
        /*
            boolean r0 = defpackage.fjs.c(r8, r9)
            r1 = 1
            if (r0 != 0) goto L5c
            int r0 = r8.length()
            r2 = 0
            if (r0 == 0) goto L5b
            r0 = r2
            r3 = r0
            r4 = r3
        L11:
            int r5 = r8.length()
            if (r0 >= r5) goto L3f
            char r5 = r8.charAt(r0)
            int r6 = r4 + 1
            r7 = 40
            if (r4 != 0) goto L25
            if (r5 != r7) goto L5b
            r4 = r2
            r5 = r7
        L25:
            if (r5 == r7) goto L39
            r7 = 41
            if (r5 == r7) goto L2c
            goto L3b
        L2c:
            int r3 = r3 + (-1)
            if (r3 != 0) goto L3b
            int r5 = r8.length()
            int r5 = r5 + (-1)
            if (r4 == r5) goto L3b
            goto L5b
        L39:
            int r3 = r3 + 1
        L3b:
            int r0 = r0 + 1
            r4 = r6
            goto L11
        L3f:
            if (r3 != 0) goto L5b
            int r0 = r8.length()
            int r0 = r0 + (-1)
            java.lang.String r8 = r8.substring(r1, r0)
            r8.getClass()
            java.lang.CharSequence r8 = defpackage.fjz.i(r8)
            java.lang.String r8 = r8.toString()
            boolean r8 = defpackage.fjs.c(r8, r9)
            return r8
        L5b:
            return r2
        L5c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.up.j(java.lang.String, java.lang.String):boolean");
    }

    public static final boolean k(aet aetVar, Object obj) {
        Set set;
        if (aetVar == obj) {
            return true;
        }
        if (!(obj instanceof aet)) {
            return false;
        }
        aet aetVar2 = (aet) obj;
        if (!fjs.c(aetVar.a, aetVar2.a) || !fjs.c(aetVar.b, aetVar2.b) || !fjs.c(aetVar.c, aetVar2.c)) {
            return false;
        }
        Set set2 = aetVar.d;
        if (set2 == null || (set = aetVar2.d) == null) {
            return true;
        }
        return fjs.c(set2, set);
    }

    public static cag l(djy djyVar) {
        brb brbVar = new brb((char[]) null, (byte[]) null, (byte[]) null);
        brb brbVar2 = new brb((brb) brbVar.a);
        cnx.J(djyVar, new cbm(brbVar2, djyVar, brbVar), diy.a);
        return (cag) brbVar2.a;
    }

    public static boolean m(Context context) {
        return "com.google.android.gms".equals(context.getPackageName());
    }

    public static cag n(Exception exc) {
        cal calVar = new cal();
        calVar.m(exc);
        return calVar;
    }

    public static cag o(Object obj) {
        cal calVar = new cal();
        calVar.n(obj);
        return calVar;
    }

    public up() {
        new HashMap();
    }
}
