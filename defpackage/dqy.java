package defpackage;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.ECField;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dqy {
    public static final ECParameterSpec a = h("115792089210356248762697446949407573530086143415290314195533631308867097853951", "115792089210356248762697446949407573529996955224135760342422259061068512044369", "5ac635d8aa3a93e7b3ebbd55769886bc651d06b0cc53b0f63bce3c3e27d2604b", "6b17d1f2e12c4247f8bce6e563a440f277037d812deb33a0f4a13945d898c296", "4fe342e2fe1a7f9b8ee7eb4a7c0f9e162bce33576b315ececbb6406837bf51f5");
    public static final ECParameterSpec b = h("39402006196394479212279040100143613805079739270465446667948293404245721771496870329047266088258938001861606973112319", "39402006196394479212279040100143613805079739270465446667946905279627659399113263569398956308152294913554433653942643", "b3312fa7e23ee7e4988e056be3f82d19181d9c6efe8141120314088f5013875ac656398d8a2ed19d2a85c8edd3ec2aef", "aa87ca22be8b05378eb1c71ef320ad746e1d3b628ba79b9859f741e082542a385502f25dbf55296c3a545e3872760ab7", "3617de4a96262c6f5d9e98bf9292dc29f8f41dbd289a147ce9da3113b5f0b8c00a60b1ce1d7e819d7a431d7c90ea0e5f");
    public static final ECParameterSpec c = h("6864797660130609714981900799081393217269435300143305409394463459185543183397656052122559640661454554977296311391480858037121987999716643812574028291115057151", "6864797660130609714981900799081393217269435300143305409394463459185543183397655394245057746333217197532963996371363321113864768612440380340372808892707005449", "051953eb9618e1c9a1f929a21a0b68540eea2da725b99b315f3b8b489918ef109e156193951ec7e937b1652c0bd3bb1bf073573df883d2c34f1ef451fd46b503f00", "c6858e06b70404e9cd9e3ecb662395b4429c648139053fb521f828af606b4d3dbaa14b5e77efe75928fe1dc127a2ffa8de3348b3c1856a429bf97e7e31c2e5bd66", "11839296a789a3bc0045c8a5fb42c7d1bd998f54449579b446817afbd17273e662c97ee72995ef42640c550b9013fad0761353c7086a272c24088be94769fd16650");
    private static final BigInteger d = BigInteger.valueOf(2);
    private static final BigInteger e = BigInteger.valueOf(3);
    private static final BigInteger f = BigInteger.valueOf(4);
    private static final BigInteger g = BigInteger.valueOf(8);

    static dqx a(dqx dqxVar, dqx dqxVar2, BigInteger bigInteger, BigInteger bigInteger2) {
        if (dqxVar.a()) {
            return dqxVar2;
        }
        if (dqxVar2.a()) {
            return dqxVar;
        }
        BigInteger bigInteger3 = dqxVar.d;
        BigInteger bigIntegerMod = bigInteger3.multiply(bigInteger3).mod(bigInteger2);
        BigInteger bigInteger4 = dqxVar2.d;
        BigInteger bigIntegerMod2 = bigInteger4.multiply(bigInteger4).mod(bigInteger2);
        BigInteger bigIntegerMod3 = dqxVar.b.multiply(bigIntegerMod2).mod(bigInteger2);
        BigInteger bigIntegerMod4 = dqxVar2.b.multiply(bigIntegerMod).mod(bigInteger2);
        BigInteger bigIntegerMod5 = dqxVar.c.multiply(dqxVar2.d).mod(bigInteger2).multiply(bigIntegerMod2).mod(bigInteger2);
        BigInteger bigIntegerMod6 = dqxVar2.c.multiply(dqxVar.d).mod(bigInteger2).multiply(bigIntegerMod).mod(bigInteger2);
        if (bigIntegerMod3.equals(bigIntegerMod4)) {
            return !bigIntegerMod5.equals(bigIntegerMod6) ? dqx.a : b(dqxVar, bigInteger, bigInteger2);
        }
        BigInteger bigIntegerMod7 = bigIntegerMod4.subtract(bigIntegerMod3).mod(bigInteger2);
        BigInteger bigIntegerMod8 = bigIntegerMod7.multiply(f).multiply(bigIntegerMod7).mod(bigInteger2);
        BigInteger bigIntegerMod9 = bigIntegerMod7.multiply(bigIntegerMod8).mod(bigInteger2);
        BigInteger bigIntegerSubtract = bigIntegerMod6.subtract(bigIntegerMod5);
        BigInteger bigInteger5 = d;
        BigInteger bigIntegerMod10 = bigIntegerSubtract.multiply(bigInteger5).mod(bigInteger2);
        BigInteger bigIntegerMod11 = bigIntegerMod3.multiply(bigIntegerMod8).mod(bigInteger2);
        BigInteger bigIntegerMod12 = bigIntegerMod10.multiply(bigIntegerMod10).mod(bigInteger2).subtract(bigIntegerMod9).subtract(bigIntegerMod11.multiply(bigInteger5)).mod(bigInteger2);
        BigInteger bigIntegerMod13 = bigIntegerMod10.multiply(bigIntegerMod11.subtract(bigIntegerMod12)).subtract(bigIntegerMod5.multiply(bigInteger5).multiply(bigIntegerMod9)).mod(bigInteger2);
        BigInteger bigIntegerAdd = dqxVar.d.add(dqxVar2.d);
        return new dqx(bigIntegerMod12, bigIntegerMod13, bigIntegerAdd.multiply(bigIntegerAdd).mod(bigInteger2).subtract(bigIntegerMod).subtract(bigIntegerMod2).multiply(bigIntegerMod7).mod(bigInteger2));
    }

    static dqx b(dqx dqxVar, BigInteger bigInteger, BigInteger bigInteger2) {
        if (dqxVar.c.equals(BigInteger.ZERO)) {
            return dqx.a;
        }
        BigInteger bigInteger3 = dqxVar.b;
        BigInteger bigIntegerMod = bigInteger3.multiply(bigInteger3).mod(bigInteger2);
        BigInteger bigInteger4 = dqxVar.c;
        BigInteger bigIntegerMod2 = bigInteger4.multiply(bigInteger4).mod(bigInteger2);
        BigInteger bigIntegerMod3 = bigIntegerMod2.multiply(bigIntegerMod2).mod(bigInteger2);
        BigInteger bigInteger5 = dqxVar.d;
        BigInteger bigIntegerMod4 = bigInteger5.multiply(bigInteger5).mod(bigInteger2);
        BigInteger bigIntegerAdd = dqxVar.b.add(bigIntegerMod2);
        BigInteger bigIntegerSubtract = bigIntegerAdd.multiply(bigIntegerAdd).mod(bigInteger2).subtract(bigIntegerMod).subtract(bigIntegerMod3);
        BigInteger bigInteger6 = d;
        BigInteger bigIntegerMultiply = bigIntegerSubtract.multiply(bigInteger6);
        BigInteger bigIntegerAdd2 = bigIntegerMod.multiply(e).add(bigInteger.multiply(bigIntegerMod4).multiply(bigIntegerMod4).mod(bigInteger2));
        BigInteger bigIntegerMod5 = bigIntegerAdd2.multiply(bigIntegerAdd2).mod(bigInteger2).subtract(bigIntegerMultiply.multiply(bigInteger6)).mod(bigInteger2);
        BigInteger bigIntegerMod6 = bigIntegerAdd2.multiply(bigIntegerMultiply.subtract(bigIntegerMod5)).mod(bigInteger2).subtract(bigIntegerMod3.multiply(g)).mod(bigInteger2);
        BigInteger bigIntegerAdd3 = dqxVar.c.add(dqxVar.d);
        return new dqx(bigIntegerMod5, bigIntegerMod6, bigIntegerAdd3.multiply(bigIntegerAdd3).mod(bigInteger2).subtract(bigIntegerMod2).subtract(bigIntegerMod4).mod(bigInteger2));
    }

    static dqx c(ECPoint eCPoint, BigInteger bigInteger) {
        if (eCPoint.equals(ECPoint.POINT_INFINITY)) {
            return dqx.a;
        }
        BigInteger bigIntegerMod = new BigInteger(1, dsi.b((bigInteger.bitLength() + 8) / 8)).mod(bigInteger);
        BigInteger bigIntegerMod2 = bigIntegerMod.multiply(bigIntegerMod).mod(bigInteger);
        return new dqx(eCPoint.getAffineX().multiply(bigIntegerMod2).mod(bigInteger), eCPoint.getAffineY().multiply(bigIntegerMod2.multiply(bigIntegerMod).mod(bigInteger)).mod(bigInteger), bigIntegerMod);
    }

    public static BigInteger d(EllipticCurve ellipticCurve) {
        ECField field = ellipticCurve.getField();
        if (field instanceof ECFieldFp) {
            return ((ECFieldFp) field).getP();
        }
        throw new GeneralSecurityException("Only curves over prime order fields are supported");
    }

    public static ECPoint e(BigInteger bigInteger, ECParameterSpec eCParameterSpec) throws GeneralSecurityException {
        ECPoint eCPoint;
        if (!g(eCParameterSpec, a) && !g(eCParameterSpec, b) && !g(eCParameterSpec, c)) {
            throw new GeneralSecurityException("spec must be NIST P256, P384 or P521");
        }
        if (bigInteger.signum() != 1) {
            throw new GeneralSecurityException("k must be positive");
        }
        if (bigInteger.compareTo(eCParameterSpec.getOrder()) >= 0) {
            throw new GeneralSecurityException("k must be smaller than the order of the generator");
        }
        EllipticCurve curve = eCParameterSpec.getCurve();
        ECPoint generator = eCParameterSpec.getGenerator();
        f(generator, curve);
        BigInteger a2 = eCParameterSpec.getCurve().getA();
        BigInteger bigIntegerD = d(curve);
        dqx dqxVarC = c(ECPoint.POINT_INFINITY, bigIntegerD);
        dqx dqxVarC2 = c(generator, bigIntegerD);
        for (int iBitLength = bigInteger.bitLength(); iBitLength >= 0; iBitLength--) {
            if (bigInteger.testBit(iBitLength)) {
                dqxVarC = a(dqxVarC, dqxVarC2, a2, bigIntegerD);
                dqxVarC2 = b(dqxVarC2, a2, bigIntegerD);
            } else {
                dqxVarC2 = a(dqxVarC, dqxVarC2, a2, bigIntegerD);
                dqxVarC = b(dqxVarC, a2, bigIntegerD);
            }
        }
        if (dqxVarC.a()) {
            eCPoint = ECPoint.POINT_INFINITY;
        } else {
            BigInteger bigIntegerModInverse = dqxVarC.d.modInverse(bigIntegerD);
            BigInteger bigIntegerMod = bigIntegerModInverse.multiply(bigIntegerModInverse).mod(bigIntegerD);
            eCPoint = new ECPoint(dqxVarC.b.multiply(bigIntegerMod).mod(bigIntegerD), dqxVarC.c.multiply(bigIntegerMod).mod(bigIntegerD).multiply(bigIntegerModInverse).mod(bigIntegerD));
        }
        f(eCPoint, curve);
        return eCPoint;
    }

    public static void f(ECPoint eCPoint, EllipticCurve ellipticCurve) {
        BigInteger bigIntegerD = d(ellipticCurve);
        BigInteger affineX = eCPoint.getAffineX();
        BigInteger affineY = eCPoint.getAffineY();
        if (affineX == null || affineY == null) {
            throw new GeneralSecurityException("point is at infinity");
        }
        if (affineX.signum() == -1 || affineX.compareTo(bigIntegerD) >= 0) {
            throw new GeneralSecurityException("x is out of range");
        }
        if (affineY.signum() == -1 || affineY.compareTo(bigIntegerD) >= 0) {
            throw new GeneralSecurityException("y is out of range");
        }
        if (!affineY.multiply(affineY).mod(bigIntegerD).equals(affineX.multiply(affineX).add(ellipticCurve.getA()).multiply(affineX).add(ellipticCurve.getB()).mod(bigIntegerD))) {
            throw new GeneralSecurityException("Point is not on curve");
        }
    }

    public static boolean g(ECParameterSpec eCParameterSpec, ECParameterSpec eCParameterSpec2) {
        return eCParameterSpec.getCurve().equals(eCParameterSpec2.getCurve()) && eCParameterSpec.getGenerator().equals(eCParameterSpec2.getGenerator()) && eCParameterSpec.getOrder().equals(eCParameterSpec2.getOrder()) && eCParameterSpec.getCofactor() == eCParameterSpec2.getCofactor();
    }

    private static ECParameterSpec h(String str, String str2, String str3, String str4, String str5) {
        BigInteger bigInteger = new BigInteger(str);
        return new ECParameterSpec(new EllipticCurve(new ECFieldFp(bigInteger), bigInteger.subtract(new BigInteger("3")), new BigInteger(str3, 16)), new ECPoint(new BigInteger(str4, 16), new BigInteger(str5, 16)), new BigInteger(str2), 1);
    }
}
