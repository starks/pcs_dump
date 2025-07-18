package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cgy {
    public final eea a;
    public final String b;
    public final String c;
    public final List d;
    public final List e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    private final boolean i;
    private final List j;

    public cgy(boolean z, List list, eea eeaVar, String str, String str2, List list2, List list3, boolean z2, boolean z3, boolean z4) {
        list.getClass();
        eeaVar.getClass();
        str.getClass();
        str2.getClass();
        list2.getClass();
        list3.getClass();
        this.i = z;
        this.j = list;
        this.a = eeaVar;
        this.b = str;
        this.c = str2;
        this.d = list2;
        this.e = list3;
        this.f = z2;
        this.g = z3;
        this.h = z4;
    }

    public final boolean a(dwu dwuVar) {
        dwuVar.getClass();
        return this.i && this.j.contains(dwuVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cgy)) {
            return false;
        }
        cgy cgyVar = (cgy) obj;
        return this.i == cgyVar.i && fjs.c(this.j, cgyVar.j) && fjs.c(this.a, cgyVar.a) && fjs.c(this.b, cgyVar.b) && fjs.c(this.c, cgyVar.c) && fjs.c(this.d, cgyVar.d) && fjs.c(this.e, cgyVar.e) && this.f == cgyVar.f && this.g == cgyVar.g && this.h == cgyVar.h;
    }

    public final int hashCode() {
        int iD = (((((((((((a.d(this.i) * 31) + this.j.hashCode()) * 31) + this.a.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
        boolean z = this.h;
        return (((((iD * 31) + a.d(this.f)) * 31) + a.d(this.g)) * 31) + a.d(z);
    }

    public final String toString() {
        return "SharedStorageInfo(shouldUseSharedStorage=" + this.i + ", enabledBackings=" + this.j + ", secret=" + this.a + ", dirPath=" + this.b + ", gmsCoreDirPath=" + this.c + ", includeStaticConfigPackages=" + this.d + ", excludeStaticConfigPackages=" + this.e + ", hasStorageInfoFromGms=" + this.f + ", allowEmptySnapshotToken=" + this.g + ", enableCommitV2Api=" + this.h + ")";
    }
}
