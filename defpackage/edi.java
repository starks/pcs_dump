package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class edi implements egp {
    static {
        een eenVar = een.a;
        egr egrVar = egr.a;
    }

    private static final void f(egi egiVar) throws efp {
        if (egiVar != null && !egiVar.isInitialized()) {
            throw ((edg) egiVar).newUninitializedMessageException().a();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [egi, java.lang.Object] */
    @Override // defpackage.egp
    public final /* bridge */ /* synthetic */ Object a(eee eeeVar, een eenVar) throws efp {
        ?? E = e(eeeVar, eenVar);
        f(E);
        return E;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [egi, java.lang.Object] */
    @Override // defpackage.egp
    public final /* bridge */ /* synthetic */ Object b(InputStream inputStream, een eenVar) throws efp {
        eee eeeVarJ = eee.J(inputStream);
        ?? E = e(eeeVarJ, eenVar);
        eeeVarJ.z(0);
        f(E);
        return E;
    }

    @Override // defpackage.egp
    public final /* bridge */ /* synthetic */ Object c(byte[] bArr, een eenVar) throws efp {
        egi egiVarD = d(bArr, bArr.length, eenVar);
        f(egiVarD);
        return egiVarD;
    }

    public egi d(byte[] bArr, int i, een eenVar) {
        throw null;
    }
}
