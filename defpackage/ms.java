package defpackage;

import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ms {
    public final Map a;
    public final Map b;
    public final Map c;
    public final List d;
    public final transient Map e;
    public final Map f;
    public final Bundle g;

    public ms(byte[] bArr) {
        this();
    }

    public final void a(int i, String str) {
        Map map = this.a;
        Integer numValueOf = Integer.valueOf(i);
        map.put(numValueOf, str);
        this.b.put(str, numValueOf);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, mq] */
    public final boolean b(int i, int i2, Intent intent) {
        String str = (String) this.a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        ayo ayoVar = (ayo) this.e.get(str);
        if ((ayoVar != null ? ayoVar.b : null) == null || !this.d.contains(str)) {
            this.f.remove(str);
            this.g.putParcelable(str, new mp(i2, intent));
            return true;
        }
        ayoVar.b.a(((mu) ayoVar.a).a(i2, intent));
        this.d.remove(str);
        return true;
    }

    public final bot c(String str, mu muVar, mq mqVar) {
        if (((Integer) this.b.get(str)) == null) {
            mr mrVar = mr.a;
            Iterator itA = fjs.f(new fkz(mrVar, new fkx(mrVar), 1)).a();
            while (itA.hasNext()) {
                Number number = (Number) itA.next();
                if (!this.a.containsKey(Integer.valueOf(number.intValue()))) {
                    a(number.intValue(), str);
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
        this.e.put(str, new ayo(mqVar, muVar));
        if (this.f.containsKey(str)) {
            Object obj = this.f.get(str);
            this.f.remove(str);
            mqVar.a(obj);
        }
        mp mpVar = (mp) this.g.getParcelable(str, mp.class);
        if (mpVar != null) {
            this.g.remove(str);
            mqVar.a(muVar.a(mpVar.a, mpVar.b));
        }
        return new bot(this, str);
    }

    public ms() {
        this.a = new LinkedHashMap();
        this.b = new LinkedHashMap();
        this.c = new LinkedHashMap();
        this.d = new ArrayList();
        this.e = new LinkedHashMap();
        this.f = new LinkedHashMap();
        this.g = new Bundle();
    }
}
