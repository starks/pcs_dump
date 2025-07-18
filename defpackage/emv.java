package defpackage;

import j$.util.DesugarCollections;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class emv {
    public static final elo a = new elo("io.grpc.EquivalentAddressGroup.ATTR_AUTHORITY_OVERRIDE");
    public final List b;
    public final elp c;
    private final int d;

    public emv(SocketAddress socketAddress) {
        this(socketAddress, elp.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof emv)) {
            return false;
        }
        emv emvVar = (emv) obj;
        if (this.b.size() != emvVar.b.size()) {
            return false;
        }
        for (int i = 0; i < this.b.size(); i++) {
            if (!((SocketAddress) this.b.get(i)).equals(emvVar.b.get(i))) {
                return false;
            }
        }
        return this.c.equals(emvVar.c);
    }

    public final int hashCode() {
        return this.d;
    }

    public final String toString() {
        elp elpVar = this.c;
        return "[" + String.valueOf(this.b) + "/" + elpVar.toString() + "]";
    }

    public emv(SocketAddress socketAddress, elp elpVar) {
        this(Collections.singletonList(socketAddress), elpVar);
    }

    public emv(List list, elp elpVar) {
        clq.w(!list.isEmpty(), "addrs is empty");
        List listUnmodifiableList = DesugarCollections.unmodifiableList(new ArrayList(list));
        this.b = listUnmodifiableList;
        elpVar.getClass();
        this.c = elpVar;
        this.d = listUnmodifiableList.hashCode();
    }
}
