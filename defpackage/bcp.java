package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bcp {
    public static volatile epg a;

    public static long a(byte[] bArr) {
        byte[] bArr2 = bArr;
        int length = bArr2.length;
        long j = -5435081209227447693L;
        boolean z = false;
        if (length <= 32) {
            if (length > 16) {
                long jN = n(bArr2, 0) * (-5435081209227447693L);
                long jN2 = n(bArr2, 8);
                long j2 = (length + length) - 7286425919675154353L;
                long jN3 = n(bArr2, length - 8) * j2;
                return m(Long.rotateRight(jN + jN2, 43) + Long.rotateRight(jN3, 30) + (n(bArr2, length - 16) * (-7286425919675154353L)), jN + Long.rotateRight(jN2 - 7286425919675154353L, 18) + jN3, j2);
            }
            if (length >= 8) {
                long j3 = (length + length) - 7286425919675154353L;
                long jN4 = n(bArr2, 0) - 7286425919675154353L;
                long jN5 = n(bArr2, length - 8);
                return m((Long.rotateRight(jN5, 37) * j3) + jN4, (Long.rotateRight(jN4, 25) + jN5) * j3, j3);
            }
            if (length >= 4) {
                return m(length + ((l(bArr2, 0) & 4294967295L) << 3), l(bArr2, length - 4) & 4294967295L, (length + length) - 7286425919675154353L);
            }
            if (length <= 0) {
                return -7286425919675154353L;
            }
            return o((((bArr2[0] & 255) + ((bArr2[length >> 1] & 255) << 8)) * (-7286425919675154353L)) ^ ((length + ((bArr2[length - 1] & 255) << 2)) * (-4348849565147123417L))) * (-7286425919675154353L);
        }
        char c = '@';
        if (length <= 64) {
            long jN6 = n(bArr2, 0) * (-7286425919675154353L);
            long jN7 = n(bArr2, 8);
            long j4 = (length + length) - 7286425919675154353L;
            long jN8 = n(bArr2, length - 8) * j4;
            long jN9 = n(bArr2, length - 16) * (-7286425919675154353L);
            long jRotateRight = Long.rotateRight(jN6 + jN7, 43) + Long.rotateRight(jN8, 30);
            long jRotateRight2 = Long.rotateRight(jN7 - 7286425919675154353L, 18) + jN6;
            long jN10 = n(bArr2, 16) * j4;
            long jN11 = n(bArr2, 24);
            long j5 = jRotateRight + jN9;
            long jN12 = j5 + n(bArr2, length - 32);
            long j6 = jN12 * j4;
            return m(Long.rotateRight(jN10 + jN11, 43) + Long.rotateRight(j6, 30) + ((m(j5, jRotateRight2 + jN8, j4) + n(bArr2, length - 24)) * j4), jN10 + Long.rotateRight(jN11 + jN6, 18) + j6, j4);
        }
        long[] jArr = new long[2];
        long[] jArr2 = new long[2];
        long jN13 = n(bArr2, 0) + 95310865018149119L;
        long jO = o(-7956866745689871395L) * (-7286425919675154353L);
        long j7 = 2480279821605975764L;
        int i = 0;
        while (true) {
            int i2 = length - 1;
            boolean z2 = z;
            int i3 = (i2 >> 6) * 64;
            char c2 = c;
            long jRotateRight3 = Long.rotateRight(jN13 + j7 + jArr[z2 ? 1 : 0] + n(bArr2, i + 8), 37) * j;
            long jRotateRight4 = Long.rotateRight(j7 + jArr[1] + n(bArr2, i + 48), 42) * j;
            long j8 = jRotateRight3 ^ jArr2[1];
            long j9 = j;
            long jN14 = n(bArr2, i + 40) + jArr[z2 ? 1 : 0];
            long jRotateRight5 = Long.rotateRight(jO + jArr2[z2 ? 1 : 0], 33) * j9;
            int i4 = i;
            p(bArr2, i4, jArr[1] * j9, j8 + jArr2[z2 ? 1 : 0], jArr);
            long[] jArr3 = jArr;
            j7 = jRotateRight4 + jN14;
            p(bArr2, i4 + 32, jRotateRight5 + jArr2[1], n(bArr2, i4 + 16) + j7, jArr2);
            i = i4 + 64;
            if (i == i3) {
                int i5 = i2 & 63;
                int i6 = i3 + i5;
                long j10 = j8 & 255;
                long j11 = j10 + j10 + j9;
                long j12 = jArr2[z2 ? 1 : 0] + i5;
                long j13 = jArr3[z2 ? 1 : 0] + j12;
                jArr3[z2 ? 1 : 0] = j13;
                jArr2[z2 ? 1 : 0] = j12 + j13;
                long jRotateRight6 = Long.rotateRight(jRotateRight5 + j7 + j13 + n(bArr2, i6 - 55), 37) * j11;
                long jRotateRight7 = Long.rotateRight(j7 + jArr3[1] + n(bArr2, i6 - 15), 42) * j11;
                long j14 = jArr2[1] * 9;
                long jN15 = (jArr3[z2 ? 1 : 0] * 9) + n(bArr2, i6 - 23);
                long jRotateRight8 = Long.rotateRight(j8 + jArr2[z2 ? 1 : 0], 33) * j11;
                long j15 = jRotateRight6 ^ j14;
                p(bArr2, i6 - 63, jArr3[1] * j11, j15 + jArr2[z2 ? 1 : 0], jArr3);
                long j16 = jRotateRight7 + jN15;
                p(bArr2, i6 - 31, jArr2[1] + jRotateRight8, n(bArr2, i6 - 47) + j16, jArr2);
                return m(m(jArr3[z2 ? 1 : 0], jArr2[z2 ? 1 : 0], j11) + (o(j16) * (-4348849565147123417L)) + j15, m(jArr3[1], jArr2[1], j11) + jRotateRight8, j11);
            }
            bArr2 = bArr;
            c = c2;
            z = z2 ? 1 : 0;
            jO = j8;
            j = j9;
            jN13 = jRotateRight5;
            jArr = jArr3;
        }
    }

    public static /* synthetic */ String b(int i) {
        return i != 1 ? "PERSONALIZED_TRAINING_OPTIONS" : "FEDERATED_TRAINING_OPTIONS";
    }

    public static void c(bkj bkjVar, Status status, cbx cbxVar) {
        try {
            bkjVar.a(status);
        } catch (RemoteException e) {
            cbxVar.j(e, "Unexpected RemoteException");
        }
    }

    public static void d(btq btqVar, bkj bkjVar, Executor executor, cbx cbxVar, Context context) {
        cnx.J(cnx.F(new cjb(btqVar, 1), executor), new ero(bkjVar, cbxVar, executor, context.getApplicationContext(), 1), executor);
    }

    public static bqp e(ccm ccmVar) {
        bqo bqoVar = new bqo();
        int iB = ccl.b(ccmVar.c);
        if (iB == 0) {
            iB = ccl.d;
        }
        bqoVar.a = iB == ccl.b ? 0 : 1;
        eek eekVar = ccmVar.d;
        if (eekVar == null) {
            eekVar = eek.a;
        }
        bqoVar.b = ehx.a(eekVar);
        return bqoVar.a();
    }

    public static ccf f(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? ccf.UNRECOGNIZED : ccf.ATTESTATION_NONE : ccf.ATTESTATION_DROID_GUARD_NO_IDS : ccf.ATTESTATION_DROID_GUARD_FULL : ccf.ATTESTATION_DEFAULT;
    }

    public static ccg g(bqg bqgVar) {
        asr asrVar = (asr) ccg.a.createBuilder();
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        String str = bqgVar.d;
        ccg ccgVar = (ccg) asrVar.a;
        str.getClass();
        ccgVar.c = str;
        ccf ccfVarF = f(bqgVar.e);
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        ((ccg) asrVar.a).d = ccfVarF.a();
        bqp bqpVar = bqgVar.j;
        if (bqpVar != null) {
            ccm ccmVarI = i(bqpVar);
            if (!asrVar.a.isMutable()) {
                asrVar.B();
            }
            ccg ccgVar2 = (ccg) asrVar.a;
            ccmVarI.getClass();
            ccgVar2.e = ccmVarI;
            ccgVar2.b |= 1;
        }
        return (ccg) asrVar.z();
    }

    public static cci h(bqg bqgVar) {
        asr asrVar = (asr) cci.a.createBuilder();
        String string = bqgVar.f.toString();
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        cci cciVar = (cci) asrVar.a;
        string.getClass();
        cciVar.c = string;
        String string2 = bqgVar.i.toString();
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        cci cciVar2 = (cci) asrVar.a;
        string2.getClass();
        cciVar2.e = string2;
        ccm ccmVarI = i(bqgVar.j);
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        cci cciVar3 = (cci) asrVar.a;
        ccmVarI.getClass();
        cciVar3.f = ccmVarI;
        cciVar3.b |= 1;
        Uri uri = bqgVar.k;
        if (uri != null) {
            String string3 = uri.toString();
            if (!asrVar.a.isMutable()) {
                asrVar.B();
            }
            cci cciVar4 = (cci) asrVar.a;
            string3.getClass();
            cciVar4.g = string3;
        }
        Bundle bundle = bqgVar.l;
        if (bundle != null) {
            List listJ = j(bundle);
            if (!asrVar.a.isMutable()) {
                asrVar.B();
            }
            cci cciVar5 = (cci) asrVar.a;
            efm efmVar = cciVar5.h;
            if (!efmVar.c()) {
                cciVar5.h = efb.mutableCopy(efmVar);
            }
            edg.addAll(listJ, cciVar5.h);
        }
        return (cci) asrVar.z();
    }

    public static ccm i(bqp bqpVar) {
        if (bqpVar == null) {
            return ccm.a;
        }
        asr asrVar = (asr) ccm.a.createBuilder();
        int iK = k(bqpVar.a);
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        ((ccm) asrVar.a).c = ccl.a(iK);
        eek eekVarB = ehx.b(bqpVar.b);
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        ccm ccmVar = (ccm) asrVar.a;
        eekVarB.getClass();
        ccmVar.d = eekVarB;
        ccmVar.b |= 1;
        return (ccm) asrVar.z();
    }

    public static List j(Bundle bundle) {
        ArrayList arrayList = new ArrayList();
        if (bundle != null) {
            ArrayList arrayList2 = new ArrayList(bundle.keySet());
            Collections.sort(arrayList2);
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                String str = (String) arrayList2.get(i);
                Uri uri = (Uri) bundle.getParcelable(str);
                if (uri == null) {
                    throw new IllegalStateException("Empty input resource Uri.");
                }
                asr asrVar = (asr) cch.a.createBuilder();
                if (!asrVar.a.isMutable()) {
                    asrVar.B();
                }
                cch cchVar = (cch) asrVar.a;
                str.getClass();
                cchVar.b = str;
                String string = uri.toString();
                if (!asrVar.a.isMutable()) {
                    asrVar.B();
                }
                cch cchVar2 = (cch) asrVar.a;
                string.getClass();
                cchVar2.c = string;
                arrayList.add((cch) asrVar.z());
            }
        }
        return arrayList;
    }

    public static int k(int i) {
        if (i == 0) {
            return ccl.b;
        }
        if (i == 1) {
            return ccl.c;
        }
        throw new IllegalStateException("Unknown value for scheduling mode");
    }

    private static int l(byte[] bArr, int i) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    private static long m(long j, long j2, long j3) {
        long j4 = (j ^ j2) * j3;
        long j5 = ((j4 ^ (j4 >>> 47)) ^ j2) * j3;
        return (j5 ^ (j5 >>> 47)) * j3;
    }

    private static long n(byte[] bArr, int i) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, i, 8);
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        return byteBufferWrap.getLong();
    }

    private static long o(long j) {
        return j ^ (j >>> 47);
    }

    private static void p(byte[] bArr, int i, long j, long j2, long[] jArr) {
        long jN = j + n(bArr, i);
        long jN2 = n(bArr, i + 8);
        long jN3 = n(bArr, i + 16);
        long jN4 = n(bArr, i + 24);
        long j3 = jN2 + jN + jN3;
        long jRotateRight = Long.rotateRight(j2 + jN + jN4, 21) + Long.rotateRight(j3, 44);
        jArr[0] = j3 + jN4;
        jArr[1] = jRotateRight + jN;
    }
}
