package defpackage;

import android.view.View;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ani implements Consumer {
    private final /* synthetic */ int a;

    public /* synthetic */ ani(int i) {
        this.a = i;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.a;
        if (i == 0) {
            clq.w(!((String) obj).isEmpty(), "Content binding should not be an empty string.");
            return;
        }
        if (i == 1) {
            ((aot) obj).b();
        } else if (i != 2) {
            ((View) obj).setVisibility(0);
        } else {
            ((ebe) obj).a();
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        int i = this.a;
        return i != 0 ? i != 1 ? i != 2 ? Consumer$CC.$default$andThen(this, consumer) : Consumer$CC.$default$andThen(this, consumer) : Consumer$CC.$default$andThen(this, consumer) : Consumer$CC.$default$andThen(this, consumer);
    }
}
