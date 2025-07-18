package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fsl {
    public static final fsl a = new fsl();

    private fsl() {
    }

    public static final boolean a(String str) {
        return (fjs.c(str, "GET") || fjs.c(str, "HEAD")) ? false : true;
    }
}
