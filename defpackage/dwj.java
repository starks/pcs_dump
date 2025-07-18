package defpackage;

import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dwj {
    public static final dwj a = new dwj(new dwk(1));
    public static final dwj b = new dwj(new dwk(4));
    public static final dwj c;
    public static final dwj d;
    public static final dwj e;
    private final dwi f;

    static {
        new dwj(new dwk(6));
        new dwj(new dwk(5));
        c = new dwj(new dwk(0));
        d = new dwj(new dwk(3));
        e = new dwj(new dwk(2));
    }

    public dwj(dwl dwlVar) {
        if (dop.a()) {
            this.f = new dwh(dwlVar, 2);
        } else if (dcr.V()) {
            this.f = new dwh(dwlVar, 1);
        } else {
            this.f = new dwh(dwlVar, 0);
        }
    }

    public static List b(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        return arrayList;
    }

    public final Object a(String str) {
        return this.f.a(str);
    }
}
