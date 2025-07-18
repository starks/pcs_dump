package defpackage;

import android.app.Application;
import android.app.Service;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ekd implements ekj {
    private final Service a;
    private Object b;

    public ekd(Service service) {
        this.a = service;
    }

    @Override // defpackage.ekj
    public final Object aS() {
        if (this.b == null) {
            Application application = this.a.getApplication();
            ebq.v(application instanceof ekj, "Hilt service must be attached to an @HiltAndroidApp Application. Found: %s", application.getClass());
            ald aldVarE = ((ekc) ebq.z(application, ekc.class)).e();
            aldVarE.a = this.a;
            ebq.r(aldVarE.a, Service.class);
            this.b = new alk((all) aldVarE.b);
        }
        return this.b;
    }
}
