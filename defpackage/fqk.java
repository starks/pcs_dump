package defpackage;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fqk implements fql {
    @Override // defpackage.fql
    public final List a(String str) throws UnknownHostException {
        try {
            InetAddress[] allByName = InetAddress.getAllByName(str);
            allByName.getClass();
            return ffh.ac(allByName);
        } catch (NullPointerException e) {
            UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(str));
            unknownHostException.initCause(e);
            throw unknownHostException;
        }
    }
}
