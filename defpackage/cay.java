package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cay {
    public final Context a;
    public final cru b;
    private final cru c;
    private final cru d;

    public cay() {
    }

    public final Context a() {
        return this.a;
    }

    public final cru b() {
        return this.c;
    }

    public final cru c() {
        return this.b;
    }

    public final cru d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cay) {
            cay cayVar = (cay) obj;
            if (this.a.equals(cayVar.a()) && this.c.equals(cayVar.b()) && this.d.equals(cayVar.d()) && this.b.equals(cayVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((this.a.hashCode() ^ 1000003) * 1000003) ^ 2040732332) * 1000003) ^ this.d.hashCode()) * 1000003;
        return this.b.hashCode() ^ ((iHashCode ^ 1237) * 1000003);
    }

    public final String toString() {
        cru cruVar = this.b;
        cru cruVar2 = this.d;
        cru cruVar3 = this.c;
        return "CollectionBasisContext{context=" + String.valueOf(this.a) + ", accountNames=" + String.valueOf(cruVar3) + ", stacktrace=" + String.valueOf(cruVar2) + ", googlerOverridesCheckbox=false, executor=" + String.valueOf(cruVar) + "}";
    }

    public cay(Context context, cru cruVar, cru cruVar2, cru cruVar3) {
        this();
        this.a = context;
        this.c = cruVar;
        this.d = cruVar2;
        this.b = cruVar3;
    }
}
