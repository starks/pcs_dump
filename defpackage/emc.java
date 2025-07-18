package defpackage;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class emc implements emd {
    public static final emd a = new emc(0);
    private final /* synthetic */ int b;

    public emc(int i) {
        this.b = i;
    }

    @Override // defpackage.emt
    public final InputStream a(InputStream inputStream) {
        return this.b != 0 ? new GZIPInputStream(inputStream) : inputStream;
    }

    @Override // defpackage.eme
    public final OutputStream b(OutputStream outputStream) {
        return this.b != 0 ? new GZIPOutputStream(outputStream) : outputStream;
    }

    @Override // defpackage.eme, defpackage.emt
    public final String c() {
        return this.b != 0 ? "gzip" : "identity";
    }
}
