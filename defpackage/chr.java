package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class chr {
    public static final chr a = new chr();

    private chr() {
    }

    public static final File a(Uri uri) throws chw {
        if (!uri.getScheme().equals("file")) {
            throw new chw("Scheme must be 'file'");
        }
        if (!TextUtils.isEmpty(uri.getQuery())) {
            throw new chw("Did not expect uri to have query");
        }
        if (TextUtils.isEmpty(uri.getAuthority())) {
            return new File(uri.getPath());
        }
        throw new chw("Did not expect uri to have authority");
    }
}
