package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
final class exy implements fbj {
    private InputStream a;

    public exy(InputStream inputStream) {
        this.a = inputStream;
    }

    @Override // defpackage.fbj
    public final InputStream a() {
        InputStream inputStream = this.a;
        this.a = null;
        return inputStream;
    }
}
