package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aso {
    public static volatile eqi a;
    private static volatile epg b;

    public static void A(Handler handler) {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != handler.getLooper()) {
            String name = looperMyLooper != null ? looperMyLooper.getThread().getName() : "null current looper";
            throw new IllegalStateException("Must be called on " + handler.getLooper().getThread().getName() + " thread, but got " + name + ".");
        }
    }

    public static void B() {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IllegalStateException("Must not be called on the main application thread");
        }
    }

    public static void C(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void D(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException((String) obj);
        }
    }

    public static void E(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
    }

    public static void F(Object obj) {
        if (obj == null) {
            throw new NullPointerException("null reference");
        }
    }

    public static void G(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException((String) obj2);
        }
    }

    public static aoa H(fsc fscVar) {
        aut autVar = new aut(fscVar.ae(aog.DEVICE_PERSONALIZATION_SERVICES, anl.b));
        aof aofVar = autVar.c;
        ((aok) aofVar).d.s(new aml(autVar, 7));
        return autVar;
    }

    private static void I(Parcel parcel, int i, int i2) {
        int iF = f(parcel, i);
        if (iF == i2) {
            return;
        }
        throw new bms("Expected size " + i2 + " got " + iF + " (0x" + Integer.toHexString(iF) + ")", parcel);
    }

    public static epg a() {
        epg epgVarA;
        epg epgVar = b;
        if (epgVar != null) {
            return epgVar;
        }
        synchronized (aso.class) {
            epgVarA = b;
            if (epgVarA == null) {
                epd epdVarA = epg.a();
                epdVarA.c = epf.SERVER_STREAMING;
                epdVarA.d = epg.c("com.google.android.apps.miphone.astrea.http.api.HttpService", "Download");
                epdVarA.b();
                asi asiVar = asi.a;
                int i = fec.b;
                epdVarA.a = new fea(asiVar);
                epdVarA.b = new fea(asj.a);
                epgVarA = epdVarA.a();
                b = epgVarA;
            }
        }
        return epgVarA;
    }

    public static double b(Parcel parcel, int i) {
        I(parcel, i, 8);
        return parcel.readDouble();
    }

    public static float c(Parcel parcel, int i) {
        I(parcel, i, 4);
        return parcel.readFloat();
    }

    public static int d(int i) {
        return (char) i;
    }

    public static int e(Parcel parcel, int i) {
        I(parcel, i, 4);
        return parcel.readInt();
    }

    public static int f(Parcel parcel, int i) {
        return (i & (-65536)) != -65536 ? (char) (i >> 16) : parcel.readInt();
    }

    public static int g(Parcel parcel) {
        int i = parcel.readInt();
        int iF = f(parcel, i);
        int iD = d(i);
        int iDataPosition = parcel.dataPosition();
        if (iD != 20293) {
            throw new bms("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(i))), parcel);
        }
        int i2 = iF + iDataPosition;
        if (i2 < iDataPosition || i2 > parcel.dataSize()) {
            throw new bms(a.D(i2, iDataPosition, "Size read is invalid start=", " end="), parcel);
        }
        return i2;
    }

    public static long h(Parcel parcel, int i) {
        I(parcel, i, 8);
        return parcel.readLong();
    }

    public static Bundle i(Parcel parcel, int i) {
        int iF = f(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iF == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iDataPosition + iF);
        return bundle;
    }

    public static IBinder j(Parcel parcel, int i) {
        int iF = f(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iF == 0) {
            return null;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(iDataPosition + iF);
        return strongBinder;
    }

    public static Parcelable k(Parcel parcel, int i, Parcelable.Creator creator) {
        int iF = f(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iF == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iF);
        return parcelable;
    }

    public static Integer l(Parcel parcel, int i) {
        int iF = f(parcel, i);
        if (iF == 0) {
            return null;
        }
        x(parcel, iF);
        return Integer.valueOf(parcel.readInt());
    }

    public static String m(Parcel parcel, int i) {
        int iF = f(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iF == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iF);
        return string;
    }

    public static ArrayList n(Parcel parcel, int i) {
        int iF = f(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iF == 0) {
            return null;
        }
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(iDataPosition + iF);
        return arrayListCreateStringArrayList;
    }

    public static ArrayList o(Parcel parcel, int i, Parcelable.Creator creator) {
        int iF = f(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iF == 0) {
            return null;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(iDataPosition + iF);
        return arrayListCreateTypedArrayList;
    }

    public static void p(Parcel parcel, int i) {
        if (parcel.dataPosition() != i) {
            throw new bms(a.x(i, "Overread allowed size end="), parcel);
        }
    }

    public static void q(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + f(parcel, i));
    }

    public static boolean r(Parcel parcel, int i) {
        I(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    public static byte[] s(Parcel parcel, int i) {
        int iF = f(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iF == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(iDataPosition + iF);
        return bArrCreateByteArray;
    }

    public static int[] t(Parcel parcel, int i) {
        int iF = f(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iF == 0) {
            return null;
        }
        int[] iArrCreateIntArray = parcel.createIntArray();
        parcel.setDataPosition(iDataPosition + iF);
        return iArrCreateIntArray;
    }

    public static Object[] u(Parcel parcel, int i, Parcelable.Creator creator) {
        int iF = f(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iF == 0) {
            return null;
        }
        Object[] objArrCreateTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + iF);
        return objArrCreateTypedArray;
    }

    public static String[] v(Parcel parcel, int i) {
        int iF = f(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iF == 0) {
            return null;
        }
        String[] strArrCreateStringArray = parcel.createStringArray();
        parcel.setDataPosition(iDataPosition + iF);
        return strArrCreateStringArray;
    }

    public static byte[][] w(Parcel parcel, int i) {
        int iF = f(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iF == 0) {
            return null;
        }
        int i2 = parcel.readInt();
        byte[][] bArr = new byte[i2][];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr[i3] = parcel.createByteArray();
        }
        parcel.setDataPosition(iDataPosition + iF);
        return bArr;
    }

    public static void x(Parcel parcel, int i) {
        if (i == 4) {
            return;
        }
        throw new bms("Expected size 4 got " + i + " (0x" + Integer.toHexString(i) + ")", parcel);
    }

    public static void y(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void z(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException((String) obj);
        }
    }
}
