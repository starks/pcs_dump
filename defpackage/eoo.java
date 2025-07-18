package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eoo extends RuntimeException {
    private static final long serialVersionUID = 1;

    public eoo() {
        super("No functional channel service provider found. Try adding a dependency on the grpc-okhttp, grpc-netty, or grpc-netty-shaded artifact");
    }
}
