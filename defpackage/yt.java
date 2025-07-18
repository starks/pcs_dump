package defpackage;

import android.content.Context;
import android.os.Looper;
import android.util.Log;
import com.google.android.apps.aicore.aidl.AIFeature;

/* compiled from: PG */
/* loaded from: classes.dex */
public class yt {
    public static Context a;

    public yt() {
    }

    public static yu a(yv yvVar) {
        yvVar.getClass();
        int iOrdinal = yvVar.ordinal();
        if (iOrdinal == 1) {
            return yu.ON_CREATE;
        }
        if (iOrdinal == 2) {
            return yu.ON_START;
        }
        if (iOrdinal != 3) {
            return null;
        }
        return yu.ON_RESUME;
    }

    public static float b(float[] fArr, float f, float f2) {
        if (f2 >= 1.0f) {
            return 1.0f;
        }
        if (f2 <= 0.0f) {
            return 0.0f;
        }
        int iMin = Math.min((int) (200.0f * f2), 199);
        float f3 = f2 - (iMin * 0.005f);
        float f4 = fArr[iMin];
        return f4 + ((f3 / 0.005f) * (fArr[iMin + 1] - f4));
    }

    public static String d(int i) {
        switch (i) {
            case -1:
                return "SUCCESS_CACHE";
            case 0:
                return "SUCCESS";
            case 1:
            case 9:
            case 11:
            case 12:
            default:
                return a.x(i, "unknown status code: ");
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
            case 10:
                return "DEVELOPER_ERROR";
            case 13:
                return "ERROR";
            case 14:
                return "INTERRUPTED";
            case 15:
                return "TIMEOUT";
            case 16:
                return "CANCELED";
            case 17:
                return "API_NOT_CONNECTED";
            case 18:
                return "DEAD_CLIENT";
            case AIFeature.Type.IMAGE_DESCRIPTION /* 19 */:
                return "REMOTE_EXCEPTION";
            case 20:
                return "CONNECTION_SUSPENDED_DURING_CALL";
            case 21:
                return "RECONNECTION_TIMED_OUT_DURING_UPDATE";
            case 22:
                return "RECONNECTION_TIMED_OUT";
        }
    }

    public static synchronized void g(Context context) {
        if (a == null) {
            a = context;
        } else {
            Log.e("DynamiteAppCtx", "Duplicated init of DynamiteApplicationContext");
        }
    }

    public void c(afb afbVar) {
        throw null;
    }

    @Deprecated
    public biw e(Context context, Looper looper, blh blhVar, Object obj, bjb bjbVar, bjc bjcVar) {
        return f(context, looper, blhVar, obj, bjbVar, bjcVar);
    }

    public biw f(Context context, Looper looper, blh blhVar, Object obj, bjx bjxVar, bkn bknVar) {
        throw new UnsupportedOperationException("buildClient must be implemented");
    }

    public yt(byte[] bArr) {
    }

    public yt(byte[] bArr, byte[] bArr2) {
        this(null);
    }
}
