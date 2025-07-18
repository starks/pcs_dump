package defpackage;

import android.net.Uri;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class chs implements cik {
    public chs(byte[] bArr) {
    }

    @Override // defpackage.cik
    public final File c(Uri uri) {
        return chr.a(uri);
    }

    @Override // defpackage.cik
    public final InputStream d(Uri uri) throws chw {
        File fileA = chr.a(uri);
        return new chz(new FileInputStream(fileA), fileA);
    }

    @Override // defpackage.cik
    public final String e() {
        return "file";
    }

    @Override // defpackage.cik
    public final boolean f(Uri uri) {
        return chr.a(uri).exists();
    }

    @Override // defpackage.cik
    public final void g(Uri uri, Uri uri2) throws IOException {
        File fileA = chr.a(uri);
        File fileA2 = chr.a(uri2);
        cnx.T(fileA2);
        if (!fileA.renameTo(fileA2)) {
            throw new IOException(String.format("%s could not be renamed to %s", uri, uri2));
        }
    }

    @Override // defpackage.cik
    public final OutputStream j(Uri uri) throws IOException {
        File fileA = chr.a(uri);
        cnx.T(fileA);
        return new cia(new FileOutputStream(fileA), fileA);
    }

    @Override // defpackage.cik
    public final void k(Uri uri) throws IOException {
        File fileA = chr.a(uri);
        if (fileA.isDirectory()) {
            throw new FileNotFoundException(String.format("%s is a directory", uri));
        }
        if (fileA.delete()) {
            return;
        }
        if (!fileA.exists()) {
            throw new FileNotFoundException(String.format("%s does not exist", uri));
        }
        throw new IOException(String.format("%s could not be deleted", uri));
    }

    public chs() {
        new chv();
    }
}
