package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cbi {
    public final cay a;
    private final cbd b;

    public cbi(Context context, cbd cbdVar) {
        Context context2;
        context.getClass();
        Context applicationContext = context.getApplicationContext();
        cbj cbjVar = new cbj();
        cax caxVar = new cax(null);
        caxVar.a();
        if (applicationContext == null) {
            throw new NullPointerException("Null context");
        }
        caxVar.a = applicationContext;
        caxVar.c = cru.d(cbjVar);
        caxVar.a();
        if (caxVar.e == 1 && (context2 = caxVar.a) != null) {
            this.a = new cay(context2, caxVar.b, caxVar.c, caxVar.d);
            this.b = cbdVar;
            return;
        }
        StringBuilder sb = new StringBuilder();
        if (caxVar.a == null) {
            sb.append(" context");
        }
        if (caxVar.e == 0) {
            sb.append(" googlerOverridesCheckbox");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final String toString() {
        return "CollectionBasisLogVerifier{collectionBasisContext=" + this.a + ", basis=" + this.b + "}";
    }
}
