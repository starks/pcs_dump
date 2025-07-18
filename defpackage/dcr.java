package defpackage;

import com.google.android.apps.aicore.aidl.AIFeature;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedSet;
import java.util.logging.Level;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dcr {
    public static volatile dcr c;

    public dcr() {
    }

    public static Object A(Iterable iterable) {
        Iterator it = iterable.iterator();
        Object next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        StringBuilder sb = new StringBuilder("expected one element but was: <");
        sb.append(next);
        for (int i = 0; i < 4 && it.hasNext(); i++) {
            sb.append(", ");
            sb.append(it.next());
        }
        if (it.hasNext()) {
            sb.append(", ...");
        }
        sb.append('>');
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    public static Object[] B(Iterable iterable) {
        boolean z = iterable instanceof Collection;
        ?? r1 = iterable;
        if (!z) {
            Iterator it = iterable.iterator();
            ArrayList arrayList = new ArrayList();
            x(arrayList, it);
            r1 = arrayList;
        }
        return r1.toArray();
    }

    public static Object C(Iterable iterable) {
        return y(((cyw) iterable).listIterator());
    }

    public static int D(int i) {
        return (int) (Integer.rotateLeft((int) (i * (-862048943)), 15) * 461845907);
    }

    public static int E(Object obj) {
        return D(obj == null ? 0 : obj.hashCode());
    }

    public static int F(int i, int i2) {
        return i & (~i2);
    }

    public static int G(int i, int i2, int i3) {
        return (i & (~i3)) | (i2 & i3);
    }

    public static int H(int i) {
        return (i < 32 ? 4 : 2) * (i + 1);
    }

    public static int I(Object obj, Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i2;
        int i3;
        int iE = E(obj);
        int i4 = iE & i;
        int iJ = J(obj3, i4);
        if (iJ == 0) {
            return -1;
        }
        int iF = F(iE, i);
        int i5 = -1;
        while (true) {
            i2 = iJ - 1;
            int i6 = iArr[i2];
            i3 = i6 & i;
            if (F(i6, i) == iF && a.g(obj, objArr[i2]) && (objArr2 == null || a.g(obj2, objArr2[i2]))) {
                break;
            }
            if (i3 == 0) {
                return -1;
            }
            i5 = i2;
            iJ = i3;
        }
        if (i5 == -1) {
            L(obj3, i4, i3);
            return i2;
        }
        iArr[i5] = G(iArr[i5], i3, i);
        return i2;
    }

    public static int J(Object obj, int i) {
        return obj instanceof byte[] ? ((byte[]) obj)[i] & 255 : obj instanceof short[] ? (char) ((short[]) obj)[i] : ((int[]) obj)[i];
    }

    public static Object K(int i) {
        if (i < 2 || i > 1073741824 || Integer.highestOneBit(i) != i) {
            throw new IllegalArgumentException(a.x(i, "must be power of 2 between 2^1 and 2^30: "));
        }
        return i <= 256 ? new byte[i] : i <= 65536 ? new short[i] : new int[i];
    }

    public static void L(Object obj, int i, int i2) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }

    public static void M(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(String.valueOf(obj2))));
        }
        if (obj2 == null) {
            throw new NullPointerException(a.G(obj, "null value in entry: ", "=null"));
        }
    }

    public static void N(boolean z) {
        clq.G(z, "no calls to next() since the last call to remove()");
    }

    public static void O(int i, String str) {
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i);
    }

    public static Object P(Object obj) {
        Object[] objArr = new Object[0];
        if (obj != null) {
            return obj;
        }
        throw new csn(clq.u("expected a non-null reference", objArr));
    }

    public static void Q(boolean z, String str, Object obj) {
        if (!z) {
            throw new csn(clq.u(str, obj));
        }
    }

    public static String R(String str) {
        return "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat(str);
    }

    public static byte[] S(byte[] bArr, byte[] bArr2) throws InvalidKeyException {
        int i;
        if (bArr.length != 32) {
            throw new InvalidKeyException("Private key must have 32 bytes.");
        }
        long[] jArr = new long[11];
        byte[] bArrCopyOf = Arrays.copyOf(bArr, 32);
        int i2 = 0;
        bArrCopyOf[0] = (byte) (bArrCopyOf[0] & 248);
        int i3 = bArrCopyOf[31] & Byte.MAX_VALUE;
        bArrCopyOf[31] = (byte) i3;
        bArrCopyOf[31] = (byte) (i3 | 64);
        byte[][] bArr3 = dqw.a;
        if (bArr2.length != 32) {
            throw new InvalidKeyException("Public key length is not 32-byte");
        }
        byte[] bArrCopyOf2 = Arrays.copyOf(bArr2, 32);
        bArrCopyOf2[31] = (byte) (bArrCopyOf2[31] & Byte.MAX_VALUE);
        for (int i4 = 0; i4 < 7; i4++) {
            if (MessageDigest.isEqual(dqw.a[i4], bArrCopyOf2)) {
                throw new InvalidKeyException("Banned public key: ".concat(String.valueOf(X(dqw.a[i4]))));
            }
        }
        int[] iArr = dqz.a;
        int i5 = 10;
        long[] jArr2 = new long[10];
        int i6 = 0;
        while (true) {
            i = 8;
            if (i6 >= i5) {
                break;
            }
            int i7 = dqz.a[i6];
            long j = (bArrCopyOf2[i7 + 2] & 255) << 16;
            jArr2[i6] = (((j | ((bArrCopyOf2[i7] & 255) | ((bArrCopyOf2[i7 + 1] & 255) << 8))) | ((bArrCopyOf2[i7 + 3] & 255) << 24)) >> dqz.b[i6]) & dqz.c[i6 & 1];
            i6++;
            i5 = 10;
            i2 = i2;
        }
        int i8 = i2;
        int i9 = 19;
        long[] jArr3 = new long[19];
        long[] jArr4 = new long[19];
        jArr4[i8] = 1;
        long[] jArr5 = new long[19];
        jArr5[i8] = 1;
        long[] jArr6 = new long[19];
        long[] jArr7 = new long[19];
        long[] jArr8 = new long[19];
        jArr8[i8] = 1;
        long[] jArr9 = new long[19];
        long[] jArr10 = new long[19];
        jArr10[i8] = 1;
        System.arraycopy(jArr2, i8, jArr3, i8, 10);
        int i10 = 0;
        while (i10 < 32) {
            int i11 = bArrCopyOf[31 - i10] & 255;
            long[] jArr11 = jArr10;
            long[] jArr12 = jArr9;
            long[] jArr13 = jArr8;
            long[] jArr14 = jArr7;
            long[] jArr15 = jArr6;
            long[] jArr16 = jArr5;
            int i12 = 0;
            while (i12 < i) {
                int i13 = (i11 >> (7 - i12)) & 1;
                dqw.a(jArr16, jArr3, i13);
                dqw.a(jArr15, jArr4, i13);
                byte[] bArr4 = bArrCopyOf;
                long[] jArrCopyOf = Arrays.copyOf(jArr16, 10);
                long[] jArr17 = new long[i9];
                int i14 = i10;
                long[] jArr18 = new long[i9];
                int i15 = i11;
                long[] jArr19 = new long[i9];
                int i16 = i12;
                long[] jArr20 = new long[i9];
                long[] jArr21 = jArr;
                long[] jArr22 = new long[i9];
                long[] jArr23 = new long[i9];
                long[] jArr24 = new long[i9];
                dqz.i(jArr16, jArr16, jArr15);
                dqz.h(jArr15, jArrCopyOf, jArr15);
                long[] jArrCopyOf2 = Arrays.copyOf(jArr3, 10);
                dqz.i(jArr3, jArr3, jArr4);
                dqz.h(jArr4, jArrCopyOf2, jArr4);
                dqz.b(jArr20, jArr3, jArr15);
                dqz.b(jArr22, jArr16, jArr4);
                dqz.e(jArr20);
                dqz.d(jArr20);
                dqz.e(jArr22);
                dqz.d(jArr22);
                long[] jArr25 = jArr3;
                System.arraycopy(jArr20, 0, jArrCopyOf2, 0, 10);
                dqz.i(jArr20, jArr20, jArr22);
                dqz.h(jArr22, jArrCopyOf2, jArr22);
                dqz.g(jArr24, jArr20);
                dqz.g(jArr23, jArr22);
                dqz.b(jArr22, jArr23, jArr2);
                dqz.e(jArr22);
                dqz.d(jArr22);
                System.arraycopy(jArr24, 0, jArr14, 0, 10);
                System.arraycopy(jArr22, 0, jArr13, 0, 10);
                dqz.g(jArr18, jArr16);
                dqz.g(jArr19, jArr15);
                dqz.b(jArr12, jArr18, jArr19);
                dqz.e(jArr12);
                dqz.d(jArr12);
                dqz.h(jArr19, jArr18, jArr19);
                Arrays.fill(jArr17, 10, 18, 0L);
                dqz.f(jArr17, jArr19, 121665L);
                dqz.d(jArr17);
                dqz.i(jArr17, jArr17, jArr18);
                long[] jArr26 = jArr11;
                dqz.b(jArr26, jArr19, jArr17);
                dqz.e(jArr26);
                dqz.d(jArr26);
                dqw.a(jArr12, jArr14, i13);
                dqw.a(jArr26, jArr13, i13);
                i12 = i16 + 1;
                long[] jArr27 = jArr13;
                jArr13 = jArr4;
                jArr4 = jArr27;
                long[] jArr28 = jArr12;
                jArr12 = jArr16;
                jArr16 = jArr28;
                jArr11 = jArr15;
                jArr3 = jArr14;
                i10 = i14;
                i11 = i15;
                jArr = jArr21;
                jArr14 = jArr25;
                i9 = 19;
                i = 8;
                jArr15 = jArr26;
                bArrCopyOf = bArr4;
            }
            i10++;
            jArr5 = jArr16;
            jArr6 = jArr15;
            jArr7 = jArr14;
            jArr8 = jArr13;
            jArr9 = jArr12;
            i9 = 19;
            i = 8;
            jArr10 = jArr11;
            bArrCopyOf = bArrCopyOf;
        }
        long[] jArr29 = jArr;
        long[] jArr30 = new long[10];
        long[] jArr31 = new long[10];
        long[] jArr32 = new long[10];
        long[] jArr33 = new long[10];
        long[] jArr34 = new long[10];
        long[] jArr35 = new long[10];
        long[] jArr36 = new long[10];
        long[] jArr37 = new long[10];
        long[] jArr38 = new long[10];
        long[] jArr39 = new long[10];
        long[] jArr40 = jArr3;
        long[] jArr41 = new long[10];
        dqz.g(jArr31, jArr6);
        dqz.g(jArr41, jArr31);
        dqz.g(jArr39, jArr41);
        dqz.a(jArr32, jArr39, jArr6);
        dqz.a(jArr33, jArr32, jArr31);
        dqz.g(jArr39, jArr33);
        dqz.a(jArr34, jArr39, jArr32);
        dqz.g(jArr39, jArr34);
        dqz.g(jArr41, jArr39);
        dqz.g(jArr39, jArr41);
        dqz.g(jArr41, jArr39);
        dqz.g(jArr39, jArr41);
        dqz.a(jArr35, jArr39, jArr34);
        dqz.g(jArr39, jArr35);
        dqz.g(jArr41, jArr39);
        for (int i17 = 2; i17 < 10; i17 += 2) {
            dqz.g(jArr39, jArr41);
            dqz.g(jArr41, jArr39);
        }
        dqz.a(jArr36, jArr41, jArr35);
        dqz.g(jArr39, jArr36);
        dqz.g(jArr41, jArr39);
        for (int i18 = 2; i18 < 20; i18 += 2) {
            dqz.g(jArr39, jArr41);
            dqz.g(jArr41, jArr39);
        }
        dqz.a(jArr39, jArr41, jArr36);
        dqz.g(jArr41, jArr39);
        dqz.g(jArr39, jArr41);
        for (int i19 = 2; i19 < 10; i19 += 2) {
            dqz.g(jArr41, jArr39);
            dqz.g(jArr39, jArr41);
        }
        dqz.a(jArr37, jArr39, jArr35);
        dqz.g(jArr39, jArr37);
        dqz.g(jArr41, jArr39);
        for (int i20 = 2; i20 < 50; i20 += 2) {
            dqz.g(jArr39, jArr41);
            dqz.g(jArr41, jArr39);
        }
        dqz.a(jArr38, jArr41, jArr37);
        dqz.g(jArr41, jArr38);
        dqz.g(jArr39, jArr41);
        for (int i21 = 2; i21 < 100; i21 += 2) {
            dqz.g(jArr41, jArr39);
            dqz.g(jArr39, jArr41);
        }
        dqz.a(jArr41, jArr39, jArr38);
        dqz.g(jArr39, jArr41);
        dqz.g(jArr41, jArr39);
        for (int i22 = 2; i22 < 50; i22 += 2) {
            dqz.g(jArr39, jArr41);
            dqz.g(jArr41, jArr39);
        }
        dqz.a(jArr39, jArr41, jArr37);
        dqz.g(jArr41, jArr39);
        dqz.g(jArr39, jArr41);
        dqz.g(jArr41, jArr39);
        dqz.g(jArr39, jArr41);
        dqz.g(jArr41, jArr39);
        dqz.a(jArr30, jArr41, jArr33);
        dqz.a(jArr29, jArr5, jArr30);
        long[] jArr42 = new long[10];
        long[] jArr43 = new long[10];
        long[] jArr44 = new long[11];
        long[] jArr45 = new long[11];
        long[] jArr46 = new long[11];
        dqz.a(jArr42, jArr2, jArr29);
        dqz.i(jArr43, jArr2, jArr29);
        long[] jArr47 = new long[10];
        jArr47[0] = 486662;
        dqz.i(jArr45, jArr43, jArr47);
        dqz.a(jArr45, jArr45, jArr4);
        dqz.i(jArr45, jArr45, jArr40);
        dqz.a(jArr45, jArr45, jArr42);
        dqz.a(jArr45, jArr45, jArr40);
        dqz.f(jArr44, jArr45, 4L);
        dqz.d(jArr44);
        dqz.a(jArr45, jArr42, jArr4);
        dqz.h(jArr45, jArr45, jArr4);
        dqz.a(jArr46, jArr43, jArr40);
        dqz.i(jArr45, jArr45, jArr46);
        dqz.g(jArr45, jArr45);
        if (MessageDigest.isEqual(dqz.j(jArr44), dqz.j(jArr45))) {
            return dqz.j(jArr29);
        }
        throw new IllegalStateException("Arithmetic error in curve multiplication with the public key: ".concat(String.valueOf(X(bArr2))));
    }

    public static byte[] T() {
        byte[] bArrB = dsi.b(32);
        bArrB[0] = (byte) (bArrB[0] | 7);
        int i = bArrB[31] & 63;
        bArrB[31] = (byte) i;
        bArrB[31] = (byte) (i | 128);
        return bArrB;
    }

    public static byte[] U(byte[] bArr) throws InvalidKeyException {
        if (bArr.length != 32) {
            throw new InvalidKeyException("Private key must have 32 bytes.");
        }
        byte[] bArr2 = new byte[32];
        bArr2[0] = 9;
        return S(bArr, bArr2);
    }

    public static boolean V() {
        return "The Android Project".equals(System.getProperty("java.vendor"));
    }

    public static byte[] W(byte[] bArr, byte[] bArr2, String str, byte[] bArr3, byte[] bArr4, int i) throws IllegalStateException, GeneralSecurityException {
        byte[] bArrAl = al(bArr, bArr2);
        Mac mac = (Mac) dwj.b.a(str);
        if (i > mac.getMacLength() * AIFeature.Id.ROSIE_ROBOT_TRANSLATE) {
            throw new GeneralSecurityException("size too large");
        }
        if (bArr3.length == 0) {
            mac.init(new SecretKeySpec(new byte[mac.getMacLength()], str));
        } else {
            mac.init(new SecretKeySpec(bArr3, str));
        }
        byte[] bArr5 = new byte[i];
        mac.init(new SecretKeySpec(mac.doFinal(bArrAl), str));
        byte[] bArrDoFinal = new byte[0];
        int i2 = 1;
        int i3 = 0;
        while (true) {
            mac.update(bArrDoFinal);
            mac.update(bArr4);
            mac.update((byte) i2);
            bArrDoFinal = mac.doFinal();
            int length = bArrDoFinal.length;
            int i4 = i3 + length;
            if (i4 >= i) {
                System.arraycopy(bArrDoFinal, 0, bArr5, i3, i - i3);
                return bArr5;
            }
            System.arraycopy(bArrDoFinal, 0, bArr5, i3, length);
            i2++;
            i3 = i4;
        }
    }

    public static String X(byte[] bArr) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (byte b : bArr) {
            sb.append("0123456789abcdef".charAt((b & 255) >> 4));
            sb.append("0123456789abcdef".charAt(b & 15));
        }
        return sb.toString();
    }

    public static byte[] Y(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Expected a string of even length");
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i + i;
            int iDigit = Character.digit(str.charAt(i2), 16);
            int iDigit2 = Character.digit(str.charAt(i2 + 1), 16);
            if (iDigit == -1 || iDigit2 == -1) {
                throw new IllegalArgumentException("input is not hexadecimal");
            }
            bArr[i] = (byte) ((iDigit * 16) + iDigit2);
        }
        return bArr;
    }

    public static int Z(EllipticCurve ellipticCurve) {
        return (dqy.d(ellipticCurve).subtract(BigInteger.ONE).bitLength() + 7) / 8;
    }

    public static KeyPair aa(dwe dweVar) {
        return ab(af(dweVar));
    }

    public static KeyPair ab(ECParameterSpec eCParameterSpec) throws InvalidAlgorithmParameterException {
        KeyPairGenerator keyPairGenerator = (KeyPairGenerator) dwj.d.a("EC");
        keyPairGenerator.initialize(eCParameterSpec);
        return keyPairGenerator.generateKeyPair();
    }

    public static ECPrivateKey ac(dwe dweVar, byte[] bArr) throws NoSuchAlgorithmException {
        return (ECPrivateKey) ((KeyFactory) dwj.e.a("EC")).generatePrivate(new ECPrivateKeySpec(new BigInteger(1, bArr), af(dweVar)));
    }

    public static ECPublicKey ad(dwe dweVar, dwf dwfVar, byte[] bArr) {
        return ae(af(dweVar), dwfVar, bArr);
    }

    public static ECPublicKey ae(ECParameterSpec eCParameterSpec, dwf dwfVar, byte[] bArr) {
        return (ECPublicKey) ((KeyFactory) dwj.e.a("EC")).generatePublic(new ECPublicKeySpec(ag(eCParameterSpec.getCurve(), dwfVar, bArr), eCParameterSpec));
    }

    public static ECParameterSpec af(dwe dweVar) throws NoSuchAlgorithmException {
        int iOrdinal = dweVar.ordinal();
        if (iOrdinal == 0) {
            return dqy.a;
        }
        if (iOrdinal == 1) {
            return dqy.b;
        }
        if (iOrdinal == 2) {
            return dqy.c;
        }
        throw new NoSuchAlgorithmException("curve not implemented:".concat(String.valueOf(String.valueOf(dweVar))));
    }

    public static ECPoint ag(EllipticCurve ellipticCurve, dwf dwfVar, byte[] bArr) throws GeneralSecurityException {
        int iZ = Z(ellipticCurve);
        int iOrdinal = dwfVar.ordinal();
        boolean z = false;
        if (iOrdinal == 0) {
            int length = bArr.length;
            if (length != iZ + iZ + 1) {
                throw new GeneralSecurityException("invalid point size");
            }
            if (bArr[0] != 4) {
                throw new GeneralSecurityException("invalid point format");
            }
            int i = iZ + 1;
            ECPoint eCPoint = new ECPoint(new BigInteger(1, Arrays.copyOfRange(bArr, 1, i)), new BigInteger(1, Arrays.copyOfRange(bArr, i, length)));
            dqy.f(eCPoint, ellipticCurve);
            return eCPoint;
        }
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                throw new GeneralSecurityException("invalid format:".concat(String.valueOf(String.valueOf(dwfVar))));
            }
            int i2 = iZ + iZ;
            int length2 = bArr.length;
            if (length2 != i2) {
                throw new GeneralSecurityException("invalid point size");
            }
            ECPoint eCPoint2 = new ECPoint(new BigInteger(1, Arrays.copyOf(bArr, iZ)), new BigInteger(1, Arrays.copyOfRange(bArr, iZ, length2)));
            dqy.f(eCPoint2, ellipticCurve);
            return eCPoint2;
        }
        int i3 = iZ + 1;
        BigInteger bigIntegerD = dqy.d(ellipticCurve);
        int length3 = bArr.length;
        if (length3 != i3) {
            throw new GeneralSecurityException("compressed point has wrong length");
        }
        byte b = bArr[0];
        if (b != 2) {
            if (b != 3) {
                throw new GeneralSecurityException("invalid format");
            }
            z = true;
        }
        BigInteger bigInteger = new BigInteger(1, Arrays.copyOfRange(bArr, 1, length3));
        if (bigInteger.signum() == -1 || bigInteger.compareTo(bigIntegerD) >= 0) {
            throw new GeneralSecurityException("x is out of range");
        }
        return new ECPoint(bigInteger, at(bigInteger, z, ellipticCurve));
    }

    public static byte[] ah(ECPrivateKey eCPrivateKey, ECPublicKey eCPublicKey) throws IllegalStateException, GeneralSecurityException {
        try {
            if (!dqy.g(eCPublicKey.getParams(), eCPrivateKey.getParams())) {
                throw new GeneralSecurityException("invalid public key spec");
            }
            ECPoint w = eCPublicKey.getW();
            dqy.f(w, eCPrivateKey.getParams().getCurve());
            PublicKey publicKeyGeneratePublic = ((KeyFactory) dwj.e.a("EC")).generatePublic(new ECPublicKeySpec(w, eCPrivateKey.getParams()));
            KeyAgreement keyAgreement = (KeyAgreement) dwj.c.a("ECDH");
            keyAgreement.init(eCPrivateKey);
            try {
                keyAgreement.doPhase(publicKeyGeneratePublic, true);
                byte[] bArrGenerateSecret = keyAgreement.generateSecret();
                EllipticCurve curve = eCPrivateKey.getParams().getCurve();
                BigInteger bigInteger = new BigInteger(1, bArrGenerateSecret);
                if (bigInteger.signum() == -1 || bigInteger.compareTo(dqy.d(curve)) >= 0) {
                    throw new GeneralSecurityException("shared secret is out of range");
                }
                at(bigInteger, true, curve);
                return bArrGenerateSecret;
            } catch (IllegalStateException e) {
                throw new GeneralSecurityException(e);
            }
        } catch (IllegalArgumentException | NullPointerException e2) {
            throw new GeneralSecurityException(e2);
        }
    }

    public static byte[] ai(dwe dweVar, dwf dwfVar, ECPoint eCPoint) {
        return aj(af(dweVar).getCurve(), dwfVar, eCPoint);
    }

    public static byte[] aj(EllipticCurve ellipticCurve, dwf dwfVar, ECPoint eCPoint) throws GeneralSecurityException {
        dqy.f(eCPoint, ellipticCurve);
        int iZ = Z(ellipticCurve);
        int iOrdinal = dwfVar.ordinal();
        if (iOrdinal == 0) {
            int i = iZ + 1;
            int i2 = iZ + iZ + 1;
            byte[] bArr = new byte[i2];
            byte[] bArrAq = aq(eCPoint.getAffineX());
            byte[] bArrAq2 = aq(eCPoint.getAffineY());
            int length = bArrAq2.length;
            System.arraycopy(bArrAq2, 0, bArr, i2 - length, length);
            int length2 = bArrAq.length;
            System.arraycopy(bArrAq, 0, bArr, i - length2, length2);
            bArr[0] = 4;
            return bArr;
        }
        if (iOrdinal == 1) {
            int i3 = iZ + 1;
            byte[] bArr2 = new byte[i3];
            byte[] bArrAq3 = aq(eCPoint.getAffineX());
            int length3 = bArrAq3.length;
            System.arraycopy(bArrAq3, 0, bArr2, i3 - length3, length3);
            bArr2[0] = true == eCPoint.getAffineY().testBit(0) ? (byte) 3 : (byte) 2;
            return bArr2;
        }
        if (iOrdinal != 2) {
            throw new GeneralSecurityException("invalid format:".concat(String.valueOf(String.valueOf(dwfVar))));
        }
        int i4 = iZ + iZ;
        byte[] bArr3 = new byte[i4];
        byte[] bArrAq4 = aq(eCPoint.getAffineX());
        int length4 = bArrAq4.length;
        if (length4 > iZ) {
            bArrAq4 = Arrays.copyOfRange(bArrAq4, length4 - iZ, length4);
        }
        byte[] bArrAq5 = aq(eCPoint.getAffineY());
        int length5 = bArrAq5.length;
        if (length5 > iZ) {
            bArrAq5 = Arrays.copyOfRange(bArrAq5, length5 - iZ, length5);
        }
        int length6 = bArrAq5.length;
        System.arraycopy(bArrAq5, 0, bArr3, i4 - length6, length6);
        int length7 = bArrAq4.length;
        System.arraycopy(bArrAq4, 0, bArr3, iZ - length7, length7);
        return bArr3;
    }

    public static void ak(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i) {
        if (i < 0 || byteBuffer2.remaining() < i || byteBuffer3.remaining() < i || byteBuffer.remaining() < i) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        for (int i2 = 0; i2 < i; i2++) {
            byteBuffer.put((byte) (byteBuffer2.get() ^ byteBuffer3.get()));
        }
    }

    public static byte[] al(byte[]... bArr) throws GeneralSecurityException {
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= bArr.length) {
                byte[] bArr2 = new byte[i2];
                int i3 = 0;
                for (byte[] bArr3 : bArr) {
                    int length = bArr3.length;
                    System.arraycopy(bArr3, 0, bArr2, i3, length);
                    i3 += length;
                }
                return bArr2;
            }
            int length2 = bArr[i].length;
            if (i2 > Integer.MAX_VALUE - length2) {
                throw new GeneralSecurityException("exceeded size limit");
            }
            i2 += length2;
            i++;
        }
    }

    public static byte[] am(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length == bArr2.length) {
            return an(bArr, 0, bArr2, length);
        }
        throw new IllegalArgumentException("The lengths of x and y should match.");
    }

    public static byte[] an(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (bArr.length - i2 < i || bArr2.length - i2 < 0) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        byte[] bArr3 = new byte[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr3[i3] = (byte) (bArr[i3 + i] ^ bArr2[i3]);
        }
        return bArr3;
    }

    public static byte[] ao(byte[] bArr) {
        int length = bArr.length;
        if (length >= 16) {
            throw new IllegalArgumentException("x must be smaller than a block.");
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, 16);
        bArrCopyOf[length] = Byte.MIN_VALUE;
        return bArrCopyOf;
    }

    public static byte[] ap(byte[] bArr) {
        if (bArr.length != 16) {
            throw new IllegalArgumentException("value must be a block.");
        }
        byte[] bArr2 = new byte[16];
        int i = 0;
        while (i < 16) {
            int i2 = i + 1;
            byte b = bArr[i];
            byte b2 = (byte) ((b + b) & AIFeature.Id.ROSIE_ROBOT_GEM_AUDIO);
            bArr2[i] = b2;
            if (i < 15) {
                bArr2[i] = (byte) (((bArr[i2] >> 7) & 1) | b2);
            }
            i = i2;
        }
        bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & 135)) ^ bArr2[15]);
        return bArr2;
    }

    public static byte[] aq(BigInteger bigInteger) {
        if (bigInteger.signum() != -1) {
            return bigInteger.toByteArray();
        }
        throw new IllegalArgumentException("n must not be negative");
    }

    public static byte[] ar(BigInteger bigInteger, int i) throws GeneralSecurityException {
        if (bigInteger.signum() == -1) {
            throw new IllegalArgumentException("integer must be nonnegative");
        }
        byte[] byteArray = bigInteger.toByteArray();
        int length = byteArray.length;
        if (length == i) {
            return byteArray;
        }
        int i2 = i + 1;
        if (length > i2) {
            throw new GeneralSecurityException("integer too large");
        }
        if (length == i2) {
            if (byteArray[0] == 0) {
                return Arrays.copyOfRange(byteArray, 1, length);
            }
            throw new GeneralSecurityException("integer too large");
        }
        byte[] bArr = new byte[i];
        System.arraycopy(byteArray, 0, bArr, i - length, length);
        return bArr;
    }

    public static fsc as(Class cls, String str) {
        try {
            return new fsc(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e) {
            throw new AssertionError(e);
        }
    }

    private static BigInteger at(BigInteger bigInteger, boolean z, EllipticCurve ellipticCurve) throws GeneralSecurityException {
        BigInteger bigIntegerModPow;
        BigInteger bigInteger2;
        BigInteger bigIntegerD = dqy.d(ellipticCurve);
        BigInteger bigIntegerMod = bigInteger.multiply(bigInteger).add(ellipticCurve.getA()).multiply(bigInteger).add(ellipticCurve.getB()).mod(bigIntegerD);
        if (bigIntegerD.signum() != 1) {
            throw new InvalidAlgorithmParameterException("p must be positive");
        }
        BigInteger bigIntegerMod2 = bigIntegerMod.mod(bigIntegerD);
        if (bigIntegerMod2.equals(BigInteger.ZERO)) {
            bigInteger2 = BigInteger.ZERO;
        } else {
            if (bigIntegerD.testBit(0) && bigIntegerD.testBit(1)) {
                bigIntegerModPow = bigIntegerMod2.modPow(bigIntegerD.add(BigInteger.ONE).shiftRight(2), bigIntegerD);
            } else {
                bigIntegerModPow = null;
                if (bigIntegerD.testBit(0) && !bigIntegerD.testBit(1)) {
                    BigInteger bigIntegerAdd = BigInteger.ONE;
                    BigInteger bigIntegerShiftRight = bigIntegerD.subtract(BigInteger.ONE).shiftRight(1);
                    int i = 0;
                    while (true) {
                        BigInteger bigIntegerMod3 = bigIntegerAdd.multiply(bigIntegerAdd).subtract(bigIntegerMod2).mod(bigIntegerD);
                        if (bigIntegerMod3.equals(BigInteger.ZERO)) {
                            bigInteger2 = bigIntegerAdd;
                            break;
                        }
                        BigInteger bigIntegerModPow2 = bigIntegerMod3.modPow(bigIntegerShiftRight, bigIntegerD);
                        if (bigIntegerModPow2.add(BigInteger.ONE).equals(bigIntegerD)) {
                            BigInteger bigIntegerShiftRight2 = bigIntegerD.add(BigInteger.ONE).shiftRight(1);
                            BigInteger bigIntegerMod4 = BigInteger.ONE;
                            BigInteger bigInteger3 = bigIntegerAdd;
                            for (int iBitLength = bigIntegerShiftRight2.bitLength() - 2; iBitLength >= 0; iBitLength--) {
                                BigInteger bigIntegerMultiply = bigInteger3.multiply(bigIntegerMod4);
                                BigInteger bigIntegerMod5 = bigInteger3.multiply(bigInteger3).add(bigIntegerMod4.multiply(bigIntegerMod4).mod(bigIntegerD).multiply(bigIntegerMod3)).mod(bigIntegerD);
                                BigInteger bigIntegerMod6 = bigIntegerMultiply.add(bigIntegerMultiply).mod(bigIntegerD);
                                if (bigIntegerShiftRight2.testBit(iBitLength)) {
                                    BigInteger bigIntegerMod7 = bigIntegerMod5.multiply(bigIntegerAdd).add(bigIntegerMod6.multiply(bigIntegerMod3)).mod(bigIntegerD);
                                    bigIntegerMod4 = bigIntegerAdd.multiply(bigIntegerMod6).add(bigIntegerMod5).mod(bigIntegerD);
                                    bigInteger3 = bigIntegerMod7;
                                } else {
                                    bigInteger3 = bigIntegerMod5;
                                    bigIntegerMod4 = bigIntegerMod6;
                                }
                            }
                            bigIntegerModPow = bigInteger3;
                        } else {
                            if (!bigIntegerModPow2.equals(BigInteger.ONE)) {
                                throw new InvalidAlgorithmParameterException("p is not prime");
                            }
                            bigIntegerAdd = bigIntegerAdd.add(BigInteger.ONE);
                            i++;
                            if (i == 128 && !bigIntegerD.isProbablePrime(80)) {
                                throw new InvalidAlgorithmParameterException("p is not prime");
                            }
                        }
                    }
                }
            }
            if (bigIntegerModPow != null && bigIntegerModPow.multiply(bigIntegerModPow).mod(bigIntegerD).compareTo(bigIntegerMod2) != 0) {
                throw new GeneralSecurityException("Could not find a modular square root");
            }
            bigInteger2 = bigIntegerModPow;
        }
        return z != bigInteger2.testBit(0) ? bigIntegerD.subtract(bigInteger2).mod(bigIntegerD) : bigInteger2;
    }

    public static int d(Level level) {
        int iIntValue = level.intValue();
        if (iIntValue >= Level.SEVERE.intValue()) {
            return 6;
        }
        if (iIntValue >= Level.WARNING.intValue()) {
            return 5;
        }
        if (iIntValue >= Level.INFO.intValue()) {
            return 4;
        }
        return iIntValue >= Level.FINE.intValue() ? 3 : 2;
    }

    public static String e(String str, boolean z) {
        if (str.length() > 23) {
            int i = -1;
            for (int length = str.length() - 1; length >= 0; length--) {
                char cCharAt = str.charAt(length);
                if (cCharAt == '.' || cCharAt == '$') {
                    i = length;
                    break;
                }
            }
            str = str.substring(i + 1);
        }
        String strConcat = "".concat(String.valueOf(str));
        return !z ? strConcat : strConcat.substring(0, Math.min(strConcat.length(), 23));
    }

    public static boolean f(Comparator comparator, Iterable iterable) {
        Comparator comparator2;
        comparator.getClass();
        iterable.getClass();
        if (iterable instanceof SortedSet) {
            comparator2 = ((SortedSet) iterable).comparator();
            if (comparator2 == null) {
                comparator2 = cyi.a;
            }
        } else {
            if (!(iterable instanceof cza)) {
                return false;
            }
            comparator2 = ((cza) iterable).comparator();
        }
        return comparator.equals(comparator2);
    }

    public static int g(Set set) {
        Iterator it = set.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    public static HashSet h(int i) {
        return new HashSet(p(i));
    }

    public static boolean i(Set set, Collection collection) {
        collection.getClass();
        if (collection instanceof cyh) {
            collection = ((cyh) collection).a();
        }
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            return j(set, collection.iterator());
        }
        Iterator it = set.iterator();
        collection.getClass();
        boolean z = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public static boolean j(Set set, Iterator it) {
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= set.remove(it.next());
        }
        return zRemove;
    }

    public static void k(cyg cygVar, ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(cygVar.j().size());
        for (Map.Entry entry : cygVar.j().entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeInt(((Collection) entry.getValue()).size());
            Iterator it = ((Collection) entry.getValue()).iterator();
            while (it.hasNext()) {
                objectOutputStream.writeObject(it.next());
            }
        }
    }

    public static void l(Object obj, int i) {
        if (obj == null) {
            throw new NullPointerException(a.x(i, "at index "));
        }
    }

    public static void m(Object... objArr) {
        n(objArr, objArr.length);
    }

    public static void n(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            l(objArr[i2], i2);
        }
    }

    public static cxd o(Iterable iterable, crp crpVar) {
        cxh cxhVar = new cxh(null);
        for (Object obj : iterable) {
            obj.getClass();
            Object objA = crpVar.a(obj);
            M(objA, obj);
            cwt cwtVarB = (cwt) cxhVar.a().get(objA);
            if (cwtVarB == null) {
                cwtVarB = cxh.b(cxhVar.b);
                cxhVar.a().put(objA, cwtVarB);
            }
            cwtVarB.c(obj);
        }
        Map map = cxhVar.a;
        if (map == null) {
            return cwm.a;
        }
        Set<Map.Entry> setEntrySet = map.entrySet();
        if (setEntrySet.isEmpty()) {
            return cwm.a;
        }
        cxe cxeVar = new cxe(setEntrySet.size());
        int i = 0;
        for (Map.Entry entry : setEntrySet) {
            Object key = entry.getKey();
            cxc cxcVarG = ((cwy) entry.getValue()).g();
            cxeVar.b(key, cxcVarG);
            i += ((cyp) cxcVarG).c;
        }
        return new cxd(cxeVar.e(), i);
    }

    public static int p(int i) {
        if (i < 3) {
            O(i, "expectedSize");
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) Math.ceil(i / 0.75d);
        }
        return Integer.MAX_VALUE;
    }

    public static Object q(Map map, Object obj) {
        map.getClass();
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    public static LinkedHashMap r(int i) {
        return new LinkedHashMap(p(i));
    }

    public static boolean s(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static ArrayList t(int i) {
        O(i, "initialArraySize");
        return new ArrayList(i);
    }

    public static List u(List list) {
        return list instanceof cxc ? ((cxc) list).h() : list instanceof cxz ? ((cxz) list).a : list instanceof RandomAccess ? new cxx(list) : new cxz(list);
    }

    public static boolean v(List list, Object obj) {
        if (obj == list) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list2 = (List) obj;
        int size = list.size();
        if (size != list2.size()) {
            return false;
        }
        if (list2 instanceof RandomAccess) {
            for (int i = 0; i < size; i++) {
                if (!a.g(list.get(i), list2.get(i))) {
                    return false;
                }
            }
            return true;
        }
        Iterator it = list.iterator();
        Iterator it2 = list2.iterator();
        while (true) {
            if (it.hasNext()) {
                if (!it2.hasNext() || !a.g(it.next(), it2.next())) {
                    break;
                }
            } else if (!it2.hasNext()) {
                return true;
            }
        }
        return false;
    }

    public static void w(Iterator it) {
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    public static void x(Collection collection, Iterator it) {
        collection.getClass();
        it.getClass();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    public static Object y(Iterator it) {
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object z(Iterable iterable) {
        if (iterable.isEmpty()) {
            throw new NoSuchElementException();
        }
        return iterable.get(iterable.size() - 1);
    }

    public dbg a() {
        return dbf.a;
    }

    public dcy b() {
        return dcy.b;
    }

    public dcr(byte[] bArr) {
    }

    public dcr(byte[] bArr, byte[] bArr2) {
        this(null);
    }

    public dcr(char[] cArr, byte[] bArr) {
        Object obj = dqu.a;
    }

    public void c(String str, Level level, boolean z) {
    }
}
