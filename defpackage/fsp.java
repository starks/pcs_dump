package defpackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fsp implements fqr {
    private final fqu a;

    public fsp(fqu fquVar) {
        this.a = fquVar;
    }

    private final boolean b(IOException iOException, frw frwVar, fqx fqxVar, boolean z) {
        fse fseVar;
        frz frzVar;
        if (!this.a.f) {
            return false;
        }
        if (z) {
            fqz fqzVar = fqxVar.d;
            if (iOException instanceof FileNotFoundException) {
                return false;
            }
        }
        if ((iOException instanceof ProtocolException) || (!(iOException instanceof InterruptedIOException) ? !(((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) : (iOException instanceof SocketTimeoutException) && !z)) {
            return false;
        }
        frt frtVar = frwVar.e;
        frtVar.getClass();
        int i = frtVar.d;
        if (i != 0 || frtVar.e != 0 || frtVar.f != 0) {
            if (frtVar.g == null) {
                fre freVar = null;
                if (i <= 1 && frtVar.e <= 1 && frtVar.f <= 0 && (frzVar = frtVar.b.f) != null) {
                    synchronized (frzVar) {
                        if (frzVar.i == 0 && frh.u(frzVar.a.a.h, frtVar.a.h)) {
                            freVar = frzVar.a;
                        }
                    }
                }
                if (freVar != null) {
                    frtVar.g = freVar;
                } else {
                    fui fuiVar = frtVar.h;
                    if ((fuiVar == null || !fuiVar.i()) && (fseVar = frtVar.c) != null && !fseVar.a()) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    private static final int c(frb frbVar, int i) {
        String strA = frb.a(frbVar, "Retry-After");
        if (strA == null) {
            return i;
        }
        if (new fld("\\d+").a(strA)) {
            return Integer.valueOf(strA).intValue();
        }
        return Integer.MAX_VALUE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01a8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01b6 A[Catch: all -> 0x0250, TryCatch #0 {all -> 0x0250, blocks: (B:22:0x0075, B:24:0x0079, B:26:0x007f, B:28:0x0094, B:29:0x009b, B:30:0x00a2, B:31:0x00a3, B:33:0x00a8, B:35:0x00b4, B:48:0x00d6, B:118:0x01ea, B:120:0x01ee, B:124:0x01fd, B:125:0x0208, B:51:0x00dd, B:54:0x00e4, B:56:0x00e8, B:59:0x00ed, B:62:0x00f5, B:63:0x00f8, B:65:0x0105, B:66:0x010e, B:67:0x0115, B:68:0x0116, B:70:0x011a, B:73:0x011f, B:75:0x0128, B:77:0x012d, B:79:0x0145, B:80:0x014d, B:82:0x0157, B:85:0x0161, B:87:0x016b, B:91:0x0175, B:93:0x018d, B:100:0x01a0, B:104:0x01ac, B:111:0x01c1, B:113:0x01d2, B:115:0x01dc, B:116:0x01e1, B:107:0x01b6, B:109:0x01bc, B:143:0x0248, B:144:0x024f, B:130:0x0210, B:132:0x021a, B:134:0x0224, B:135:0x0228, B:137:0x022a, B:139:0x0234, B:141:0x0241, B:142:0x0247), top: B:157:0x0075, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01c1 A[Catch: all -> 0x0250, TryCatch #0 {all -> 0x0250, blocks: (B:22:0x0075, B:24:0x0079, B:26:0x007f, B:28:0x0094, B:29:0x009b, B:30:0x00a2, B:31:0x00a3, B:33:0x00a8, B:35:0x00b4, B:48:0x00d6, B:118:0x01ea, B:120:0x01ee, B:124:0x01fd, B:125:0x0208, B:51:0x00dd, B:54:0x00e4, B:56:0x00e8, B:59:0x00ed, B:62:0x00f5, B:63:0x00f8, B:65:0x0105, B:66:0x010e, B:67:0x0115, B:68:0x0116, B:70:0x011a, B:73:0x011f, B:75:0x0128, B:77:0x012d, B:79:0x0145, B:80:0x014d, B:82:0x0157, B:85:0x0161, B:87:0x016b, B:91:0x0175, B:93:0x018d, B:100:0x01a0, B:104:0x01ac, B:111:0x01c1, B:113:0x01d2, B:115:0x01dc, B:116:0x01e1, B:107:0x01b6, B:109:0x01bc, B:143:0x0248, B:144:0x024f, B:130:0x0210, B:132:0x021a, B:134:0x0224, B:135:0x0228, B:137:0x022a, B:139:0x0234, B:141:0x0241, B:142:0x0247), top: B:157:0x0075, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0157 A[Catch: all -> 0x0250, TryCatch #0 {all -> 0x0250, blocks: (B:22:0x0075, B:24:0x0079, B:26:0x007f, B:28:0x0094, B:29:0x009b, B:30:0x00a2, B:31:0x00a3, B:33:0x00a8, B:35:0x00b4, B:48:0x00d6, B:118:0x01ea, B:120:0x01ee, B:124:0x01fd, B:125:0x0208, B:51:0x00dd, B:54:0x00e4, B:56:0x00e8, B:59:0x00ed, B:62:0x00f5, B:63:0x00f8, B:65:0x0105, B:66:0x010e, B:67:0x0115, B:68:0x0116, B:70:0x011a, B:73:0x011f, B:75:0x0128, B:77:0x012d, B:79:0x0145, B:80:0x014d, B:82:0x0157, B:85:0x0161, B:87:0x016b, B:91:0x0175, B:93:0x018d, B:100:0x01a0, B:104:0x01ac, B:111:0x01c1, B:113:0x01d2, B:115:0x01dc, B:116:0x01e1, B:107:0x01b6, B:109:0x01bc, B:143:0x0248, B:144:0x024f, B:130:0x0210, B:132:0x021a, B:134:0x0224, B:135:0x0228, B:137:0x022a, B:139:0x0234, B:141:0x0241, B:142:0x0247), top: B:157:0x0075, inners: #1, #3 }] */
    @Override // defpackage.fqr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.frb a(defpackage.fsm r27) {
        /*
            Method dump skipped, instructions count: 638
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fsp.a(fsm):frb");
    }
}
