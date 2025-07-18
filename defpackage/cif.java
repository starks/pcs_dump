package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cif implements chm {
    private final egp a;
    private final een b;

    private cif(egp egpVar) {
        een eenVar = een.a;
        egr egrVar = egr.a;
        this.b = een.a;
        this.a = egpVar;
    }

    public static cif b(egi egiVar) {
        return new cif(egiVar.getParserForType());
    }

    @Override // defpackage.chm
    public final /* bridge */ /* synthetic */ Object a(fpv fpvVar) throws IOException {
        InputStream inputStreamB = cig.b(fpvVar);
        try {
            Object objB = this.a.b(inputStreamB, this.b);
            if (inputStreamB != null) {
                inputStreamB.close();
            }
            return objB;
        } catch (Throwable th) {
            if (inputStreamB != null) {
                try {
                    inputStreamB.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
