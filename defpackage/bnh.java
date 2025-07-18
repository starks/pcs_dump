package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.StrictMode;
import j$.util.Optional;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Random;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bnh {
    private static Context a;
    private static Boolean b;

    public static synchronized boolean A(Context context) {
        Boolean bool;
        Context applicationContext = context.getApplicationContext();
        Context context2 = a;
        if (context2 != null && (bool = b) != null && context2 == applicationContext) {
            return bool.booleanValue();
        }
        b = null;
        Boolean boolValueOf = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
        b = boolValueOf;
        a = applicationContext;
        return boolValueOf.booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ff, code lost:
    
        if (((java.io.File) r15.c).createNewFile() != false) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0325 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:221:0x01c9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:264:? A[Catch: all -> 0x032e, SYNTHETIC, TRY_LEAVE, TryCatch #4 {all -> 0x032e, blocks: (B:73:0x01a8, B:155:0x032d, B:154:0x032a, B:151:0x0325), top: B:218:0x0099, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01c7  */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.exo B(android.content.Context r24, defpackage.boi r25, defpackage.bnq r26) {
        /*
            Method dump skipped, instructions count: 908
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bnh.B(android.content.Context, boi, bnq):exo");
    }

    private static void C(Parcel parcel, Parcelable parcelable, int i) {
        int iDataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int iDataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i);
        int iDataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(iDataPosition);
        parcel.writeInt(iDataPosition3 - iDataPosition2);
        parcel.setDataPosition(iDataPosition3);
    }

    public static StrictMode.VmPolicy.Builder a(StrictMode.VmPolicy.Builder builder) {
        return builder.permitUnsafeIntentLaunch();
    }

    public static int b(int i) {
        if (i == -1) {
            return -1;
        }
        return i / 1000;
    }

    public static int c(Parcel parcel) {
        return d(parcel, 20293);
    }

    public static int d(Parcel parcel, int i) {
        parcel.writeInt(i | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void e(Parcel parcel, int i) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(iDataPosition - i);
        parcel.setDataPosition(iDataPosition);
    }

    public static void f(Parcel parcel, int i, boolean z) {
        i(parcel, i, 4);
        parcel.writeInt(z ? 1 : 0);
    }

    public static void g(Parcel parcel, int i, double d) {
        i(parcel, i, 8);
        parcel.writeDouble(d);
    }

    public static void h(Parcel parcel, int i, float f) {
        i(parcel, i, 4);
        parcel.writeFloat(f);
    }

    public static void i(Parcel parcel, int i, int i2) {
        parcel.writeInt(i | (i2 << 16));
    }

    public static void j(Parcel parcel, int i, int i2) {
        i(parcel, i, 4);
        parcel.writeInt(i2);
    }

    public static void k(Parcel parcel, int i, long j) {
        i(parcel, i, 8);
        parcel.writeLong(j);
    }

    public static void l(Parcel parcel, int i, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int iD = d(parcel, i);
        parcel.writeBundle(bundle);
        e(parcel, iD);
    }

    public static void m(Parcel parcel, int i, byte[] bArr) {
        if (bArr == null) {
            return;
        }
        int iD = d(parcel, i);
        parcel.writeByteArray(bArr);
        e(parcel, iD);
    }

    public static void n(Parcel parcel, int i, byte[][] bArr) {
        if (bArr == null) {
            return;
        }
        int iD = d(parcel, i);
        parcel.writeInt(bArr.length);
        for (byte[] bArr2 : bArr) {
            parcel.writeByteArray(bArr2);
        }
        e(parcel, iD);
    }

    public static void o(Parcel parcel, int i, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int iD = d(parcel, i);
        parcel.writeStrongBinder(iBinder);
        e(parcel, iD);
    }

    public static void p(Parcel parcel, int i, int[] iArr) {
        if (iArr == null) {
            return;
        }
        int iD = d(parcel, i);
        parcel.writeIntArray(iArr);
        e(parcel, iD);
    }

    public static void q(Parcel parcel, int i, Integer num) {
        if (num == null) {
            return;
        }
        i(parcel, i, 4);
        parcel.writeInt(num.intValue());
    }

    public static void r(Parcel parcel, int i, Parcelable parcelable, int i2) {
        if (parcelable == null) {
            return;
        }
        int iD = d(parcel, i);
        parcelable.writeToParcel(parcel, i2);
        e(parcel, iD);
    }

    public static void s(Parcel parcel, int i, String str) {
        if (str == null) {
            return;
        }
        int iD = d(parcel, i);
        parcel.writeString(str);
        e(parcel, iD);
    }

    public static void t(Parcel parcel, int i, String[] strArr) {
        if (strArr == null) {
            return;
        }
        int iD = d(parcel, i);
        parcel.writeStringArray(strArr);
        e(parcel, iD);
    }

    public static void u(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int iD = d(parcel, i);
        parcel.writeStringList(list);
        e(parcel, iD);
    }

    public static void v(Parcel parcel, int i, Parcelable[] parcelableArr, int i2) {
        if (parcelableArr == null) {
            return;
        }
        int iD = d(parcel, i);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                C(parcel, parcelable, i2);
            }
        }
        e(parcel, iD);
    }

    public static void w(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int iD = d(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            Parcelable parcelable = (Parcelable) list.get(i2);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                C(parcel, parcelable, 0);
            }
        }
        e(parcel, iD);
    }

    public static boolean x(File file) {
        File[] fileArrListFiles;
        if (!file.exists()) {
            return true;
        }
        if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                x(file2);
            }
        }
        return file.delete();
    }

    public static cqz y(Context context, byte[] bArr, cqy cqyVar) {
        Optional optionalEmpty;
        asr asrVar = (asr) cqz.a.createBuilder();
        eea eeaVarR = eea.r(bArr);
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        cqz cqzVar = (cqz) asrVar.a;
        cqzVar.b |= 2;
        cqzVar.d = eeaVarR;
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        cqz cqzVar2 = (cqz) asrVar.a;
        cqyVar.getClass();
        cqzVar2.e = cqyVar;
        cqzVar2.b |= 4;
        cqv cqvVar = cqv.a;
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        cqz cqzVar3 = (cqz) asrVar.a;
        cqvVar.getClass();
        cqzVar3.f = cqvVar;
        cqzVar3.b |= 8;
        int i = 0;
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences("dg_shared_preferences", 0);
            String string = sharedPreferences.getString("client_uuid", "");
            if (string.isEmpty()) {
                UUID uuidRandomUUID = UUID.randomUUID();
                sharedPreferences.edit().putString("client_uuid", uuidRandomUUID.toString()).apply();
                optionalEmpty = Optional.of(uuidRandomUUID);
            } else {
                optionalEmpty = Optional.of(UUID.fromString(string));
            }
        } catch (IllegalStateException unused) {
            optionalEmpty = Optional.empty();
        }
        optionalEmpty.map(new bog(i)).ifPresent(new awp(asrVar, 7));
        return (cqz) asrVar.z();
    }

    public static byte[] z(cqz cqzVar) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[8];
            new Random().nextBytes(bArr);
            bArr[0] = 10;
            bArr[1] = 6;
            int i = 3;
            for (int i2 = 0; i2 < 8; i2++) {
                i ^= bArr[i2];
            }
            bArr[2] = (byte) (((byte) i) ^ bArr[2]);
            byteArrayOutputStream.write(bArr);
            asr asrVar = (asr) cqzVar.toBuilder();
            if (!asrVar.a.isMutable()) {
                asrVar.B();
            }
            cqz cqzVar2 = (cqz) asrVar.a;
            cqzVar2.b &= -2;
            cqzVar2.c = cqz.a.c;
            ((cqz) asrVar.z()).writeTo(byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
