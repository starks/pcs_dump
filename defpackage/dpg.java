package defpackage;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dpg extends dpw {
    public final dph a;
    public final fsc b;
    public final fsc c;

    public dpg(dph dphVar, fsc fscVar, fsc fscVar2) {
        this.a = dphVar;
        this.c = fscVar;
        this.b = fscVar2;
    }

    public static dpg e(dph dphVar, fsc fscVar) throws GeneralSecurityException {
        ECPoint eCPoint = dphVar.b;
        if (eCPoint == null) {
            throw new GeneralSecurityException("ECIES private key for NIST curve cannot be constructed with X25519-curve public key");
        }
        Object obj = fscVar.a;
        dpb dpbVar = dphVar.a.b;
        BigInteger order = g(dpbVar).getOrder();
        BigInteger bigInteger = (BigInteger) obj;
        if (bigInteger.signum() <= 0 || bigInteger.compareTo(order) >= 0) {
            throw new GeneralSecurityException("Invalid private value");
        }
        if (dqy.e(bigInteger, g(dpbVar)).equals(eCPoint)) {
            return new dpg(dphVar, fscVar, null);
        }
        throw new GeneralSecurityException("Invalid private value");
    }

    private static ECParameterSpec g(dpb dpbVar) {
        if (dpbVar == dpb.a) {
            return dqy.a;
        }
        if (dpbVar == dpb.b) {
            return dqy.b;
        }
        if (dpbVar == dpb.c) {
            return dqy.c;
        }
        throw new IllegalArgumentException("Unable to determine NIST curve type for ".concat(String.valueOf(String.valueOf(dpbVar))));
    }

    @Override // defpackage.dpw, defpackage.dlj
    public final /* synthetic */ dky b() {
        return this.a;
    }

    public final dpf c() {
        return this.a.a;
    }

    @Override // defpackage.dpw
    public final /* synthetic */ dpx d() {
        return this.a;
    }
}
