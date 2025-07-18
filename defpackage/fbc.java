package defpackage;

import android.os.Parcel;
import j$.util.DesugarCollections;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.URL;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
public class fbc {
    public fbc() {
    }

    public static Set b(Map map, String str) {
        eql eqlVar;
        List listF = ewp.f(map, str);
        if (listF == null) {
            return null;
        }
        EnumSet enumSetNoneOf = EnumSet.noneOf(eql.class);
        for (Object obj : listF) {
            if (obj instanceof Double) {
                Double d = (Double) obj;
                int iIntValue = d.intValue();
                dcr.Q(((double) iIntValue) == d.doubleValue(), "Status code %s is not integral", obj);
                eqlVar = eqo.b(iIntValue).o;
                dcr.Q(eqlVar.r == d.intValue(), "Status code %s is not valid", obj);
            } else {
                if (!(obj instanceof String)) {
                    throw new csn("Can not convert status code " + String.valueOf(obj) + " to Status.Code, because its type is " + String.valueOf(obj.getClass()));
                }
                try {
                    eql eqlVar2 = eql.OK;
                    eqlVar = (eql) Enum.valueOf(eql.class, (String) obj);
                } catch (IllegalArgumentException e) {
                    throw new csn(a.H(obj, "Status code ", " is not valid"), e);
                }
            }
            enumSetNoneOf.add(eqlVar);
        }
        return DesugarCollections.unmodifiableSet(enumSetNoneOf);
    }

    public static /* synthetic */ String c(int i) {
        return i != 1 ? "OUTBOUND" : "INBOUND";
    }

    public static PasswordAuthentication d(String str, InetAddress inetAddress, int i) {
        URL url;
        try {
            url = new URL("https", str, i, "");
        } catch (MalformedURLException unused) {
            eyw.a.logp(Level.WARNING, "io.grpc.internal.ProxyDetectorImpl$1", "requestPasswordAuthentication", "failed to create URL for Authenticator: {0} {1}", new Object[]{"https", str});
            url = null;
        }
        return Authenticator.requestPasswordAuthentication(str, inetAddress, i, "https", "", null, url, Authenticator.RequestorType.PROXY);
    }

    public static ews e() {
        return ezb.a == null ? new ezb() : new eta();
    }

    public static int f(Parcel parcel, eqo eqoVar) {
        int i = eqoVar.o.r;
        String strSubstring = eqoVar.p;
        if (strSubstring != null && strSubstring.length() > 1000) {
            strSubstring = strSubstring.substring(0, 1000);
        }
        int i2 = i << 16;
        if (strSubstring == null) {
            return i2;
        }
        int i3 = i2 | 32;
        parcel.writeString(strSubstring);
        return i3;
    }

    public static void g(Parcel parcel, int i) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(0);
        parcel.writeInt(i);
        parcel.setDataPosition(iDataPosition);
    }

    public static boolean h(int i, int i2) {
        return (i & i2) != 0;
    }

    public void a(ewn ewnVar) {
        throw null;
    }

    public fbc(short[] sArr) {
    }
}
