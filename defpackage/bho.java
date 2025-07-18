package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.aicore.aidl.AIFeature;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bho extends bmr {
    final int b;
    public final int c;
    public final PendingIntent d;
    public final String e;
    public static final bho a = new bho(0);
    public static final Parcelable.Creator CREATOR = new apz(16);

    public bho(int i, int i2, PendingIntent pendingIntent, String str) {
        this.b = i;
        this.c = i2;
        this.d = pendingIntent;
        this.e = str;
    }

    public static String a(int i) {
        if (i == 99) {
            return "UNFINISHED";
        }
        if (i == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case AIFeature.Type.IMAGE_DESCRIPTION /* 19 */:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    case 25:
                        return "API_INSTALL_REQUIRED";
                    default:
                        return a.E(i, "UNKNOWN_ERROR_CODE(", ")");
                }
        }
    }

    public final boolean b() {
        return (this.c == 0 || this.d == null) ? false : true;
    }

    public final boolean c() {
        return this.c == 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bho)) {
            return false;
        }
        bho bhoVar = (bho) obj;
        return this.c == bhoVar.c && a.g(this.d, bhoVar.d) && a.g(this.e, bhoVar.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.c), this.d, this.e});
    }

    public final String toString() {
        bmf bmfVar = new bmf(this);
        bmfVar.a("statusCode", a(this.c));
        bmfVar.a("resolution", this.d);
        bmfVar.a("message", this.e);
        return bmfVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iC = bnh.c(parcel);
        bnh.j(parcel, 1, this.b);
        bnh.j(parcel, 2, this.c);
        bnh.r(parcel, 3, this.d, i);
        bnh.s(parcel, 4, this.e);
        bnh.e(parcel, iC);
    }

    public bho(int i) {
        this(i, null, null);
    }

    public bho(int i, PendingIntent pendingIntent) {
        this(i, pendingIntent, null);
    }

    public bho(int i, PendingIntent pendingIntent, String str) {
        this(1, i, pendingIntent, null);
    }
}
