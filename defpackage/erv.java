package defpackage;

import java.net.SocketAddress;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class erv extends SocketAddress {
    private static final long serialVersionUID = 0;
    private final int a;

    public erv(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof erv) && this.a == ((erv) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "BoundClientAddress[" + this.a + "]";
    }
}
