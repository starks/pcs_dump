package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class blv extends akh implements blw {
    private int a;

    protected blv(byte[] bArr) {
        this();
        aso.y(bArr.length == 25);
        this.a = Arrays.hashCode(bArr);
    }

    public static byte[] c(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    public abstract byte[] aU();

    @Override // defpackage.blw
    public final int aV() {
        return this.a;
    }

    @Override // defpackage.blw
    public final bpf b() {
        return new bpe(aU());
    }

    @Override // defpackage.akh
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            bpf bpfVarB = b();
            parcel2.writeNoException();
            aki.d(parcel2, bpfVarB);
        } else {
            if (i != 2) {
                return false;
            }
            int iAV = aV();
            parcel2.writeNoException();
            parcel2.writeInt(iAV);
        }
        return true;
    }

    public final boolean equals(Object obj) {
        bpf bpfVarB;
        if (obj != null && (obj instanceof blw)) {
            try {
                blw blwVar = (blw) obj;
                if (blwVar.aV() == this.a && (bpfVarB = blwVar.b()) != null) {
                    return Arrays.equals(aU(), (byte[]) bpe.a(bpfVarB));
                }
                return false;
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public blv() {
        super("com.google.android.gms.common.internal.ICertData");
    }
}
