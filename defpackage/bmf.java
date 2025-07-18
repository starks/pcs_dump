package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bmf {
    private final List a = new ArrayList();
    private final Object b;

    public bmf(Object obj) {
        this.b = obj;
    }

    public final void a(String str, Object obj) {
        this.a.add(str + "=" + String.valueOf(obj));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append(this.b.getClass().getSimpleName());
        sb.append('{');
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            sb.append((String) this.a.get(i));
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
