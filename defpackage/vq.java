package defpackage;

import android.util.Pair;
import android.view.ActionMode;
import android.view.View;
import android.view.WindowInsets;
import android.widget.TextView;
import com.google.android.apps.aicore.aidl.AIFeature;
import com.google.android.as.oss.R;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.security.DigestException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class vq {
    static int a(int i) {
        int iStatusBars;
        int i2 = 0;
        for (int i3 = 1; i3 <= 512; i3 += i3) {
            if ((i & i3) != 0) {
                if (i3 == 1) {
                    iStatusBars = WindowInsets.Type.statusBars();
                } else if (i3 == 2) {
                    iStatusBars = WindowInsets.Type.navigationBars();
                } else if (i3 == 4) {
                    iStatusBars = WindowInsets.Type.captionBar();
                } else if (i3 == 8) {
                    iStatusBars = WindowInsets.Type.ime();
                } else if (i3 == 16) {
                    iStatusBars = WindowInsets.Type.systemGestures();
                } else if (i3 == 32) {
                    iStatusBars = WindowInsets.Type.mandatorySystemGestures();
                } else if (i3 == 64) {
                    iStatusBars = WindowInsets.Type.tappableElement();
                } else if (i3 == 128) {
                    iStatusBars = WindowInsets.Type.displayCutout();
                }
                i2 |= iStatusBars;
            }
        }
        return i2;
    }

    public static ActionMode.Callback b(ActionMode.Callback callback) {
        if (!(callback instanceof wl)) {
            return callback;
        }
        throw null;
    }

    public static void c(TextView textView, int i) {
        un.x(i);
        if (i != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i - r0, 1.0f);
        }
    }

    public static zx d(zz zzVar, fkk fkkVar, aag aagVar) {
        try {
            try {
                return zzVar.c(fkkVar, aagVar);
            } catch (AbstractMethodError unused) {
                return zzVar.b(fjp.l(fkkVar), aagVar);
            }
        } catch (AbstractMethodError unused2) {
            return zzVar.a(fjp.l(fkkVar));
        }
    }

    public static void e(View view, aad aadVar) {
        view.getClass();
        view.setTag(R.id.view_tree_view_model_store_owner, aadVar);
    }

    public static long f(ByteBuffer byteBuffer, int i) {
        return byteBuffer.getInt(i) & 4294967295L;
    }

    public static Pair g(RandomAccessFile randomAccessFile, int i) throws IOException {
        int i2;
        long length = randomAccessFile.length();
        if (length < 22) {
            return null;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(((int) Math.min(i, (-22) + length)) + 22);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        long jCapacity = length - byteBufferAllocate.capacity();
        randomAccessFile.seek(jCapacity);
        randomAccessFile.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
        h(byteBufferAllocate);
        int iCapacity = byteBufferAllocate.capacity();
        if (iCapacity < 22) {
            i2 = -1;
        } else {
            int i3 = iCapacity - 22;
            int iMin = Math.min(i3, 65535);
            for (int i4 = 0; i4 < iMin; i4++) {
                i2 = i3 - i4;
                if (byteBufferAllocate.getInt(i2) == 101010256 && ((char) byteBufferAllocate.getShort(i2 + 20)) == i4) {
                    break;
                }
            }
            i2 = -1;
        }
        if (i2 == -1) {
            return null;
        }
        byteBufferAllocate.position(i2);
        ByteBuffer byteBufferSlice = byteBufferAllocate.slice();
        byteBufferSlice.order(ByteOrder.LITTLE_ENDIAN);
        return Pair.create(byteBufferSlice, Long.valueOf(jCapacity + i2));
    }

    public static void h(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }

    public static ByteBuffer i(ByteBuffer byteBuffer, int i) {
        int iLimit = byteBuffer.limit();
        int iPosition = byteBuffer.position();
        int i2 = i + iPosition;
        if (i2 < iPosition || i2 > iLimit) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(i2);
        try {
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            byteBufferSlice.order(byteBuffer.order());
            byteBuffer.position(i2);
            return byteBufferSlice;
        } finally {
            byteBuffer.limit(iLimit);
        }
    }

    public static X509Certificate[][] j(FileChannel fileChannel, ajr ajrVar) throws CertificateException {
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            try {
                ByteBuffer byteBufferP = p(ajrVar.a);
                int i = 0;
                while (byteBufferP.hasRemaining()) {
                    i++;
                    try {
                        arrayList.add(s(p(byteBufferP), map, certificateFactory));
                    } catch (IOException | SecurityException | BufferUnderflowException e) {
                        throw new SecurityException(a.E(i, "Failed to parse/verify signer #", " block"), e);
                    }
                }
                if (i <= 0) {
                    throw new SecurityException("No signers found");
                }
                if (map.isEmpty()) {
                    throw new SecurityException("No content digests found");
                }
                q(map, fileChannel, ajrVar.b, ajrVar.c, ajrVar.d, ajrVar.e);
                return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()][]);
            } catch (IOException e2) {
                throw new SecurityException("Failed to read list of signers", e2);
            }
        } catch (CertificateException e3) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e3);
        }
    }

    private static int m(int i) {
        if (i == 1) {
            return 32;
        }
        if (i == 2) {
            return 64;
        }
        throw new IllegalArgumentException(a.x(i, "Unknown content digest algorthm: "));
    }

    private static int n(int i) {
        if (i == 513) {
            return 1;
        }
        if (i == 514) {
            return 2;
        }
        if (i == 769) {
            return 1;
        }
        switch (i) {
            case 257:
            case 259:
                return 1;
            case 258:
            case 260:
                return 2;
            default:
                throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i))));
        }
    }

    private static String o(int i) {
        if (i == 1) {
            return "SHA-256";
        }
        if (i == 2) {
            return "SHA-512";
        }
        throw new IllegalArgumentException(a.x(i, "Unknown content digest algorthm: "));
    }

    private static ByteBuffer p(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.remaining() < 4) {
            throw new IOException("Remaining buffer too short to contain length of length-prefixed field. Remaining: " + byteBuffer.remaining());
        }
        int i = byteBuffer.getInt();
        if (i < 0) {
            throw new IllegalArgumentException("Negative length");
        }
        if (i <= byteBuffer.remaining()) {
            return i(byteBuffer, i);
        }
        throw new IOException("Length-prefixed field longer than remaining buffer. Field length: " + i + ", remaining: " + byteBuffer.remaining());
    }

    private static void q(Map map, FileChannel fileChannel, long j, long j2, long j3, ByteBuffer byteBuffer) {
        if (map.isEmpty()) {
            throw new SecurityException("No digests provided");
        }
        ajq ajqVar = new ajq(fileChannel, 0L, j);
        ajq ajqVar2 = new ajq(fileChannel, j2, j3 - j2);
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
        h(byteBufferDuplicate);
        int iPosition = byteBufferDuplicate.position() + 16;
        if (j < 0 || j > 4294967295L) {
            throw new IllegalArgumentException(a.C(j, "uint32 value of out range: "));
        }
        byteBufferDuplicate.putInt(byteBufferDuplicate.position() + iPosition, (int) j);
        ajo ajoVar = new ajo(byteBufferDuplicate);
        int size = map.size();
        int[] iArr = new int[size];
        Iterator it = map.keySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Integer) it.next()).intValue();
            i++;
        }
        try {
            byte[][] bArrT = t(iArr, new ajp[]{ajqVar, ajqVar2, ajoVar});
            for (int i2 = 0; i2 < size; i2++) {
                int i3 = iArr[i2];
                if (!MessageDigest.isEqual((byte[]) map.get(Integer.valueOf(i3)), bArrT[i2])) {
                    throw new SecurityException(o(i3).concat(" digest of contents did not verify"));
                }
            }
        } catch (DigestException e) {
            throw new SecurityException("Failed to compute digest(s) of contents", e);
        }
    }

    private static byte[] r(ByteBuffer byteBuffer) throws IOException {
        int i = byteBuffer.getInt();
        if (i < 0) {
            throw new IOException("Negative length");
        }
        if (i <= byteBuffer.remaining()) {
            byte[] bArr = new byte[i];
            byteBuffer.get(bArr);
            return bArr;
        }
        throw new IOException("Underflow while reading length-prefixed value. Length: " + i + ", available: " + byteBuffer.remaining());
    }

    private static X509Certificate[] s(ByteBuffer byteBuffer, Map map, CertificateFactory certificateFactory) throws InvalidKeySpecException, NoSuchAlgorithmException, SignatureException, IOException, InvalidKeyException, InvalidAlgorithmParameterException {
        String str;
        Pair pairCreate;
        ByteBuffer byteBufferP = p(byteBuffer);
        ByteBuffer byteBufferP2 = p(byteBuffer);
        byte[] bArrR = r(byteBuffer);
        ArrayList arrayList = new ArrayList();
        byte[] bArrR2 = null;
        byte[] bArrR3 = null;
        int i = -1;
        int i2 = 0;
        while (byteBufferP2.hasRemaining()) {
            i2++;
            try {
                ByteBuffer byteBufferP3 = p(byteBufferP2);
                if (byteBufferP3.remaining() < 8) {
                    throw new SecurityException("Signature record too short");
                }
                int i3 = byteBufferP3.getInt();
                arrayList.add(Integer.valueOf(i3));
                if (i3 != 513 && i3 != 514 && i3 != 769) {
                    switch (i3) {
                        case 257:
                        case 258:
                        case 259:
                        case 260:
                            break;
                        default:
                            continue;
                    }
                }
                if (i != -1) {
                    int iN = n(i3);
                    int iN2 = n(i);
                    if (iN != 1 && iN2 == 1) {
                    }
                }
                bArrR3 = r(byteBufferP3);
                i = i3;
            } catch (IOException | BufferUnderflowException e) {
                throw new SecurityException(a.x(i2, "Failed to parse signature record #"), e);
            }
        }
        if (i == -1) {
            if (i2 == 0) {
                throw new SecurityException("No signatures found");
            }
            throw new SecurityException("No supported signatures found");
        }
        if (i == 513 || i == 514) {
            str = "EC";
        } else if (i != 769) {
            switch (i) {
                case 257:
                case 258:
                case 259:
                case 260:
                    str = "RSA";
                    break;
                default:
                    throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i))));
            }
        } else {
            str = "DSA";
        }
        if (i == 513) {
            pairCreate = Pair.create("SHA256withECDSA", null);
        } else if (i == 514) {
            pairCreate = Pair.create("SHA512withECDSA", null);
        } else if (i != 769) {
            switch (i) {
                case 257:
                    pairCreate = Pair.create("SHA256withRSA/PSS", new PSSParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, 32, 1));
                    break;
                case 258:
                    pairCreate = Pair.create("SHA512withRSA/PSS", new PSSParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, 64, 1));
                    break;
                case 259:
                    pairCreate = Pair.create("SHA256withRSA", null);
                    break;
                case 260:
                    pairCreate = Pair.create("SHA512withRSA", null);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i))));
            }
        } else {
            pairCreate = Pair.create("SHA256withDSA", null);
        }
        String str2 = (String) pairCreate.first;
        AlgorithmParameterSpec algorithmParameterSpec = (AlgorithmParameterSpec) pairCreate.second;
        try {
            PublicKey publicKeyGeneratePublic = KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(bArrR));
            Signature signature = Signature.getInstance(str2);
            signature.initVerify(publicKeyGeneratePublic);
            if (algorithmParameterSpec != null) {
                signature.setParameter(algorithmParameterSpec);
            }
            signature.update(byteBufferP);
            if (!signature.verify(bArrR3)) {
                throw new SecurityException(String.valueOf(str2).concat(" signature did not verify"));
            }
            byteBufferP.clear();
            ByteBuffer byteBufferP4 = p(byteBufferP);
            ArrayList arrayList2 = new ArrayList();
            int i4 = 0;
            while (byteBufferP4.hasRemaining()) {
                i4++;
                try {
                    ByteBuffer byteBufferP5 = p(byteBufferP4);
                    if (byteBufferP5.remaining() < 8) {
                        throw new IOException("Record too short");
                    }
                    int i5 = byteBufferP5.getInt();
                    arrayList2.add(Integer.valueOf(i5));
                    if (i5 == i) {
                        bArrR2 = r(byteBufferP5);
                    }
                } catch (IOException | BufferUnderflowException e2) {
                    throw new IOException(a.x(i4, "Failed to parse digest record #"), e2);
                }
            }
            if (!arrayList.equals(arrayList2)) {
                throw new SecurityException("Signature algorithms don't match between digests and signatures records");
            }
            int iN3 = n(i);
            byte[] bArr = (byte[]) map.put(Integer.valueOf(iN3), bArrR2);
            if (bArr != null && !MessageDigest.isEqual(bArr, bArrR2)) {
                throw new SecurityException(o(iN3).concat(" contents digest does not match the digest specified by a preceding signer"));
            }
            ByteBuffer byteBufferP6 = p(byteBufferP);
            ArrayList arrayList3 = new ArrayList();
            int i6 = 0;
            while (byteBufferP6.hasRemaining()) {
                i6++;
                byte[] bArrR4 = r(byteBufferP6);
                try {
                    arrayList3.add(new ajt((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(bArrR4)), bArrR4));
                } catch (CertificateException e3) {
                    throw new SecurityException(a.x(i6, "Failed to decode certificate #"), e3);
                }
            }
            if (arrayList3.isEmpty()) {
                throw new SecurityException("No certificates listed");
            }
            if (Arrays.equals(bArrR, ((X509Certificate) arrayList3.get(0)).getPublicKey().getEncoded())) {
                return (X509Certificate[]) arrayList3.toArray(new X509Certificate[arrayList3.size()]);
            }
            throw new SecurityException("Public key mismatch between certificate and signature record");
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | SignatureException | InvalidKeySpecException e4) {
            throw new SecurityException(a.z(str2, "Failed to verify ", " signature"), e4);
        }
    }

    private static byte[][] t(int[] iArr, ajp[] ajpVarArr) throws DigestException {
        long j;
        int i;
        int length;
        char c;
        int i2 = 0;
        long jA = 0;
        while (true) {
            j = 1048576;
            if (i2 >= 3) {
                break;
            }
            jA += (ajpVarArr[i2].a() + 1048575) / 1048576;
            i2++;
        }
        if (jA >= 2097151) {
            throw new DigestException(a.C(jA, "Too many chunks: "));
        }
        byte[][] bArr = new byte[iArr.length][];
        int i3 = 0;
        while (true) {
            length = iArr.length;
            c = 5;
            if (i3 >= length) {
                break;
            }
            int i4 = (int) jA;
            byte[] bArr2 = new byte[(m(iArr[i3]) * i4) + 5];
            bArr2[0] = 90;
            u(i4, bArr2);
            bArr[i3] = bArr2;
            i3++;
        }
        byte[] bArr3 = new byte[5];
        bArr3[0] = -91;
        MessageDigest[] messageDigestArr = new MessageDigest[length];
        for (int i5 = 0; i5 < iArr.length; i5++) {
            String strO = o(iArr[i5]);
            try {
                messageDigestArr[i5] = MessageDigest.getInstance(strO);
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(strO.concat(" digest not supported"), e);
            }
        }
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        for (i = 3; i6 < i; i = 3) {
            ajp ajpVar = ajpVarArr[i6];
            int i9 = i6;
            long jA2 = ajpVar.a();
            long j2 = 0;
            while (jA2 > 0) {
                char c2 = c;
                int i10 = i7;
                int iMin = (int) Math.min(jA2, j);
                u(iMin, bArr3);
                for (int i11 = 0; i11 < length; i11++) {
                    messageDigestArr[i11].update(bArr3);
                }
                try {
                    ajpVar.b(messageDigestArr, j2, iMin);
                    int i12 = 0;
                    while (i12 < iArr.length) {
                        int i13 = iArr[i12];
                        byte[] bArr4 = bArr[i12];
                        int iM = m(i13);
                        ajp ajpVar2 = ajpVar;
                        MessageDigest messageDigest = messageDigestArr[i12];
                        long j3 = jA2;
                        int iDigest = messageDigest.digest(bArr4, (i10 * iM) + 5, iM);
                        if (iDigest != iM) {
                            throw new RuntimeException("Unexpected output size of " + messageDigest.getAlgorithm() + " digest: " + iDigest);
                        }
                        i12++;
                        ajpVar = ajpVar2;
                        jA2 = j3;
                    }
                    ajp ajpVar3 = ajpVar;
                    long j4 = iMin;
                    j2 += j4;
                    jA2 -= j4;
                    i7 = i10 + 1;
                    c = c2;
                    ajpVar = ajpVar3;
                    j = 1048576;
                } catch (IOException e2) {
                    throw new DigestException(a.D(i8, i10, "Failed to digest chunk #", " of section #"), e2);
                }
            }
            i8++;
            i6 = i9 + 1;
            j = 1048576;
        }
        byte[][] bArr5 = new byte[iArr.length][];
        for (int i14 = 0; i14 < iArr.length; i14++) {
            int i15 = iArr[i14];
            byte[] bArr6 = bArr[i14];
            String strO2 = o(i15);
            try {
                bArr5[i14] = MessageDigest.getInstance(strO2).digest(bArr6);
            } catch (NoSuchAlgorithmException e3) {
                throw new RuntimeException(strO2.concat(" digest not supported"), e3);
            }
        }
        return bArr5;
    }

    private static void u(int i, byte[] bArr) {
        bArr[1] = (byte) (i & AIFeature.Id.ROSIE_ROBOT_TRANSLATE);
        bArr[2] = (byte) ((i >>> 8) & AIFeature.Id.ROSIE_ROBOT_TRANSLATE);
        bArr[3] = (byte) ((i >>> 16) & AIFeature.Id.ROSIE_ROBOT_TRANSLATE);
        bArr[4] = (byte) (i >> 24);
    }

    public boolean k() {
        return false;
    }

    public boolean l(int[] iArr) {
        return false;
    }
}
