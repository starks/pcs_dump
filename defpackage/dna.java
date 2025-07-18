package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dna extends dte {
    public final dmz a;
    public final String b;
    public final dte c;
    private final dmy d;

    public dna(dmz dmzVar, String str, dmy dmyVar, dte dteVar) {
        this.a = dmzVar;
        this.b = str;
        this.d = dmyVar;
        this.c = dteVar;
    }

    @Override // defpackage.dli
    public final boolean a() {
        return this.a != dmz.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dna)) {
            return false;
        }
        dna dnaVar = (dna) obj;
        return dnaVar.d.equals(this.d) && dnaVar.c.equals(this.c) && dnaVar.b.equals(this.b) && dnaVar.a.equals(this.a);
    }

    public final int hashCode() {
        return Objects.hash(dna.class, this.b, this.d, this.c, this.a);
    }

    public final String toString() {
        dmz dmzVar = this.a;
        dte dteVar = this.c;
        return "LegacyKmsEnvelopeAead Parameters (kekUri: " + this.b + ", dekParsingStrategy: " + String.valueOf(this.d) + ", dekParametersForNewKeys: " + String.valueOf(dteVar) + ", variant: " + String.valueOf(dmzVar) + ")";
    }
}
