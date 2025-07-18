package defpackage;

import android.os.RemoteException;
import android.security.keystore.KeyGenParameterSpec;
import java.io.IOException;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.nio.ByteBuffer;
import javax.crypto.KeyGenerator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bba {
    public static volatile epg a;

    public static void a(ByteBuffer byteBuffer, BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        int length = byteArray.length;
        if (length <= 0 || byteArray[0] != 0) {
            byteBuffer.put(byteArray);
        } else {
            byteBuffer.put(byteArray, 1, length - 1);
        }
    }

    public static final dks b() {
        dqt dqtVar;
        Object obj = dqu.a;
        String strB = dws.b("android-keystore://pcs_protected_downloads");
        synchronized (dqu.a) {
            if (!cnx.q().containsAlias(strB)) {
                KeyGenParameterSpec keyGenParameterSpecBuild = new KeyGenParameterSpec.Builder(strB, 3).setKeySize(256).setBlockModes("GCM").setEncryptionPaddings("NoPadding").build();
                KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                keyGenerator.init(keyGenParameterSpecBuild);
                keyGenerator.generateKey();
            }
            dqtVar = new dqt(strB);
            dqu.c(dqtVar);
        }
        return dqtVar;
    }

    public static dxb c(final bvo bvoVar, final bpz bpzVar, bqm bqmVar, cdd cddVar, dfa dfaVar) {
        boolean zD;
        try {
            if (bpzVar.bf()) {
                bqj bqjVarB = bqmVar.b(bql.HTTP_CLIENT_INITIALIZATION_LATENCY, dfaVar);
                try {
                    zD = bvoVar.d();
                    bqjVarB.close();
                } finally {
                }
            } else {
                zD = bvoVar.d();
            }
            if (zD) {
                cddVar.i(bvoVar.e());
                if (!bvoVar.f()) {
                    cddVar.c(-1);
                }
                bvoVar.b(bpzVar.aV());
                return new dxb() { // from class: bsz
                    @Override // defpackage.dxb
                    public final HttpURLConnection a(String str) throws IOException {
                        bvo bvoVar2 = bvoVar;
                        bpz bpzVar2 = bpzVar;
                        try {
                            HttpURLConnection httpURLConnection = (HttpURLConnection) bpe.a(bvoVar2.a(str));
                            if (!clq.O(bpzVar2.f())) {
                                httpURLConnection.setRequestProperty("X-SERVER-TOKEN", bpzVar2.f());
                            }
                            return httpURLConnection;
                        } catch (RemoteException e) {
                            throw new IOException(e);
                        }
                    }
                };
            }
            if (bvoVar.c()) {
                bqmVar.k(ccj.fe);
                return new bta(bpzVar.f());
            }
            bqmVar.k(ccj.ff);
            return new dxb() { // from class: bsy
                @Override // defpackage.dxb
                public final HttpURLConnection a(String str) throws IOException {
                    throw new IOException("HttpURLConnectionFactory failed to load!");
                }
            };
        } catch (RemoteException e) {
            throw new IllegalStateException("unexpected RemoteException", e);
        }
    }

    public static btw d(ccg ccgVar) {
        ccgVar.getClass();
        return new bsh(ccgVar);
    }

    public static btw e(cci cciVar) {
        cciVar.getClass();
        return new bsi(cciVar);
    }
}
