package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.format.Formatter;
import com.google.android.as.oss.R;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.OffsetDateTime;
import j$.time.ZoneId;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class awt {
    public static final czn a = czn.j("com/google/android/apps/miphone/astrea/networkusage/ui/user/NetworkUsageItemUtils");
    public static final Uri b = Uri.parse("https://github.com/google/private-compute-services/tree/master/src/com/google/android/as/oss/assets/federatedcompute");

    public static cxc a(Context context, aww awwVar) {
        int i = cxc.d;
        cwy cwyVar = new cwy();
        cxc cxcVar = awwVar.b;
        int size = cxcVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            ava avaVar = (ava) cxcVar.get(i2);
            cwyVar.h(avu.a(avaVar.i()));
            if (avaVar.c() > 0) {
                cwyVar.h(new awn(context.getString(R.string.details_page_download_size), Formatter.formatShortFileSize(context, avaVar.c())));
            }
            if (avaVar.e() > 0) {
                cwyVar.h(new awn(context.getString(R.string.details_page_upload_size), Formatter.formatShortFileSize(context, avaVar.e())));
            }
        }
        return cwyVar.g();
    }

    public static LocalDate b(Instant instant) {
        return OffsetDateTime.ofInstant(instant, ZoneId.systemDefault()).toLocalDate();
    }

    static String c(aux auxVar) {
        int iOrdinal = auxVar.b().ordinal();
        if (iOrdinal == 2 || iOrdinal == 3) {
            auj aujVarA = auxVar.a();
            return (aujVarA.b == 1 ? (auk) aujVarA.c : auk.a).c;
        }
        if (iOrdinal == 4) {
            auj aujVarA2 = auxVar.a();
            return (aujVarA2.b == 2 ? (aul) aujVarA2.c : aul.a).c;
        }
        if (iOrdinal == 5) {
            auj aujVarA3 = auxVar.a();
            return (aujVarA3.b == 3 ? (auo) aujVarA3.c : auo.a).c;
        }
        if (iOrdinal != 6) {
            return "";
        }
        auj aujVarA4 = auxVar.a();
        return (aujVarA4.b == 4 ? (aun) aujVarA4.c : aun.a).c;
    }

    public static String d(Context context, int i) {
        return context.getString(i == 1 ? R.string.details_page_status_success : R.string.details_page_status_failure);
    }
}
