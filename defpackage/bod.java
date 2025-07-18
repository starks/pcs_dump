package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.util.Pair;
import j$.nio.channels.DesugarChannels;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.ref.SoftReference;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.cert.X509Certificate;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bod {
    public static final brb c = new brb();
    private static SoftReference e;
    public final Context a;
    public final boi b;
    public final fcy d;
    private final bny f;

    public bod(Context context, fcy fcyVar, bny bnyVar, boi boiVar) {
        this.a = context;
        this.d = fcyVar;
        this.f = bnyVar;
        this.b = boiVar;
    }

    public static synchronized bod c(Context context, fcy fcyVar, bny bnyVar, boi boiVar) {
        bod bodVar;
        SoftReference softReference = e;
        if (softReference != null && (bodVar = (bod) softReference.get()) != null) {
            return bodVar;
        }
        bod bodVar2 = new bod(context, fcyVar, bnyVar, boiVar);
        e = new SoftReference(bodVar2);
        return bodVar2;
    }

    public final boolean a() {
        SoftReference softReference = e;
        return softReference != null && this == ((bod) softReference.get());
    }

    public final boolean b(File file) throws GeneralSecurityException, IOException {
        Pair pairG;
        try {
            bny bnyVar = this.f;
            try {
                try {
                    RandomAccessFile randomAccessFile = new RandomAccessFile(file.getAbsolutePath(), "r");
                    try {
                        if (randomAccessFile.length() < 22) {
                            pairG = null;
                        } else {
                            pairG = vq.g(randomAccessFile, 0);
                            if (pairG == null) {
                                pairG = vq.g(randomAccessFile, 65535);
                            }
                        }
                        if (pairG == null) {
                            throw new ajs("Not an APK file: ZIP End of Central Directory record not found in file with " + randomAccessFile.length() + " bytes");
                        }
                        ByteBuffer byteBuffer = (ByteBuffer) pairG.first;
                        long jLongValue = ((Long) pairG.second).longValue();
                        long j = (-20) + jLongValue;
                        if (j >= 0) {
                            randomAccessFile.seek(j);
                            if (randomAccessFile.readInt() == 1347094023) {
                                throw new ajs("ZIP64 APK not supported");
                            }
                        }
                        vq.h(byteBuffer);
                        long jF = vq.f(byteBuffer, byteBuffer.position() + 16);
                        if (jF >= jLongValue) {
                            throw new ajs("ZIP Central Directory offset out of range: " + jF + ". ZIP End of Central Directory offset: " + jLongValue);
                        }
                        vq.h(byteBuffer);
                        if (vq.f(byteBuffer, byteBuffer.position() + 12) + jF != jLongValue) {
                            throw new ajs("ZIP Central Directory is not immediately followed by End of Central Directory");
                        }
                        if (jF < 32) {
                            throw new ajs(a.C(jF, "APK too small for APK Signing Block. ZIP Central Directory offset: "));
                        }
                        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(24);
                        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
                        randomAccessFile.seek(jF - byteBufferAllocate.capacity());
                        randomAccessFile.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
                        if (byteBufferAllocate.getLong(8) != 2334950737559900225L || byteBufferAllocate.getLong(16) != 3617552046287187010L) {
                            throw new ajs("No APK Signing Block before ZIP Central Directory");
                        }
                        long j2 = byteBufferAllocate.getLong(0);
                        if (j2 < byteBufferAllocate.capacity() || j2 > 2147483639) {
                            throw new ajs(a.C(j2, "APK Signing Block size out of range: "));
                        }
                        int i = (int) (8 + j2);
                        long j3 = jF - i;
                        if (j3 < 0) {
                            throw new ajs(a.C(j3, "APK Signing Block offset out of range: "));
                        }
                        ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(i);
                        byteBufferAllocate2.order(ByteOrder.LITTLE_ENDIAN);
                        randomAccessFile.seek(j3);
                        randomAccessFile.readFully(byteBufferAllocate2.array(), byteBufferAllocate2.arrayOffset(), byteBufferAllocate2.capacity());
                        long j4 = byteBufferAllocate2.getLong(0);
                        if (j4 != j2) {
                            throw new ajs("APK Signing Block sizes in header and footer do not match: " + j4 + " vs " + j2);
                        }
                        Pair pairCreate = Pair.create(byteBufferAllocate2, Long.valueOf(j3));
                        ByteBuffer byteBuffer2 = (ByteBuffer) pairCreate.first;
                        long jLongValue2 = ((Long) pairCreate.second).longValue();
                        if (byteBuffer2.order() != ByteOrder.LITTLE_ENDIAN) {
                            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
                        }
                        int iCapacity = byteBuffer2.capacity() - 24;
                        if (iCapacity < 8) {
                            throw new IllegalArgumentException(a.D(8, iCapacity, "end < start: ", " < "));
                        }
                        int iCapacity2 = byteBuffer2.capacity();
                        if (iCapacity > byteBuffer2.capacity()) {
                            throw new IllegalArgumentException(a.D(iCapacity2, iCapacity, "end > capacity: ", " > "));
                        }
                        int iLimit = byteBuffer2.limit();
                        int iPosition = byteBuffer2.position();
                        try {
                            byteBuffer2.position(0);
                            byteBuffer2.limit(iCapacity);
                            byteBuffer2.position(8);
                            ByteBuffer byteBufferSlice = byteBuffer2.slice();
                            byteBufferSlice.order(byteBuffer2.order());
                            byteBuffer2.position(0);
                            byteBuffer2.limit(iLimit);
                            byteBuffer2.position(iPosition);
                            int i2 = 0;
                            while (byteBufferSlice.hasRemaining()) {
                                i2++;
                                if (byteBufferSlice.remaining() < 8) {
                                    throw new ajs(a.x(i2, "Insufficient data to read size of APK Signing Block entry #"));
                                }
                                long j5 = byteBufferSlice.getLong();
                                if (j5 < 4 || j5 > 2147483647L) {
                                    throw new ajs("APK Signing Block entry #" + i2 + " size out of range: " + j5);
                                }
                                int i3 = (int) j5;
                                int iPosition2 = byteBufferSlice.position() + i3;
                                if (i3 > byteBufferSlice.remaining()) {
                                    throw new ajs("APK Signing Block entry #" + i2 + " size out of range: " + i3 + ", available: " + byteBufferSlice.remaining());
                                }
                                if (byteBufferSlice.getInt() == 1896449818) {
                                    X509Certificate[][] x509CertificateArrJ = vq.j(DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(randomAccessFile.getChannel()), new ajr(vq.i(byteBufferSlice, i3 - 4), jLongValue2, jF, jLongValue, byteBuffer));
                                    randomAccessFile.close();
                                    if (x509CertificateArrJ.length != 1) {
                                        throw new GeneralSecurityException("APK has more than one signature.");
                                    }
                                    byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(x509CertificateArrJ[0][0].getEncoded());
                                    if (!Arrays.equals(((boa) bnyVar).d, bArrDigest) && ("user".equals(Build.TYPE) || !Arrays.equals(((boa) bnyVar).c, bArrDigest))) {
                                        return false;
                                    }
                                    return true;
                                }
                                byteBufferSlice.position(iPosition2);
                            }
                            throw new ajs("No APK Signature Scheme v2 block in APK Signing Block");
                        } catch (Throwable th) {
                            byteBuffer2.position(0);
                            byteBuffer2.limit(iLimit);
                            byteBuffer2.position(iPosition);
                            throw th;
                        }
                    } finally {
                        try {
                            randomAccessFile.close();
                        } catch (IOException unused) {
                        }
                    }
                } catch (IOException | RuntimeException e2) {
                    throw new GeneralSecurityException("Failed to verify signatures", e2);
                }
            } catch (ajs e3) {
                throw new GeneralSecurityException("Package is not signed", e3);
            }
        } catch (GeneralSecurityException e4) {
            Log.e("DG", "APK at " + file.getAbsolutePath() + " failed signature verification", e4);
            return false;
        }
    }
}
